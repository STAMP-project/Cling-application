import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test18001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                 9", "\\XTALXAN_ITALIAN_ENGLXSHRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "          ita                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 9" + "'", str3, "                                 9");
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.lang.String str8 = locale7.getISO3Country();
        java.util.Locale locale10 = new java.util.Locale("en");
        boolean boolean11 = locale10.hasExtensions();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleKeys();
        java.lang.String str13 = locale7.getDisplayCountry(locale10);
        java.util.Locale.setDefault(locale7);
        java.lang.String str15 = locale0.getDisplayScript(locale7);
        java.lang.String str16 = locale7.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "France" + "'", str13, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!!!!!!!!!!!!!!!!!!!!!!    ZH_CN    !!!!!!!!!!!!!!!!!!!!!!", "\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IIIIIIIIII9999999999999999999999999999999", 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "E             g                          sh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB", "Italia");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("cccccccccccccccccccccccccccccccc", "iFranzosisch", "CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cccccccccccccccccccccccccccccccc" + "'", str3, "cccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("francese (Francia)", 115, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)");
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", "zh_TW", "francese (Francia)", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN" + "'", str4, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ..." + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("talian\\u0032talian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN\\U0032TALIAN" + "'", str1, "TALIAN\\U0032TALIAN");
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('B');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0042" + "'", str1, "\\u0042");
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "8300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "CINESE (CINA)\\U0069H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\XTALXAN_ITALIAN_ENGLXSH                                                 ", "Chine)");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale3.getDisplayCountry();
        java.lang.String str8 = locale3.getScript();
        java.lang.String str9 = locale3.getScript();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale10.getDisplayCountry();
        java.lang.String str15 = locale10.getScript();
        java.lang.String str16 = locale10.getScript();
        java.lang.String str17 = locale3.getDisplayCountry(locale10);
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale21.getExtension('h');
        java.lang.String str24 = locale20.getDisplayScript(locale21);
        java.lang.String str25 = locale20.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale26);
        java.lang.String str28 = locale20.getDisplayName(locale26);
        java.lang.String str29 = locale20.getScript();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str31 = locale3.getDisplayCountry(locale20);
        java.lang.String str32 = locale3.getVariant();
        java.lang.String str33 = locale0.getDisplayName(locale3);
        java.lang.String str34 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)" + "'", str2, "chinois (Chine)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FRA" + "'", str25, "FRA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str28, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "chinois (Chine)" + "'", str33, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                     g             ", "... g ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     g             " + "'", str2, "                                                                                     g             ");
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "itTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.Object obj8 = null;
        boolean boolean9 = languageRange1.equals(obj8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\U0020", "\u610f\u5927\u5229\u6587", 103, 71);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\u610f\u5927\u5229\u6587" + "'", str4, "\\\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!       _\\u0020_italienisch####################################################################...", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ", "                                NI                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str3, "hi!       _\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "TALIAN\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "francese (Canada)", (java.lang.CharSequence) "tttttt\\u0049");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "francese (Canada)" + "'", charSequence2, "francese (Canada)");
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = locale5.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale5.getDisplayName(locale11);
        java.lang.String str14 = locale4.getDisplayLanguage(locale11);
        java.lang.String str15 = locale1.getDisplayVariant(locale11);
        java.lang.String str16 = locale11.getVariant();
        java.lang.String str17 = locale11.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "de" + "'", str17, "de");
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih                            dalleman!ih                            dalleman!ih                          ", 6, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         dalleman!ih                            dalleman!ih                          " + "'", str3, "                         dalleman!ih                            dalleman!ih                          ");
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("00000000000000coreen (coree du sud)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("italieital", (int) 'g', 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italieital" + "'", str3, "italieital");
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
        java.util.Locale locale1 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str2 = locale1.getScript();
        boolean boolean3 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  \\u007a", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "anihC", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaa...ANiTALIaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\ud504');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setScript("FgenceFgenceFgenceFgenceFgenceFgenceFgenc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FgenceFgenceFgenceFgenceFgenceFgenceFgenc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("en_C", "2italianitalianitalianitali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.util.Locale.Builder builder11 = builder0.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder14 = builder12.setLocale(locale13);
        java.util.Locale locale15 = builder12.build();
        java.util.Locale.Builder builder18 = builder12.setExtension('Y', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguageTag("hi!       _\\u0020_italienisch####################################################################...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hi!       _\\u0020_italienisch####################################################################... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'F' + "'", char1 == 'F');
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("Hi!       _\\U0020_Italienisch####################################################################          ", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HcsineilatI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French" + "'", str6, "French");
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf", "R0                                               nailati                                                ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str2, "Englisch (Vereinigtes K\366nigreich)");
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 262, "                                             hcsfr-CueD                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  " + "'", str3, "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ");
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguage("ITALIAN");
        java.util.Locale locale14 = builder11.build();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale14);
        java.lang.String str16 = locale0.getDisplayScript(locale14);
        java.lang.String str17 = locale14.getDisplayCountry();
        java.lang.String str18 = locale14.getISO3Country();
        java.lang.Object obj19 = locale14.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "italian");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "italian");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "italian");
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046" + "'", str2, "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais (Canaaa)", "", "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais (canaaa)__20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.lang.String str12 = locale10.getVariant();
        java.lang.String str13 = locale10.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Korean" + "'", str11, "Korean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
        java.util.Locale locale3 = new java.util.Locale("French (Canada)", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        org.junit.Assert.assertEquals(locale3.toString(), "french (canada)_AZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\347AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str4, "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "GBR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale7.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale7.getExtension('5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("italian    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getCountry();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('N');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...ISH ...", "4AE4AF4AG4AI4AL4AM4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1\\u0061\\u0061\\u0061                           ", "FR...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "United Kingdom", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "French (France)", (java.lang.CharSequence) "\\U0046");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                         E    Italien", (int) (short) 10, "4444ALLEMAND4444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         E    Italien" + "'", str3, "                                                                                         E    Italien");
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
        char[] charArray7 = new char[] { ' ' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiTALI", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("italian    ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "9hhhhhhhhhh", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! allemandtalienischallemanditalian_TALAN_Eng \\ ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444" + "'", str2, "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
        java.util.Locale locale2 = new java.util.Locale("2ITHI!_\\U0020_ITALIENISCH####################################################################2I", "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertEquals(locale2.toString(), "2ithi!_\\u0020_italienisch####################################################################2i_ENGLISCH (VEREINIGTES K\366NIGREICH)");
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("fRANZ\326SISCH (kANADA)", (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AnihCFFFFFFFF", (java.lang.CharSequence) "...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 220 + "'", int2 == 220);
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...\r\r\r\r\r\r\r\r...", (java.lang.CharSequence) "FRA\326SIS\n(FRAKREI)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList25);
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList25);
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
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet56 = locale55.getExtensionKeys();
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale60 = new java.util.Locale("");
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Locale locale62 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str63 = locale61.getDisplayScript(locale62);
        java.util.Locale locale64 = java.util.Locale.ENGLISH;
        java.lang.String str65 = locale64.getDisplayCountry();
        java.util.Locale locale66 = java.util.Locale.PRC;
        java.util.Locale locale67 = java.util.Locale.US;
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.util.Locale locale69 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str70 = locale68.getDisplayScript(locale69);
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet72 = locale71.getExtensionKeys();
        java.util.Locale locale73 = java.util.Locale.ITALIAN;
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.util.Locale locale75 = java.util.Locale.FRENCH;
        java.util.Locale locale76 = java.util.Locale.US;
        java.util.Locale locale77 = java.util.Locale.ITALIAN;
        java.lang.String str78 = locale77.getDisplayLanguage();
        java.util.Locale locale79 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale55, locale58, locale60, locale61, locale64, locale66, locale67, locale69, locale71, locale73, locale75, locale76, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList81);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
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
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNotNull(charSet56);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it");
        org.junit.Assert.assertNotNull(charSet72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "it");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Italian" + "'", str74, "Italian");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Italian" + "'", str78, "Italian");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNull(locale85);
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tedesco    ", "x", (int) (byte) 10);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                           U0020", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444", "itTAiT_ITALIAN_EgAish          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...       HCSINEILATI                          HCSINEILATI             sh", 0, "DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...       HCSINEILATI                          HCSINEILATI             sh" + "'", str3, "...       HCSINEILATI                          HCSINEILATI             sh");
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getLanguage();
        java.lang.String str11 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str8, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TALIAN\\u0023", "inglesehhhhhhhhH", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("r0                                               nailati                                                ", "de                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Franzosisch (Frankreich)", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        java.util.Locale locale1 = new java.util.Locale("eAGAASH");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "eagaash");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("             \\u0049                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             \\U0049                                           " + "'", str1, "             \\U0049                                           ");
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))", "u Italia u", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder11 = builder0.clear();
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("eNGLISH");
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale.Builder builder15 = builder13.setLocale(locale14);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale.Builder builder23 = builder15.setLocale(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setVariant("e                               e                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: e                               e                    [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Franz\366sisch (Kanada)" + "'", str19, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                     fran\347ais (france)                                      ", "                          French");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                      !ih dalleman                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh" + "'", str2, "HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh");
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("USEEEE", "\\u0066");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla" + "'", str1, "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TALIAN\\u0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "             \\u0049             ", 7);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("UND");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 it", strArray4, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '\u671d');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 it" + "'", str7, "                                                                                                 it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UND" + "'", str9, "UND");
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("frankreich", "English", (int) '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "frankreich" + "'", str4, "frankreich");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "frankreich" + "'", str5, "frankreich");
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str1, "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("g             E", "\\U0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch", "\\u00de\\u00\\u\\u00de\\u00\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch" + "'", str2, "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
        java.util.Locale locale3 = new java.util.Locale("fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr", "Eagaash", "                                                                                                 it");
        org.junit.Assert.assertEquals(locale3.toString(), "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr_EAGAASH_                                                                                                 it");
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0075", "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" hi!       _\\U0020_Italienisch####################################################################            ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!_\\U0020_ITLE#########################################################################################", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_ITLE#########################################################################################" + "'", str2, "!_\\U0020_ITLE#########################################################################################");
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("B", "china");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE" + "'", str1, "hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE");
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("NI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL", 16, 'Y');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL" + "'", str3, "NI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL");
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH" + "'", str1, "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
    }

    @Test
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...", (int) 'Y', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian", 'i');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "talan" + "'", str4, "talan");
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("franz\366sisch(frankreich)", "iTALIAN                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale4.getDisplayName(locale8);
        java.util.Locale locale15 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale8.getDisplayName(locale16);
        java.lang.String str18 = locale8.getCountry();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale8.getDisplayName(locale19);
        boolean boolean21 = locale19.hasExtensions();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale24.getVariant();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale24);
        boolean boolean28 = locale24.hasExtensions();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("");
        java.lang.String str31 = locale24.getDisplayName(locale30);
        java.lang.String str32 = locale19.getDisplayScript(locale24);
        java.lang.String str33 = locale19.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "und" + "'", str6, "und");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str11, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u0034" + "'", str27, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "French (Canada)" + "'", str31, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("francese (Canada)", "\\U0049");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('F', 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale1.getDisplayCountry(locale3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("eNGLISH", locale3);
        java.lang.String str8 = locale3.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk", "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setLanguageTag("                                                         \\u005c                                                         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                                          \\u005c                                                          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CINESE (CINA)\\U0069H...", "INGLESE", (int) 'I');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CINESE (CINA)\\U0069H..." + "'", str4, "CINESE (CINA)\\U0069H...");
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("2CINESE (CINA.", "nglish ...nglish ...nglish ...nglichinoisf(Chine)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB", "T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB" + "'", str2, "ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0034\\u00 hcstud \\u0034\\u00", "aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u00 hcstud \\u0034\\u00" + "'", str2, "\\u0034\\u00 hcstud \\u0034\\u00");
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
        java.util.Locale locale3 = new java.util.Locale("\\u0062", "", "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0062__Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AD  \\u007a", (int) 'D');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD  \\u007a" + "'", str2, "AD  \\u007a");
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ", "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      " + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ");
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ", "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "             hcsineilatI             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("8600u\\", "anglais");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("z...Frn", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale4.getUnicodeLocaleType("                                                                            1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                                                             1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr" + "'", str3, "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z...FRN" + "'", str7, "Z...FRN");
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str10 = locale2.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u005c" + "'", str10, "\\u005c");
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("TAUAWAXAZBA", "...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                ", 9, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                " + "'", str3, "                                                ");
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale9 = locale3.stripExtensions();
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale.Builder builder15 = builder12.setLocale(locale13);
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale.Builder builder18 = builder16.setLanguage("ITALIAN");
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = builder18.build();
        java.util.Locale.Builder builder22 = builder18.setLanguageTag("italien");
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale25.getDisplayCountry();
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        java.lang.String str28 = locale24.getDisplayCountry();
        java.lang.String str29 = locale24.getScript();
        java.lang.String str30 = locale24.getScript();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale32.getDisplayCountry();
        java.lang.String str34 = locale31.getDisplayVariant(locale32);
        java.lang.String str35 = locale31.getDisplayCountry();
        java.lang.String str36 = locale31.getScript();
        java.lang.String str37 = locale31.getScript();
        java.lang.String str38 = locale24.getDisplayCountry(locale31);
        java.util.Locale.Category category39 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale40 = java.util.Locale.getDefault(category39);
        java.util.Locale locale41 = java.util.Locale.FRANCE;
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale42.getExtension('h');
        java.lang.String str45 = locale41.getDisplayScript(locale42);
        java.lang.String str46 = locale41.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale47);
        java.lang.String str49 = locale41.getDisplayName(locale47);
        java.lang.String str50 = locale41.getScript();
        java.util.Locale.setDefault(category39, locale41);
        java.lang.String str52 = locale24.getDisplayCountry(locale41);
        java.lang.String str53 = locale41.getCountry();
        java.util.Locale.Builder builder54 = builder22.setLocale(locale41);
        java.lang.String str55 = locale9.getDisplayVariant(locale41);
        java.util.Set<java.lang.String> strSet56 = locale9.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Kanada)" + "'", str14, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + category39 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category39.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "de");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "FRA" + "'", str46, "FRA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str49, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "FR" + "'", str53, "FR");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strSet56);
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                         fr-", "itTAiT_ITALIAN_EgAish");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         fr-" + "'", str3, "                                                                                         fr-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2cinese (cina)italianitalianitalianital", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2cinese (cina)italianitalianitalianital" + "'", str2, "2cinese (cina)italianitalianitalianital");
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        java.lang.String str9 = locale4.getDisplayName(locale8);
        java.lang.String str10 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList13, filteringMode17);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList25, filteringMode27);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList57, filteringMode59);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList49, filteringMode59);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList49);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList3, (java.util.Collection<java.lang.String>) strList62);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList63, "                                                                                           U0020ITALIANITALIANITALIANITALI");
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList63, 'Y');
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode17.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode27.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("F", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("nailati", strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap8);
        java.lang.String[] strArray22 = new java.lang.String[] { "\\u0020iItalian\\u008600u\\", "\\u0020iItalian\\u0020i", "anglais", "FRZ\326CZ(FRKREC)", "italian    ", "                                                                                                      ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "FRZ\326CZ(FRKREC)", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "                                      ..." };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.lang.String str25 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strList23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList38, filteringMode42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList74, filteringMode84);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList74);
        java.lang.String str89 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "0");
        java.lang.String str91 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "Eagaash");
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str94 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, 'F');
        java.lang.String str96 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "TALIAN_italian_eNGLISHITAL");
        java.lang.String str98 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList87, "ANGLAIS (ROYAUME-UNI)FRA");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0069\\U0069\\U", 0, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0069\\U0069\\U" + "'", str3, "\\U0069\\U0069\\U");
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u6587", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587                                                                                                  " + "'", str2, "\u4e2d\u6587                                                                                                  ");
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("             HCSINEILATI             ", "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!       _\\U0020_Italienisch####################################################################", 'N', '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       _\\U0020_Italienisch####################################################################" + "'", str3, "hi!       _\\U0020_Italienisch####################################################################");
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("....................................................................................... (italian,english)", "                                                                                                              italieital", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
        java.util.Locale locale2 = new java.util.Locale("aaaaaaaaaaaaaaaa", "Fr ncG ");
        org.junit.Assert.assertEquals(locale2.toString(), "aaaaaaaaaaaaaaaa_FR NCG ");
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Italian");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U002" + "'", str1, "\\U002");
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hIAN\\U0020Ihi", (int) (short) -1, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hIAN\\U0020Ihi" + "'", str3, "hIAN\\U0020Ihi");
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\ud55c\uad6d\uc5b4", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str3, "\ud55c\uad6d\uc5b4");
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("francese (Francia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=francese(francia)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "rEGNO uNITO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Korean", "x-lvariant-ZH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u0065", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.getDisplayName();
        java.lang.String str11 = locale7.getDisplayName();
        java.lang.String str12 = locale7.getDisplayLanguage();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale7.getDisplayName(locale14);
        java.util.Set<java.lang.String> strSet17 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale14);
        java.lang.String str19 = locale0.getDisplayVariant(locale14);
        boolean boolean20 = locale14.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien" + "'", str10, "italien");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italien" + "'", str11, "italien");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
        java.util.Locale locale2 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str12 = locale9.getDisplayLanguage(locale11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("", locale11);
        java.lang.String str14 = locale11.getScript();
        java.lang.String str15 = locale3.getDisplayVariant(locale11);
        org.junit.Assert.assertEquals(locale2.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-CA" + "'", str5, "fr-CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian (italian,english)" + "'", str6, "italian (italian,english)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r", "\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r" + "'", str2, "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r");
    }

    @Test
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          \\u0046");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "TIT");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", (int) (byte) 0);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str10, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale12 = new java.util.Locale("en");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale17.getVariant();
        java.lang.String str19 = locale12.getDisplayLanguage(locale17);
        java.lang.String str20 = locale8.getDisplayVariant(locale12);
        java.lang.String str21 = locale8.getDisplayScript();
        java.lang.String str22 = locale8.getDisplayCountry();
        java.util.Locale.Builder builder23 = builder3.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder3.setVariant("G");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: G [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "inglese" + "'", str19, "inglese");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "United Kingdom" + "'", str22, "United Kingdom");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u0069", 0, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str4, "\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "CHINESE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ESENIHC", "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ESENIHC" + "'", str2, "ESENIHC");
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("coreen", 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "corn" + "'", str2, "corn");
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("                                     fran\347ais (France)                                      ", locale1);
        java.lang.String str7 = locale1.getDisplayScript();
        java.lang.String str8 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str6, "                                     fran\347ais (france)                                      ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS", "allemand (Allemagne)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en");
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale1.getDisplayCountry(locale2);
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("DE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("   \\U0034\\U00", 'B');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder12 = builder9.setExtension('u', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.addUnicodeLocaleAttribute("Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "    \\     ", (int) 'C');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("TIT", (java.lang.Object[]) strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0039", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                         " + "'", str6, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                         " + "'", str7, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                         " + "'", str8, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504" + "'", str1, "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("HI!HI!", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "h");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                     g             ", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italienisch#########################################################################################" + "'", str5, "Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                     g             " + "'", str10, "                                                                                     g             ");
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("nihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", 0, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC" + "'", str3, "nihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC");
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\0020iTALIANiTALIANiTALIANiTAL", (java.lang.CharSequence) "hi!        (\\U0020,Italienisch#########################################################################################nnn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\0020iTALIANiTALIANiTALIANiTAL" + "'", charSequence2, "\\0020iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" italian  ", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.Locale.FilteringMode filteringMode21 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList19, filteringMode21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList25);
        java.lang.String str28 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList38, filteringMode42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.util.Locale.FilteringMode filteringMode55 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList53, filteringMode55);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList53, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList43, filteringMode57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap60);
        java.util.Locale locale62 = java.util.Locale.ROOT;
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Set<java.lang.String> strSet64 = locale62.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet64, "FRENCH (CANADA)");
        java.lang.String str68 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList72, strMap73);
        java.util.Locale locale75 = java.util.Locale.ITALIAN;
        java.lang.String str76 = locale75.getDisplayLanguage();
        java.util.Locale locale77 = locale75.stripExtensions();
        java.util.Locale locale79 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str80 = locale79.getDisplayScript();
        java.lang.String str81 = locale77.getDisplayCountry(locale79);
        java.util.Set<java.lang.String> strSet82 = locale79.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList72, (java.util.Collection<java.lang.String>) strSet82);
        java.lang.String str85 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet82, "USEEEE");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + filteringMode21 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode21.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + filteringMode55 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode55.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "italien" + "'", str76, "italien");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(strSet82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test18171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18171");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder7 = builder1.setLocale(locale6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.lang.String str10 = locale6.getDisplayCountry(locale8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("CA", locale6);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
    }

    @Test
    public void test18172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("x-lvariant-A", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18173");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen", "         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18174");
        java.util.Locale locale1 = new java.util.Locale(" (italian,english)                                      ");
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale3);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.String str7 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder14 = builder9.setLocale(locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale13.getVariant();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = locale13.getDisplayLanguage(locale17);
        java.lang.String str20 = locale3.getDisplayLanguage(locale13);
        java.lang.String str21 = locale1.getDisplayScript(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale3.getUnicodeLocaleType("CCCC\\CCCC                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: CCCC\\CCCC                                                       ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), " (italian,english)                                      ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "anglais" + "'", str4, "anglais");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH" + "'", str5, "!IH");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais (Canada)" + "'", str11, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tedesco" + "'", str19, "tedesco");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Englisch" + "'", str20, "Englisch");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18175");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList61);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList64, filteringMode65);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList64, 'a');
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList64);
        java.lang.String str71 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList69, 'g');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test18176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("x", "ixii");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("CCCC\\CCCCC", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test18178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
    }

    @Test
    public void test18179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("de                                                                                                                      ", (int) 'E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de                                                                                                                      " + "'", str2, "de                                                                                                                      ");
    }

    @Test
    public void test18181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("e                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e                               " + "'", str1, "e                               ");
    }

    @Test
    public void test18182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18182");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test18183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "         HITALIANH_HitalianH_HeHNGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18184");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("RA", "8600u\\                                                                                                                  ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\xtalxan_ITALIAN_Englxsh");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'T');
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0038ZHO                          ", strArray4);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0020", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RA" + "'", str9, "RA");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4300U\\                                             DUTSCH                                            ", "Francia", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "430Francia  " + "'", str3, "430Francia  ");
    }

    @Test
    public void test18186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18186");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Undetermined", 'g');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test18187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18188");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("de", "\\u0055");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test18190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", 17, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI" + "'", str3, "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
    }

    @Test
    public void test18192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18192");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("italienisch", "italian", 8);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test18194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18194");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.getVariant();
        java.lang.Object obj7 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-CA" + "'", str3, "fr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "fr_CA");
    }

    @Test
    public void test18195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u004e                                                          ", 49, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u004e                                                          " + "'", str3, "\\u004e                                                          ");
    }

    @Test
    public void test18196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18198");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", (java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18199");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih                            dalleman!ih                            dalleman!ih                          ", "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18200");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray5, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "                                             hcstueD                                             ");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("TA...", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("\\u0041", (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str8, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "TA..." + "'", str15, "TA...");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!" + "'", str16, "HI!");
    }

    @Test
    public void test18201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "TALIAN\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("anglais (Canada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada" + "'", str1, "anglais (Canada");
    }

    @Test
    public void test18203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18203");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18204");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30, filteringMode40);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList30, ' ');
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList30, "fr_FR                  ");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch" + "'", str44, "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch" + "'", str46, "hi!       fr_FR                  Italienischfr_FR                  italian_ITALIAN_Englishfr_FR                  HI!fr_FR                  hi!fr_FR                  ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...fr_FR                  \\u0034fr_FR                  HI!fr_FR                  Italianfr_FR                  \\u0061fr_FR                  \\u0023fr_FR                  hi!fr_FR                  iTALIANfr_FR                  Chinese (China)fr_FR                  hi!fr_FR                  zh_CNfr_FR                  iTALIANfr_FR                  enfr_FR                  Italienisch");
    }

    @Test
    public void test18205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444ITALIAN44444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test18206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18206");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FRA", 27, (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18207");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("de_DE");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      ...", "\\u000d");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("esenihc", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRREFrankreichgFrankreichFrankreichs", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test18208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18208");
        java.util.Locale locale1 = new java.util.Locale("HHHHHHHHH");
        java.util.Locale locale2 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "hhhhhhhhh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hhhhhhhhh");
    }

    @Test
    public void test18209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18209");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                 \\U0020  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0020");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U" + "'", str1, "U");
    }

    @Test
    public void test18211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18211");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("talian\\u0032talian");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18212");
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
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleKeys();
        java.lang.Class<?> wildcardClass17 = strSet16.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "italian");
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
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", "\uc601\uc5b4                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str2, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test18214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("FRANZ\326SISCH");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\ub3c5\uc77c\uc5b4", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'D');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("...IIIIIIIIIIIIIIIIIIII...", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str7, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...IIIIIIIIIIIIIIIIIIII..." + "'", str8, "...IIIIIIIIIIIIIIIIIIII...");
    }

    @Test
    public void test18215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18215");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.Class<?> wildcardClass5 = locale4.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...anitali");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18216");
        java.util.Locale locale2 = new java.util.Locale("G", "Franz\366sisch");
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale4);
        java.lang.String str10 = locale4.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale12);
        java.lang.String str14 = locale12.getDisplayName();
        java.lang.String str15 = locale4.getDisplayCountry(locale12);
        java.lang.String str16 = locale2.getDisplayVariant(locale12);
        java.util.Locale locale19 = new java.util.Locale("\\u005c");
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale21);
        java.lang.String str23 = locale21.getVariant();
        java.lang.String str24 = locale19.getDisplayScript(locale21);
        java.lang.String str26 = locale19.getExtension('C');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("italian (ITALIAN,English)", locale19);
        java.lang.String str28 = locale2.getDisplayName(locale19);
        org.junit.Assert.assertEquals(locale2.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!       " + "'", str9, "hi!       ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French" + "'", str10, "French");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "franz\366sisch (frankreich)" + "'", str13, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese" + "'", str14, "Chinese");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u56fd" + "'", str15, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale19.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "franz\366sisch (frankreich)" + "'", str22, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italian (italian,english)" + "'", str27, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "g (FRANZ\366SISCH)" + "'", str28, "g (FRANZ\366SISCH)");
    }

    @Test
    public void test18217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("erma (ermay)", "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erma (ermay)" + "'", str2, "erma (ermay)");
    }

    @Test
    public void test18218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\" + "'", str1, "\\");
    }

    @Test
    public void test18219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig" + "'", str1, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
    }

    @Test
    public void test18220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18220");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "", 223);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18221");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale.setDefault(locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str20 = locale17.getExtension('C');
        java.lang.String str21 = locale16.getDisplayLanguage(locale17);
        java.lang.String str22 = locale16.getScript();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Set<java.lang.String> strSet24 = locale16.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "france");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test18222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18222");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale5);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.setDefault(locale9);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale9);
        java.util.Locale locale13 = builder1.build();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("!_\\u0020_itle#########################################################################################", locale13);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.util.Locale locale21 = locale16.stripExtensions();
        java.lang.String str22 = locale21.getISO3Country();
        java.util.Locale locale24 = new java.util.Locale("en");
        boolean boolean25 = locale24.hasExtensions();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleKeys();
        java.lang.String str27 = locale21.getDisplayCountry(locale24);
        java.util.Locale locale29 = new java.util.Locale("en");
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale24.getDisplayCountry(locale29);
        java.lang.String str32 = locale24.getDisplayName();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", locale24);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale.Builder builder37 = builder34.setLanguageTag("Italian");
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.lang.String str39 = locale38.getDisplayName();
        java.util.Locale.Builder builder40 = builder34.setLocale(locale38);
        java.util.Locale.Builder builder41 = builder40.clear();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder43 = builder41.setLocale(locale42);
        java.util.Locale.Builder builder44 = builder41.clearExtensions();
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.util.Locale locale47 = locale45.stripExtensions();
        java.lang.String str48 = locale45.getDisplayVariant();
        java.util.Set<java.lang.String> strSet49 = locale45.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder50 = builder41.setLocale(locale45);
        java.util.Set<java.lang.Character> charSet51 = locale45.getExtensionKeys();
        java.lang.String str52 = locale24.getDisplayVariant(locale45);
        boolean boolean53 = locale13.equals((java.lang.Object) str52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "chinois (Chine)" + "'", str6, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!_\\U0020_ITLE#########################################################################################" + "'", str14, "!_\\U0020_ITLE#########################################################################################");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FRA" + "'", str22, "FRA");
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "France" + "'", str27, "France");
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW" + "'", str33, "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese (China)" + "'", str39, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Italian" + "'", str46, "Italian");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test18223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18224");
        java.util.Locale locale3 = new java.util.Locale("francese", "hi!        (\\U0020,Italienisch#########################################################################################)");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("A", locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "francese_HI!        (\\U0020,ITALIENISCH#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test18225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18225");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            ", "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065", 499);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "TEDESCO");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("cor\351en", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cor\351en" + "'", str2, "cor\351en");
    }

    @Test
    public void test18229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ", "\\u0064", "H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18230");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", (int) '8', (int) 'n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18231");
        java.util.Locale locale3 = new java.util.Locale("9hhhhhhhhhh", "italiano", "\r\r...");
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Royaume-Uni");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("fr-FR", locale6);
        java.lang.String str8 = locale3.getDisplayLanguage(locale6);
        java.util.Locale locale10 = new java.util.Locale("iTALIE                         ");
        boolean boolean11 = locale6.equals((java.lang.Object) locale10);
        org.junit.Assert.assertEquals(locale3.toString(), "9hhhhhhhhhh_ITALIANO_\r\r...");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "uni");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR-FR" + "'", str7, "FR-FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9hhhhhhhhhh" + "'", str8, "9hhhhhhhhhh");
        org.junit.Assert.assertEquals(locale10.toString(), "italie                         ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18232");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                               \\u002");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                               \\u002");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18233");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("E             g                          ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '7', 96, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait", 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait" + "'", str2, "n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait");
    }

    @Test
    public void test18235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18235");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale3);
        java.lang.String str7 = locale3.getDisplayName();
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.util.Locale locale15 = locale10.stripExtensions();
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category8, locale15);
        java.lang.String str18 = locale3.getDisplayLanguage(locale15);
        java.lang.String str19 = locale15.toLanguageTag();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", locale15);
        java.util.Locale.setDefault(locale15);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0034" + "'", str6, "\\u0034");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr-FR" + "'", str19, "fr-FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str20, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test18236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18236");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 241);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 241 + "'", int2 == 241);
    }

    @Test
    public void test18237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gERMAN (gERMANY", "an\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n", 82, 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "\neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test18239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("E", "x");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 133 + "'", int4 == 133);
    }

    @Test
    public void test18240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("               Deutschland");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Deutschland" + "'", str1, "Deutschland");
    }

    @Test
    public void test18242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18242");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                    ", "\\U000A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Italian (italian,english", "d8                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian (italian,english" + "'", str2, "Italian (italian,english");
    }

    @Test
    public void test18244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ch" + "'", str2, "ch");
    }

    @Test
    public void test18245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HSAAGAekkkkkkkkkkkkkkkkk", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HSAAGAekkkkkkkkkkkkkkkkk" + "'", str2, "HSAAGAekkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test18247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale8.getUnicodeLocaleType("fran\347ais (Canaaa)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc?ais (Canaaa)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian__#e-deutsch");
    }

    @Test
    public void test18248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18248");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.lang.String str4 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getUnicodeLocaleType("ADA\\AFAGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\BFBGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDCFCGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\Dh...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ADA\\AFAGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\BFBGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDCFCGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\Dh...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", "FRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL" + "'", str2, "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL");
    }

    @Test
    public void test18250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18250");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("francese", strMap1);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale4);
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Set<java.lang.String> strSet11 = locale8.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet11, filteringMode12);
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale14.getCountry();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str18 = locale14.getDisplayScript(locale17);
        java.util.Set<java.lang.String> strSet19 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange languageRange21 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange23 = new java.util.Locale.LanguageRange("E");
        java.lang.String str24 = languageRange23.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] { languageRange21, languageRange23 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale28 = java.util.Locale.ITALIAN;
        java.lang.String str29 = locale28.getDisplayLanguage();
        java.util.Locale locale30 = locale28.stripExtensions();
        java.lang.String str31 = locale28.getLanguage();
        java.util.Set<java.lang.String> strSet32 = locale28.getUnicodeLocaleKeys();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet32, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet32, filteringMode35);
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale39.getExtension('h');
        java.lang.String str42 = locale37.getDisplayCountry(locale39);
        java.util.Set<java.lang.String> strSet43 = locale39.getUnicodeLocaleKeys();
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet43, "Deutsch");
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList52, filteringMode54);
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet43, filteringMode54);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet19, filteringMode54);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DE_DE" + "'", str5, "DE_DE");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "e" + "'", str24, "e");
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "italien" + "'", str29, "italien");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "it" + "'", str31, "it");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode35.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "italien" + "'", str38, "italien");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode54.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
    }

    @Test
    public void test18251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18251");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN", "nglisch", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\" + "'", str4, "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
    }

    @Test
    public void test18252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "...", "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str3, "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test18253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18254");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension(')');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
    }

    @Test
    public void test18255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ITALIAN                                                                 ", '\u6cd5', 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN                                                                 " + "'", str3, "ITALIAN                                                                 ");
    }

    @Test
    public void test18256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("iFranzosisch ", "fran\347ais(france)(CHINESE(CHINA)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Eagaash");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9hhhhhhhhhh 9hhhhhhhhhh" + "'", str1, "9hhhhhhhhhh 9hhhhhhhhhh");
    }

    @Test
    public void test18259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18259");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str2 = locale1.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getExtension('5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18260");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setLanguageTag("italienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: italienisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test18261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18261");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) 'x', (int) (byte) 10);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18262");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList30);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList61);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList64, filteringMode65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap68 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList69 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap68);
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.lang.String str72 = locale70.getVariant();
        java.lang.String str73 = locale70.getDisplayName();
        java.lang.String str74 = locale70.getCountry();
        java.util.Set<java.lang.String> strSet75 = locale70.getUnicodeLocaleKeys();
        java.lang.String str76 = java.util.Locale.lookupTag(languageRangeList69, (java.util.Collection<java.lang.String>) strSet75);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.lang.String[] strArray85 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, (java.util.Collection<java.lang.String>) strList86, filteringMode88);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList86, filteringMode90);
        java.util.Collection<java.util.Locale> localeCollection92 = null;
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, localeCollection92);
        java.util.Locale locale94 = java.util.Locale.lookup(languageRangeList69, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Locale locale96 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap97 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList98 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap97);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode65.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeList69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "italien" + "'", str73, "italien");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode88.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(languageRangeList98);
    }

    @Test
    public void test18263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18263");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder1.setLanguageTag("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???????????????????????????????????????????????????????????????????????????????????????????????????Chinesisch (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test18264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18264");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test18265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              ..." + "'", str2, "                                                                                                              ...");
    }

    @Test
    public void test18266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18266");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18267");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CHINESE", 0, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("E gl", "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI", "hcstueD");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E g" + "'", str3, "E g");
    }

    @Test
    public void test18269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str1, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test18270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18270");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18271");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str8 = locale2.getScript();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.lang.String str16 = locale2.getDisplayCountry(locale9);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.getDefault(category19);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale21.getDisplayScript(locale22);
        java.util.Locale locale26 = locale21.stripExtensions();
        java.util.Locale.setDefault(category19, locale21);
        java.util.Locale locale28 = java.util.Locale.GERMANY;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Locale.setDefault(category19, locale28);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.lowerCase("E             g                                                                                     ", locale28);
        java.lang.String str32 = locale28.getLanguage();
        java.util.Locale.setDefault(category0, locale28);
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.lang.String str36 = locale34.getVariant();
        java.lang.String str37 = locale34.getDisplayName();
        java.lang.String str38 = locale34.getCountry();
        java.util.Set<java.lang.String> strSet39 = locale34.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet40 = locale34.getUnicodeLocaleKeys();
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.lang.String str43 = locale41.getVariant();
        java.lang.String str44 = locale41.getDisplayName();
        java.lang.String str45 = locale41.getCountry();
        java.util.Set<java.lang.String> strSet46 = locale41.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet47 = locale41.getUnicodeLocaleKeys();
        java.lang.String str48 = locale34.getDisplayLanguage(locale41);
        java.util.Locale.setDefault(category0, locale34);
        java.lang.String str50 = locale34.getDisplayCountry();
        java.util.Set<java.lang.String> strSet51 = locale34.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "e             g                                                                                     " + "'", str31, "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "de" + "'", str32, "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Italienisch" + "'", str37, "Italienisch");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertNotNull(charSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Italienisch" + "'", str44, "Italienisch");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "italiano" + "'", str48, "italiano");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strSet51);
    }

    @Test
    public void test18272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18273");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 194 + "'", int1 == 194);
    }

    @Test
    public void test18274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18274");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ITALIE", (java.lang.CharSequence) "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 812 + "'", int2 == 812);
    }

    @Test
    public void test18275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18275");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'd');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" (ITALIAN,ENGLISH)", "Cinese (cina)\\u0069h...", "2cinese (Cina...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e ITALIAN,ENGLISHa" + "'", str3, "e ITALIAN,ENGLISHa");
    }

    @Test
    public void test18277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ITALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18278");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Franz\366sisch", "                                        ittait_italian_egaish                                 \\u006", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18279");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("IENISCH", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test18280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iTALIE                         ", "ITTAIT_ITALIAN_EGAISH", "                                             hcsfr-CueD                                         ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iTALIE                         " + "'", str3, "iTALIE                         ");
    }

    @Test
    public void test18281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18281");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\u0034", 'x');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray2, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\\u004e", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str7, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0034" + "'", str8, "\\u0034");
    }

    @Test
    public void test18282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18282");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CA", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18283");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                      ITALIAN (italian,eNGLISH)                                      ", 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18284");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0020iItalian\\u008600u", "\\u0074", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("eagaash", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eagaash" + "'", str3, "eagaash");
    }

    @Test
    public void test18286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "tedesco (Germania)", "                                         fr-c                                                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18287");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 [at index 0]");
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
    }

    @Test
    public void test18288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli", "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli" + "'", str2, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
    }

    @Test
    public void test18289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("DE\rDJ\rDK\rDM\rDO\rDZ\rEC\rEE\rEG\rEH\rER\rES\rET\rFI\rFJ\rFK\rFM\rFO\rFR\rGA\rGB\rGD\rGE\rGF\rGG\rGH\rGI\rGL\rGM\rGN\rGP\rGQ", "hi!       _\\U0020_Italienisch#########################################################################################", 42);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18290");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..." + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
    }

    @Test
    public void test18291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("DE_DEFRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx", "             HCSINEILATI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DEFRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx" + "'", str2, "DE_DEFRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx");
    }

    @Test
    public void test18292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061", "HI!HI     \\u005c", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0034\\u00                                             hcstud                                             \\u0034\\u00", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", 241);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("coreen", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "coreen" + "'", str2, "coreen");
    }

    @Test
    public void test18295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test18296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff" + "'", str2, "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test18297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("italian (italian,e...", 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         italian (italian,e...                                                                                          " + "'", str2, "                                                                                         italian (italian,e...                                                                                          ");
    }

    @Test
    public void test18298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18298");
        java.util.Locale locale2 = new java.util.Locale("hhhhhhhhhh", "                                                                                     g             ");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "hhhhhhhhhh_                                                                                     G             ");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test18299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "TITITITITITIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en" + "'", str1, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
    }

    @Test
    public void test18301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         " + "'", str2, "                                                         ");
    }

    @Test
    public void test18302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18302");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder12 = builder9.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder9.clear();
        java.util.Locale.Builder builder14 = builder9.clear();
        java.util.Locale locale15 = builder9.build();
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale15.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18303");
        java.util.Locale locale2 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih_HHHHHHHHHH" + "'", str5, "!ih_HHHHHHHHHH");
    }

    @Test
    public void test18304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18304");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayName(locale3);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        boolean boolean11 = locale6.hasExtensions();
        java.lang.String str12 = locale6.getVariant();
        java.util.Set<java.lang.Character> charSet13 = locale6.getExtensionKeys();
        java.lang.String str14 = locale3.getDisplayScript(locale6);
        java.util.Set<java.lang.String> strSet15 = locale3.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-CA" + "'", str4, "fr-CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test18305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!       G");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18306");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0065                             ", (java.lang.CharSequence) "Fgence");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("fran\347ais (France)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18309");
        java.util.Locale locale2 = new java.util.Locale("9hhhhhhhhhh 9hhhhhhhhhh", "                                             DE_DE                                             ");
        org.junit.Assert.assertEquals(locale2.toString(), "9hhhhhhhhhh 9hhhhhhhhhh_                                             DE_DE                                             ");
    }

    @Test
    public void test18310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18310");
        java.util.Locale locale2 = new java.util.Locale("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ", "\\U0078");
        java.lang.String str4 = locale2.getExtension('D');
        org.junit.Assert.assertEquals(locale2.toString(), "ccccccccccccccccccccccccccfrz\366cz(frkrec)cccccccccccccccccccccccccc                                                                                                                                                                                                                                                                                                                                                    _\\U0078");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18311");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  \\u007a", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                          \\u0046", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444ALLEMAND4444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test18312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("china", '8');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "china" + "'", str4, "china");
    }

    @Test
    public void test18313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18313");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("###################################i#######...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void test18314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18314");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test18315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18315");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ILATiNA...royaume-uniroyaume-uniroy", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ilatina...royaume-uniroyaume-uniroy");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", 44, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih       !ih       !ih       !ih       !ih       !ih   " + "'", str3, "ih       !ih       !ih       !ih       !ih       !ih   ");
    }

    @Test
    public void test18317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18317");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale2.getDisplayCountry();
        java.lang.String str7 = locale2.getScript();
        java.lang.String str8 = locale2.getScript();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.getScript();
        java.lang.String str15 = locale9.getScript();
        java.lang.String str16 = locale2.getDisplayCountry(locale9);
        java.lang.String str17 = locale1.getDisplayVariant(locale9);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale19);
        java.lang.String str22 = locale19.getCountry();
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale9.getDisplayCountry(locale19);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.util.Locale locale28 = locale25.stripExtensions();
        java.lang.String str29 = locale19.getDisplayVariant(locale28);
        java.util.Locale locale32 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.lang.String str33 = locale19.getDisplayLanguage(locale32);
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleKeys();
        java.lang.String str35 = locale32.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH" + "'", str21, "!IH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale32.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italian (italian,english)" + "'", str35, "italian (italian,english)");
    }

    @Test
    public void test18318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih_HHHHHHHHHH", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "E             G                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih_HHHHHHHHHH" + "'", str3, "!ih_HHHHHHHHHH");
    }

    @Test
    public void test18319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18319");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale.Builder builder11 = builder7.setLanguageTag("italien");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.removeUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("italiae");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: italiae [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test18320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18320");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test18321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\ud55c\uad6d\uc5b4", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18322");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca", strArray2, strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca" + "'", str4, "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
    }

    @Test
    public void test18323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18323");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u97d3\u6587\u5357\u97d3)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test18324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", "Fr ncG");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test18325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18325");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("KKKKKKKKKKKKKKKKKKKK)DNK( HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", "Iinglese");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", 224);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "nglish (united kingdom");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf", 38, "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf" + "'", str3, "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf");
    }

    @Test
    public void test18330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx", "ITTAIT_ITALIAN_EGAISH          ", (int) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AND4444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test18331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("tttttttfr-C                 ttttttt", "\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18332");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("s (Canada)", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) '\ud504');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18333");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...ANiTALI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test18334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18334");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setScript("DE_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: DE_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test18335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18335");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18336");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("2aiTALIANiTALIANiTALIANiTAL", (int) '2', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test18337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)", (int) 'n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       " + "'", str2, "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       ");
    }

    @Test
    public void test18338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18338");
        java.util.Locale locale1 = new java.util.Locale("44444444444444444444444444444444!IH");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale3.getDisplayName(locale7);
        java.lang.String str10 = locale1.getDisplayCountry(locale3);
        java.lang.String str11 = locale3.getDisplayLanguage();
        java.lang.String str12 = locale3.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "44444444444444444444444444444444!ih");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French (Canada)" + "'", str9, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French" + "'", str11, "French");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...HBI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hbi..." + "'", str1, "...hbi...");
    }

    @Test
    public void test18340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "U0020ITALIANITALIANITALIANITALI", " nailati             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUADAEALAMANAOAQARASATAJEAJMAJOAJPAKEAKGAKHAKAKMAKNAKPAKRAKWAKYAKZALAALBALCALALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str2, "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUADAEALAMANAOAQARASATAJEAJMAJOAJPAKEAKGAKHAKAKMAKNAKPAKRAKWAKYAKZALAALBALCALALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test18342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18343");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ittait_italian_egaish          ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ittait_italian_egaish          " + "'", str2, "ittait_italian_egaish          ");
    }

    @Test
    public void test18344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRfranceRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrfrancerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18345");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getScript();
        java.lang.String str7 = locale1.getScript();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.lang.String str12 = locale8.getDisplayCountry();
        java.lang.String str13 = locale8.getScript();
        java.lang.String str14 = locale8.getScript();
        java.lang.String str15 = locale1.getDisplayCountry(locale8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale8);
        java.lang.String str17 = locale8.getISO3Language();
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale21.getExtension('h');
        java.lang.String str24 = locale20.getDisplayScript(locale21);
        java.lang.String str25 = locale20.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale26);
        java.lang.String str28 = locale20.getDisplayName(locale26);
        java.lang.String str29 = locale19.getDisplayLanguage(locale26);
        java.lang.String str30 = locale8.getDisplayName(locale26);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str16, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fra" + "'", str17, "fra");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FRA" + "'", str25, "FRA");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str28, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Franz\366sisch" + "'", str30, "Franz\366sisch");
    }

    @Test
    public void test18346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18346");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "EFrankreichgFrankreichFrankreichs", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 116);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA" + "'", str4, "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
    }

    @Test
    public void test18347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18347");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ANGLAIS (ROYAUME-UNI)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglais (royaume-uni)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz" + "'", str1, "hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test18349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18349");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)", "i!", (int) ')');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18350");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale3);
        java.lang.String str10 = locale3.getExtension('z');
        java.lang.String str12 = locale3.getExtension('z');
        java.lang.String str13 = locale1.getDisplayLanguage(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       " + "'", str8, "hi!       ");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18351");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("gERMAN (gERMANY)", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 537);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                      HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str2, "                                                                                                                                                                      HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test18353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", 79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("iTALIAN                                                                 ", 220, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test18355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18355");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguage("ITALIAN");
        java.util.Locale locale12 = builder9.build();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale14);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale.Builder builder21 = builder18.setLanguageTag("Italian");
        java.util.Locale.Builder builder22 = builder18.clearExtensions();
        java.util.Locale.Builder builder23 = builder18.clear();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder26 = builder18.setLocale(locale25);
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale.Builder builder28 = builder26.clear();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder28.build();
        java.util.Locale.Builder builder31 = builder17.setLocale(locale30);
        java.util.Locale.setDefault(category0, locale30);
        java.util.Locale locale33 = java.util.Locale.getDefault(category0);
        java.util.Locale locale34 = locale33.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
    }

    @Test
    public void test18356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18356");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale14);
        java.lang.String str16 = locale8.getDisplayName(locale14);
        java.lang.String str17 = locale8.getScript();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Set<java.lang.String> strSet19 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = locale8.getCountry();
        java.util.Locale locale22 = new java.util.Locale("en");
        boolean boolean23 = locale22.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale25.getDisplayLanguage();
        java.util.Locale locale27 = locale25.stripExtensions();
        java.lang.String str28 = locale27.getVariant();
        java.lang.String str29 = locale22.getDisplayLanguage(locale27);
        java.util.Locale.setDefault(locale27);
        java.lang.String str31 = locale8.getDisplayLanguage(locale27);
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str35 = locale32.getExtension('C');
        java.lang.String str36 = locale32.getVariant();
        java.lang.String str37 = locale27.getDisplayScript(locale32);
        java.lang.String str38 = locale27.getDisplayScript();
        java.util.Locale.Builder builder39 = builder0.setLocale(locale27);
        java.util.Locale.Builder builder40 = builder39.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder43 = builder39.setExtension('H', ")modgniK detinU( hsilgnE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: )modgniK detinU( hsilgnE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str16, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FR" + "'", str20, "FR");
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italien" + "'", str26, "italien");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "inglese" + "'", str29, "inglese");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "francese" + "'", str31, "francese");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "francese" + "'", str33, "francese");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test18357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("1\\u0061\\u0061\\u0061                           ", "Chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18358");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getExtension('h');
        java.lang.String str16 = locale12.getDisplayScript(locale13);
        java.lang.String str17 = locale12.getISO3Country();
        java.lang.String str18 = locale10.getDisplayVariant(locale12);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale10);
        java.lang.String str20 = locale4.getDisplayCountry(locale10);
        java.util.Locale locale21 = locale4.stripExtensions();
        java.util.Set<java.lang.String> strSet22 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale4.getDisplayLanguage();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.lowerCase("HSILGNE,NAILATI( NAILATi", locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRA" + "'", str17, "FRA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str19, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "inglese" + "'", str23, "inglese");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hsilgne,nailati( nailati" + "'", str24, "hsilgne,nailati( nailati");
    }

    @Test
    public void test18359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0039", 42, 164);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!frankreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (int) 'E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test18361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18361");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (int) 'h');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FRANZ\326SISCHF(FRANKREICH)", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCHF(FRANKREICH)" + "'", str2, "FRANZ\326SISCHF(FRANKREICH)");
    }

    @Test
    public void test18363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18363");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB", (double) 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=24.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT", "s (Canada)", 103);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT" + "'", str5, "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT" + "'", str6, "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
    }

    @Test
    public void test18365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18365");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (cina)\\u0069h..", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          ...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18366");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('b');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18367");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                               INGLESE                                ", 81, (int) 'H');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti", "             ", "8600u\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti" + "'", str3, "8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti");
    }

    @Test
    public void test18369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                             DE_DE                                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZHO                               44\\                                             DE_DE                                             002344  \\                                             DE_DE                                             0020iTALIANiTALIANiTALIANiTALI" + "'", str4, "ZHO                               44\\                                             DE_DE                                             002344  \\                                             DE_DE                                             0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test18370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18370");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                h                                 ", 2, "AD  \\u007a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                h                                 " + "'", str3, "                                h                                 ");
    }

    @Test
    public void test18371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "zH_CN", (java.lang.CharSequence) "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18372");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'D', '\u671d');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'D' + "'", char2 == 'D');
    }

    @Test
    public void test18373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("eagaash", "                                                         \\u005c                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eagaash" + "'", str2, "eagaash");
    }

    @Test
    public void test18374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18374");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("d");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("nailati", strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList28, filteringMode30);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList34);
        java.lang.String str37 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList47, filteringMode49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList57, filteringMode59);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList63);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList63);
        java.util.Locale locale67 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale70 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale72 = new java.util.Locale("");
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.lang.String str77 = locale76.getDisplayCountry();
        java.util.Locale locale78 = java.util.Locale.PRC;
        java.util.Locale locale79 = java.util.Locale.US;
        java.util.Locale locale80 = java.util.Locale.FRANCE;
        java.util.Locale locale81 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str82 = locale80.getDisplayScript(locale81);
        java.util.Locale locale83 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet84 = locale83.getExtensionKeys();
        java.util.Locale locale85 = java.util.Locale.ITALIAN;
        java.lang.String str86 = locale85.getDisplayLanguage();
        java.util.Locale locale87 = java.util.Locale.FRENCH;
        java.util.Locale locale88 = java.util.Locale.US;
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.lang.String str90 = locale89.getDisplayLanguage();
        java.util.Locale locale91 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray92 = new java.util.Locale[] { locale67, locale70, locale72, locale73, locale76, locale78, locale79, locale81, locale83, locale85, locale87, locale88, locale89, locale91 };
        java.util.ArrayList<java.util.Locale> localeList93 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList93, localeArray92);
        java.util.Locale locale95 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList93);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList11, (java.util.Collection<java.util.Locale>) localeList96);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList96);
        java.util.Locale locale99 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList98);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode30.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode49.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "it");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "");
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "it");
        org.junit.Assert.assertNotNull(charSet84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "italien" + "'", str86, "italien");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "italien" + "'", str90, "italien");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(locale95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test18375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "ti");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18376");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch", "444444444it                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18377");
        java.util.Locale locale3 = new java.util.Locale("", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "");
        org.junit.Assert.assertEquals(locale3.toString(), "_ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZH");
    }

    @Test
    public void test18378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18378");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) 'G');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test18379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Cor\351e du Sud");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18381");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale5);
        java.lang.String str11 = locale1.getDisplayVariant(locale5);
        java.lang.String str12 = locale1.getDisplayLanguage();
        java.lang.Object obj13 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN\\U0023" + "'", str3, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!       " + "'", str10, "hi!       ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "cor\351en" + "'", str12, "cor\351en");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "ko_KR");
    }

    @Test
    public void test18382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc5b4\uc77c\ub3c5" + "'", str1, "\uc5b4\uc77c\ub3c5");
    }

    @Test
    public void test18383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18383");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale locale4 = new java.util.Locale("\\u005c");
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale6);
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale4.getDisplayScript(locale6);
        java.lang.String str11 = locale4.getExtension('C');
        java.lang.String str12 = locale4.getDisplayScript();
        java.lang.String str13 = locale4.getScript();
        java.util.Set<java.lang.String> strSet14 = locale4.getUnicodeLocaleKeys();
        boolean boolean15 = languageRange1.equals((java.lang.Object) strSet14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals(locale4.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "franz\366sisch (frankreich)" + "'", str7, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "English(UnitedKingdom)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0069\\U0069\\U", "HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18386");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("erma (ermay)                                                 TALIAN                                                  ", "nglish (united kingdom");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18387");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("ti");
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale locale11 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category3, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category3);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        java.util.Locale.setDefault(locale15);
        java.util.Locale.setDefault(category3, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category3);
        java.util.Locale locale20 = java.util.Locale.getDefault(category3);
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale.Builder builder22 = builder0.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder22.setScript("\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: \\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "allemand" + "'", str16, "allemand");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CA" + "'", str21, "CA");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test18388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444" + "'", str2, "44444444444");
    }

    @Test
    public void test18389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)" + "'", str2, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbFRANZ\326SISCH (FRANKREICH)");
    }

    @Test
    public void test18390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder6.setRegion("");
        java.util.Locale locale12 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setScript("Katalanisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Katalanisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test18391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("jpn", 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test18392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("nc_HZ                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nc_HZ" + "'", str1, "nc_HZ");
    }

    @Test
    public void test18393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("k", (int) 'R', 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("         italian_italian_english", "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_engl" + "'", str2, "         italian_italian_engl");
    }

    @Test
    public void test18395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18395");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                         italian (italian,e...                                                                                          ", "i\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str1, "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test18397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18397");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale0.getDisplayName(locale6);
        java.lang.String str9 = locale0.getScript();
        java.lang.String str10 = locale0.getLanguage();
        java.lang.String str11 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet12 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale15.getVariant();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale15);
        boolean boolean19 = locale15.hasExtensions();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.lang.String str22 = locale15.getDisplayName(locale21);
        java.lang.String str23 = locale15.getDisplayVariant();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale.setDefault(locale25);
        java.lang.String str28 = locale15.getDisplayScript(locale25);
        java.lang.String str29 = locale0.getDisplayCountry(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = locale0.getExtension('0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str8, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u0034" + "'", str18, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French (Canada)" + "'", str22, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "France" + "'", str29, "France");
    }

    @Test
    public void test18398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18398");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'g', 'B');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'g' + "'", char2 == 'g');
    }

    @Test
    public void test18399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18399");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ZHO", "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("i\\u0020iTALIANiTALIANiTALIANiTALIit", "                                             DE_DE                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18402");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 85, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)", "FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)" + "'", str2, "\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)");
    }

    @Test
    public void test18404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Eagaash", "                                              8600u\\U\\u0", 223);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eagaash" + "'", str3, "Eagaash");
    }

    @Test
    public void test18406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "CCCC\\CCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("fr-FR", "cHINESISCH (cHINA)", "ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18408");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                          \\u005c         ", locale7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                \r", locale7);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                          \\u005c         " + "'", str9, "                                                                                          \\u005c         ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                \r" + "'", str10, "                                                                                                                \r");
    }

    @Test
    public void test18409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0034\\U00 HCSTUD \\U0034", "\ud504\ub791\uc2a4", "itaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaita");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0034\\U00 HCSTUD \\U0034" + "'", str3, "\\U0034\\U00 HCSTUD \\U0034");
    }

    @Test
    public void test18410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18410");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hcstued-e#__nailati", 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Deutsc", "                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Deutsc" + "'", str2, "Deutsc");
    }

    @Test
    public void test18412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0034\\u00" + "'", str1, "0034\\u00");
    }

    @Test
    public void test18413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18413");
        java.util.Locale locale1 = new java.util.Locale("TA...");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale6 = new java.util.Locale("8ian\\u0020i86", "                               INGLESE                                ");
        java.lang.String str7 = locale1.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ta..." + "'", str3, "ta...");
        org.junit.Assert.assertEquals(locale6.toString(), "8ian\\u0020i86_                               INGLESE                                ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ta..." + "'", str7, "ta...");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               INGLESE                                " + "'", str8, "                               INGLESE                                ");
    }

    @Test
    public void test18414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("English (Canada)", "cHINESISCH(cHINA)", (int) (short) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English (Canada)" + "'", str4, "English (Canada)");
    }

    @Test
    public void test18415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\U000A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", "uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie" + "'", str2, "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
    }

    @Test
    public void test18417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                             DE_DE                                              ", "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_" + "'", str2, "_");
    }

    @Test
    public void test18418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18418");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              444444444444444444444444444444444444444444444444444...", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                              444444444444444444444444444444444444444444444444444..." + "'", str8, "                              444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test18419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0054");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0054" + "'", str1, "\\U0054");
    }

    @Test
    public void test18420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18420");
        char[] charArray4 = new char[] { ' ' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih_HHHHHHHHHH", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH", "Di!        (\\U0020,ItalicniueD#########################################################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hI!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005", 84);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18425");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale locale9 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.lang.String str14 = locale11.getExtension('C');
        java.lang.String str15 = locale10.getDisplayLanguage(locale11);
        java.util.Locale.setDefault(locale10);
        java.lang.String str17 = locale9.getDisplayVariant(locale10);
        java.lang.String str18 = locale6.getDisplayVariant(locale10);
        java.util.Locale locale22 = new java.util.Locale("ILATiNA...", "HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", "iTALIAN                                                                ALLEMAND");
        java.lang.String str23 = locale6.getDisplayLanguage(locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale9.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French" + "'", str12, "French");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale22.toString(), "ilatina..._HHHHHHHHH         ITAL\\U0020IITALIAN\\U008600U\\HHHHHHHHH         ITAL_iTALIAN                                                                ALLEMAND");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
    }

    @Test
    public void test18426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)" + "'", str2, "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
    }

    @Test
    public void test18427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Katalanisch", "fRANZ\326SISC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18428");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale8.getDisplayCountry(locale10);
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder22 = builder17.setLocale(locale21);
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale21.getVariant();
        java.util.Locale locale25 = locale21.stripExtensions();
        java.util.Locale locale26 = locale21.stripExtensions();
        java.lang.String str27 = locale10.getDisplayLanguage(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale26.getExtensionKeys();
        java.lang.String str29 = locale5.getDisplayName(locale26);
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = locale30.getDisplayCountry();
        boolean boolean33 = locale30.hasExtensions();
        java.util.Locale.setDefault(locale30);
        boolean boolean35 = locale30.hasExtensions();
        java.lang.String str36 = locale30.getISO3Country();
        java.lang.String str37 = locale5.getDisplayScript(locale30);
        java.lang.String str38 = locale5.getLanguage();
        java.lang.String str39 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str9, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str15, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str19, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Italienisch" + "'", str27, "Italienisch");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u610f\u5927\u5229" + "'", str32, "\u610f\u5927\u5229");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ITA" + "'", str36, "ITA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "und" + "'", str39, "und");
    }

    @Test
    public void test18429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF", "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", 406);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF" + "'", str3, "                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF");
    }

    @Test
    public void test18430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                         \\u005c                                                        ", "                                                                                                                  \\u0068", (int) '\n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Chinesisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA" + "'", str1, "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
    }

    @Test
    public void test18433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18433");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayName(locale12);
        java.util.Locale.setDefault(locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale21 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale17.getDisplayCountry(locale21);
        java.lang.String str25 = locale21.getExtension('E');
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale21.getDisplayName(locale26);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale29.getDisplayVariant(locale30);
        java.lang.String str33 = locale29.getDisplayCountry();
        java.lang.String str34 = locale29.getScript();
        java.lang.String str35 = locale29.getScript();
        java.util.Locale locale36 = java.util.Locale.FRENCH;
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.lang.String str38 = locale37.getDisplayCountry();
        java.lang.String str39 = locale36.getDisplayVariant(locale37);
        java.lang.String str40 = locale36.getDisplayCountry();
        java.lang.String str41 = locale36.getScript();
        java.lang.String str42 = locale36.getScript();
        java.lang.String str43 = locale29.getDisplayCountry(locale36);
        java.util.Locale.Category category44 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale45 = java.util.Locale.getDefault(category44);
        java.util.Locale locale46 = java.util.Locale.FRANCE;
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str49 = locale47.getExtension('h');
        java.lang.String str50 = locale46.getDisplayScript(locale47);
        java.lang.String str51 = locale46.getISO3Country();
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale52);
        java.lang.String str54 = locale46.getDisplayName(locale52);
        java.lang.String str55 = locale46.getScript();
        java.util.Locale.setDefault(category44, locale46);
        java.lang.String str57 = locale29.getDisplayCountry(locale46);
        java.lang.String str58 = locale26.getDisplayScript(locale29);
        java.lang.String str59 = locale16.getDisplayLanguage(locale29);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "allemand" + "'", str13, "allemand");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale21.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITALIAN" + "'", str22, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "China" + "'", str23, "China");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "italian (ITALIAN,English)" + "'", str28, "italian (ITALIAN,English)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + category44 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category44.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "FRA" + "'", str51, "FRA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str54, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "fran\347ais" + "'", str59, "fran\347ais");
    }

    @Test
    public void test18434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.addUnicodeLocaleAttribute("\u52a0\u62ff\u5927\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeIitalian(italian,eng???eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test18435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("EFrankreichgFrankreichFrankreichsEFrankreicundEFrankreichgFrankreichFrankreichsEFrankreich");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE" + "'", str1, "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE");
    }

    @Test
    public void test18436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18436");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("fr_CA                                                   ", "EEEEEEEEEFRAEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18437");
        java.util.Locale locale3 = new java.util.Locale("n", "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "(ROYAUME-UNI)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for KOREZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMANDN (SOUTH KOREA)");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "n_KOREZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMANDN (SOUTH KOREA)_(ROYAUME-UNI)");
    }

    @Test
    public void test18438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18438");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test18439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", "                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test18440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("it_IT", "it-IT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_" + "'", str2, "_");
    }

    @Test
    public void test18441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA" + "'", str2, "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA");
    }

    @Test
    public void test18442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18442");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "englisch", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hcsineilati", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!       _\\u0020_italienisch#########################################################################################_KO", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test18443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18443");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) '\ud504');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504" + "'", str1, "\ud504");
    }

    @Test
    public void test18444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("J", "hi!       _\\U0020_Italienisch####################################################################...", (int) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("francese (Canada)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 997);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test18447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18447");
        java.util.Locale locale1 = new java.util.Locale("                                                         \\u005c                                                        ");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getISO3Country();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder10.setLanguage("ITALIAN");
        java.util.Locale locale13 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.clearExtensions();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale15.getISO3Country();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder18 = builder14.setLocale(locale15);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale.Builder builder22 = builder19.setLanguageTag("Italian");
        java.util.Locale.Builder builder23 = builder19.clearExtensions();
        java.util.Locale.Builder builder24 = builder19.clear();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder27 = builder19.setLocale(locale26);
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = builder27.clear();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale31 = builder29.build();
        java.util.Locale.Builder builder32 = builder18.setLocale(locale31);
        java.lang.String str33 = locale1.getDisplayVariant(locale31);
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str39 = locale37.getExtension('h');
        java.lang.String str40 = locale36.getDisplayScript(locale37);
        java.lang.String str41 = locale36.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale42);
        java.lang.String str44 = locale36.getDisplayName(locale42);
        java.lang.String str45 = locale36.getScript();
        java.util.Locale.setDefault(category34, locale36);
        java.util.Set<java.lang.String> strSet47 = locale36.getUnicodeLocaleKeys();
        java.lang.String str48 = locale36.getCountry();
        java.util.Locale locale49 = locale36.stripExtensions();
        java.lang.String str50 = locale31.getDisplayLanguage(locale49);
        org.junit.Assert.assertEquals(locale1.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French (Canada)" + "'", str8, "French (Canada)");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "FRA" + "'", str41, "FRA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str44, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "FR" + "'", str48, "FR");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test18448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18448");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("uni", "CCCC\\CCCCC                                                             ", (int) 'T', 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uniCCCC\\CCCCC                                                             " + "'", str4, "uniCCCC\\CCCCC                                                             ");
    }

    @Test
    public void test18449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18449");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhanglais (Canada)", 'g');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test18450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18450");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = new java.util.Locale("\\u005c");
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale14);
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale12.getDisplayScript(locale14);
        java.util.Locale.setDefault(locale12);
        java.util.Locale.setDefault(category10, locale12);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale22.getExtension('h');
        java.lang.String str25 = locale21.getDisplayScript(locale22);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale21);
        java.lang.String str28 = locale21.getExtension('z');
        java.util.Locale.setDefault(category10, locale21);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.lang.String str34 = locale32.getExtension('h');
        java.lang.String str35 = locale30.getDisplayCountry(locale32);
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category10, locale32);
        java.util.Locale.Builder builder38 = builder6.setLocale(locale32);
        java.util.Locale locale39 = builder38.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder38.setLanguage("HI!HI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: HI!HI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale12.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "franz\366sisch (frankreich)" + "'", str15, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!       " + "'", str26, "hi!       ");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italian" + "'", str31, "Italian");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
    }

    @Test
    public void test18451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("talian", "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian" + "'", str2, "talian");
    }

    @Test
    public void test18452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("NE_NAILATI_", "italian (italian,english)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test18453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18453");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Etats-Unis", "hhh italia");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u52a0\u62ff\u5927" + "'", str1, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test18455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18455");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                         ", 262, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test18456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test18457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("f_KOREAN", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f_KOREAN" + "'", str2, "f_KOREAN");
    }

    @Test
    public void test18458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) 'f');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18460");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale locale10 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setExtension('U', "ITALIANITALIANITALIANITALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ITALIANITALIANITALIANITALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "und_CA");
    }

    @Test
    public void test18461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ", 'C', '\u671d');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      " + "'", str3, "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
    }

    @Test
    public void test18462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18462");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "KKKKKKKKKKKKKKKKKKKK)DNK( HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", (java.lang.CharSequence) "                                                                                     German (Germany)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test18463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...                             xxxxxxxxxxxxxxxxxxtit...                             xxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ..." + "'", str1, "xxxxxxxxxxxxxxxxxxx                             ...titxxxxxxxxxxxxxxxxxx                             ...");
    }

    @Test
    public void test18464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\ud504\ub791\uc2a4hi!(\\u0020,italienisch#########################################################################################)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "FranzosischFranzosisch (Frankreich)", (java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444", "\\u0069");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test18468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18468");
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
        java.util.Set<java.lang.Character> charSet42 = locale12.getExtensionKeys();
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
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(charSet42);
    }

    @Test
    public void test18469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test18470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test18471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (int) 'n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18472");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                        ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand", "                               INGLESE                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18474");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 314);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18475");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("FrancGa", "44444444444", 347, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444" + "'", str4, "44444444444");
    }

    @Test
    public void test18476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw" + "'", str1, "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
    }

    @Test
    public void test18477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18477");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("99999\\u0021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "a");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99999\\u0021" + "'", str3, "99999\\u0021");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test18478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18478");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test18479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18479");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ixii", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ALLEMAND", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18480");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getISO3Country();
        boolean boolean8 = locale6.hasExtensions();
        java.lang.String str9 = locale6.getISO3Language();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.util.Locale locale15 = locale10.stripExtensions();
        java.lang.String str16 = locale15.getISO3Country();
        boolean boolean17 = locale15.hasExtensions();
        java.lang.String str18 = locale15.getLanguage();
        java.lang.String str19 = locale6.getDisplayLanguage(locale15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("canada", locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fra" + "'", str9, "fra");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fran\347ais" + "'", str19, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CANADA" + "'", str20, "CANADA");
    }

    @Test
    public void test18481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A", "8600U\\                                                                                                                  ", "hi!(\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A" + "'", str3, "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
    }

    @Test
    public void test18482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18482");
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
        java.util.Locale locale89 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet90 = locale89.getExtensionKeys();
        java.lang.String str91 = locale89.getVariant();
        java.lang.String str92 = locale89.getDisplayName();
        java.lang.String str93 = locale89.getDisplayLanguage();
        java.lang.String str94 = locale89.getISO3Language();
        java.util.Set<java.lang.String> strSet95 = locale89.getUnicodeLocaleKeys();
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList88, (java.util.Collection<java.lang.String>) strSet95);
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
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "it");
        org.junit.Assert.assertNotNull(charSet90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
// flaky:         org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Italian" + "'", str92, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Italian" + "'", str93, "Italian");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "ita" + "'", str94, "ita");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test18483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18483");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ecanadaGcanadacanadaSH                                                                                                   ", (java.lang.CharSequence) "german (germany)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ecanadaGcanadacanadaSH                                                                                                   " + "'", charSequence2, "ecanadaGcanadacanadaSH                                                                                                   ");
    }

    @Test
    public void test18484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhh (                                                                                     G             )", "                                     fran\347ais (France)                                      ", (int) '7');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18485");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaAnihCaaaaaaaaaaaaaaaaaaaaaaaaaa", "Eagaas\\\\\\\\\\\\\\HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test18486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("okokok");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "okokok" + "'", str1, "okokok");
    }

    @Test
    public void test18487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("              TA...", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED.." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
    }

    @Test
    public void test18488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", "                         dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" + "'", str2, "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
    }

    @Test
    public void test18489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18489");
        char[] charArray9 = new char[] { 'f', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITA", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ROYAUME-UNI", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test18490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("          HI!           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test18491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("... g ...", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18492");
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
        java.lang.String str21 = locale14.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!       " + "'", str21, "hi!       ");
    }

    @Test
    public void test18493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!" + "'", str1, "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!");
    }

    @Test
    public void test18494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("e                               e                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: e                               e                    [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test18495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("zhAzhzhzhzhzhzhzhzhzhzh", "CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhAzhzhzhzhzhzhzhzhzhzh" + "'", str2, "zhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test18496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !ih                            ", "fran\347ais(france)(CHINESE(CHINA)", (int) '\r');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test18497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18497");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "United Kingdom");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test18498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("italiaE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiaE" + "'", str1, "italiaE");
    }

    @Test
    public void test18499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18499");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italie", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw4by4bz4ca4cc4cd4cf4cg4ch4ci4ck4cl4cm4cn4co4cr4cu4cv4cw4cx4cy4cz4de4dj4dk4dm4do4dz4ec4ee4eg4eh4er4es4et4fi4fj4fk4fm4fo4fr4ga4gb4gd4ge4gf4gg4gh4gi4gl4gm4gn4gp4gq4gr4gs4gt4gu4gw4gy4hk4hm4hn4hr4ht4hu4id4ie4il4im4in4io4iq4ir4is4it4je4jm4jo4jp4ke4kg4kh4ki4km4kn4kp4kr4kw4ky4kz4la4lb4lc4li4lk4lr4ls4lt4lu4lv4ly4ma4mc4md4me4mf4mg4mh4mk4ml4mm4mn4mo4mp4mq4mr4ms4mt4mu4mv4mw4mx4my4mz4na4nc4ne4nf4ng4ni4nl4no4np4nr4nu4nz4om4pa4pe4pf4pg4ph4pk4pl4pm4pn4pr4ps4pt4pw4py4qa4re4ro4rs4ru4rw4sa4sb4sc4sd4se4sg4sh4si4sj4sk4sl4sm4sn4so4sr4ss4st4sv4sx4sy4sz4tc4td4tf4tg4th4tj4tk4tl4tm4tn4to4tr4tt4tv4tw4tz4ua4ug4um4us4uy4uz4va4vc4ve4vg4vi4vn4vu4wf4ws4ye4yt4za4zm4zw");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test18500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18500");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str9 = locale1.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0020italianitalianitalianitali" + "'", str10, "\\u0020italianitalianitalianitali");
    }
}
