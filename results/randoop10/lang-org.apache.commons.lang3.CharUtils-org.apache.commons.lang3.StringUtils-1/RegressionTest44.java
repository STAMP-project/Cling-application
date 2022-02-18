import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test22001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22001");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(")hcierknarF( hcsisoznarFhcsisoznarF#########", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
    }

    @Test
    public void test22003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22003");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('S');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0053" + "'", str1, "\\u0053");
    }

    @Test
    public void test22004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22004");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=zh_cnfrench(canada)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22005");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("\\xtalxan_ITALIAN_Englxsh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\xtalxan_ITALIAN_Englxsh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test22006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22006");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Locale.setDefault(category2, locale5);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.lang.String str11 = locale9.getExtension('x');
        java.util.Locale.setDefault(category2, locale9);
        java.util.Locale locale13 = java.util.Locale.getDefault(category2);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category2, locale15);
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
        java.util.Locale.Category category32 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale33 = java.util.Locale.getDefault(category32);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str37 = locale35.getExtension('h');
        java.lang.String str38 = locale34.getDisplayScript(locale35);
        java.lang.String str39 = locale34.getISO3Country();
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale40);
        java.lang.String str42 = locale34.getDisplayName(locale40);
        java.lang.String str43 = locale34.getScript();
        java.util.Locale.setDefault(category32, locale34);
        java.lang.String str45 = locale17.getDisplayCountry(locale34);
        java.util.Locale.Builder builder46 = new java.util.Locale.Builder();
        java.util.Locale locale47 = builder46.build();
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str50 = locale47.getDisplayLanguage(locale49);
        java.lang.String str51 = locale34.getDisplayVariant(locale47);
        java.util.Locale.setDefault(category2, locale47);
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale54.getExtension('h');
        java.lang.String str57 = locale53.getDisplayScript(locale54);
        java.util.Locale locale58 = locale53.stripExtensions();
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.util.Locale locale61 = java.util.Locale.ENGLISH;
        java.lang.String str62 = locale61.getDisplayLanguage();
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale61);
        java.lang.String str64 = locale61.getCountry();
        java.lang.String str65 = locale61.getCountry();
        boolean boolean66 = locale61.hasExtensions();
        java.lang.String str67 = locale58.getDisplayVariant(locale61);
        java.lang.String str69 = locale61.getExtension('a');
        java.lang.String str70 = locale47.getDisplayScript(locale61);
        java.lang.String str71 = locale0.getDisplayCountry(locale47);
        java.lang.String str72 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "allemand" + "'", str6, "allemand");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
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
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category32.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FRA" + "'", str39, "FRA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str42, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "anglais" + "'", str62, "anglais");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "!IH" + "'", str63, "!IH");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test22007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Undetermined", "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Undetermined" + "'", str2, "Undetermined");
    }

    @Test
    public void test22009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22009");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                       \\u0020iTALIANiTALIANiTALIANiTALI                                  Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test22010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22010");
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
        java.util.Locale locale28 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = locale19.getDisplayCountry(locale29);
        java.util.Locale locale33 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str34 = locale19.getDisplayScript(locale33);
        java.lang.String str35 = locale33.getDisplayName();
        java.lang.String str36 = locale33.getVariant();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais" + "'", str20, "anglais");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH" + "'", str21, "!IH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale33.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                     fran\347ais (france)                                       (CHINESE (CHINA)" + "'", str35, "                                     fran\347ais (france)                                       (CHINESE (CHINA)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test22011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ANGLAIS (R                                                                                                                     ", "u0034\\u00                                             hcstuD                                             \\u0034\\u00", (int) 'l');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                     g             e", "44444444444444444444444444444444!IH", "8600u\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ti");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test22013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22013");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", 71, (int) ')');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)" + "'", str4, "german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
    }

    @Test
    public void test22014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("talian_ITALIAN_English         ital", "ITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talian_ITALIAN_English         ital" + "'", str2, "talian_ITALIAN_English         ital");
    }

    @Test
    public void test22016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ch", "NC_H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ch" + "'", str2, "ch");
    }

    @Test
    public void test22018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22018");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("itTAiT_ITALIAN_EgAish", 71, 347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22019");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a700u\\  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22020");
        java.util.Locale locale1 = new java.util.Locale("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA");
        org.junit.Assert.assertEquals(locale1.toString(), "!       allemandtalienischallemanditalian_talan_eng    \\     adaeafagaala");
    }

    @Test
    public void test22021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("USEEEE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "USEEEE" + "'", str1, "USEEEE");
    }

    @Test
    public void test22022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22022");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet7 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test22023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22023");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("italian(italian,eng", "hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22024");
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
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("HCSTUD \\U0034");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: HCSTUD \\U0034 [at index 0]");
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
    }

    @Test
    public void test22025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22025");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Chinese", (java.lang.CharSequence) "E g");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test22026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                               \\U002", 88, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22027");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 \\U0020  ", "DEUTSCD\\XTALXAN_ITALIAN_ENGLXSH", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22028");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleKeys();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet13, "                                                                                        e                               ");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str10, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test22029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22029");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setUnicodeLocaleKeyword("EN_US", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: EN_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test22030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT [at index 0]");
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
    }

    @Test
    public void test22031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("allemand (Allemagne)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "allemand (Allemagne)" + "'", str1, "allemand (Allemagne)");
    }

    @Test
    public void test22032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test22033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22033");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.setDefault(locale5);
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.util.Locale locale9 = new java.util.Locale("\\u0068");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Locale locale13 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str15 = locale9.getDisplayName(locale13);
        java.lang.String str16 = locale9.getDisplayCountry();
        java.lang.String str17 = locale1.getDisplayCountry(locale9);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale.Builder builder22 = builder19.setLocale(locale20);
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder24 = builder19.setLocale(locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale1.getDisplayLanguage(locale23);
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.lang.String str28 = locale27.getISO3Language();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.lang.String str30 = locale1.getDisplayVariant(locale27);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (Canada)" + "'", str7, "French (Canada)");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals(locale13.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!ih" + "'", str14, "!ih");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\u0068" + "'", str15, "\\u0068");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Canada" + "'", str17, "Canada");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (Canada)" + "'", str21, "French (Canada)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Franz\366sisch" + "'", str26, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test22034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444allemand4444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444llemnd4444" + "'", str2, "4444llemnd4444");
    }

    @Test
    public void test22035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22035");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setScript("");
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("en");
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = locale10.getDisplayCountry(locale11);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale10);
        java.util.Locale locale17 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder8.removeUnicodeLocaleAttribute("s (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: s (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
    }

    @Test
    public void test22036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22036");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'f', (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test22037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22037");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setLanguageTag("Italian");
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("\uc601\uc5b4", locale9);
        java.lang.Object obj14 = locale9.clone();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ko" + "'", str11, "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc601\uc5b4" + "'", str13, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "ko");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "ko");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "ko");
    }

    @Test
    public void test22038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22039");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("itTAiT_ITALIAN_EgAish                                                                               ", "                                                                               ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test22040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22040");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder16.build();
        java.util.Locale.Builder builder19 = builder16.clearExtensions();
        java.util.Locale.Builder builder20 = builder19.clear();
        java.util.Locale.Builder builder22 = builder19.setScript("");
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale locale24 = builder23.build();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("\\u005", locale24);
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FRA" + "'", str7, "FRA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str10, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\U005" + "'", str25, "\\U005");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
    }

    @Test
    public void test22041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22041");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getExtension('F');
        java.lang.String str5 = locale1.toLanguageTag();
        boolean boolean6 = locale1.hasExtensions();
        java.lang.String str7 = locale1.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
    }

    @Test
    public void test22042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AnihCFFFFFFFF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ", "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     " + "'", str2, "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ");
    }

    @Test
    public void test22044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22044");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        java.lang.String[] strArray5 = java.util.Locale.getISOCountries();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray4, strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\U0078");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, 'k', (int) 'C', 20);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str6, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str7, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test22045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("anglais (Canada)CHINESE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada)CHINESE" + "'", str1, "anglais (Canada)CHINESE");
    }

    @Test
    public void test22046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Eng", "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Franz\366sisch(Frankreich)", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22048");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str15 = locale12.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
    }

    @Test
    public void test22049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!        (\\U0020,Italienisch#########################################################################################)", "                                      fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22050");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale locale8 = locale5.stripExtensions();
        java.lang.String str9 = locale4.getDisplayVariant(locale5);
        java.lang.String str10 = locale2.getDisplayLanguage(locale5);
        java.util.Locale locale11 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet12 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale2.getDisplayName();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("fr-C", locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Franz\366sisch" + "'", str10, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "French (Canada)" + "'", str13, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR-C" + "'", str14, "FR-C");
    }

    @Test
    public void test22051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22051");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U0020ITALIANITALIANITALIANITALI", (double) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=50.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22052");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French (France)" + "'", str7, "French (France)");
    }

    @Test
    public void test22053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22053");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u6cd5\u6587\u52a0\u62ff\u5927)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(???)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22054");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 't', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 't' + "'", char2 == 't');
    }

    @Test
    public void test22055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22055");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale10 = new java.util.Locale("i\\u0020iTALIANiTALIANiTALIANiTALIit", "Hhhhhhhhhh");
        java.lang.String str11 = locale4.getDisplayName(locale10);
        java.lang.String str12 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "i\\u0020italianitalianitalianitaliit_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test22056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22056");
        java.util.Locale locale3 = new java.util.Locale("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "fRENCH (fRANCE)", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali_FRENCH (FRANCE)_ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str4, "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test22057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22057");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("italian_ITALIAN_EnglisF", 47, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22058");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str4 = locale0.getDisplayScript(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getLanguage();
        java.lang.String str9 = locale5.getISO3Language();
        java.lang.String str10 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale11 = locale0.stripExtensions();
        java.lang.String str13 = locale11.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cinese" + "'", str10, "cinese");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ROYAUME-UNI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test22061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22061");
        java.util.Locale locale1 = new java.util.Locale("KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
        org.junit.Assert.assertEquals(locale1.toString(), "kkkkkkkkkkkkkkkkkkkk)dnk(hcsis\326znrfkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test22062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic" + "'", str1, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
    }

    @Test
    public void test22063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22065");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str5 = locale1.getExtension('x');
        java.lang.String str6 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
    }

    @Test
    public void test22066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR", "                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("zzzChina", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("5", 400, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444544444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test22070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22070");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("BBBBBBILATiNA...royaume-uniroyaume-uniroyBBBBBBB", 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("dallemandallemandallemandallemandallemandallemandallemandalle", ".Korean (South Korea)Korean (So", "                                        ITtaIt_italian_eGaISH                                 \\U006");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test22072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22072");
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
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList35, filteringMode39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.util.Locale.FilteringMode filteringMode54 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList50, filteringMode54);
        java.util.Locale.LanguageRange[] languageRangeArray56 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList57 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList57, languageRangeArray56);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList57, (java.util.Collection<java.lang.String>) strList62, filteringMode64);
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList55, filteringMode64);
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str69 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList67, ' ');
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
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + filteringMode54 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode54.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(languageRangeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode64.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test22073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22073");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale0.getDisplayVariant(locale1);
        java.lang.String str6 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test22074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                    ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         ..." + "'", str2, "                                                                         ...");
    }

    @Test
    public void test22075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22075");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "     e                               e                               e            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82 + "'", int1 == 82);
    }

    @Test
    public void test22076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "japonais");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Japonais" + "'", str1, "Japonais");
    }

    @Test
    public void test22077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" (italian,english)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " (ITALIAN,ENGLISH)" + "'", str1, " (ITALIAN,ENGLISH)");
    }

    @Test
    public void test22078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22078");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", '\n');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test22079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22079");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setVariant("CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test22080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u4e2d\u6587                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22081");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayName();
        java.util.Locale.Builder builder16 = builder10.setLocale(locale14);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.util.Locale.Builder builder21 = builder10.setLocale(locale18);
        java.util.Locale locale22 = builder10.build();
        java.lang.String str23 = locale1.getDisplayLanguage(locale22);
        java.lang.String str24 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese (China)" + "'", str15, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test22082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hhhhhhhhh", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22083");
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
            java.util.Locale.Builder builder12 = builder6.setScript("2it hi!       _\\u0020_italienisch####################################################################            2it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2it hi!       _\\u0020_italienisch####################################################################            2it [at index 0]");
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
    public void test22084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22084");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 371);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str1, "\u82f1\u6587\u82f1\u56fd)");
    }

    @Test
    public void test22086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22086");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22087");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder5.setVariant("esenihC");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test22088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0064f (KOREAN)", 122, (int) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0064f (KOREAN)" + "'", str3, "\\U0064f (KOREAN)");
    }

    @Test
    public void test22089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'l', 'F');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEngFischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEngFischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test22091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Eagaas\\\\\\\\\\\\\\HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eagaas\\\\\\\\\\\\\\HI!HI!" + "'", str1, "Eagaas\\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test22092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test22093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("chinese", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22094");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test22095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "frnz\366sisch#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzlafrnz\366sisch ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("zho");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Chinese (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test22097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("en_GB", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_GB" + "'", str2, "en_GB");
    }

    @Test
    public void test22098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischall");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "tTAT_ITA                                                                                                ", "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0020TALIANTALIANTALIANiTALI", "ITALIAN (italian,eNGLISH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ..." + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
    }

    @Test
    public void test22102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22102");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Fr ncG ", charArray10);
        java.lang.Class<?> wildcardClass15 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaCaaaaaaaaaaaa", "italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g", 29);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22104");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 104 + "'", int1 == 104);
    }

    @Test
    public void test22105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U0020", "LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020" + "'", str2, "\\U0020");
    }

    @Test
    public void test22106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#u##2#iTALIANiTALIANiTALIANiT", "\uce90\ub098\ub2e4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#u##2#iTALIANiTALIANiTALIANiT" + "'", str2, "#u##2#iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test22107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ", "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22108");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                            zzzChina", "FRANZ\326SISCH2(FRANKREICH)", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("FRA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22110");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\", 12);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                           U0020");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test22111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22111");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)", (java.lang.CharSequence) "ja                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22112");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("talian_ITALIAN_English         ital");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22113");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", 89, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\U0046");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0046" + "'", str1, "\\u0046");
    }

    @Test
    public void test22115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22115");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ", (int) '9');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str4, "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test22116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22116");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\ud504");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test22117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22117");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test22118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hhhhhhhhh", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 997, (int) 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        java.lang.String str12 = locale11.getDisplayCountry();
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test22121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                         \\u005c                                                        ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("Eagaash", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test22122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22122");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0035", "NI", 23);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                         fran\347                          ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0035" + "'", str5, "\\u0035");
    }

    @Test
    public void test22123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22123");
        java.util.Locale locale2 = new java.util.Locale("zhAzhzhzhzhzhzhzhzhzhzh", "und-CA");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("italian");
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale.Builder builder12 = builder9.setLocale(locale10);
        java.lang.String str13 = locale10.getVariant();
        java.util.Locale locale14 = locale10.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getLanguage();
        java.lang.String str19 = locale15.getISO3Language();
        java.lang.String str20 = locale15.getDisplayLanguage();
        java.lang.String str21 = locale10.getDisplayVariant(locale15);
        java.lang.String str22 = locale4.getDisplayVariant(locale10);
        boolean boolean23 = locale2.equals((java.lang.Object) locale4);
        org.junit.Assert.assertEquals(locale2.toString(), "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ita" + "'", str19, "ita");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Italian" + "'", str20, "Italian");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test22124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "SUen_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test22125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U0020IiTALIAN\\U0020I", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("citalian_ITALIAN_Englishna)\\u0069h...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "citalian_ITALIAN_Englishna)\\u0069h..." + "'", str4, "citalian_ITALIAN_Englishna)\\u0069h...");
    }

    @Test
    public void test22127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22127");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.setLanguageTag("anglais");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setVariant("\\u0020iTALIANiTALIANiTALIANiT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: \\u0020iTALIANiTALIANiTALIANiT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test22128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22128");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList26);
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList39, filteringMode43);
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList54, filteringMode56);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList54, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList44, filteringMode58);
        java.lang.String str61 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strList44);
        java.util.Collection<java.util.Locale> localeCollection62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale63 = java.util.Locale.lookup(languageRangeList3, localeCollection62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode43.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode56.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test22129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22129");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "44444444444444444444444444444444", 29);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\" + "'", str5, "...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\");
    }

    @Test
    public void test22130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("fr-", "JP", 120);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ')', 105, 40);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test22132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22132");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ilatinailatinailatinailati0200u\\", "HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", "                                                      englisch                                                       ", 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ilatinailatinailatinailati0200u\\" + "'", str4, "ilatinailatinailatinailati0200u\\");
    }

    @Test
    public void test22133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u0034\\u00hcstuD\\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00hcstuD\\u0034\\u0" + "'", str1, "\\u0034\\u00hcstuD\\u0034\\u0");
    }

    @Test
    public void test22134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22134");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "00000000000000COR\311EN (cOR\311E DU sUD)", (java.lang.CharSequence) "CCCC\\CCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test22135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h########################################################################################" + "'", str1, "h########################################################################################");
    }

    @Test
    public void test22136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22136");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" ", "E             g                          sh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str1, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test22138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22138");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'b', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22139");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Egsh" + "'", str7, "Egsh");
    }

    @Test
    public void test22140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "44444444444444ITALIAN44444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                       HI!                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA" + "'", str4, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
    }

    @Test
    public void test22141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22141");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", "giapponese", 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str4, "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test22142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22142");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ", "Frnz\366sisch(Knd)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22143");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITALIE", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("cinese (Cina)\\u0069h...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisc", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\!u!00!de!\\!u!00", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Italienisch#########################################################################################", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'x');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
    }

    @Test
    public void test22145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22145");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Undetermined", 'A');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u007a", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Undetermined" + "'", str6, "Undetermined");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str8, "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test22146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22146");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setRegion("IT");
        java.util.Locale.Builder builder8 = builder4.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setUnicodeLocaleKeyword("u Italia u", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: u Italia u [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test22147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22147");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0054", '\ud504');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r", "                                               TALY                                                   TALY     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               TALY                                                   TALY     " + "'", str2, "                                               TALY                                                   TALY     ");
    }

    @Test
    public void test22150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("FRANZ\326SISCHF(FRANKREICH)", "     ", "hi!        (\\U0020,Italifran\347#######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANZ\326SISCHF(FRANKREICH)" + "'", str3, "FRANZ\326SISCHF(FRANKREICH)");
    }

    @Test
    public void test22152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...\r\r\r\r\r\r\r\r..", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\r\r\r\r\r\r\r\r.." + "'", str2, "...\r\r\r\r\r\r\r\r..");
    }

    @Test
    public void test22153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ITALIAN (italian,eNGLISH)", 6, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN (italian,eNGLISH)" + "'", str3, "ITALIAN (italian,eNGLISH)");
    }

    @Test
    public void test22154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "\\u007");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test22156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZOSISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZOSISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test22157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test22158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG", "               Deutschland");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22159");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setLanguageTag("Italian");
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        java.util.Locale.Builder builder11 = builder6.clear();
        java.util.Locale.Builder builder12 = builder6.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str18 = locale17.getDisplayScript();
        java.lang.String str19 = locale15.getDisplayCountry(locale17);
        java.util.Set<java.lang.Character> charSet20 = locale15.getExtensionKeys();
        java.util.Locale.Builder builder21 = builder6.setLocale(locale15);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale24.getDisplayCountry();
        java.lang.String str26 = locale23.getDisplayVariant(locale24);
        java.lang.String str27 = locale23.getDisplayCountry();
        java.lang.String str28 = locale23.getScript();
        java.lang.String str29 = locale23.getScript();
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale30.getDisplayVariant(locale31);
        java.lang.String str34 = locale30.getDisplayCountry();
        java.lang.String str35 = locale30.getScript();
        java.lang.String str36 = locale30.getScript();
        java.lang.String str37 = locale23.getDisplayCountry(locale30);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale30);
        java.lang.String str39 = locale30.getDisplayName();
        java.util.Locale locale40 = null;
        java.lang.String str41 = locale30.getDisplayVariant(locale40);
        java.util.Set<java.lang.String> strSet42 = locale30.getUnicodeLocaleKeys();
        java.lang.String str43 = locale15.getDisplayVariant(locale30);
        java.util.Locale.Builder builder44 = builder5.setLocale(locale15);
        java.util.Locale.Builder builder45 = builder44.clearExtensions();
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder48 = builder46.setRegion("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str38, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test22160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22160");
        java.util.Locale locale1 = new java.util.Locale("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayVariant(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "cccccccccccccanglais (canadaccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test22161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22161");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet3, '\\');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test22162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("cHN", "uuuu", 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHN" + "'", str3, "cHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHN");
    }

    @Test
    public void test22163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str1, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test22164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22164");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "                                                                                        e                        ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ITALIANITALIANITALIANITALI", "                                                     \\u005c        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIANITALIANITALIANITALI" + "'", str2, "ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test22166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)" + "'", str2, "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)");
    }

    @Test
    public void test22167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("anglais (royaume-uni)fra", "\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)", ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4" + "'", str2, "\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4");
    }

    @Test
    public void test22169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22169");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale14);
        java.lang.String str17 = locale14.getCountry();
        java.lang.String str18 = locale8.getDisplayCountry(locale14);
        java.lang.String str19 = locale14.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
    }

    @Test
    public void test22170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22170");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'h');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", (int) 'x', 216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22171");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nglish (united kingdom)", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                        ittait_italian_egaish                                 \\u006");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "600u\\                                 hsiage_nailati_tiatti                                        " + "'", str1, "600u\\                                 hsiage_nailati_tiatti                                        ");
    }

    @Test
    public void test22173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                " + "'", str1, "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                ");
    }

    @Test
    public void test22174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...E_NAILATI...", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...E_NAILATI..." + "'", str2, "...E_NAILATI...");
    }

    @Test
    public void test22175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22175");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("cHINESISCH (cHINA)", "AD5AE5AF5AG5AI5AL5AM5AN5AO5AQ5AR5AS5AT5AU5AW5AX5AZ5BA5BB5BD5BE5BF5BG5BH5BI5BJ5BL5BM5BN5BO5BQ5BR5BS5BT5BV5BW5BY5BZ5CA5CC5CD5CF5CG5CH5CI5CK5CL5CM5CN5CO5CR5CU5CV5CW5CX5CY5CZ5DE5DJ5DK5DM5DO5DZ5EC5EE5EG5EH5ER5ES5ET5FI5FJ5FK5FM5FO5FR5GA5GB5GD5GE5GF5GG5GH5GI5GL5GM5GN5GP5GQ5GR5GS5GT5GU5GW5GY5HK5HM5HN5HR5HT5HU5ID5IE5IL5IM5IN5IO5IQ5IR5IS5IT5JE5JM5JO5JP5KE5KG5KH5KI5KM5KN5KP5KR5KW5KY5KZ5LA5LB5LC5LI5LK5LR5LS5LT5LU5LV5LY5MA5MC5MD5ME5MF5MG5MH5MK5ML5MM5MN5MO5MP5MQ5MR5MS5MT5MU5MV5MW5MX5MY5MZ5NA5NC5NE5NF5NG5NI5NL5NO5NP5NR5NU5NZ5OM5PA5PE5PF5PG5PH5PK5PL5PM5PN5PR5PS5PT5PW5PY5QA5RE5RO5RS5RU5RW5SA5SB5SC5SD5SE5SG5SH5SI5SJ5SK5SL5SM5SN5SO5SR5SS5ST5SV5SX5SY5SZ5TC5TD5TF5TG5TH5TJ5TK5TL5TM5TN5TO5TR5TT5TV5TW5TZ5UA5UG5UM5US5UY5UZ5VA5VC5VE5VG5VI5VN5VU5WF5WS5YE5YT5ZA5ZM5ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHINESISCH (cHINA)" + "'", str2, "cHINESISCH (cHINA)");
    }

    @Test
    public void test22177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22177");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023", "                                                                                              Deutsch", 574);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22179");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u000d", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u007", strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("hcstued-e#__nailati", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u000d" + "'", str5, "\\u000d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                          francese (Canada)                                           ", (int) 'g', 400);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("NAC", 't');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NAC" + "'", str2, "NAC");
    }

    @Test
    public void test22182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HCSTUD \\U0034", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca" + "'", str2, "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca");
    }

    @Test
    public void test22183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ')', ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22184");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Italienisch#########################################################################################", "!ih");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray9, strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("8600u\\", strArray4, strArray9);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.endsWithAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa004600000000000000000000000000000000000000000000000000000000", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "8600u\\" + "'", str20, "8600u\\");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test22185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig" + "'", str2, "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
    }

    @Test
    public void test22186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Chinesisch (Ch", "44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz" + "'", str2, "zhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test22188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "chinoisf(Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinoisf(Chine)" + "'", str2, "chinoisf(Chine)");
    }

    @Test
    public void test22189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI" + "'", str2, "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
    }

    @Test
    public void test22190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22190");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str9 = locale7.getExtension('x');
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale14 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getScript();
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale17.getCountry();
        java.util.Locale.setDefault(locale17);
        java.util.Locale.setDefault(category0, locale17);
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
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale41);
        java.util.Locale locale55 = locale41.stripExtensions();
        java.util.Locale.setDefault(category0, locale55);
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        java.lang.String str58 = locale57.getDisplayLanguage();
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        java.lang.String str61 = locale59.getExtension('h');
        java.lang.String str62 = locale57.getDisplayCountry(locale59);
        java.util.Locale locale65 = new java.util.Locale("\\u0066");
        java.lang.String str67 = locale65.getExtension('i');
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale65);
        java.lang.String str69 = locale65.getScript();
        java.lang.String str70 = locale59.getDisplayName(locale65);
        java.lang.String str71 = locale65.getDisplayName();
        java.lang.String str72 = locale55.getDisplayName(locale65);
        java.lang.String str73 = locale55.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals(locale14.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "US" + "'", str20, "US");
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
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str54, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "italien" + "'", str58, "italien");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals(locale65.toString(), "\\u0066");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "cinese (cina)\\u0069h..." + "'", str68, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Italian" + "'", str70, "Italian");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\\u0066" + "'", str71, "\\u0066");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "French (France)" + "'", str72, "French (France)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "fr" + "'", str73, "fr");
    }

    @Test
    public void test22191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22191");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test22192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("canad", 'b');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22193");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO", "Chinese", 5);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                                        anglais (royaume-uni)FRA                                         ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZHO" + "'", str6, "ZHO");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!       _\\u0020_italienisch####################################################################..." + "'", str1, "Hi!       _\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test22195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22195");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.lang.String str5 = locale0.getDisplayVariant(locale2);
        java.lang.Object obj6 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "de");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "de");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "de");
    }

    @Test
    public void test22196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22196");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "1\\U0061\\U0061\\U0061");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test22197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...dedcfcgchcickclcmcncocrcucvcwcxcyczdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdaeafagaialamanaoaqarasatauawaxazbabbbda", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22198");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getScript();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.lang.String str4 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "allemand" + "'", str1, "allemand");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test22199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22200");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale.setDefault(locale6);
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.lang.String str16 = locale11.getScript();
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayVariant(locale19);
        java.lang.String str22 = locale18.getDisplayCountry();
        java.lang.String str23 = locale18.getScript();
        java.lang.String str24 = locale18.getScript();
        java.lang.String str25 = locale11.getDisplayCountry(locale18);
        java.util.Locale.Category category26 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale29.getExtension('h');
        java.lang.String str32 = locale28.getDisplayScript(locale29);
        java.lang.String str33 = locale28.getISO3Country();
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale34);
        java.lang.String str36 = locale28.getDisplayName(locale34);
        java.lang.String str37 = locale28.getScript();
        java.util.Locale.setDefault(category26, locale28);
        java.lang.String str39 = locale11.getDisplayCountry(locale28);
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.util.Locale.setDefault(locale42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale42);
        java.lang.String str46 = locale42.getDisplayName();
        java.lang.String str47 = locale28.getDisplayScript(locale42);
        java.lang.String str48 = locale1.getDisplayLanguage(locale28);
        java.lang.String str49 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category26.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FRA" + "'", str33, "FRA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str36, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "allemand" + "'", str43, "allemand");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "8600U\\                                                                                                                  " + "'", str45, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fran\347ais (Canada)" + "'", str46, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "anglais" + "'", str48, "anglais");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en" + "'", str49, "en");
    }

    @Test
    public void test22201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('f', "tTAT_ITA");
        java.util.Locale.Builder builder11 = builder6.setRegion("US");
        java.util.Locale.Builder builder12 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test22202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22202");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIENISCH" + "'", str5, "ITALIENISCH");
        org.junit.Assert.assertNotNull(charSet6);
    }

    @Test
    public void test22203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22203");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale.setDefault(locale6);
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = locale1.getDisplayCountry(locale6);
        java.util.Locale locale12 = new java.util.Locale("                                                         \\u005c                                                        ");
        java.util.Locale.setDefault(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.lang.String str15 = locale12.getISO3Country();
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder21.setLanguage("ITALIAN");
        java.util.Locale locale24 = builder21.build();
        java.util.Locale.Builder builder25 = builder21.clearExtensions();
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.lang.String str27 = locale26.getISO3Country();
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder29 = builder25.setLocale(locale26);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder31 = builder30.clearExtensions();
        java.util.Locale.Builder builder33 = builder30.setLanguageTag("Italian");
        java.util.Locale.Builder builder34 = builder30.clearExtensions();
        java.util.Locale.Builder builder35 = builder30.clear();
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder38 = builder30.setLocale(locale37);
        java.util.Locale.Builder builder39 = builder38.clear();
        java.util.Locale.Builder builder40 = builder38.clear();
        java.util.Locale.Builder builder41 = builder40.clear();
        java.util.Locale locale42 = builder40.build();
        java.util.Locale.Builder builder43 = builder29.setLocale(locale42);
        java.lang.String str44 = locale12.getDisplayVariant(locale42);
        java.lang.String str45 = locale6.getDisplayCountry(locale12);
        java.lang.Object obj46 = locale12.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals(locale12.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French (Canada)" + "'", str19, "French (Canada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "italian");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "                                                         \\u005c                                                        ");
    }

    @Test
    public void test22204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("italiaE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiaE" + "'", str1, "italiaE");
    }

    @Test
    public void test22205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22205");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "hhhhhhhhHFranz\366sisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22206");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("e");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e" + "'", str3, "e");
    }

    @Test
    public void test22207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22207");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder0.setVariant("CANADA");
        java.util.Locale locale8 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder0.setExtension('z', "hhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: hhhhhhhhhhhhhhhhhhh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test22208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22208");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("NE_NAILATI_", 120, 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22209");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'g', 'd');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'g' + "'", char2 == 'g');
    }

    @Test
    public void test22210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!       allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 216);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN_ITALIAN_ENGLISH" + "'", str1, "ITALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test22212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni", "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni" + "'", str2, "RoADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
    }

    @Test
    public void test22213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", "                                             hcsfr-CueD                                         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test22214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22214");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getCountry();
        boolean boolean6 = locale1.hasExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Locale locale10 = locale7.stripExtensions();
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str13 = locale7.getExtension('H');
        java.lang.String str14 = locale7.getDisplayVariant();
        java.util.Set<java.lang.String> strSet15 = locale7.getUnicodeLocaleKeys();
        java.lang.String str16 = locale1.getDisplayVariant(locale7);
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale1.getDisplayLanguage(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English" + "'", str2, "English");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test22215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0069HHHHHHHHHH", "e ITALIAN,ENGLISHa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test22217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("italian (italian,engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian (italian,engl" + "'", str1, "italian (italian,engl");
    }

    @Test
    public void test22218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22218");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "Aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22219");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test22220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fran\347ais (Canada)", 'd');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais (Canaaa)" + "'", str4, "fran\347ais (Canaaa)");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test22221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22222");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("nc_HZ                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("tanoch", "hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test22225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "          ita                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          ita                " + "'", str1, "          ita                ");
    }

    @Test
    public void test22227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("uuuuuuuuuuuuuuuuu\\u0066", "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuu\\u0066" + "'", str2, "uuuuuuuuuuuuuuuuu\\u0066");
    }

    @Test
    public void test22228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#########FranzosischFranzosisch (Frankreich)", "talian\\u0032talian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ESENIHC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ESENIHC" + "'", str1, "ESENIHC");
    }

    @Test
    public void test22230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22230");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", (double) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=21.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22231");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("nglish (United Kingdom)french (NC_HZ)", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", "\\u0053");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str2, "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test22233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22233");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test22234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)", 77, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)" + "'", str3, "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
    }

    @Test
    public void test22235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22235");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.getDisplayVariant();
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale0.getDisplayName(locale4);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-US" + "'", str1, "en-US");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English (United States)" + "'", str9, "English (United States)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
    }

    @Test
    public void test22236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22236");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Italie                         ", "", 99);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '.');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Italie                         " + "'", str7, "Italie                         ");
    }

    @Test
    public void test22237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("emand", "ian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getVariant();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("it", locale9);
        java.util.Locale.Builder builder13 = builder1.setLocale(locale9);
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IT" + "'", str12, "IT");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
    }

    @Test
    public void test22239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22239");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaa", "jp", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22240");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'b', 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test22241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22241");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder13 = builder0.setLocale(locale12);
        java.util.Locale.Builder builder16 = builder0.setExtension('b', "TIT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.addUnicodeLocaleAttribute("             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:               [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAN" + "'", str10, "CAN");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test22242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22242");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale0.getDisplayScript(locale3);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getVariant();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale8);
        java.lang.String str12 = locale8.getDisplayName();
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.util.Locale locale20 = locale15.stripExtensions();
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category13, locale20);
        java.lang.String str23 = locale8.getDisplayLanguage(locale20);
        java.lang.String str24 = locale20.toLanguageTag();
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", locale20);
        java.lang.String str26 = locale0.getDisplayName(locale20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0034" + "'", str11, "\\u0034");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (Canada)" + "'", str12, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr-FR" + "'", str24, "fr-FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str25, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais (Canada)" + "'", str26, "fran\347ais (Canada)");
    }

    @Test
    public void test22243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                        aNCHc                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        cHCNa                        " + "'", str1, "                        cHCNa                        ");
    }

    @Test
    public void test22244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22244");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ko-KR                                                                                                    ", 26397);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\U0069cccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test22246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22246");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'k', 'e');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'k' + "'", char2 == 'k');
    }

    @Test
    public void test22247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("und-itTAiT-ITALIAN-EgAish                    ", "            \\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und-itTAiT-ITALIAN-EgAish                    " + "'", str2, "und-itTAiT-ITALIAN-EgAish                    ");
    }

    @Test
    public void test22248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0069");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("ca", "GENCE");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test22250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", "it hi!       _\\U0020...T hi!       _\\U0020...Ai hi!       _\\U0020...T hi!       _\\U0020..._ hi!       _\\U0020...ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                         German (Germany)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22254");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Chinesisch (China", 32);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test22255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22255");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale10.getDisplayLanguage();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str15 = locale14.getDisplayScript();
        java.lang.String str16 = locale12.getDisplayCountry(locale14);
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.lang.String str18 = locale14.getScript();
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str21 = locale20.getCountry();
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.lang.String str27 = locale20.getDisplayLanguage(locale23);
        java.lang.String str28 = locale20.getDisplayVariant();
        java.lang.String str29 = locale20.getDisplayName();
        java.lang.String str30 = locale14.getDisplayScript(locale20);
        java.util.Locale.Builder builder31 = builder9.setLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder9.setRegion("hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hzhzhzhzhzhzhzhzhzhzahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfhzhzhzhzhzhzhzhzhzhz [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italien" + "'", str11, "italien");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test22256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22256");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)", "                                                           ...                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                ESELGNI                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("en-US", "cccccccccccccccccccccccccccccccc", 314);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22259");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0020__AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih dalleman", "                                                                                           U0020ITALIANITALIANITALIANITALI", 194);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22261");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("talian_italian_english", locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TALIAN_ITALIAN_ENGLISH" + "'", str6, "TALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test22262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded" + "'", str1, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded");
    }

    @Test
    public void test22263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22263");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test22264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22264");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "Chinese");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deutsch" + "'", str10, "Deutsch");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test22265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22265");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "z (IFRANZOSISCH)", 54, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test22266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR" + "'", str2, "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
    }

    @Test
    public void test22267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("NE_NAILATI_");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0034\\u00hcstud\\u0034\\u00", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("l", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l" + "'", str2, "l");
    }

    @Test
    public void test22269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0034\\u00 hcstud \\u0034\\u00", "                                                               \\U002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22270");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-FR");
    }

    @Test
    public void test22271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("2E             giTALIANiTALIANiTALIANiTAL", "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)", "ENGLISCH (         italian_italian_english,\\U0061)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test22272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("         italian_italian_engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         italian_italian_engl" + "'", str1, "         italian_italian_engl");
    }

    @Test
    public void test22273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22273");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("dnaHhhhhhhhhdnam");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dnaHhhhhhhhhdnam" + "'", str1, "dnaHhhhhhhhhdnam");
    }

    @Test
    public void test22274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22274");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                      ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA" + "'", str4, "en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
    }

    @Test
    public void test22275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22275");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italie", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test22276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22276");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                      \\u006bCinese (Cina)\\u0069h..                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22277");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italian (italian,e...", "E             g");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test22278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                           z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    italian_ITALIAN_EnglisF", " Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", "...hzhzemandn (South Korea)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...........................................................................................................................................................................................z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................h.hzhhn_.AL.AN_ngzhsF" + "'", str3, "...........................................................................................................................................................................................z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................h.hzhhn_.AL.AN_ngzhsF");
    }

    @Test
    public void test22279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test22280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                           u0020italianitalianitalianital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22281");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale.setDefault(locale4);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
    }

    @Test
    public void test22282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22282");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", (int) 'A', 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIH", "fr_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Eegeesh", (java.lang.CharSequence) "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", (int) 'F', 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str3, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test22287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22288");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.lang.String str4 = locale1.getDisplayScript();
        boolean boolean5 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine..." + "'", str1, "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
    }

    @Test
    public void test22290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("nglisch", " (italian,english)                                      ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("EFrankreichgFrankreichFrankreichs", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test22291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                        e                               ", "                                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e                               " + "'", str2, "e                               ");
    }

    @Test
    public void test22292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22292");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setRegion("IT");
        java.util.Locale.Builder builder8 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("allemand (Allemagne)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: allemand (Allemagne) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test22293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22293");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale9);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("France");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale13);
        java.lang.String str15 = locale13.getDisplayVariant();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale16.getVariant();
        java.lang.String str19 = locale13.getDisplayVariant(locale16);
        java.util.Locale locale22 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str23 = locale13.getDisplayLanguage(locale22);
        java.lang.String str24 = locale9.getDisplayName(locale13);
        java.util.Locale locale26 = new java.util.Locale("");
        java.util.Locale.setDefault(locale26);
        java.util.Set<java.lang.Character> charSet28 = locale26.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("TA...");
        java.lang.String str31 = locale26.getDisplayCountry(locale30);
        java.lang.String str32 = locale30.getDisplayScript();
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str35 = locale30.getDisplayVariant(locale33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.getDefault(category37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayName(locale40);
        java.util.Locale.setDefault(category37, locale40);
        java.util.Set<java.lang.String> strSet43 = locale40.getUnicodeLocaleKeys();
        java.lang.String str44 = locale36.getDisplayVariant(locale40);
        java.lang.String str45 = locale36.getCountry();
        java.lang.String str46 = locale33.getDisplayScript(locale36);
        java.util.Set<java.lang.Character> charSet47 = locale33.getExtensionKeys();
        java.lang.String str48 = locale13.getDisplayCountry(locale33);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                        " + "'", str10, "                                                                                                        ");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "france");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "frankreich" + "'", str14, "frankreich");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "france" + "'", str23, "france");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italian" + "'", str24, "italian");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals(locale30.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "allemand" + "'", str41, "allemand");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "GB" + "'", str45, "GB");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test22294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22294");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", "FRENCH                     ", "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", (int) 'l');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str4, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test22295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hcsineilat", 264, "                                                                              \\     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              \\                                                                                   \\                                                                                   \\       Hcsineilat" + "'", str3, "                                                                              \\                                                                                   \\                                                                                   \\       Hcsineilat");
    }

    @Test
    public void test22296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22296");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('S');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("taly", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22298");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test22299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                okokok                                                                                                                                ", (int) '\u671d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22300");
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
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.lang.String str18 = locale17.getCountry();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant();
        java.util.Set<java.lang.String> strSet23 = locale19.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet24 = locale19.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet25 = locale19.getExtensionKeys();
        java.lang.String str26 = locale17.getDisplayLanguage(locale19);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CA" + "'", str18, "CA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italien" + "'", str20, "italien");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "francese" + "'", str26, "francese");
    }

    @Test
    public void test22301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))", (int) '!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              ))))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str2, "                                                                              ))))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test22302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22302");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22303");
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
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test22304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22304");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.Locale.FilteringMode filteringMode11 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList9, filteringMode11);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList9, filteringMode13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleKeys();
        java.lang.String str22 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strSet21);
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap24);
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale26.getDisplayLanguage();
        java.util.Locale locale28 = locale26.stripExtensions();
        java.lang.String str29 = locale26.getLanguage();
        java.util.Set<java.lang.String> strSet30 = locale26.getUnicodeLocaleKeys();
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet30, 'u');
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet30);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + filteringMode11 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode11.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode13.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italien" + "'", str27, "italien");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "it" + "'", str29, "it");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test22305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22305");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale6.getDisplayLanguage();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.lang.String str9 = locale6.getLanguage();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str15 = locale13.getExtension('h');
        java.lang.String str16 = locale12.getDisplayScript(locale13);
        java.util.Locale locale20 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str21 = locale12.getDisplayCountry(locale20);
        java.lang.String str22 = locale20.getDisplayName();
        java.lang.String str24 = locale20.getExtension('i');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale20);
        java.lang.String str26 = locale6.getDisplayVariant(locale20);
        java.util.Locale.Builder builder27 = builder4.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder27.setLanguage("\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italien" + "'", str7, "italien");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "it" + "'", str9, "it");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals(locale20.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "France" + "'", str21, "France");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str22, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITALIAN                                                                 " + "'", str25, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test22306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("8ian\\u0020i86");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8IAN\\U0020I86" + "'", str1, "8IAN\\U0020I86");
    }

    @Test
    public void test22307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22307");
        java.util.Locale locale3 = new java.util.Locale("", "T", "2CINESE (CINA...");
        org.junit.Assert.assertEquals(locale3.toString(), "_T_2CINESE (CINA...");
    }

    @Test
    public void test22308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("italiano (Italia)", "69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc (E                         IITAL,italian    )", "anglais (royaume-uni)FRA", "                               English(UnitedKingdom)                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc  E                         IIT L, t          " + "'", str3, "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc  E                         IIT L, t          ");
    }

    @Test
    public void test22310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22310");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'N', 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test22311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", 97, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig" + "'", str3, "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
    }

    @Test
    public void test22312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0020iItalian\\u008600u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder13 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setRegion("E gl");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: E gl [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test22314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("u0034\\u00                                             hcstuD                                             \\u0034\\u00", 14, "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777Italian (italian,english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0034\\u00                                             hcstuD                                             \\u0034\\u00" + "'", str3, "u0034\\u00                                             hcstuD                                             \\u0034\\u00");
    }

    @Test
    public void test22316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("           \\U", "                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U" + "'", str2, "\\U");
    }

    @Test
    public void test22318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HCSTUED", 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22319");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\U005", "", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test22320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNHI!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22321");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        java.util.Locale locale14 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.util.Set<java.lang.String> strSet16 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale5.getDisplayName(locale14);
        java.util.Locale locale18 = locale5.stripExtensions();
        java.lang.Object obj19 = locale5.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ALLEMAND" + "'", str15, "ALLEMAND");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French (France)" + "'", str17, "French (France)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "fr_FR");
    }

    @Test
    public void test22322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22322");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HU!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("         italian_ITALIAN_English", "\\u002e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fran\347ais (Canaaa)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22326");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale locale8 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test22327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22327");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale14);
        java.lang.String str17 = locale14.getCountry();
        java.lang.String str18 = locale8.getDisplayCountry(locale14);
        java.util.Set<java.lang.String> strSet19 = locale8.getUnicodeLocaleKeys();
        java.lang.String str20 = locale8.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "anglais" + "'", str15, "anglais");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais" + "'", str20, "anglais");
    }

    @Test
    public void test22328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Englisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Englisch" + "'", str1, "Englisch");
    }

    @Test
    public void test22329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22329");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("chineseaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22330");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih" + "'", str2, "\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih");
    }

    @Test
    public void test22331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
    }

    @Test
    public void test22333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22333");
        java.util.Locale locale2 = new java.util.Locale("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "Franz\366sischFranzosisch (Frankreich)uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "azhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzhfrancais (france)azhzhzhzhzhzhzhzhzhzh_FRANZ\366SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test22334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22334");
        java.util.Locale locale1 = new java.util.Locale("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals(locale1.toString(), "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u0020italianitalianitalianitali");
    }

    @Test
    public void test22335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22335");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("ZH_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ZH_CN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test22336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "U005C");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
    }

    @Test
    public void test22337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22338");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        java.util.Locale locale7 = locale4.stripExtensions();
        java.lang.String str8 = locale3.getDisplayVariant(locale4);
        java.lang.String str9 = locale1.getDisplayLanguage(locale4);
        java.util.Locale locale10 = locale1.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = locale16.getLanguage();
        java.lang.String str19 = locale10.getDisplayVariant(locale16);
        java.lang.String str20 = locale10.getISO3Country();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.util.Locale.Builder builder25 = builder22.setLocale(locale23);
        java.util.Locale.Builder builder26 = builder22.clear();
        java.util.Locale.Builder builder27 = builder26.clear();
        java.util.Locale.Builder builder29 = builder26.setLanguage("zh");
        java.util.Locale locale30 = builder29.build();
        java.util.Locale.setDefault(locale30);
        java.util.Locale locale32 = locale30.stripExtensions();
        java.util.Locale locale33 = locale32.stripExtensions();
        java.lang.String str34 = locale10.getDisplayScript(locale33);
        java.util.Set<java.lang.String> strSet35 = locale10.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "allemand" + "'", str6, "allemand");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Franz\366sisch" + "'", str9, "Franz\366sisch");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italienisch#########################################################################################" + "'", str17, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!       " + "'", str18, "hi!       ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CAN" + "'", str20, "CAN");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (Canada)" + "'", str24, "French (Canada)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test22339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22339");
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "E             g", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                     fran\347ais (france)                                      ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IH", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test22340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22340");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "cinese (cina)\\u0069h...", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(")ADANAc( ESECNARF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")ADANAc( ESECNARF" + "'", str1, ")ADANAc( ESECNARF");
    }

    @Test
    public void test22342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("KOREAN (SOUTH KOREA)", "uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KOREAN (SOUTH KOREA)" + "'", str2, "KOREAN (SOUTH KOREA)");
    }

    @Test
    public void test22343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22344");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "CA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str3, "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str4, "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test22345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test22346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str1, "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test22347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22347");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.lang.Class<?> wildcardClass4 = locale3.getClass();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test22349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", "frz\366cz(frkrec)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.util.Locale locale13 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str14 = locale5.getDisplayCountry(locale13);
        java.util.Locale.setDefault(locale5);
        java.util.Locale locale16 = locale5.stripExtensions();
        boolean boolean17 = locale4.equals((java.lang.Object) locale5);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "               FRANZ\326SISCH(FRANKREICH)               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("b", 81, "hsilgne,nailati( nailati");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hsilgne,nailati( nailatihsilgne,nailati( nailatihsilgne,nailati( nailatihsilgne,b" + "'", str3, "hsilgne,nailati( nailatihsilgne,nailati( nailatihsilgne,nailati( nailatihsilgne,b");
    }

    @Test
    public void test22353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22353");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList44, strMap45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList44, strMap47);
        java.util.Locale locale49 = java.util.Locale.ROOT;
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Set<java.lang.String> strSet51 = locale49.getUnicodeLocaleKeys();
        java.lang.String str52 = java.util.Locale.lookupTag(languageRangeList48, (java.util.Collection<java.lang.String>) strSet51);
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
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test22354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTI" + "'", str1, "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTI");
    }

    @Test
    public void test22355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22355");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        boolean boolean8 = locale3.hasExtensions();
        java.lang.String str9 = locale3.getVariant();
        java.util.Set<java.lang.Character> charSet10 = locale3.getExtensionKeys();
        java.lang.String str11 = locale3.toLanguageTag();
        java.lang.String str12 = locale1.getDisplayCountry(locale3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", locale1);
        java.lang.String str14 = locale1.getISO3Country();
        java.lang.String str15 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fr-FR" + "'", str11, "fr-FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "France" + "'", str12, "France");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
    }

    @Test
    public void test22356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22356");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('7');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22358");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                              de_de                              ", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22359");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Italien", "                       00000000000000cor\351en (Cor\351e du Sud)                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22361");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("deutsch", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "KO", 73, 46);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test22362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22362");
        java.util.Locale locale3 = new java.util.Locale("...                               ", "                                                                                           U002", "kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals(locale3.toString(), "...                               _                                                                                           U002_kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test22363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("r-FR", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!", "de                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test22365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                              ED_ED                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22366");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.lang.String str10 = locale8.getExtension('x');
        java.util.Locale.setDefault(category1, locale8);
        java.util.Locale locale12 = java.util.Locale.getDefault(category1);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category1, locale14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale16.getDisplayVariant(locale17);
        java.lang.String str20 = locale16.getDisplayCountry();
        java.lang.String str21 = locale16.getScript();
        java.lang.String str22 = locale16.getScript();
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale24.getDisplayCountry();
        java.lang.String str26 = locale23.getDisplayVariant(locale24);
        java.lang.String str27 = locale23.getDisplayCountry();
        java.lang.String str28 = locale23.getScript();
        java.lang.String str29 = locale23.getScript();
        java.lang.String str30 = locale16.getDisplayCountry(locale23);
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale32 = java.util.Locale.getDefault(category31);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Locale locale34 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale34.getExtension('h');
        java.lang.String str37 = locale33.getDisplayScript(locale34);
        java.lang.String str38 = locale33.getISO3Country();
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale39);
        java.lang.String str41 = locale33.getDisplayName(locale39);
        java.lang.String str42 = locale33.getScript();
        java.util.Locale.setDefault(category31, locale33);
        java.lang.String str44 = locale16.getDisplayCountry(locale33);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale locale46 = builder45.build();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str49 = locale46.getDisplayLanguage(locale48);
        java.lang.String str50 = locale33.getDisplayVariant(locale46);
        java.util.Locale.setDefault(category1, locale46);
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.util.Locale locale53 = java.util.Locale.ITALIAN;
        java.lang.String str55 = locale53.getExtension('h');
        java.lang.String str56 = locale52.getDisplayScript(locale53);
        java.util.Locale locale57 = locale52.stripExtensions();
        java.util.Set<java.lang.Character> charSet58 = locale57.getExtensionKeys();
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale60.getDisplayLanguage();
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale60);
        java.lang.String str63 = locale60.getCountry();
        java.lang.String str64 = locale60.getCountry();
        boolean boolean65 = locale60.hasExtensions();
        java.lang.String str66 = locale57.getDisplayVariant(locale60);
        java.lang.String str68 = locale60.getExtension('a');
        java.lang.String str69 = locale46.getDisplayScript(locale60);
        java.util.Locale locale72 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str73 = locale60.getDisplayScript(locale72);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.lowerCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", locale60);
        java.lang.String str75 = locale60.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category31.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "FRA" + "'", str38, "FRA");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str41, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet58);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "anglais" + "'", str61, "anglais");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "!IH" + "'", str62, "!IH");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals(locale72.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str74, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test22367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...", "cinese (cina)\\u0069h..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk..." + "'", str2, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
    }

    @Test
    public void test22368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test22369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "franci" + "'", str1, "franci");
    }

    @Test
    public void test22370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                   U0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", "Deutsch (Deutschland)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie" + "'", str2, "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
    }

    @Test
    public void test22372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22372");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("German (Germany)", "\\u0023");
        boolean boolean7 = locale0.equals((java.lang.Object) "German (Germany)");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                ", "\\u002e", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test22374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!(\\U0020,Italienisch#########################################################################################", "und-ittait-italian-egaish");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22375");
        char[] charArray5 = new char[] { ' ', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "French", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!       _\\u0020_iTALIENISCH####################################################################...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test22376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test22377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                              ...                                                                                                                                                       ", 55, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              ...                                                                                                                                                       " + "'", str3, "                                                                                                                                                                              ...                                                                                                                                                       ");
    }

    @Test
    public void test22378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22378");
        java.util.Locale locale3 = new java.util.Locale("IIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "German", "!ih dalleman");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "iiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_GERMAN_!ih dalleman");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test22379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                              it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22380");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("", locale6);
        java.lang.String str9 = locale6.getScript();
        java.util.Set<java.lang.String> strSet10 = locale6.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet11 = locale6.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap13);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str22 = locale19.getDisplayLanguage(locale21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("", locale21);
        java.lang.String str24 = locale21.getScript();
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet26 = locale21.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags(languageRangeList16, (java.util.Collection<java.lang.String>) strSet26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList49, filteringMode51);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList55);
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList55, '\\');
        java.lang.String str61 = java.util.Locale.lookupTag(languageRangeList16, (java.util.Collection<java.lang.String>) strList55);
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags(languageRangeList14, (java.util.Collection<java.lang.String>) strList55);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList55, "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode51.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test22381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILA" + "'", str1, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILA");
    }

    @Test
    public void test22382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22382");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\                                               nailati                                              ", 0, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\                                               nailati                                              " + "'", str3, "\\                                               nailati                                              ");
    }

    @Test
    public void test22383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", "...EnglishEnYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)" + "'", str2, "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
    }

    @Test
    public void test22384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("china", "...                             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("und", (java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "china" + "'", str4, "china");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "china" + "'", str5, "china");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "china" + "'", str6, "china");
    }

    @Test
    public void test22385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = builder10.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.removeUnicodeLocaleAttribute("!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test22386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit", "                                             DEUTSCH                                             ", "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit" + "'", str3, "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
    }

    @Test
    public void test22387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CANADA", "", "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CANADA" + "'", str3, "CANADA");
    }

    @Test
    public void test22388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22388");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.getDisplayVariant();
        java.lang.String str11 = locale2.getISO3Language();
        java.util.Set<java.lang.Character> charSet12 = locale2.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fra" + "'", str11, "fra");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test22389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22389");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.lang.String str12 = locale0.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleKeys();
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.lang.String str18 = locale13.getDisplayLanguage(locale17);
        java.lang.String str19 = locale0.getDisplayVariant(locale17);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale0.getDisplayName(locale21);
        java.util.Set<java.lang.String> strSet24 = locale0.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet25 = locale0.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "anglais" + "'", str18, "anglais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French (France)" + "'", str23, "French (France)");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(charSet25);
    }

    @Test
    public void test22390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("nnnnnnnnnnnnnnnnnCinese (cina)\\u0069h...", "                                                          nnnnnnnnnnnnnnnnnnne                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITALIANITA#########FranzosischFranzosisch (Frankreich", "\\                                               nailati                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test22392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u0034\\u0034\\u0034\\u003" + "'", str2, "\\u0034\\u0034\\u0034\\u0034\\u003");
    }

    @Test
    public void test22393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  \\u005   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22394");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("und-itTAiT-ITALIAN-EgAish                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22395");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder7 = builder1.setLocale(locale6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayVariant();
        java.lang.String str10 = locale6.getDisplayCountry(locale8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("                                                       hi!                                                              ", locale8);
        java.lang.String str13 = locale8.getExtension('E');
        java.lang.String str14 = locale8.getDisplayScript();
        java.util.Locale locale17 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.lang.String str18 = locale8.getDisplayVariant(locale17);
        java.lang.String str19 = locale17.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                       HI!                                                              " + "'", str11, "                                                       HI!                                                              ");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\u0020italianitalianitalianitali" + "'", str19, "\\u0020italianitalianitalianitali");
    }

    @Test
    public void test22396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22396");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test22397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale locale4 = builder3.build();
        java.lang.String str5 = locale4.getISO3Country();
        java.lang.String str6 = locale4.getLanguage();
        java.lang.String str7 = locale4.getDisplayScript();
        java.lang.String str8 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
    }

    @Test
    public void test22398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504" + "'", str1, "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504");
    }

    @Test
    public void test22399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22399");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test22400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                           Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF" + "'", str1, "Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...                                                                                                                                                                    ITALIAN_ITALIAN_ENGLISF");
    }

    @Test
    public void test22401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22402");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i\\u0020iitalian\\u0020i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("anglaisaaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa(Royaume-Uni)", "EEEEEEEEEEEEE", 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aEEEEEEEEEEEEE)" + "'", str3, "aEEEEEEEEEEEEE)");
    }

    @Test
    public void test22404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22404");
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
        java.util.Set<java.lang.Character> charSet17 = locale13.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(charSet17);
    }

    @Test
    public void test22405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22405");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", locale1);
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str6, "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test22406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22406");
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
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale26.getDisplayName(locale27);
        java.util.Locale.setDefault(category24, locale27);
        java.util.Locale.Category category30 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.lang.String str33 = locale31.getExtension('x');
        java.util.Locale.setDefault(category24, locale31);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder35.clearExtensions();
        java.util.Locale.Builder builder38 = builder35.setLanguageTag("Italian");
        java.util.Locale locale39 = java.util.Locale.PRC;
        java.lang.String str40 = locale39.getDisplayName();
        java.util.Locale.Builder builder41 = builder35.setLocale(locale39);
        java.util.Locale.Builder builder42 = builder41.clear();
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder44 = builder42.setLocale(locale43);
        java.lang.String str45 = locale43.getDisplayName();
        java.util.Locale.setDefault(category24, locale43);
        java.util.Locale.setDefault(category0, locale43);
        java.util.Locale locale48 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "allemand" + "'", str28, "allemand");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.FORMAT + "'", category30.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "chinois (Chine)" + "'", str40, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "cor\351en" + "'", str45, "cor\351en");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
    }

    @Test
    public void test22407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22407");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "E             g                                                                                     ");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0069", strArray11, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray16);
        boolean boolean19 = languageRange1.equals((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0069" + "'", str17, "\\u0069");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       " + "'", str18, "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\u82f1\u8a9e", "ITALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e" + "'", str2, "\u82f1\u8a9e");
    }

    @Test
    public void test22409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("uuuu", "iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuu" + "'", str2, "uuuu");
    }

    @Test
    public void test22410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444llemnd4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22411");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("cor\351en", "44444444444444444444444444444444!ih", (int) 'D', 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cor\351en44444444444444444444444444444444!ih" + "'", str4, "cor\351en44444444444444444444444444444444!ih");
    }

    @Test
    public void test22412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", "chinoisf(Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r..." + "'", str2, "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test22413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Yhi!", "\\u671d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Yhi!" + "'", str2, "Yhi!");
    }

    @Test
    public void test22414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22414");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setRegion("INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
    }

    @Test
    public void test22415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test22416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22416");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("       !IH", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "China", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U0020ITALIANITALIANITALIANITALI", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                              4444ALLEMAND                              4444", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hhhhhhhhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test22417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22417");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         ", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22418");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Eagaash");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList24);
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList24);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.lang.String>) strList50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList50);
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet55 = locale54.getExtensionKeys();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale59 = new java.util.Locale("");
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.util.Locale locale61 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str62 = locale60.getDisplayScript(locale61);
        java.util.Locale locale63 = java.util.Locale.ENGLISH;
        java.lang.String str64 = locale63.getDisplayCountry();
        java.util.Locale locale65 = java.util.Locale.PRC;
        java.util.Locale locale66 = java.util.Locale.US;
        java.util.Locale locale67 = java.util.Locale.FRANCE;
        java.util.Locale locale68 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str69 = locale67.getDisplayScript(locale68);
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.lang.String str73 = locale72.getDisplayLanguage();
        java.util.Locale locale74 = java.util.Locale.FRENCH;
        java.util.Locale locale75 = java.util.Locale.US;
        java.util.Locale locale76 = java.util.Locale.ITALIAN;
        java.lang.String str77 = locale76.getDisplayLanguage();
        java.util.Locale locale78 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale54, locale57, locale59, locale60, locale63, locale65, locale66, locale68, locale70, locale72, locale74, locale75, locale76, locale78 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.Locale locale82 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList80, filteringMode84);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap86);
        java.util.Locale locale88 = java.util.Locale.ITALIAN;
        java.lang.String str89 = locale88.getDisplayLanguage();
        java.util.Locale locale90 = locale88.stripExtensions();
        java.lang.String str91 = locale88.getDisplayVariant();
        java.util.Set<java.lang.String> strSet92 = locale88.getUnicodeLocaleKeys();
        java.lang.String str93 = java.util.Locale.lookupTag(languageRangeList87, (java.util.Collection<java.lang.String>) strSet92);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + filteringMode10 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode10.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + filteringMode36 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode36.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNotNull(charSet55);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertNotNull(charSet71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Italienisch" + "'", str73, "Italienisch");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Italienisch" + "'", str77, "Italienisch");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Italienisch" + "'", str89, "Italienisch");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "it");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test22419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test22421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22421");
        java.util.Locale locale3 = new java.util.Locale("English", "italy", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "english_ITALY_H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "english (ITALY,H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK))" + "'", str4, "english (ITALY,H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK))");
    }

    @Test
    public void test22422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22422");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
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
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale14.getDisplayCountry(locale17);
        java.util.Locale.Builder builder20 = builder6.setLocale(locale17);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italienisch" + "'", str10, "Italienisch");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italienisch" + "'", str11, "Italienisch");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italienisch" + "'", str12, "Italienisch");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CAN" + "'", str18, "CAN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test22423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("TALIAN", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "e                               ", 0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test22424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22424");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale14 = locale11.stripExtensions();
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList22, filteringMode24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList28);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList37, filteringMode39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strList43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList43);
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale47.getDisplayLanguage();
        java.util.Locale locale49 = locale47.stripExtensions();
        java.lang.String str50 = locale47.getLanguage();
        java.util.Set<java.lang.String> strSet51 = locale47.getUnicodeLocaleKeys();
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet51, "French (Canada)");
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        java.util.Locale.LanguageRange[] languageRangeArray86 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList87 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList87, languageRangeArray86);
        java.lang.String[] strArray91 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        java.util.Locale.FilteringMode filteringMode94 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList87, (java.util.Collection<java.lang.String>) strList92, filteringMode94);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList84, filteringMode94);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strSet51, filteringMode94);
        java.util.List<java.lang.String> strList98 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet15, filteringMode94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Italienisch" + "'", str48, "Italienisch");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "it" + "'", str50, "it");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(languageRangeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + filteringMode94 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode94.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test22425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("CCCC\\CCCCC                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCC\\CCCCC                                                             " + "'", str1, "CCCC\\CCCCC                                                             ");
    }

    @Test
    public void test22426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test22427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0020iTALIANiTALIANiTALIANiTAL", "french");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTAL" + "'", str2, "\\u0020iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test22428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Chinesisch(China)", "fffffffffffffffffffffffffffffffffffffffffffffffffff\nffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch(China)" + "'", str2, "Chinesisch(China)");
    }

    @Test
    public void test22429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("fRANZ\326SISCH (kANADA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRANZ\326SISCH (kANADA)" + "'", str1, "fRANZ\326SISCH (kANADA)");
    }

    @Test
    public void test22430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       !IH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !IH" + "'", str2, "       !IH");
    }

    @Test
    public void test22431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               INGLESE                                ", "########################################################################################eltI_0200U\\_!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test22432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22432");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        double double2 = languageRange1.getWeight();
        java.util.Locale locale4 = new java.util.Locale("\\u0066");
        java.lang.String str6 = locale4.getExtension('i');
        java.lang.String str7 = locale4.getVariant();
        boolean boolean8 = languageRange1.equals((java.lang.Object) str7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals(locale4.toString(), "\\u0066");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22433");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UND", "\uc601\uc5b4                                                                                                  ", (int) 'B');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("und", "                                          FRANCESE (CANADA)                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "und" + "'", str2, "und");
    }

    @Test
    public void test22435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22435");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)", "HHHHHHHHH         ITAL\\u0020iItalian\\...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test22436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("fr_CA                                                   ", 'b', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_CA                                                   " + "'", str3, "fr_CA                                                   ");
    }

    @Test
    public void test22437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str1, "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test22438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22438");
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
        java.util.Locale.Category category15 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        java.lang.String str22 = locale17.getISO3Country();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale23);
        java.lang.String str25 = locale17.getDisplayName(locale23);
        java.lang.String str26 = locale17.getScript();
        java.util.Locale.setDefault(category15, locale17);
        java.lang.String str28 = locale0.getDisplayCountry(locale17);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = locale30.getDisplayName(locale31);
        java.util.Locale.setDefault(locale31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.upperCase("8600u\\                                                                                                                  ", locale31);
        java.lang.String str35 = locale31.getDisplayName();
        java.lang.String str36 = locale17.getDisplayScript(locale31);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.lang.String str40 = locale31.getDisplayVariant(locale37);
        java.lang.String str42 = locale31.getExtension('g');
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
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category15.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FRA" + "'", str22, "FRA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str25, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "allemand" + "'", str32, "allemand");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "8600U\\                                                                                                                  " + "'", str34, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fran\347ais (Canada)" + "'", str35, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test22439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", 812, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("TTAT_ITA", "4444allemand4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TTAT_ITA" + "'", str2, "TTAT_ITA");
    }

    @Test
    public void test22441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", "Hi!       _\\U0020_Italienisch####################################################################          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22443");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" \\U0078 ", "NC_HZ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22444");
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
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayVariant(locale13);
        java.lang.String str16 = locale12.getDisplayCountry();
        java.lang.String str17 = locale12.getScript();
        java.lang.String str18 = locale12.getScript();
        java.lang.String str19 = locale12.getDisplayVariant();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str23 = locale21.getExtension('h');
        java.lang.String str24 = locale20.getDisplayScript(locale21);
        java.util.Locale locale28 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str29 = locale20.getDisplayCountry(locale28);
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale31 = locale20.stripExtensions();
        java.lang.String str32 = locale20.getDisplayName();
        java.util.Set<java.lang.String> strSet33 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale12.getDisplayLanguage(locale20);
        java.util.Set<java.lang.Character> charSet35 = locale12.getExtensionKeys();
        java.lang.String str36 = locale0.getDisplayCountry(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = locale0.getExtension('!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: !");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "France" + "'", str29, "France");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fran\347ais (France)" + "'", str32, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "fran\347ais" + "'", str34, "fran\347ais");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "France" + "'", str36, "France");
    }

    @Test
    public void test22445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test22446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              " + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              ");
    }

    @Test
    public void test22447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22447");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    ...EnglishEn", "!ih                            dalleman!ih                            dalleman!ih                          ", "\ud504\ub791\uc2a4\uc5b4)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    ...EnglishEn" + "'", str3, "    ...EnglishEn");
    }

    @Test
    public void test22449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22449");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hhh italia", 79, (int) 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22450");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", (int) '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test22451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22451");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi     \\u005cggggggggggggggggggggggggggggggggggggg", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22452");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.lang.String str11 = locale0.getISO3Country();
        java.lang.String str12 = locale0.getISO3Country();
        boolean boolean13 = locale0.hasExtensions();
        java.lang.String str14 = locale0.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRA" + "'", str11, "FRA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fra" + "'", str14, "fra");
    }

    @Test
    public void test22453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setVariant("IXII");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: IXII [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test22454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22454");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.util.Locale.setDefault(locale1);
        java.lang.String str12 = locale1.getISO3Country();
        java.lang.String str13 = locale1.getDisplayVariant();
        java.lang.String str14 = locale1.getDisplayScript();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)" + "'", str15, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)");
    }

    @Test
    public void test22455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22455");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'g');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test22456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22456");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, 'R');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test22457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "italian_ITALIAN_English");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "8600u\\                                                                                                                  ");
        java.lang.String[] strArray12 = null;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("en", strArray11, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", strArray3, strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'U');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English" + "'", str14, "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                    " + "'", str18, "                                                                                                    ");
    }

    @Test
    public void test22458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444ALLEMAND 4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444ALLEMAND 4444" + "'", str1, "4444ALLEMAND 4444");
    }

    @Test
    public void test22459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi! _\\U0020_Italienisch####################################################################", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! _\\0020_Italienisch####################################################################" + "'", str2, "hi! _\\0020_Italienisch####################################################################");
    }

    @Test
    public void test22460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "z...Frn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22461");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########", "\u6cd5\u570b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("               FRANZ\326SISCH(FRANKREICH)               ", "                                               ##########                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               FRANZ\326SISCH(FRANKREICH)               " + "'", str2, "               FRANZ\326SISCH(FRANKREICH)               ");
    }

    @Test
    public void test22463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "hi!_\\U0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str2, "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test22464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22464");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("NE_NAILATI_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ne_nailati_");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22465");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("iFtlnz\\sisc02", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iftlnz\\sisc02");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22466");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...LIAN");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...LIAN" + "'", str3, "...LIAN");
    }

    @Test
    public void test22467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22467");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("french (canada)                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("CHINESE (CHINA)", "Frankreich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINESE (CHINA)" + "'", str2, "CHINESE (CHINA)");
    }

    @Test
    public void test22469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("okokok", 812);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "okokok" + "'", str2, "okokok");
    }

    @Test
    public void test22470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("        \\u005c         canadacanadacanadacan", "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        \\u005c         canadacanadacanadacan" + "'", str2, "        \\u005c         canadacanadacanadacan");
    }

    @Test
    public void test22471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22471");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale8 = new java.util.Locale("en");
        boolean boolean9 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleKeys();
        java.lang.String str11 = locale5.getDisplayCountry(locale8);
        java.lang.String str12 = locale8.getScript();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayLanguage();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale14);
        java.lang.String str17 = locale14.getCountry();
        java.lang.String str18 = locale8.getDisplayCountry(locale14);
        java.lang.String str19 = locale8.toLanguageTag();
        java.lang.String str20 = locale8.getVariant();
        boolean boolean21 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "France" + "'", str11, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test22472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italian_ITALIAN_EnglisF", (int) '\r', "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian_ITALIAN_EnglisF" + "'", str3, "italian_ITALIAN_EnglisF");
    }

    @Test
    public void test22473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci", "ehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLISehGLIS", "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci");
    }

    @Test
    public void test22474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22474");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "       !IH", (int) (byte) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Italien", 16, 7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("Englisch (Vereinigtes K\366nigreich)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!IH" + "'", str6, "!IH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22475");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "chinois");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "Hi!       _\\U0020_Italienisch####################################################################          ");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test22476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22476");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                 inglese");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test22477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ita");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
    }

    @Test
    public void test22478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", 537, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22479");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", 42, 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand" + "'", str3, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand");
    }

    @Test
    public void test22481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065" + "'", str2, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
    }

    @Test
    public void test22482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Eagaas", "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eagaas" + "'", str2, "Eagaas");
    }

    @Test
    public void test22483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22483");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ITALIAN_italian_eNGLISH", "\\\u610f\u5927\u5229\u6587", 216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test22484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("EN_ca.....", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN_ca....." + "'", str2, "EN_ca.....");
    }

    @Test
    public void test22485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22485");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", "italian (italian,english", "G");
        java.lang.String str6 = locale0.getDisplayLanguage(locale5);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale8);
        java.util.Locale locale11 = locale8.stripExtensions();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.lang.String str15 = locale13.getExtension('x');
        java.lang.String str16 = locale8.getDisplayScript(locale13);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.lang.String str19 = locale17.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.lang.String str24 = locale20.getDisplayCountry();
        java.lang.String str25 = locale20.getScript();
        java.lang.String str26 = locale20.getScript();
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.lang.String str30 = locale27.getDisplayVariant(locale28);
        java.lang.String str31 = locale27.getDisplayCountry();
        java.lang.String str32 = locale27.getScript();
        java.lang.String str33 = locale27.getScript();
        java.lang.String str34 = locale20.getDisplayCountry(locale27);
        java.util.Locale.Category category35 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale36 = java.util.Locale.getDefault(category35);
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.lang.String str40 = locale38.getExtension('h');
        java.lang.String str41 = locale37.getDisplayScript(locale38);
        java.lang.String str42 = locale37.getISO3Country();
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale43);
        java.lang.String str45 = locale37.getDisplayName(locale43);
        java.lang.String str46 = locale37.getScript();
        java.util.Locale.setDefault(category35, locale37);
        java.lang.String str48 = locale20.getDisplayCountry(locale37);
        java.lang.String str49 = locale20.getVariant();
        java.lang.String str50 = locale17.getDisplayName(locale20);
        java.lang.String str51 = locale13.getDisplayCountry(locale17);
        java.lang.String str52 = locale0.getDisplayScript(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "8600u\\                                 hsiage_nailati_tiatti                                        _ITALIAN (ITALIAN,ENGLISH_G");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Korean" + "'", str6, "Korean");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CANADA" + "'", str10, "CANADA");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (China)" + "'", str19, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category35.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "italian");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FRA" + "'", str42, "FRA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str45, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "chinois (Chine)" + "'", str50, "chinois (Chine)");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test22486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22486");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setExtension('4', "hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test22487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22487");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", "g       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22488");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("nnnnnnn                                                                                               en", "2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ADA\\A\\AGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\B\\BGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDC\\CGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\D\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22490");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("u00\\u0034\\u00                                             hcstud                                             \\u0034", locale2);
        java.lang.String str4 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u00\\u0034\\u00                                             hcstud                                             \\u0034" + "'", str3, "u00\\u0034\\u00                                             hcstud                                             \\u0034");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test22491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22491");
        java.util.Locale locale2 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "hhh italia");
        org.junit.Assert.assertEquals(locale2.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aua0046_HHH ITALIA");
    }

    @Test
    public void test22492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22493");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                         German (Germany)", 76, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                         German (Germany)" + "'", str3, "                                                                                                         German (Germany)");
    }

    @Test
    public void test22494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22494");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL", 103);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("it                   ", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str6, "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test22495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22496");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.lang.String str9 = locale7.getExtension('x');
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale16 = new java.util.Locale("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
        java.lang.String str17 = locale12.getDisplayScript(locale16);
        java.lang.Object obj18 = locale12.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "en");
    }

    @Test
    public void test22497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22497");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("korezhzhzhzhzhzhzhzhzhzhfraadzhaezTtat_itahagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "             \\u0049             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test22498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22498");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "fran\347ais(france)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test22499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test22500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla", "hI!hI!hI!hI!hI!CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla" + "'", str2, "#########################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
    }
}
