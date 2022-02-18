import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest65 {

    public static boolean debug = false;

    @Test
    public void test32501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "NGLISH (uNITED kINGDOM)FRENCH (nc_hz)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                          \\U0064                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\aUa0046" + "'", str1, "\\aUa0046");
    }

    @Test
    public void test32504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Eahaa \\\\\\\\\\\\\\HI!HI!", "hi!       iTALIAN (ITALIAN,ENGLISHItalienischiTALIAN (ITALIAN,ENGLISHitalian_ITALIAN_EnglishiTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...iTALIAN (ITALIAN,ENGLISH\\u0034iTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHItalianiTALIAN (ITALIAN,ENGLISH\\u0061iTALIAN (ITALIAN,ENGLISH\\u0023iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHChinese (China)iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHzh_CNiTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHeniTALIAN (ITALIAN,ENGLISHItalienisch", 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eahaa \\\\\\\\\\\\\\HI!HI!" + "'", str3, "Eahaa \\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test32505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32505");
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
        java.lang.String str29 = locale0.getVariant();
        java.util.Locale locale30 = locale0.stripExtensions();
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
    }

    @Test
    public void test32506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32507");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                    fran\347ais (France)                                                     ", "                                               \\u0069hhhhhhhhhh", 223);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 108, 347);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str3, "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test32509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32509");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("Cinese (Cina)\\u0069h...", locale8);
        java.lang.String str12 = locale8.getScript();
        java.lang.String str13 = locale2.getDisplayName(locale8);
        java.util.Locale locale16 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str17 = locale16.getDisplayVariant();
        java.lang.String str18 = locale8.getDisplayCountry(locale16);
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        java.lang.String str25 = locale21.getDisplayCountry();
        java.lang.String str26 = locale21.getScript();
        java.lang.String str27 = locale21.getScript();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale29.getDisplayCountry();
        java.lang.String str31 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale28.getDisplayCountry();
        java.lang.String str33 = locale28.getScript();
        java.lang.String str34 = locale28.getScript();
        java.lang.String str35 = locale21.getDisplayCountry(locale28);
        java.lang.String str36 = locale20.getDisplayVariant(locale28);
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale38);
        java.lang.String str41 = locale38.getCountry();
        java.lang.String str42 = locale38.getCountry();
        java.lang.String str43 = locale28.getDisplayCountry(locale38);
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.lang.String str46 = locale28.getDisplayLanguage(locale44);
        java.lang.String str47 = locale16.getDisplayLanguage(locale44);
        java.lang.String str48 = locale44.getLanguage();
        java.util.Locale.setDefault(locale44);
        java.lang.String str50 = locale44.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese (cina)\\u0069h..." + "'", str11, "cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertEquals(locale16.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "anglais" + "'", str39, "anglais");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "!IH" + "'", str40, "!IH");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "fran\347ais" + "'", str46, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "                                     fran\347ais (france)                                      " + "'", str47, "                                     fran\347ais (france)                                      ");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "fr" + "'", str48, "fr");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test32510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32510");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("de\\_\\DE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eltI_0200U\\_!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eltI_0200U\\_!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test32512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("       ", "ITALIE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Ialensch#########################################################################################", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test32514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32514");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("TALIAN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.removeUnicodeLocaleAttribute("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!aNCHc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test32515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32515");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
    }

    @Test
    public void test32516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "italCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test32517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32517");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\u4e2d\u6587                                                                                                  ", "ECANADAgCANADACANADAsh                                                                                                  ", "KKKKKKKKKKKKKKKKKEAGAASH", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587                                                                                                  " + "'", str4, "\u4e2d\u6587                                                                                                  ");
    }

    @Test
    public void test32518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32518");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("en_GB", 'k');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'e' + "'", char2 == 'e');
    }

    @Test
    public void test32519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str2, "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test32520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" ...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444allemand4444", "IXII", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("2E             giTALIANiTALIANi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2EgiTALIANiTALIANi" + "'", str1, "2EgiTALIANiTALIANi");
    }

    @Test
    public void test32523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32523");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...", "cor\351en (cor\351e du sud) (RA)", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "allamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamandallamand");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                 \\U0020  ", "ZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cnZH_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\U0020  " + "'", str2, "                                                                 \\U0020  ");
    }

    @Test
    public void test32526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("9", "       iiiiiiiiiiifrankreichnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "C500u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32528");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  \\u007a", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "anihC", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                      italian (ITALIAN,English)                                      ", charArray13);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0020I...", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test32529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("South Korea", "engliscu", "iiiiiiiiii");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0068RRRRRRRRRRRRRRRR", "444444444it                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0068RRRRRRRRRRRRRRRR" + "'", str2, "\\u0068RRRRRRRRRRRRRRRR");
    }

    @Test
    public void test32531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("FRFRFRFRFRFRFRFRFRFRFRFRFd                                                          ", "                                                                                                \\U0054");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFd                                                          " + "'", str2, "FRFRFRFRFRFRFRFRFRFRFRFRFd                                                          ");
    }

    @Test
    public void test32532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32532");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.getDisplayName();
        java.lang.String str16 = locale12.getCountry();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = locale19.getDisplayName();
        java.lang.String str23 = locale19.getCountry();
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet25 = locale19.getUnicodeLocaleKeys();
        java.lang.String str26 = locale12.getDisplayLanguage(locale19);
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale29.getExtension('h');
        java.lang.String str32 = locale28.getDisplayScript(locale29);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale28);
        java.lang.String str35 = locale28.getExtension('z');
        java.lang.String str36 = locale12.getDisplayName(locale28);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\u002", locale28);
        boolean boolean38 = locale28.hasExtensions();
        java.util.Locale.Builder builder39 = builder10.setLocale(locale28);
        java.util.Locale.Builder builder40 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder41 = builder40.clear();
        java.util.Locale.Builder builder42 = builder40.clear();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.lang.String str45 = locale44.getCountry();
        java.util.Locale.Builder builder46 = builder43.setLocale(locale44);
        java.util.Locale.Builder builder47 = builder46.clear();
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale52 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str53 = locale52.getDisplayCountry();
        java.lang.String str54 = locale48.getDisplayCountry(locale52);
        java.lang.String str55 = locale48.getISO3Language();
        java.util.Locale.Builder builder56 = builder46.setLocale(locale48);
        java.util.Locale locale59 = new java.util.Locale("KOREAN (SOUTH KOREA)", "n");
        java.util.Locale locale62 = new java.util.Locale(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str63 = locale59.getDisplayScript(locale62);
        java.util.Set<java.lang.Character> charSet64 = locale59.getExtensionKeys();
        java.lang.String str65 = locale48.getDisplayLanguage(locale59);
        java.util.Locale locale66 = java.util.Locale.ENGLISH;
        java.lang.String str67 = locale66.getDisplayLanguage();
        java.lang.String str69 = locale66.getExtension('F');
        java.lang.String str70 = locale66.getDisplayLanguage();
        java.util.Locale locale71 = java.util.Locale.FRANCE;
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.lang.String str74 = locale72.getExtension('h');
        java.lang.String str75 = locale71.getDisplayScript(locale72);
        boolean boolean76 = locale71.hasExtensions();
        java.lang.String str77 = locale71.getVariant();
        java.util.Set<java.lang.Character> charSet78 = locale71.getExtensionKeys();
        java.lang.String str79 = locale71.toLanguageTag();
        java.lang.String str80 = locale66.getDisplayVariant(locale71);
        java.lang.String str81 = locale59.getDisplayName(locale66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder82 = builder39.setLocale(locale59);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: korean (south korea) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italien" + "'", str15, "italien");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "italien" + "'", str22, "italien");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italiano" + "'", str26, "italiano");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!       " + "'", str33, "hi!       ");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "italien" + "'", str36, "italien");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                                               \\u002" + "'", str37, "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale52.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ITALIAN" + "'", str53, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "China" + "'", str54, "China");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertEquals(locale59.toString(), "korean (south korea)_N");
        org.junit.Assert.assertEquals(locale62.toString(), ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian_44444444444444444444444444444444IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\366SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(charSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Chinese" + "'", str65, "Chinese");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "anglais" + "'", str67, "anglais");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "anglais" + "'", str70, "anglais");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(charSet78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "fr-FR" + "'", str79, "fr-FR");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "korean (south korea) (N)" + "'", str81, "korean (south korea) (N)");
    }

    @Test
    public void test32533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('f', "tTAT_ITA");
        java.util.Locale.Builder builder11 = builder6.setRegion("US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder6.setRegion("\\U0078");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\U0078 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test32534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) 'F', "italie");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test32535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32535");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32536");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi     \\u005cggggggggggggggggggggggggggggggggggggg", "DEUTSCH (DEUTSCHLAND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32537");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("en", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "chinois (chine) (\\ITALIAN_ITALIAN_ENGLISH)", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test32538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32538");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'I', 406);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 406 + "'", int2 == 406);
    }

    @Test
    public void test32539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Engl");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("an\\u00##################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444444it                   ", "5c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32541");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                      ", (java.lang.CharSequence) "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 792 + "'", int2 == 792);
    }

    @Test
    public void test32542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32542");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0045");
    }

    @Test
    public void test32543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32543");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getLanguage();
        java.lang.String str12 = locale8.getISO3Language();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("ITALIAN");
        java.util.Locale locale22 = builder19.build();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale22);
        java.lang.String str24 = locale8.getDisplayScript(locale22);
        java.util.Locale locale25 = locale8.stripExtensions();
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        java.util.Locale locale28 = java.util.Locale.GERMAN;
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = locale28.getDisplayName(locale29);
        java.util.Locale.setDefault(category26, locale29);
        java.util.Locale.Category category32 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale33 = java.util.Locale.getDefault(category32);
        java.lang.String str35 = locale33.getExtension('x');
        java.util.Locale.setDefault(category26, locale33);
        java.util.Locale locale37 = java.util.Locale.getDefault(category26);
        java.util.Locale locale38 = java.util.Locale.ITALY;
        java.lang.String str39 = locale38.getScript();
        java.util.Locale.setDefault(category26, locale38);
        java.util.Locale locale41 = java.util.Locale.getDefault(category26);
        java.lang.String str42 = locale8.getDisplayName(locale41);
        java.util.Set<java.lang.String> strSet43 = locale8.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder44 = builder6.setLocale(locale8);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ita" + "'", str12, "ita");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais (Canada)" + "'", str17, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "de");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "allemand" + "'", str30, "allemand");
        org.junit.Assert.assertTrue("'" + category32 + "' != '" + java.util.Locale.Category.FORMAT + "'", category32.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "italiano" + "'", str42, "italiano");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test32544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32544");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("de                                                                                                                      ##", "\rRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32545");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("itTAiT_ITALIAN_EgAish                                 \\u0068", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                        it                          ", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32547");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale1);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale1.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale1.getExtension('!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: !");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test32548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("french (canada)                                                                  ", "italien", "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "french (canada)                                                                  " + "'", str3, "french (canada)                                                                  ");
    }

    @Test
    public void test32549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32549");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("#########################################################################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test32550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                         dalleman!ih                            dalleman!ih                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32551");
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
        java.lang.String str16 = locale13.getDisplayVariant();
        java.lang.String str17 = locale13.getLanguage();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
    }

    @Test
    public void test32552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32552");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("francese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('#', "zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test32553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32553");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test32554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32554");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getLanguage();
        java.lang.String str16 = locale14.getScript();
        java.lang.String str17 = locale14.getISO3Country();
        java.lang.String str18 = locale14.getCountry();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder20 = builder19.clearExtensions();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale21.getDisplayName();
        java.util.Locale.Builder builder23 = builder20.setLocale(locale21);
        java.util.Locale locale24 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder25 = builder20.setLocale(locale24);
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale24.getVariant();
        java.util.Locale.setDefault(locale24);
        java.lang.String str29 = locale14.getDisplayCountry(locale24);
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale31);
        java.lang.String str33 = locale31.getDisplayVariant();
        java.util.Locale locale37 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str38 = locale37.toLanguageTag();
        java.lang.String str39 = locale31.getDisplayName(locale37);
        boolean boolean40 = locale31.hasExtensions();
        java.lang.String str41 = locale14.getDisplayScript(locale31);
        java.util.Locale.setDefault(category0, locale14);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr" + "'", str15, "fr");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CAN" + "'", str17, "CAN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CA" + "'", str18, "CA");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fran\347ais (Canada)" + "'", str22, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Kanada" + "'", str29, "Kanada");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale37.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "und" + "'", str38, "und");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "deutsch" + "'", str39, "deutsch");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test32555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C");
    }

    @Test
    public void test32556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32556");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "IIIIIIIIII000000000000000000000000000000000000000000...IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\u0054", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0054" + "'", str2, "\\u0054");
    }

    @Test
    public void test32558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32558");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("443200u\\44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 374, "                          en                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          en                                                    en                                                    en                                                    en                                                    en                                                    en                                                    en                      " + "'", str3, "                          en                                                    en                                                    en                                                    en                                                    en                                                    en                                                    en                      ");
    }

    @Test
    public void test32560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aeroK htuoS    NC_HZ    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0020iIalian\\u008600u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32562");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setRegion("                                                    k             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                     k              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
    }

    @Test
    public void test32563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\ud55c\uad6d\uc5b4", "und", 56);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "N");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test32564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32564");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("France");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'F' + "'", char1 == 'F');
    }

    @Test
    public void test32565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32565");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
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
        java.util.Locale locale35 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.Locale.FilteringMode filteringMode49 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList45, filteringMode49);
        java.util.Collection<java.util.Locale> localeCollection51 = null;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, localeCollection51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, strMap53);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList56 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder58 = new java.util.Locale.Builder();
        java.util.Locale locale59 = builder58.build();
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str62 = locale59.getDisplayLanguage(locale61);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.upperCase("", locale61);
        java.lang.String str64 = locale61.getScript();
        java.util.Set<java.lang.String> strSet65 = locale61.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet66 = locale61.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList67 = java.util.Locale.filterTags(languageRangeList56, (java.util.Collection<java.lang.String>) strSet66);
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder69 = builder68.clearExtensions();
        java.util.Locale locale70 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str71 = locale70.getDisplayName();
        java.util.Locale.Builder builder72 = builder69.setLocale(locale70);
        java.util.Locale locale73 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder74 = builder69.setLocale(locale73);
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleAttributes();
        java.lang.String str76 = locale73.getDisplayName();
        java.util.Locale locale80 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale81 = locale80.stripExtensions();
        java.util.Locale locale82 = locale81.stripExtensions();
        java.util.Locale.setDefault(locale81);
        java.lang.String str84 = locale73.getDisplayName(locale81);
        java.util.Set<java.lang.String> strSet85 = locale73.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList56, (java.util.Collection<java.lang.String>) strSet85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList86);
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList86);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
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
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + filteringMode49 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode49.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(languageRangeList56);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "French (Canada)" + "'", str71, "French (Canada)");
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "German (Germany)" + "'", str76, "German (Germany)");
        org.junit.Assert.assertEquals(locale80.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "German (Germany)" + "'", str84, "German (Germany)");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
    }

    @Test
    public void test32566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("English(UnitedKingdom)", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 65);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nglish(UnitedKingdom)" + "'", str4, "nglish(UnitedKingdom)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "nglish(UnitedKingdom)" + "'", str5, "nglish(UnitedKingdom)");
    }

    @Test
    public void test32567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)" + "'", str1, "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
    }

    @Test
    public void test32568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32568");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italie", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italie" + "'", str3, "italie");
    }

    @Test
    public void test32569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32569");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getScript();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test32570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u0065                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32572");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "aaUabUaeUafUakUamUanUarUasUavUayUazUbaUbeUbgUbhUbiUbmUbnUboUbrUbsUcaUceUchUcoUcrUcsUcuUcvUcyUdaUdeUdvUdzUeeUelUenUeoUesUetUeuUfaUffUfiUfjUfoUfrUfyUgaUgdUglUgnUguUgvUhaUheUhiUhoUhrUhtUhuUhyUhzUiaUidUieUigUiiUikUinUioUisUitUiuUiwUjaUjiUjvUkaUkgUkiUkjUkkUklUkmUknUkoUkrUksUkuUkvUkwUkyUlaUlbUlgUliUlnUloUltUluUlvUmgUmhUmiUmkUmlUmnUmoUmrUmsUmtUmyUnaUnbUndUneUngUnlUnnUnoUnrUnvUnyUocUojUomUorUosUpaUpiUplUpsUptUquUrmUrnUroUruUrwUsaUscUsdUseUsgUsiUskUslUsmUsnUsoUsqUsrUssUstUsuUsvUswUtaUteUtgUthUtiUtkUtlUtnUtoUtrUtsUttUtwUtyUugUukUurUuzUveUviUvoUwaUwoUxhUyiUyoUzaUzhUzu", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)" + "'", str1, "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)");
    }

    @Test
    public void test32574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32574");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                                                              ITALIEITAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                                                              italieital");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32575");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getCountry();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", locale1);
        java.lang.String str7 = locale1.getLanguage();
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale1.getDisplayCountry(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str6, "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test32576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ", 33, (int) 'e');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...            ...g                                      ...CANADACANADA                          ..." + "'", str3, "...            ...g                                      ...CANADACANADA                          ...");
    }

    @Test
    public void test32577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                             DE_DE                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32578");
        java.util.Locale locale3 = new java.util.Locale("TALIAN", "FRA", "Undetermined");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getCountry();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder8.setLanguage("und");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale locale16 = builder13.build();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("Korean (South Korea)", locale16);
        java.lang.String str18 = locale3.getDisplayCountry(locale16);
        java.util.Set<java.lang.String> strSet19 = locale16.getUnicodeLocaleKeys();
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, 'f');
        org.junit.Assert.assertEquals(locale3.toString(), "talian_FRA_Undetermined");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "talian" + "'", str4, "talian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FRA" + "'", str5, "FRA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "KOREAN (SOUTH KOREA)" + "'", str17, "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test32579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "GGGGGGGGGGGGGGGGGGGGGGGaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32580");
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
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.lang.String str19 = locale18.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr" + "'", str19, "fr");
    }

    @Test
    public void test32581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32581");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NA");
        java.lang.String str2 = locale1.getVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "na");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "na");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "na");
    }

    @Test
    public void test32582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                     German (Germany)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "German (Germany)" + "'", str1, "German (Germany)");
    }

    @Test
    public void test32583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32583");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("en-G\\u0038zho                         CHD", (int) 'g', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32584");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('Z');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("u0066");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0066" + "'", str1, "u0066");
    }

    @Test
    public void test32586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32586");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\351');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character e? is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32587");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("     KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)      ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Chine)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chine)" + "'", str1, "Chine)");
    }

    @Test
    public void test32589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32589");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                  Italie                                           ");
        java.lang.String str2 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32590");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0", "9hhhhhhhhhh", "                ITA                ", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0" + "'", str4, "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u0");
    }

    @Test
    public void test32591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32591");
        java.util.Locale locale3 = new java.util.Locale(".", "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ");
    }

    @Test
    public void test32592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32592");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("4444444444444444444444444444444444444             DE_DE            44444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=4444444444444444444444444444444444444de_de44444444444444444444444444444444444444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "                                             hcstued                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN" + "'", str2, "                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
    }

    @Test
    public void test32594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", "iTALIAN                                                                ALLEMAND");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str2, "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test32595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "Cinese (Cina)\\u0069h..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32596");
        java.util.Locale locale3 = new java.util.Locale("KOR", "...........................................................................................................................................................................................z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................h.hzhhn_.AL.AN_ngzhsF", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ");
        org.junit.Assert.assertEquals(locale3.toString(), "kor_...........................................................................................................................................................................................Z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................H.HZHHN_.AL.AN_NGZHSF_iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ");
    }

    @Test
    public void test32597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI                                                                                                                                                                                                                                                                                                                                                                      it_                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32598");
        java.util.Locale locale1 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test32599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32599");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                          \\u0020italianitalianitalianitali", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA" + "'", str1, "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
    }

    @Test
    public void test32601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    !" + "'", str2, "                                                                                                    !");
    }

    @Test
    public void test32602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("NC_hzitalieital", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_hzitalieital" + "'", str2, "NC_hzitalieital");
    }

    @Test
    public void test32603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32603");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", "\\U0020");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "cccccc...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str4, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test32604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u82f1\u6587", "Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) 'c', 163);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32606");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str6 = locale0.getDisplayScript();
        java.util.Locale locale9 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale9.getDisplayLanguage(locale10);
        java.lang.String str14 = locale9.getCountry();
        java.lang.String str15 = locale0.getDisplayCountry(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale9.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-CA" + "'", str12, "fr-CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italian (italian,english)" + "'", str13, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                         " + "'", str14, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test32607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        java.util.Locale.Builder builder9 = builder3.clear();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale10.toLanguageTag();
        java.util.Locale.Builder builder13 = builder3.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder3.removeUnicodeLocaleAttribute("TITHI!HI!                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: TITHI!HI!                                                                                       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-CA" + "'", str12, "fr-CA");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test32608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32608");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                             DE_DE                                              ", 69, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test32609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32609");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0069", "    ...EnglishEn", (int) '8');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("CCCC\\CCCCC", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test32610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32610");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hIEnglish                                 (                United                                 Kingdom                )!English                                 (                United                                 Kingdom                )       ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test32611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   h", "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 82, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test32612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32612");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hsilgne,nailati( nailati", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test32613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32613");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test32614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32614");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        boolean boolean7 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale3.getDisplayLanguage();
        java.util.Locale locale10 = locale3.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais" + "'", str9, "fran\347ais");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
    }

    @Test
    public void test32615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32615");
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
        java.util.Locale.Builder builder14 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder10.setExtension('f', "\u82f1\u56fd                                                            ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:                                                             ??                                                             [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test32616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32616");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("");
        java.util.Locale locale8 = new java.util.Locale("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHINESE", "ITALIAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchinese_ITALIAN");
    }

    @Test
    public void test32617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", 83);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str3, "aTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test32618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          tt           t it ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          tt           t it " + "'", str2, "          tt           t it ");
    }

    @Test
    public void test32620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Italian (italian,english", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian (italian,english                                                                " + "'", str2, "Italian (italian,english                                                                ");
    }

    @Test
    public void test32621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hic!", "...dedcfcgchcickclcmcncocrcucvcwcxcyczdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdaeafagaialamanaoaqarasatauawaxaz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hic!" + "'", str2, "hic!");
    }

    @Test
    public void test32622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setLanguageTag("                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                                                                     \\u0020iTALIANiTALIANiTALIANiTALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test32623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32623");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.removeUnicodeLocaleAttribute("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguage(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))Italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: )))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))Italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test32624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32624");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str3 = locale1.getExtension('x');
        java.lang.String str4 = locale1.getISO3Language();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("Italian");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder12 = builder8.setExtension('E', "DEUTSCH");
        java.util.Locale locale13 = builder8.build();
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.toLanguageTag();
        java.util.Locale.Builder builder18 = builder8.setLocale(locale15);
        java.lang.String str19 = locale1.getDisplayVariant(locale15);
        java.lang.String str20 = locale1.getDisplayCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian__#e-deutsch");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CA" + "'", str16, "CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr-CA" + "'", str17, "fr-CA");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Canada" + "'", str20, "Canada");
    }

    @Test
    public void test32625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test32626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32626");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder13 = builder10.setLanguageTag("Italian");
        java.util.Locale locale14 = builder10.build();
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale15.getISO3Language();
        java.util.Locale.Builder builder17 = builder10.setLocale(locale15);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale18.getScript();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale18.getCountry();
        java.util.Locale.setDefault(locale18);
        java.util.Locale.Builder builder23 = builder17.setLocale(locale18);
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.lang.String str28 = locale26.getVariant();
        java.util.Locale.setDefault(locale26);
        java.lang.String str30 = locale26.toLanguageTag();
        java.util.Locale.setDefault(category0, locale26);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "US" + "'", str21, "US");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "fr-CA" + "'", str30, "fr-CA");
    }

    @Test
    public void test32627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test32628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32629");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r...", "gERMAN (gERMANY)", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                               \\u002", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "YYYYYYYYY       !IHYYYYYYYYYY");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test32630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32630");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.lang.String str5 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet6, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet6, "g       ...");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italien" + "'", str3, "italien");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ita" + "'", str5, "ita");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test32631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("adaeafagaialamanaoaqarasatauawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcucvcwcxcyczded...", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d..." + "'", str2, "d...");
    }

    @Test
    public void test32632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32632");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00", (java.lang.CharSequence) "                                      FRANCE                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test32633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...444444444444444444444444444444444444444444444444444                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32634");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("ITALIAN                                                                 ", "eAGAASH", (int) (short) 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'd', 81, 0);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("1", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " Italia ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32636");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Koreanisch (S\374dkorea)", "gence", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                                  \\u005c                                                         \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Koreanisch (S\374dkorea)" + "'", str4, "Koreanisch (S\374dkorea)");
    }

    @Test
    public void test32637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32637");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ANGLAIS (ROYAUME-UNI)FRA", (java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test32638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32638");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AzhzhzhzhzhzhzhzhzhzhE             g", "\\U0023", 133, 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g\\U0023" + "'", str4, "AzhzhzhzhzhzhzhzhzhzhE             g\\U0023");
    }

    @Test
    public void test32639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32639");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("9hhhhhhhhhh", "(italian,eNGLISH) ITALIAN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test32641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32641");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getVariant();
        boolean boolean4 = locale1.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getDisplayScript();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        boolean boolean12 = locale7.hasExtensions();
        java.lang.String str13 = locale7.getVariant();
        java.util.Set<java.lang.Character> charSet14 = locale7.getExtensionKeys();
        java.lang.String str15 = locale7.toLanguageTag();
        java.lang.String str16 = locale5.getDisplayCountry(locale7);
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category17, locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category17);
        java.lang.String str22 = locale21.getLanguage();
        java.lang.String str23 = locale5.getDisplayLanguage(locale21);
        java.lang.String str24 = locale1.getDisplayVariant(locale5);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale.Builder builder28 = builder25.setLanguageTag("Italian");
        java.util.Locale.Builder builder29 = builder25.clearExtensions();
        java.util.Locale.Builder builder30 = builder25.clear();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder33 = builder25.setLocale(locale32);
        java.util.Locale.Builder builder34 = builder33.clear();
        java.util.Locale.Builder builder35 = builder33.clear();
        java.util.Locale.Builder builder36 = builder35.clear();
        java.util.Locale locale37 = builder36.build();
        java.util.Locale.Builder builder39 = builder36.setVariant("ITALIAN4");
        java.util.Locale.Builder builder40 = builder39.clear();
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale locale42 = builder41.build();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = locale43.getDisplayVariant(locale44);
        java.lang.String str47 = locale43.getDisplayCountry();
        java.lang.String str48 = locale43.getScript();
        java.lang.String str49 = locale43.getScript();
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.util.Locale locale51 = java.util.Locale.ENGLISH;
        java.lang.String str52 = locale51.getDisplayCountry();
        java.lang.String str53 = locale50.getDisplayVariant(locale51);
        java.lang.String str54 = locale50.getDisplayCountry();
        java.lang.String str55 = locale50.getScript();
        java.lang.String str56 = locale50.getScript();
        java.lang.String str57 = locale43.getDisplayCountry(locale50);
        java.lang.String str58 = locale42.getDisplayVariant(locale50);
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.lang.String str61 = locale60.getDisplayLanguage();
        java.lang.String str62 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale60);
        java.lang.String str63 = locale60.getCountry();
        java.lang.String str64 = locale60.getCountry();
        java.lang.String str65 = locale50.getDisplayCountry(locale60);
        java.util.Locale locale66 = java.util.Locale.GERMAN;
        java.util.Locale locale67 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str68 = locale66.getDisplayName(locale67);
        java.util.Locale locale69 = locale66.stripExtensions();
        java.lang.String str70 = locale60.getDisplayVariant(locale69);
        boolean boolean71 = locale69.hasExtensions();
        java.util.Locale.Builder builder72 = builder40.setLocale(locale69);
        java.lang.String str73 = locale5.getDisplayName(locale69);
        java.lang.String str74 = locale69.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fr-FR" + "'", str15, "fr-FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale19.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "...anitali" + "'", str22, "...anitali");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "French" + "'", str23, "French");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "English" + "'", str61, "English");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "!IH" + "'", str62, "!IH");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "de");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "allemand" + "'", str68, "allemand");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "de");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Franz\366sisch (Kanada)" + "'", str73, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "de" + "'", str74, "de");
    }

    @Test
    public void test32642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!_\\U0020_Itle#########################################################################################", 327);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_Itle#########################################################################################" + "'", str2, "!_\\U0020_Itle#########################################################################################");
    }

    @Test
    public void test32643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32643");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   44444444444444ITALIAN4444444444444                                   ", "ZHAZHZHZHZHZHZHZHZHZHZH_und-ca");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "----------------------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "----------------------------------" + "'", str1, "----------------------------------");
    }

    @Test
    public void test32645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32645");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Locale locale5 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale9);
        java.util.Set<java.lang.Character> charSet12 = locale9.getExtensionKeys();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.util.Locale locale15 = java.util.Locale.getDefault(category13);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getDisplayCountry();
        java.lang.String str19 = locale16.getDisplayVariant(locale17);
        java.lang.String str20 = locale17.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale.setDefault(locale22);
        java.lang.String str25 = locale22.getScript();
        java.lang.String str26 = locale17.getDisplayCountry(locale22);
        java.lang.String str27 = locale15.getDisplayVariant(locale22);
        java.lang.String str28 = locale9.getDisplayVariant(locale15);
        java.lang.String str29 = locale15.getScript();
        java.lang.String str30 = locale1.getDisplayScript(locale15);
        java.util.Set<java.lang.String> strSet31 = locale15.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih" + "'", str6, "!ih");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0068" + "'", str7, "\\u0068");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test32646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\XTALXAN_ITALIAN_ENGLXSH", "hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str2, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test32647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32647");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u006b");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0038", strArray5, strArray6);
        boolean boolean8 = locale2.equals((java.lang.Object) "\\u0038");
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0038" + "'", str7, "\\u0038");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32648");
        java.util.Locale locale3 = new java.util.Locale("\\U0069cccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccc", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0069ccccccccccccccccccccccccccccccccegschccccccccccccccccccccccccccccccccccccccccccccccccc_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
    }

    @Test
    public void test32649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("JapaneseCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JapaneseCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str1, "JapaneseCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test32650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("english", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rH !\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rgl\r\rh" + "'", str3, "\r\rgl\r\rh");
    }

    @Test
    public void test32651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "fran\347ais (canaaa)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32652");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                         Deutsch (Deutschland)                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 104 + "'", int1 == 104);
    }

    @Test
    public void test32653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32653");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale10.getScript();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale10.getDisplayScript(locale18);
        java.util.Locale.Builder builder20 = builder9.setLocale(locale18);
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        java.util.Locale.setDefault(category21, locale24);
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.lang.String str30 = locale28.getExtension('x');
        java.util.Locale.setDefault(category21, locale28);
        java.util.Locale locale35 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str36 = locale35.getISO3Country();
        java.util.Locale.setDefault(category21, locale35);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str40 = locale39.getDisplayScript();
        java.lang.String str41 = locale39.getDisplayScript();
        java.util.Locale.setDefault(category21, locale39);
        java.lang.String str43 = locale18.getDisplayName(locale39);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "German" + "'", str15, "German");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "allemand" + "'", str25, "allemand");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.FORMAT + "'", category27.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals(locale35.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Italian" + "'", str43, "Italian");
    }

    @Test
    public void test32654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32654");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('J');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32655");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italie", 0.0d);
        boolean boolean4 = languageRange2.equals((java.lang.Object) "FRKRB");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("kkkkkkkkkkkkkkkkkeAGAASH", 0, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kkkkkkkkkkkkkkkkkeAGAASH" + "'", str3, "kkkkkkkkkkkkkkkkkeAGAASH");
    }

    @Test
    public void test32657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32657");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("KR", 112, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA", "..................jp");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA" + "'", str2, "         HHHHHHHHHILATILGNe_nailati_NAI         HSILATI!_NAI_TiATtiHILATIhsiAgE_NA");
    }

    @Test
    public void test32659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32659");
        java.util.Locale locale3 = new java.util.Locale("italian (italian,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u", "CCCCCCC           \\uCCCCCC", "...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
        org.junit.Assert.assertEquals(locale3.toString(), "italian (italian,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u_CCCCCCC           \\UCCCCCC_...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ");
    }

    @Test
    public void test32660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32660");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("I");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet8, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap12);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.util.Locale.FilteringMode filteringMode32 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList30, filteringMode32);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList36);
        java.lang.String str39 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList56, filteringMode58);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList62);
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList62);
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet67 = locale66.getExtensionKeys();
        java.util.Locale locale69 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale71 = new java.util.Locale("");
        java.util.Locale locale72 = java.util.Locale.FRANCE;
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str74 = locale72.getDisplayScript(locale73);
        java.util.Locale locale75 = java.util.Locale.ENGLISH;
        java.lang.String str76 = locale75.getDisplayCountry();
        java.util.Locale locale77 = java.util.Locale.PRC;
        java.util.Locale locale78 = java.util.Locale.US;
        java.util.Locale locale79 = java.util.Locale.FRANCE;
        java.util.Locale locale80 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str81 = locale79.getDisplayScript(locale80);
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet83 = locale82.getExtensionKeys();
        java.util.Locale locale84 = java.util.Locale.ITALIAN;
        java.lang.String str85 = locale84.getDisplayLanguage();
        java.util.Locale locale86 = java.util.Locale.FRENCH;
        java.util.Locale locale87 = java.util.Locale.US;
        java.util.Locale locale88 = java.util.Locale.ITALIAN;
        java.lang.String str89 = locale88.getDisplayLanguage();
        java.util.Locale locale90 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray91 = new java.util.Locale[] { locale66, locale69, locale71, locale72, locale75, locale77, locale78, locale80, locale82, locale84, locale86, locale87, locale88, locale90 };
        java.util.ArrayList<java.util.Locale> localeList92 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList92, localeArray91);
        java.util.Locale locale94 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList92);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList95);
        java.util.Collection<java.util.Locale> localeCollection98 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList99 = java.util.Locale.filter(languageRangeList3, localeCollection98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + filteringMode32 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode32.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNotNull(charSet67);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "");
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertNotNull(charSet83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Italian" + "'", str85, "Italian");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Italian" + "'", str89, "Italian");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(locale94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(localeList97);
    }

    @Test
    public void test32661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32661");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ittait_italian_egaish          ", "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32662");
        java.util.Locale locale1 = new java.util.Locale("44444444444444444444444444444444!IH");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getVariant();
        java.util.Locale locale7 = new java.util.Locale("");
        java.util.Locale.setDefault(locale7);
        java.lang.String str9 = locale3.getDisplayName(locale7);
        java.lang.String str10 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale12);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale16);
        java.lang.String str22 = locale12.getDisplayVariant(locale16);
        java.lang.String str23 = locale1.getDisplayLanguage(locale12);
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayVariant();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale24.getDisplayScript(locale27);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale36.getExtension('h');
        java.lang.String str39 = locale35.getDisplayScript(locale36);
        java.lang.String str40 = locale35.getISO3Country();
        java.lang.String str41 = locale33.getDisplayVariant(locale35);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale33);
        java.lang.String str43 = locale27.getDisplayCountry(locale33);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale locale46 = builder45.build();
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str49 = locale46.getDisplayLanguage(locale48);
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.upperCase("", locale48);
        java.lang.String str51 = locale27.getDisplayName(locale48);
        java.util.Locale locale55 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale56 = locale55.stripExtensions();
        java.util.Locale.setDefault(locale56);
        java.util.Locale locale58 = locale56.stripExtensions();
        java.lang.String str59 = locale48.getDisplayVariant(locale56);
        java.lang.String str60 = locale1.getDisplayScript(locale56);
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TALIAN\\U0023" + "'", str14, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!       " + "'", str21, "hi!       ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "44444444444444444444444444444444!ih" + "'", str23, "44444444444444444444444444444444!ih");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "FRA" + "'", str40, "FRA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str42, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "English" + "'", str51, "English");
        org.junit.Assert.assertEquals(locale55.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test32663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi! _\\U0020_Italienisch###################################################################", 18, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! _\\U0020_Italienisch###################################################################" + "'", str3, "hi! _\\U0020_Italienisch###################################################################");
    }

    @Test
    public void test32664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32664");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ie                         iitalit");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test32665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32665");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "\\U005");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", "fra", 117);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\!u!00!de!\\!u!00", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!" + "'", str8, "HI!HI!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\!u!00!de!\\!u!00" + "'", str9, "\\!u!00!de!\\!u!00");
    }

    @Test
    public void test32666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32667");
        java.util.Locale locale3 = new java.util.Locale("G", "Franz\366sisch");
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale4.getDisplayCountry(locale6);
        java.lang.String str10 = locale6.toLanguageTag();
        java.lang.String str11 = locale3.getDisplayCountry(locale6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("", locale6);
        java.lang.String str13 = locale6.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it" + "'", str10, "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FRANZ\366SISCH" + "'", str11, "FRANZ\366SISCH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test32668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "aaaaaaaaaaaaCaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test32669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32669");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'b', (int) (short) -1, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32670");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale9 = new java.util.Locale("\\u0042", "it44444444444444444en");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setLocale(locale9);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0042 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0042_IT44444444444444444EN");
    }

    @Test
    public void test32671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eltI_0200U\\_!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE" + "'", str2, "Frnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFrnz\366sisch(KndFEEEEEEEEEEEEE");
    }

    @Test
    public void test32672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32672");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray14 = new char[] { ' ', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  \\u007a", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "anihC", charArray14);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray14);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0021", charArray14);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             undKO             und", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test32673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                      ITALIAN (italian,eNGLISH)                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      italian (ITALIAN,English)                                      " + "'", str1, "                                      italian (ITALIAN,English)                                      ");
    }

    @Test
    public void test32674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32674");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian    ", "Fgence");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test32675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32675");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zho", "e...", 347);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAChineAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test32676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32676");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.lang.String str9 = locale4.getLanguage();
        java.lang.String str10 = locale4.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("it");
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getExtension('h');
        java.lang.String str17 = locale13.getDisplayScript(locale14);
        java.util.Locale locale18 = locale13.stripExtensions();
        java.lang.String str19 = locale13.getDisplayCountry();
        java.lang.String str20 = locale12.getDisplayScript(locale13);
        java.lang.String str21 = locale4.getDisplayScript(locale13);
        java.lang.String str22 = locale13.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian (ITALIAN,English)" + "'", str10, "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test32677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("anglais (Royaume-Uni)", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais (Royaume-Uni)" + "'", str2, "anglais (Royaume-Uni)");
    }

    @Test
    public void test32678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32678");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale11);
        java.lang.String str18 = locale11.getExtension('z');
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale20.getVariant();
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        java.util.Locale locale28 = new java.util.Locale("French", "NC_HZ");
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder31 = builder29.clear();
        java.util.Locale.Builder builder32 = builder31.clear();
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Locale.Builder builder35 = builder32.setLocale(locale33);
        java.util.Locale locale36 = builder35.build();
        java.lang.String str37 = locale28.getDisplayLanguage(locale36);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str40 = locale38.getDisplayLanguage();
        java.util.Locale.setDefault(locale38);
        java.lang.String str42 = locale28.getDisplayName(locale38);
        java.lang.String str43 = locale38.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.getLanguage();
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale45);
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale50.getExtension('h');
        java.lang.String str53 = locale49.getDisplayScript(locale50);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale49);
        java.lang.String str55 = locale45.getDisplayVariant(locale49);
        java.lang.String str56 = locale45.getDisplayLanguage();
        boolean boolean57 = locale45.hasExtensions();
        java.lang.String str58 = locale38.getDisplayVariant(locale45);
        java.util.Locale.setDefault(category0, locale45);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!       " + "'", str16, "hi!       ");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals(locale28.toString(), "french_NC_HZ");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CAN" + "'", str34, "CAN");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "french" + "'", str37, "french");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Korean" + "'", str40, "Korean");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "french (NC_HZ)" + "'", str42, "french (NC_HZ)");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ko-KR" + "'", str43, "ko-KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ko" + "'", str46, "ko");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "TALIAN\\U0023" + "'", str47, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!       " + "'", str54, "hi!       ");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test32679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32679");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(")dnK( hcsis\366znrF", "aaabaGafakamanarasavayazbabGbgbhbibmbn...", "\u97d3\u6587\u5357\u97d3", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ")dnK( hcsis\366znrF" + "'", str4, ")dnK( hcsis\366znrF");
    }

    @Test
    public void test32680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32680");
        java.util.Locale locale1 = new java.util.Locale("itTAiT_ITALIAN_EgAish                                                                                ");
        java.lang.String str2 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "ittait_italian_egaish                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Chinesisch (China)", "                  iTALIE                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch (China)" + "'", str2, "Chinesisch (China)");
    }

    @Test
    public void test32682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32682");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.getLanguage();
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale11);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale15);
        java.lang.String str21 = locale11.getDisplayVariant(locale15);
        java.util.Locale.Builder builder22 = builder7.setLocale(locale11);
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setScript("!       2ITALIANITALIANITALIANITALItalienisch2Iadaeafagaialamanaoaqarasaauawaxazbabb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: !       2ITALIANITALIANITALIANITALItalienisch2Iadaeafagaialamanaoaqarasaauawaxazbabb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ko" + "'", str12, "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TALIAN\\U0023" + "'", str13, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!       " + "'", str20, "hi!       ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test32683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("FR_frGGGGG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR_frGGGGG" + "'", str1, "FR_frGGGGG");
    }

    @Test
    public void test32684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32684");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Cinese (cina)\\u0069h...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese(cina)\\u0069h...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32685");
        java.util.Locale locale3 = new java.util.Locale("talian_ITALIAN_English");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("9hhhhhhhhhh                                                             ", locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("\\U0034\\U00 HCSTUD \\U0034\\U00\\u0078\\u0078\\u0078\\u0078\\u0078\\u0078", locale3);
        java.lang.String str6 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "talian_italian_english");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9hhhhhhhhhh                                                             " + "'", str4, "9hhhhhhhhhh                                                             ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\U0034\\U00 HCSTUD \\U0034\\U00\\U0078\\U0078\\U0078\\U0078\\U0078\\U0078" + "'", str5, "\\U0034\\U00 HCSTUD \\U0034\\U00\\U0078\\U0078\\U0078\\U0078\\U0078\\U0078");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test32686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("FR_CA                                                   ", "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR_CA                                                   " + "'", str2, "FR_CA                                                   ");
    }

    @Test
    public void test32687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("italieital", "iFtlnz\\sisc02rankreich)00      ", "E aaaaaaaaaaaaaaaaE  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italieital" + "'", str3, "italieital");
    }

    @Test
    public void test32688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32688");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                    .................................Italian (Italy)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=.................................italian(italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444" + "'", str2, "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
    }

    @Test
    public void test32690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32690");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str9 = locale1.getDisplayVariant(locale3);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.lang.String str19 = locale17.getExtension('x');
        java.util.Locale.setDefault(category10, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category10);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category10, locale23);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.lang.String str36 = locale32.getDisplayCountry();
        java.lang.String str37 = locale32.getScript();
        java.lang.String str38 = locale32.getScript();
        java.lang.String str39 = locale25.getDisplayCountry(locale32);
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale43.getExtension('h');
        java.lang.String str46 = locale42.getDisplayScript(locale43);
        java.lang.String str47 = locale42.getISO3Country();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale48);
        java.lang.String str50 = locale42.getDisplayName(locale48);
        java.lang.String str51 = locale42.getScript();
        java.util.Locale.setDefault(category40, locale42);
        java.lang.String str53 = locale25.getDisplayCountry(locale42);
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale locale55 = builder54.build();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str58 = locale55.getDisplayLanguage(locale57);
        java.lang.String str59 = locale42.getDisplayVariant(locale55);
        java.util.Locale.setDefault(category10, locale55);
        java.lang.String str61 = locale1.getDisplayScript(locale55);
        java.util.Locale locale62 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FRA" + "'", str47, "FRA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str50, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_CA");
    }

    @Test
    public void test32691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA", "                                             hcstueD                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32692");
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
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList40, filteringMode54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap57);
        java.util.Locale locale60 = new java.util.Locale("hi!       ");
        java.util.Locale locale61 = java.util.Locale.CANADA;
        java.lang.String str62 = locale60.getDisplayName(locale61);
        java.util.Set<java.lang.String> strSet63 = locale61.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet63);
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("italian");
        java.util.Locale locale67 = locale66.stripExtensions();
        java.util.Locale locale68 = java.util.Locale.CHINESE;
        java.util.Locale locale69 = java.util.Locale.FRENCH;
        java.lang.String str70 = locale69.getDisplayName();
        java.lang.String str72 = locale69.getExtension('C');
        java.lang.String str73 = locale68.getDisplayLanguage(locale69);
        java.lang.String str74 = locale69.getISO3Country();
        java.util.Locale locale75 = locale69.stripExtensions();
        java.lang.String str76 = locale67.getDisplayScript(locale69);
        java.util.Set<java.lang.String> strSet77 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str78 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet77);
        java.lang.String str80 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet77, "nglish(UnitedKingdom)");
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
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertEquals(locale60.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!       " + "'", str62, "hi!       ");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "italian");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "italian");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "fran\347ais" + "'", str70, "fran\347ais");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "chinois" + "'", str73, "chinois");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test32693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32693");
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
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str16 = locale14.getVariant();
        java.lang.String str17 = locale14.getDisplayName();
        java.lang.String str18 = locale14.getDisplayName();
        java.lang.String str19 = locale14.getDisplayVariant();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", locale14);
        java.util.Locale locale21 = locale14.stripExtensions();
        java.util.Locale.Builder builder22 = builder12.setLocale(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder22.setExtension('l', "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ??????????????????????????????????\\aUa0046 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str20, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test32694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0034\\u00                                   en_C\\u0034\\u00                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0034\\U00                                   EN_C\\U0034\\U00                                    " + "'", str1, "\\U0034\\U00                                   EN_C\\U0034\\U00                                    ");
    }

    @Test
    public void test32695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#####################################################################################", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32696");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("         italian_italian_engl", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian_italian_engl");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ITALIAN (ITALIAN,ENGLISH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32698");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                    fRENCH (fRANCE)                                                \\u0068", 97, 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch", ")ECNARf( HCNERf", 113);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbfr_ca                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\     cfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test32702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Frnz\366sischt(Knd)                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fRNZ\326SISCHT(kND)                        " + "'", str1, "fRNZ\326SISCHT(kND)                        ");
    }

    @Test
    public void test32703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      " + "'", str1, "                                     fr         ITALIAN_italian_eNGLISHn\347         ITALIAN_italian_eNGLISHis (Fr         ITALIAN_italian_eNGLISHnce)                                      ");
    }

    @Test
    public void test32704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ASZHAZHZHZHZHZHZHZHZHZHZ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32705");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HCSTUED", (double) 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=62.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32706");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ih", "hi!       iTALIAN (ITALIAN,ENGLISHItalienischiTALIAN (ITALIAN,ENGLISHitalian_ITALIAN_EnglishiTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...iTALIAN (ITALIAN,ENGLISH\\u0034iTALIAN (ITALIAN,ENGLISHHI!iTALIAN (ITALIAN,ENGLISHItalianiTALIAN (ITALIAN,ENGLISH\\u0061iTALIAN (ITALIAN,ENGLISH\\u0023iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHChinese (China)iTALIAN (ITALIAN,ENGLISHhi!iTALIAN (ITALIAN,ENGLISHzh_CNiTALIAN (ITALIAN,ENGLISHiTALIANiTALIAN (ITALIAN,ENGLISHeniTALIAN (ITALIAN,ENGLISHItalienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32707");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setScript("                                                         \\u005");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                          \\u005 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test32708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32708");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale12.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
    }

    @Test
    public void test32709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                  i44444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32710");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##################", "fr_FR                  ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32711");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test32712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32712");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AQeAReASeATeAU\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32713");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                  \\U0069HHHHHHHHHH", "hcsnela                                                gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32714");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setVariant("                                        itTAiT_ITALIAN_EgAish                                 \\u0068");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                         itTAiT_ITALIAN_EgAish                                 \\u0068 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test32715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii ", "E             g");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test32716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32716");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("########################################################Franz\366sisc########################################################", "             HCSINEILATI             ", (int) 'n');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                              it", (int) 'x', 67);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test32717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32717");
        java.util.Locale locale1 = new java.util.Locale("FRANZ\326SISCHF(FRANKREICH)");
        java.lang.String str3 = locale1.getExtension('d');
        org.junit.Assert.assertEquals(locale1.toString(), "franz\326sischf(frankreich)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32718");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getScript();
        java.lang.String str12 = locale2.getDisplayVariant(locale8);
        java.lang.String str13 = locale2.getScript();
        java.lang.String str14 = locale2.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
    }

    @Test
    public void test32719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0055", (int) 'F', "!!!!!!!!!!!!!!!!!!!!!\\u0020hi!       _\\U0020_Italienisch################anihc!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!\\u0020hi!  \\u0055!!!!!!!!!!!!!!!!!!!!!\\u0020hi!  " + "'", str3, "!!!!!!!!!!!!!!!!!!!!!\\u0020hi!  \\u0055!!!!!!!!!!!!!!!!!!!!!\\u0020hi!  ");
    }

    @Test
    public void test32720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32720");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "E             g                                                                                     ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "iTALIAN                                                                 ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("frankreich", "English", (int) '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, 'h');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", strArray4, strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "    ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "frankreich" + "'", str16, "frankreich");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str17, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test32721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", "Franz\366sisch(Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!" + "'", str2, "HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!");
    }

    @Test
    public void test32722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0069 (    )\\u0069 (    )\\u0069 (    )\\u0069 (    )\\u0069 (    )\\u0069 (    )\\u0069 (    )\\u0069EEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "\uc774\ud0c8\ub9ac\uc544\uc5b4                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test32724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "gsh", "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#", "ENGLISCH", 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...U0069\\U0069\\U00ENGLISCH69\\U0069\\ENGLISC#" + "'", str3, "...U0069\\U0069\\U00ENGLISCH69\\U0069\\ENGLISC#");
    }

    @Test
    public void test32726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32726");
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
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale15.getDisplayName(locale16);
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale15);
        java.lang.String str20 = locale8.getDisplayScript(locale15);
        boolean boolean21 = locale15.hasExtensions();
        java.lang.String str22 = locale15.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "allemand" + "'", str17, "allemand");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "de" + "'", str22, "de");
    }

    @Test
    public void test32727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32727");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Chinesisch (China)", (java.lang.CharSequence) "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 861 + "'", int2 == 861);
    }

    @Test
    public void test32728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32728");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444france444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32729");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0034\\u00hcstud\\u0034\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "!IH");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "CAN");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test32731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0064", "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0064" + "'", str3, "\\u0064");
    }

    @Test
    public void test32732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "\ub3c5\uc77c\uc5b4ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN    ITALIAN   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32733");
        java.util.Locale locale3 = new java.util.Locale("", "DE_DE", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale10);
        java.lang.String str12 = locale4.getDisplayName(locale10);
        java.lang.String str13 = locale3.getDisplayScript(locale10);
        java.lang.String str14 = locale10.getVariant();
        java.util.Set<java.lang.String> strSet15 = locale10.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "_DE_DE_aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str12, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test32734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test32735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                              Deutsch", 21, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              Deutsch" + "'", str3, "                                                                                              Deutsch");
    }

    @Test
    public void test32736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\uc911\uad6d) \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4", "Zh_CNfRENCH (cANADA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32737");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...", "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", 40, 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IIIIIIIIIIIIIII444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISCIIIIIIIII..." + "'", str4, "IIIIIIIIIIIIIII444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISCIIIIIIIII...");
    }

    @Test
    public void test32738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("e                               e                               e        ", "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32739");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\XTALXAN_ITALIAN_ENGLXSH                                                 ", "EEEEEEEEEFRAEEEEEEEEE", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!ih" + "'", str1, "44444444444444444444444444444444!ih");
    }

    @Test
    public void test32741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32741");
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
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.lang.String str23 = locale18.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale24);
        java.lang.String str26 = locale18.getDisplayName(locale24);
        java.lang.String str27 = locale18.getScript();
        java.util.Locale.setDefault(category16, locale18);
        java.lang.String str29 = locale1.getDisplayCountry(locale18);
        java.lang.String str30 = locale18.getCountry();
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", locale18);
        java.util.Set<java.lang.String> strSet32 = locale18.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FRA" + "'", str23, "FRA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str26, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\" + "'", str31, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test32742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\351encor\351encor\351encor\351", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\351encor\351encor\351encor\351" + "'", str2, "\351encor\351encor\351encor\351");
    }

    @Test
    public void test32743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32743");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("eAGAASH");
        java.util.Locale locale4 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('4', "7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "eagaash");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test32744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", "                                                     \\u005c        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB" + "'", str2, "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
    }

    @Test
    public void test32745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32745");
        java.util.Locale locale3 = new java.util.Locale("NGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL", "italiaE", "iT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals(locale3.toString(), "ngengengengengengengengengengengengengeng_                                                                    \\u0020italianitalianitalianital_ITALIAE_iT_ITALIAN_EgAish");
    }

    @Test
    public void test32746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "frtatiIi2tatat", "         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32748");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("tTAT_ITA", locale2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               en", locale2);
        java.util.Locale locale9 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str10 = locale2.getDisplayScript(locale9);
        java.lang.String str11 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TTAT_ITA" + "'", str4, "TTAT_ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                               en" + "'", str5, "                                                                                               en");
        org.junit.Assert.assertEquals(locale9.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test32749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32749");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            \\u0020iItalian\\u0020i                                                 ", "UD");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32750");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("EcanadaGcanadacanadaSH", 'g', 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EcanadaGcanadacanadaSH" + "'", str3, "EcanadaGcanadacanadaSH");
    }

    @Test
    public void test32752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 267, "ccccccccccccccccccccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccccccczzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzccccccccccccccccccccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str3, "ccccccccccccccccccccccccccccccccccccccccccccccccceGSCHccccccccccccccccccccccccccccccccccccccccccccccccccccczzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzccccccccccccccccccccccccccccccccccccccccccccccccceGSCHcccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test32754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32754");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str9 = locale1.getDisplayVariant(locale3);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale.setDefault(category10, locale13);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.lang.String str19 = locale17.getExtension('x');
        java.util.Locale.setDefault(category10, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category10);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category10, locale23);
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.lang.String str36 = locale32.getDisplayCountry();
        java.lang.String str37 = locale32.getScript();
        java.lang.String str38 = locale32.getScript();
        java.lang.String str39 = locale25.getDisplayCountry(locale32);
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.lang.String str45 = locale43.getExtension('h');
        java.lang.String str46 = locale42.getDisplayScript(locale43);
        java.lang.String str47 = locale42.getISO3Country();
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale48);
        java.lang.String str50 = locale42.getDisplayName(locale48);
        java.lang.String str51 = locale42.getScript();
        java.util.Locale.setDefault(category40, locale42);
        java.lang.String str53 = locale25.getDisplayCountry(locale42);
        java.util.Locale.Builder builder54 = new java.util.Locale.Builder();
        java.util.Locale locale55 = builder54.build();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str58 = locale55.getDisplayLanguage(locale57);
        java.lang.String str59 = locale42.getDisplayVariant(locale55);
        java.util.Locale.setDefault(category10, locale55);
        java.lang.String str61 = locale1.getDisplayScript(locale55);
        java.util.Locale locale62 = null;
        java.lang.String str63 = locale55.getDisplayLanguage(locale62);
        java.util.Set<java.lang.String> strSet64 = locale55.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "FRA" + "'", str47, "FRA");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str50, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strSet64);
    }

    @Test
    public void test32755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32755");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0034\\u00hcstuD\\u0034\\u00", "                                                         eNGLISHu005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u00hcstuD\\u0034\\u00" + "'", str2, "\\u0034\\u00hcstuD\\u0034\\u00");
    }

    @Test
    public void test32757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32757");
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
        java.util.Locale locale17 = new java.util.Locale("cor\351en (Cor\351e du Sud)", "RA");
        java.util.Locale.setDefault(category0, locale17);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(category0, locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
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
        org.junit.Assert.assertEquals(locale17.toString(), "cor\351en (cor\351e du sud)_RA");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja_JP");
    }

    @Test
    public void test32758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A700U\\  ", "Franz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A700U\\  " + "'", str2, "A700U\\  ");
    }

    @Test
    public void test32759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32759");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Italien", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zH_CN", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test32760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("       ", "AD\rAE\rAF\rAG\rAI\rAL\rAM\rAN\rAO\rAQ\rAR\rAS\rAT\rAU\rAW\rAX\rAZ\rBA\rBB\rBD\rBE\rBF\rBG\rBH\rBI\rBJ\rBL\rBM\rB", "eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32761");
        java.util.Locale locale3 = new java.util.Locale("English", "italy", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for english");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "english_ITALY_H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
    }

    @Test
    public void test32762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "CCCC\\CCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32763");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("china");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale.Builder builder12 = builder9.setLocale(locale11);
        java.util.Locale.setDefault(locale11);
        java.util.Locale locale15 = new java.util.Locale("en");
        boolean boolean16 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = locale15.getDisplayLanguage(locale20);
        java.lang.String str23 = locale11.getDisplayVariant(locale15);
        java.lang.String str24 = locale11.getVariant();
        java.util.Locale.Builder builder25 = builder6.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder25.setExtension('4', "                               INGLESE                                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "inglese" + "'", str22, "inglese");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test32764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "UDHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32765");
        char[] charArray9 = new char[] { 'A', 't', '\r', 'f', 'R' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IH", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ITALIENISCH", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Und-iTLIN", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "At\rfR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "At\rfR");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[A, t, \r, f, R]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test32766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSHR0nailati" + "'", str1, "\\XTALXAN_ITALIAN_ENGLXSHR0nailati");
    }

    @Test
    public void test32767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32767");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('7');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
    }

    @Test
    public void test32768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("eZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZgZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZsh", "ita", "U!IH!IH!IH!IH!IHNI         D00U\\00U\\ED00U\\00U\\ED00U\\G        ESEL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZgZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZsh" + "'", str3, "eZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZgZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZZZZZZZZZZZZZZHCSINEILATIZZZZZZZZZZZZZsh");
    }

    @Test
    public void test32769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)########################################", "GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)GERMAN (GERMANY)", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32770");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet5 = locale0.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.lang.String str15 = locale10.getISO3Country();
        java.lang.String str16 = locale8.getDisplayVariant(locale10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale8);
        java.lang.String str18 = locale8.getLanguage();
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.util.Locale locale27 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str28 = locale19.getDisplayCountry(locale27);
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale30 = locale19.stripExtensions();
        java.lang.String str31 = locale19.getDisplayName();
        java.util.Set<java.lang.String> strSet32 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str33 = locale8.getDisplayCountry(locale19);
        java.lang.String str34 = locale0.getDisplayLanguage(locale8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FRA" + "'", str15, "FRA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str17, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale27.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "France" + "'", str28, "France");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "fran\347ais (France)" + "'", str31, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Canada" + "'", str33, "Canada");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "italien" + "'", str34, "italien");
    }

    @Test
    public void test32771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...UED                                                     ...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...UED                                                     ..." + "'", str2, "...UED                                                     ...");
    }

    @Test
    public void test32772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32772");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String str9 = languageRange1.getRange();
        double double10 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e" + "'", str8, "e");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "e" + "'", str9, "e");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test32773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ILATiNA...", "\\u0078");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32774");
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
        java.lang.String str21 = locale15.getVariant();
        java.lang.String str22 = locale15.getISO3Language();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0034" + "'", str6, "\\u0034");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (Canada)" + "'", str7, "fran\347ais (Canada)");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fra" + "'", str22, "fra");
    }

    @Test
    public void test32775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Korean(SouthKor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("E             g", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32777");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\351K44444444444444444444444444444444!", "             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)" + "'", str2, "fR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
    }

    @Test
    public void test32779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32779");
        java.util.Locale locale1 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str4 = locale1.getExtension('n');
        org.junit.Assert.assertEquals(locale1.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test32780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test32781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32781");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("8ian\\u0020i86");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.lang.String str6 = locale1.getDisplayScript(locale5);
        java.util.Locale locale9 = new java.util.Locale("G", "Franz\366sisch");
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale11);
        java.lang.String str17 = locale11.getDisplayLanguage();
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale19);
        java.lang.String str21 = locale19.getDisplayName();
        java.lang.String str22 = locale11.getDisplayCountry(locale19);
        java.lang.String str23 = locale9.getDisplayVariant(locale19);
        java.lang.String str24 = locale1.getDisplayVariant(locale19);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale9.toString(), "g_FRANZ\366SISCH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!       " + "'", str16, "hi!       ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "franz\366sisch (frankreich)" + "'", str20, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u56fd" + "'", str22, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test32782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32782");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u0" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u0");
    }

    @Test
    public void test32784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA", "!_\\U0020_Itle#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA");
    }

    @Test
    public void test32785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32785");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                     \\u005", "English                                 (                United                                 Kingdom                )");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32786");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("CANADA");
        java.util.Locale locale11 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setRegion("                                        anglais (royaume-uni)FRA                                         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                         anglais (royaume-uni)FRA                                          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test32787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED.");
    }

    @Test
    public void test32788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32788");
        java.util.Locale locale3 = new java.util.Locale("hzhzhzhzhz", "           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals(locale3.toString(), "hzhzhzhzhz_           E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               E                               _ \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test32789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Korean(SouthKor", "\\u0038zho                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                        ", "         italian_italian_englIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32791");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setRegion("\\U0064");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\U0064 [at index 0]");
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
    }

    @Test
    public void test32792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("YYYYYYa700u\\  YYYYYY", "fran\347                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YYYYYYa700u\\  YYYYYY" + "'", str2, "YYYYYYa700u\\  YYYYYY");
    }

    @Test
    public void test32793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("china", '8');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("cCCC\\CCCC", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "china" + "'", str6, "china");
    }

    @Test
    public void test32794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32794");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("e                               e                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=e                               e                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32795");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str13 = locale9.getDisplayCountry();
        java.util.Locale.Builder builder14 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder16 = builder8.addUnicodeLocaleAttribute("23DAL");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setLanguage("\\atalaaa_ITALIAN_Eaglaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\atalaaa_ITALIAN_Eaglaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test32796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Katalanisch\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Katalanisch" + "'", str1, "Katalanisch");
    }

    @Test
    public void test32797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32797");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Locale.setDefault(category0, locale8);
        boolean boolean10 = locale8.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale8.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test32798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                       \\u0020                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020" + "'", str1, "\\u0020");
    }

    @Test
    public void test32799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32799");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u00" + "'", str1, "\\u00");
    }

    @Test
    public void test32800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Engl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Engl" + "'", str1, "Engl");
    }

    @Test
    public void test32801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "Eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ", 107);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32802");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.lang.String str5 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "de" + "'", str5, "de");
    }

    @Test
    public void test32803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", (int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
    }

    @Test
    public void test32804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32804");
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
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList24, filteringMode28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList29, filteringMode38);
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.getScript();
        java.util.Set<java.lang.String> strSet43 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet43);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder46 = builder45.clearExtensions();
        java.util.Locale.Builder builder48 = builder45.setLanguageTag("Italian");
        java.util.Locale.Builder builder49 = builder45.clearExtensions();
        java.util.Locale.Builder builder50 = builder45.clear();
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder53 = builder45.setLocale(locale52);
        java.util.Locale.Builder builder54 = builder53.clear();
        java.util.Locale.Builder builder55 = builder53.clear();
        java.util.Locale.Builder builder56 = builder55.clear();
        java.util.Locale locale57 = builder55.build();
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleAttributes();
        java.lang.String str59 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet58);
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
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode28.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test32805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32805");
        java.util.Locale locale4 = new java.util.Locale(" italian  ", "                                                                                              Deutsch", "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("", locale4);
        java.lang.String str6 = locale4.getDisplayVariant();
        java.lang.String str8 = locale4.getExtension('z');
        java.lang.String str9 = locale4.getDisplayLanguage();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh" + "'", str6, "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " italian  " + "'", str9, " italian  ");
    }

    @Test
    public void test32806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32806");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("zhAzhzhzhzhzhzhzhzhzhzh", "und-CA");
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.lang.String str13 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franz\366sisch (frankreich)" + "'", str4, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test32807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32807");
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
            java.util.Locale.Builder builder14 = builder9.setExtension(')', "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_EGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEGEG_                                                                    \\u0020iTALIAiTALIAiTALIAiTALI----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
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
    public void test32808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch" + "'", str1, "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch");
    }

    @Test
    public void test32809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch", (int) '0', '\351');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch" + "'", str3, "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch");
    }

    @Test
    public void test32810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32810");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale4 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = java.util.Locale.FRENCH;
        java.lang.String str7 = locale6.getDisplayName();
        java.lang.String str9 = locale6.getExtension('C');
        java.lang.String str10 = locale5.getDisplayLanguage(locale6);
        java.util.Locale.setDefault(locale5);
        java.lang.String str12 = locale4.getDisplayVariant(locale5);
        java.lang.String str13 = locale4.getDisplayLanguage();
        java.lang.String str14 = locale0.getDisplayName(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
        org.junit.Assert.assertEquals(locale4.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Franz\366sisch" + "'", str7, "Franz\366sisch");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "chinois" + "'", str10, "chinois");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "france" + "'", str13, "france");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Japanese (Japan)" + "'", str14, "Japanese (Japan)");
    }

    @Test
    public void test32811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDKorean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)...", "de_DE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32812");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.lang.String str4 = locale2.getExtension('u');
        java.lang.String str5 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       !IH" + "'", str5, "       !IH");
    }

    @Test
    public void test32813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("en-GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-GB" + "'", str1, "en-GB");
    }

    @Test
    public void test32814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", (int) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064" + "'", str3, "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
    }

    @Test
    public void test32815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32815");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale12 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale8.getDisplayCountry(locale12);
        java.lang.String str15 = locale8.getISO3Language();
        java.util.Locale.Builder builder16 = builder6.setLocale(locale8);
        java.util.Locale locale17 = builder16.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale12.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ITALIAN" + "'", str13, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "China" + "'", str14, "China");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zho" + "'", str15, "zho");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
    }

    @Test
    public void test32816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32816");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h#########################################################################################", 109, '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h#########################################################################################9999999999999999999" + "'", str3, "h#########################################################################################9999999999999999999");
    }

    @Test
    public void test32818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "GB", "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32819");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "german (germany)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 27861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                         HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         HHHHHHHHHHtTAHHHHHHHHHHT_ITA" + "'", str2, "                                                         HHHHHHHHHHtTAHHHHHHHHHHT_ITA");
    }

    @Test
    public void test32821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "             FRANZ\326SISCH (KANADA)              ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\351', 499, 262);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test32822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                      ", 997);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                      " + "'", str2, "                                                                                                      ");
    }

    @Test
    public void test32823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "anglais (royaume-uni)fra");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (royaume-uni)fra" + "'", str1, "anglais (royaume-uni)fra");
    }

    @Test
    public void test32824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32824");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" italian  ", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("nailati", strMap6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList9, strMap10);
        java.lang.String[] strArray24 = new java.lang.String[] { "\\u0020iItalian\\u008600u\\", "\\u0020iItalian\\u0020i", "anglais", "FRZ\326CZ(FRKREC)", "italian    ", "                                                                                                      ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "FRZ\326CZ(FRKREC)", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "                                      ..." };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strList25);
        java.util.Locale locale31 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale33 = locale32.stripExtensions();
        java.lang.String str34 = locale32.toLanguageTag();
        java.util.Locale locale36 = new java.util.Locale("en");
        boolean boolean37 = locale36.hasExtensions();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleKeys();
        java.lang.String str39 = locale32.getDisplayName(locale36);
        java.util.Locale locale43 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale44 = locale43.stripExtensions();
        java.lang.String str45 = locale36.getDisplayName(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet47 = locale44.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.lang.String>) strList57, filteringMode59);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList57, filteringMode61);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet47, filteringMode61);
        java.util.Locale locale64 = java.util.Locale.ITALIAN;
        java.lang.String str65 = locale64.getDisplayLanguage();
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        java.lang.String str68 = locale66.getExtension('h');
        java.lang.String str69 = locale64.getDisplayCountry(locale66);
        java.lang.String str70 = locale66.toLanguageTag();
        java.lang.String str71 = locale66.getCountry();
        java.util.Set<java.lang.String> strSet72 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strSet72);
        java.lang.String str74 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strList73);
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList73, '!');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "und" + "'", str34, "und");
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str39, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale43.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English" + "'", str45, "English");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode61.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str65, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "it");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "it" + "'", str70, "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test32825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc", 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str3, "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test32826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32826");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        java.lang.String str9 = locale4.toLanguageTag();
        java.lang.String str10 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr-CA" + "'", str9, "fr-CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr_CA" + "'", str10, "fr_CA");
    }

    @Test
    public void test32827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("francesefrancesefrancesefr\\u0075", 'Y');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francesefrancesefrancesefr\\u0075" + "'", str2, "francesefrancesefrancesefr\\u0075");
    }

    @Test
    public void test32828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32828");
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
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Locale.Builder builder45 = builder42.setLocale(locale44);
        java.util.Set<java.lang.String> strSet46 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet46, "HI!HI!");
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap50);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.lang.String str53 = locale52.getDisplayVariant();
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale55.getDisplayCountry();
        java.lang.String str57 = locale54.getDisplayVariant(locale55);
        java.lang.String str58 = locale52.getDisplayScript(locale55);
        java.util.Set<java.lang.String> strSet59 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str60 = java.util.Locale.lookupTag(languageRangeList51, (java.util.Collection<java.lang.String>) strSet59);
        java.util.Locale locale61 = java.util.Locale.ROOT;
        java.lang.String str62 = locale61.getISO3Country();
        java.lang.String str63 = locale61.getDisplayVariant();
        java.lang.String str64 = locale61.getDisplayVariant();
        java.lang.String str65 = locale61.getDisplayName();
        java.util.Set<java.lang.String> strSet66 = locale61.getUnicodeLocaleKeys();
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet66, "hIAN\\U0020Ih");
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet66, "Royaume-Uni");
        java.lang.String str71 = java.util.Locale.lookupTag(languageRangeList51, (java.util.Collection<java.lang.String>) strSet66);
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
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test32829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32829");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test32830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ", 151);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32831");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ", 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32832");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder16 = builder14.clear();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = locale18.getCountry();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale22.getDisplayCountry(locale26);
        java.lang.String str29 = locale22.getISO3Language();
        java.util.Locale.Builder builder30 = builder20.setLocale(locale22);
        java.util.Locale locale33 = new java.util.Locale("KOREAN (SOUTH KOREA)", "n");
        java.util.Locale locale36 = new java.util.Locale(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str37 = locale33.getDisplayScript(locale36);
        java.util.Set<java.lang.Character> charSet38 = locale33.getExtensionKeys();
        java.lang.String str39 = locale22.getDisplayLanguage(locale33);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.lang.String str43 = locale40.getExtension('F');
        java.lang.String str44 = locale40.getDisplayLanguage();
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.lang.String str48 = locale46.getExtension('h');
        java.lang.String str49 = locale45.getDisplayScript(locale46);
        boolean boolean50 = locale45.hasExtensions();
        java.lang.String str51 = locale45.getVariant();
        java.util.Set<java.lang.Character> charSet52 = locale45.getExtensionKeys();
        java.lang.String str53 = locale45.toLanguageTag();
        java.lang.String str54 = locale40.getDisplayVariant(locale45);
        java.lang.String str55 = locale33.getDisplayName(locale40);
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str58 = locale56.getDisplayScript(locale57);
        java.lang.String str59 = locale57.getVariant();
        java.util.Set<java.lang.String> strSet60 = locale57.getUnicodeLocaleKeys();
        java.lang.String str61 = locale57.toLanguageTag();
        java.lang.String str62 = locale33.getDisplayLanguage(locale57);
        java.util.Locale.Builder builder63 = builder13.setLocale(locale57);
        java.lang.String str65 = locale57.getExtension('I');
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale26.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ITALIAN" + "'", str27, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zho" + "'", str29, "zho");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals(locale33.toString(), "korean (south korea)_N");
        org.junit.Assert.assertEquals(locale36.toString(), ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian_44444444444444444444444444444444IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\366SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(charSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chinese" + "'", str39, "Chinese");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u82f1\u6587" + "'", str41, "\u82f1\u6587");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u82f1\u6587" + "'", str44, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "fr-FR" + "'", str53, "fr-FR");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "korean (south korea) (N)" + "'", str55, "korean (south korea) (N)");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr-CA" + "'", str61, "fr-CA");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "korean (south korea)" + "'", str62, "korean (south korea)");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test32833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg", "FRNZ\326SISCH (KND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32834");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ILATiNA...", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ILATiNA..." + "'", str2, "ILATiNA...");
    }

    @Test
    public void test32836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32836");
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
        java.lang.Object obj18 = locale14.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str1, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "italian");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "italian");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "italian");
    }

    @Test
    public void test32837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hic!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test32838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32838");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "iFtlnz\\sisc02rankreich)00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32839");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder6.setLanguageTag("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiEsilgnE_NAILATI_nailatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test32840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 \\U0020  ", "italiae");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 \\U0020  " + "'", str2, "                                                                 \\U0020  ");
    }

    @Test
    public void test32841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "FRA", "(italian,eNGLISH) ITALIAN");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IFTLNZ\\SISC02", "\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischen", "italiaE    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischen" + "'", str2, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischen");
    }

    @Test
    public void test32845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32845");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.String str7 = locale3.getCountry();
        java.util.Locale locale11 = new java.util.Locale("IT", "Regno Unito", "                                        #u##2#iTALIANiTALIANiTALIANiT");
        java.lang.String str12 = locale3.getDisplayScript(locale11);
        java.lang.String str13 = locale1.getDisplayCountry(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertEquals(locale11.toString(), "it_REGNO UNITO_                                        #u##2#iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test32846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32846");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          fr-ca", 85, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32847");
        java.util.Locale locale2 = new java.util.Locale("...U0069\\U0069\\U00ENGLISCH69\\U0069\\ENGLISC#", "78");
        org.junit.Assert.assertEquals(locale2.toString(), "...u0069\\u0069\\u00englisch69\\u0069\\englisc#_78");
    }

    @Test
    public void test32848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32848");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("franz\366sisch (kanada)franz\366s                                                                 franz\366sisch (kanada)franz\366si", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih    Deutsc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hcsFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalyneFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalylaFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
    }

    @Test
    public void test32853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32853");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("IIIIIIIIIIIIIII444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISCIIIIIIIII...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiiiiiiii444444444444444444444444444444444444444444444444444444444444444444444franzo?sisciiiiiiiii...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002" + "'", str1, "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
    }

    @Test
    public void test32855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "fffffffffffffffffffffffffffffffffraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhacor\351e du sud");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32856");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) 'Y');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test32857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!(\\U0020,Italienisch############################################hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32859");
        java.util.Locale locale2 = new java.util.Locale("\\u0038zho                          ", "2ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0038zho                          _2ITALIANITALIANITALIANITAL");
    }

    @Test
    public void test32860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444it                   ", "DEUTSCH (DEUTSCHLAND)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32861");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale2);
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale7.getExtension('h');
        java.lang.String str10 = locale6.getDisplayScript(locale7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale6);
        java.lang.String str12 = locale2.getDisplayVariant(locale6);
        java.lang.String str13 = locale2.toLanguageTag();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko" + "'", str3, "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TALIAN\\U0023" + "'", str4, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!       " + "'", str11, "hi!       ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIG" + "'", str14, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIGTES K\326NIGREICH)ENGLISCH (VEREINIG");
    }

    @Test
    public void test32862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                      Englisch                                                       ", "chinois (chine) (\\ITALIAN_ITALIAN_ENGLISH)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020", "francese (canada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihhi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                         it_IT                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it_IT" + "'", str1, "it_IT");
    }

    @Test
    public void test32866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch", "\\u0067");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch" + "'", str2, "!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch");
    }

    @Test
    public void test32867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32867");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "chinoisf(Chine)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'k');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str3, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str5, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
    }

    @Test
    public void test32868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32868");
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
            java.util.Locale.Builder builder33 = builder9.setLanguageTag("  aNIHc  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:   aNIHc   [at index 0]");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str11, "\u610f\u5927\u5229\u6587");
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
    public void test32869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "99999\\u0021", (java.lang.CharSequence) "...                               RRRRRRRRRRR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ko-KR                                                                                                   ", 'b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR                                                                                                   " + "'", str2, "ko-KR                                                                                                   ");
    }

    @Test
    public void test32872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("italian__#e-deutsch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian__#e-deutsch" + "'", str1, "italian__#e-deutsch");
    }

    @Test
    public void test32873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             ITALIAN_ITALIAN_ENGLISH", ")ECNARf( HCNERf", "iTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTITILIIL_ITILIIL_TLGLISA" + "'", str3, "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTITILIIL_ITILIIL_TLGLISA");
    }

    @Test
    public void test32874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32874");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("E             g                          ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eg" + "'", str2, "Eg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eg" + "'", str3, "Eg");
    }

    @Test
    public void test32875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32875");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                     DE_DE                                              ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test32876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32876");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", (double) 115);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=115.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("23DAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23dal" + "'", str1, "23dal");
    }

    @Test
    public void test32878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32878");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0065                             a)                                                                                                           ", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("2CINESE(CINA...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################", "4300u\\                                             dutsch                                            ", (int) 'e');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0020TALIANTALIANTALIANiTALI", "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FrancGa", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FrancGa" + "'", str2, "FrancGa");
    }

    @Test
    public void test32883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32883");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("8600u\\", 'N');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("a700u\\  ", "CCCC\\CCCC");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a700u  " + "'", str7, "a700u  ");
    }

    @Test
    public void test32884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32884");
        java.util.Locale locale3 = new java.util.Locale("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ", "", " hi!       _\\U0020_Italienisch####################################################################           ");
        java.lang.String str4 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii                                             hcsfr-cued                                                                                          hcsfr-cued  __ hi!       _\\U0020_Italienisch####################################################################           ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi!       ,\\U0020,Italienisch####################################################################           " + "'", str4, " hi!       ,\\U0020,Italienisch####################################################################           ");
    }

    @Test
    public void test32885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32885");
        java.util.Locale locale2 = new java.util.Locale("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("Cor\351e du Sud", locale2);
        java.lang.String str5 = locale2.getLanguage();
        org.junit.Assert.assertEquals(locale2.toString(), "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "COR\311E DU SUD" + "'", str4, "COR\311E DU SUD");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061" + "'", str5, "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
    }

    @Test
    public void test32886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32887");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!_\\u0020_italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32888");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("Deutsch");
        java.lang.String str8 = locale7.getDisplayCountry();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = locale11.getISO3Country();
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale11.getDisplayName(locale17);
        java.lang.String str20 = locale10.getDisplayLanguage(locale17);
        java.lang.String str21 = locale7.getDisplayVariant(locale17);
        java.lang.String str22 = locale17.getVariant();
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale26.getDisplayCountry();
        java.lang.String str28 = locale25.getDisplayVariant(locale26);
        java.lang.String str29 = locale25.getDisplayCountry();
        java.lang.String str30 = locale25.getScript();
        java.lang.String str31 = locale25.getScript();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale33.getDisplayCountry();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.lang.String str36 = locale32.getDisplayCountry();
        java.lang.String str37 = locale32.getScript();
        java.lang.String str38 = locale32.getScript();
        java.lang.String str39 = locale25.getDisplayCountry(locale32);
        java.lang.String str40 = locale24.getDisplayVariant(locale32);
        java.util.Locale locale42 = java.util.Locale.ENGLISH;
        java.lang.String str43 = locale42.getDisplayLanguage();
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale42);
        java.lang.String str45 = locale42.getCountry();
        java.lang.String str46 = locale42.getCountry();
        java.lang.String str47 = locale32.getDisplayCountry(locale42);
        java.util.Locale locale48 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.lang.String str50 = locale32.getDisplayLanguage(locale48);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.lang.String str53 = locale51.getVariant();
        java.lang.String str54 = locale51.getDisplayName();
        java.lang.String str55 = locale51.getVariant();
        java.lang.String str56 = locale32.getDisplayVariant(locale51);
        java.lang.String str57 = locale51.getScript();
        java.lang.String str58 = locale17.getDisplayScript(locale51);
        java.lang.String str59 = locale0.getDisplayScript(locale51);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str1, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str4, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str19, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Englisch" + "'", str43, "Englisch");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "!IH" + "'", str44, "!IH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "fran\347ais" + "'", str50, "fran\347ais");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Italienisch" + "'", str54, "Italienisch");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test32889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "5c5c5cm5c5c5c5c5c5c5cm5c5cy5c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32890");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Canada", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test32891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32891");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("eng");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Locale.Builder builder16 = builder7.setLocale(locale12);
        java.util.Locale.Builder builder18 = builder16.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder16.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test32892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C", "_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32893");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Locale locale12 = new java.util.Locale("en");
        boolean boolean13 = locale12.hasExtensions();
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.lang.String str15 = locale9.getDisplayCountry(locale12);
        java.lang.String str16 = locale9.getISO3Language();
        java.lang.String str17 = locale9.getLanguage();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fra" + "'", str16, "fra");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
    }

    @Test
    public void test32894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("             hcsineilatI             ", 29, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "chinesisch(China)", "itTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!Tt\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str3, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!Tt\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
    }

    @Test
    public void test32896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Chinook jargon (ETE)", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinook jargon (ETE)" + "'", str2, "Chinook jargon (ETE)");
    }

    @Test
    public void test32897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test32898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32898");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale1.getDisplayName();
        java.lang.String str7 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test32899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32899");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("h");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test32900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("f(KOREAN)", "\\CCglisch");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32901");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("TNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "e...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32902");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale locale9 = builder6.build();
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.getCountry();
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("French", locale14);
        java.lang.String str16 = locale9.getDisplayCountry(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale9.getExtension('\351');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: e?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FRENCH" + "'", str15, "FRENCH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Canada" + "'", str16, "Canada");
    }

    @Test
    public void test32903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32903");
        java.util.Locale locale4 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = locale5.stripExtensions();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("en");
        boolean boolean10 = locale9.hasExtensions();
        java.util.Set<java.lang.String> strSet11 = locale9.getUnicodeLocaleKeys();
        java.lang.String str12 = locale5.getDisplayName(locale9);
        java.util.Locale locale16 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale17 = locale16.stripExtensions();
        java.lang.String str18 = locale9.getDisplayName(locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleKeys();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("                                  \\u005c                                                         ", locale17);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str12, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                  \\U005C                                                         " + "'", str20, "                                  \\U005C                                                         ");
    }

    @Test
    public void test32904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32904");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("       !IH", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "China", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("n       nn", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020hi!       _\\U0020_Italienisch################", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "erma (ermay)", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "anglais (canada)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test32905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32905");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 133 + "'", int1 == 133);
    }

    @Test
    public void test32906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32906");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance..." + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
    }

    @Test
    public void test32908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                  i44444444444444444en", "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hsxlgnE_NAILATI_naxlatx\\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "Ind\351termin\351 (Canada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hsxlgnE_NAILATI_naxlatx\\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "hsxlgnE_NAILATI_naxlatx\\nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test32910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32911");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fran\347ais(france)(CHINESE(CHINA)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test32912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", '#');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("2E             GITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2E             GITALIANITALIANITALIANITAL" + "'", str1, "2E             GITALIANITALIANITALIANITAL");
    }

    @Test
    public void test32914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "z..alhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ailati00000000000000000000000000000000000000000nailati( ne,nhsilg", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ailati00000000000000000000000000000000000000000nailati( ne,nhsilg" + "'", str2, "ailati00000000000000000000000000000000000000000nailati( ne,nhsilg");
    }

    @Test
    public void test32917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32917");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.setExtension('I', "");
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale10.getScript();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale10.getDisplayScript(locale18);
        java.util.Locale.Builder builder20 = builder9.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder21.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "allemand" + "'", str15, "allemand");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test32918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                   4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                    ", 'S');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                    " + "'", str2, "                                                                                   4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                    ");
    }

    @Test
    public void test32919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32919");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.lang.String str11 = locale9.getDisplayName();
        java.lang.String str13 = locale9.getExtension('i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale9);
        java.lang.String str15 = locale9.getDisplayLanguage();
        boolean boolean16 = locale9.hasExtensions();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale17.getDisplayScript(locale20);
        java.lang.String str24 = locale9.getDisplayLanguage(locale20);
        java.util.Locale locale28 = new java.util.Locale("                                             hcsfr-CueD                                             ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "CCCCCCIAN\\U0020ICCCCCCC");
        java.lang.String str29 = locale20.getDisplayVariant(locale28);
        java.lang.String str30 = locale20.getDisplayScript();
        java.util.Locale locale34 = new java.util.Locale("HHHHHHHHHH", "");
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.upperCase("Deutsch (Deutschland)", locale34);
        java.lang.String str36 = locale20.getDisplayScript(locale34);
        java.util.Locale locale39 = new java.util.Locale("Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", "8300u\\");
        java.lang.String str40 = locale20.getDisplayLanguage(locale39);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str11, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITALIAN                                                                 " + "'", str14, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!       " + "'", str15, "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!       " + "'", str24, "hi!       ");
        org.junit.Assert.assertEquals(locale28.toString(), "                                             hcsfr-cued                                             _CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCENGLISCHCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC_CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals(locale34.toString(), "hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DEUTSCH (DEUTSCHLAND)" + "'", str35, "DEUTSCH (DEUTSCHLAND)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale39.toString(), "azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh_8300U\\");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "English" + "'", str40, "English");
    }

    @Test
    public void test32920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("fr-c                 ", "Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32921");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...\r\r\r\r\r\r\r\r...", "...........................................................................................................................................................................................................................................................................................................................................................................eselgn", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ITALIAE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAE" + "'", str1, "ITALIAE");
    }

    @Test
    public void test32923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32923");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "GBR");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "zhazhzhzhzhzhzhzhzhzhzh");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str5, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test32924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##########", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                         \\u005", 537, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         \\u005\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\" + "'", str3, "                                                         \\u005\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\");
    }

    @Test
    public void test32926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                               e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e" + "'", str1, "e");
    }

    @Test
    public void test32927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32927");
        char[] charArray9 = new char[] { 'f', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frankreich", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "z...Frn", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test32928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\U0046", "hhhhhhhhhh (                                                                                     G             )");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32929");
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
        java.util.Locale.Category category16 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str21 = locale19.getExtension('h');
        java.lang.String str22 = locale18.getDisplayScript(locale19);
        java.lang.String str23 = locale18.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale24);
        java.lang.String str26 = locale18.getDisplayName(locale24);
        java.lang.String str27 = locale18.getScript();
        java.util.Locale.setDefault(category16, locale18);
        java.lang.String str29 = locale1.getDisplayCountry(locale18);
        java.util.Locale.Builder builder30 = new java.util.Locale.Builder();
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str34 = locale31.getDisplayLanguage(locale33);
        java.lang.String str35 = locale18.getDisplayVariant(locale31);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.upperCase("                                                       hi!                                                              ", locale18);
        java.lang.String str37 = locale18.getDisplayScript();
        java.util.Set<java.lang.String> strSet38 = locale18.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category16.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FRA" + "'", str23, "FRA");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str26, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                       HI!                                                              " + "'", str36, "                                                       HI!                                                              ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test32930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!nglish (United Kingdom)!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FRAAAAAAAAAAAAAAAA", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32931");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u00de\\u00\\u\\u00de\\u00\\u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc", (java.lang.CharSequence) "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...HBI...", 103, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HBI..." + "'", str3, "...HBI...");
    }

    @Test
    public void test32934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32934");
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
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = locale4.toString();
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "de" + "'", str11, "de");
    }

    @Test
    public void test32935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("E gl", "neilRtI    E", (int) 'l');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#########################################################################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla" + "'", str1, "#########################################################################################)ylatI( nailatIzzzc)ylatI( nailatIzzzne)ylatI( nailatIzzzla");
    }

    @Test
    public void test32937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444                                             hcstued", "Hi!        (\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444                                             hcstued" + "'", str2, "44444444444444444444444444444444                                             hcstued");
    }

    @Test
    public void test32938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32938");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5\u6cd5");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                          \\u0046", (java.lang.CharSequence) "                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test32940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32940");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005", "FRANZ\326SISCH2(FRANKREICH)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32941");
        java.util.Locale locale2 = new java.util.Locale("tedesco    ", "hi!       _\\U0020_Italienisch#########################################################################################");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "tedesco    _HI!       _\\U0020_ITALIENISCH#########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!       _\\U0020_ITALIENISCH#########################################################################################" + "'", str3, "HI!       _\\U0020_ITALIENISCH#########################################################################################");
    }

    @Test
    public void test32942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hcsfr-CueD                                         ...", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hcsfr-CueD                                         ..." + "'", str2, "  hcsfr-CueD                                         ...");
    }

    @Test
    public void test32943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("FRANZ\366SISCH", "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\366SISCH" + "'", str2, "FRANZ\366SISCH");
    }

    @Test
    public void test32945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("itTAiT_ITA", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITAitTAiT_ITAitTAiT_ITAitTAiT_ITA" + "'", str2, "itTAiT_ITAitTAiT_ITAitTAiT_ITAitTAiT_ITA");
    }

    @Test
    public void test32946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32946");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale locale5 = new java.util.Locale("TA...");
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str7 = locale5.getDisplayScript();
        java.lang.String str8 = locale5.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ta...");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals(locale5.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test32947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                            hcsineilat                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcsineilat" + "'", str1, "hcsineilat");
    }

    @Test
    public void test32948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32948");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0045", (java.lang.CharSequence) "hsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnEhsilgnE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 392 + "'", int2 == 392);
    }

    @Test
    public void test32949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32949");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale.Builder builder7 = builder4.setLocale(locale6);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder10 = builder4.setLocale(locale9);
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getExtension('h');
        java.lang.String str17 = locale12.getDisplayCountry(locale14);
        java.lang.String str18 = locale14.toLanguageTag();
        java.lang.String str19 = locale14.getDisplayLanguage();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale22.getDisplayName();
        java.util.Locale.Builder builder24 = builder21.setLocale(locale22);
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder26 = builder21.setLocale(locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale25.getVariant();
        java.util.Locale locale29 = locale25.stripExtensions();
        java.util.Locale locale30 = locale25.stripExtensions();
        java.lang.String str31 = locale14.getDisplayLanguage(locale30);
        java.util.Set<java.lang.Character> charSet32 = locale30.getExtensionKeys();
        java.lang.String str33 = locale9.getDisplayName(locale30);
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = locale34.getScript();
        java.lang.String str36 = locale34.getDisplayCountry();
        boolean boolean37 = locale34.hasExtensions();
        java.util.Locale.setDefault(locale34);
        boolean boolean39 = locale34.hasExtensions();
        java.lang.String str40 = locale34.getISO3Country();
        java.lang.String str41 = locale9.getDisplayScript(locale34);
        java.lang.String str42 = locale9.getLanguage();
        java.lang.String str43 = locale1.getDisplayLanguage(locale9);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str13, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str19, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str23, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italienisch" + "'", str31, "Italienisch");
        org.junit.Assert.assertNotNull(charSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u610f\u5927\u5229" + "'", str36, "\u610f\u5927\u5229");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ITA" + "'", str40, "ITA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\u0078" + "'", str43, "\\u0078");
    }

    @Test
    public void test32950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\AuA0046");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\AuA0046" + "'", str1, "\\AuA0046");
    }

    @Test
    public void test32951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32951");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale2.getISO3Country();
        java.lang.String str4 = locale2.getDisplayVariant();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String str6 = locale2.getDisplayName();
        java.util.Set<java.lang.String> strSet7 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str10 = locale9.getDisplayScript();
        java.lang.String str11 = locale2.getDisplayVariant(locale9);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale14.getDisplayName();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder18 = builder13.setLocale(locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale17.getVariant();
        java.util.Locale locale21 = locale17.stripExtensions();
        java.util.Locale locale22 = locale17.stripExtensions();
        java.lang.String str23 = locale9.getDisplayName(locale17);
        java.lang.String str25 = locale17.getExtension('h');
        java.util.Set<java.lang.String> strSet26 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str27 = locale1.getDisplayCountry(locale17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "francese (Canada)" + "'", str15, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test32952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32952");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('J');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J" + "'", str1, "J");
    }

    @Test
    public void test32953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32953");
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
        java.lang.String str14 = locale2.getCountry();
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale16.getDisplayLanguage(locale21);
        java.util.Locale.setDefault(locale21);
        java.lang.String str25 = locale2.getDisplayLanguage(locale21);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.lang.String str27 = locale26.getDisplayName();
        java.lang.String str29 = locale26.getExtension('C');
        java.lang.String str30 = locale26.getVariant();
        java.lang.String str31 = locale21.getDisplayScript(locale26);
        java.lang.String str32 = locale21.getDisplayScript();
        java.util.Locale locale37 = new java.util.Locale("hi!", "English", "");
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("hhhhhhhhhh", locale37);
        boolean boolean39 = locale21.equals((java.lang.Object) "hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italien" + "'", str20, "italien");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "inglese" + "'", str23, "inglese");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "francese" + "'", str25, "francese");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "francese" + "'", str27, "francese");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale37.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HHHHHHHHHH" + "'", str38, "HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test32954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32954");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Franz\366sisch (Kanada)", "it-IT", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32955");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("allemand", "\\u0020iTALIANiTALIANiTALIANiTAL", 3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("fr");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("nailati", strArray4, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "nailati" + "'", str7, "nailati");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
    }

    @Test
    public void test32956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32956");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = new char[] { '#', '4', ' ' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(charSequence4, charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("ita", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "emand", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("Cinese (cina)\\u0069h...", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "n44444444444444alia44444444444444it                                                      ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32957");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("FR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR\\U000DFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR", "ccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32958");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("NAILATI                     ", (int) 'k');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", 'z');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("u", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32960");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhhhhhhhhhhhhhhgencehhhhhhhhhhhhhhh", "CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj22222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32962");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        boolean boolean14 = locale13.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test32963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32963");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D", 'H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test32964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32964");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", "\\U0020");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("CAN", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "franz\366sisch (frankreich)");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0038ZHO", strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!        (\\U0020,Italienisch#########################################################################################", strArray6, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str5, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################" + "'", str16, "hi!        (\\U0020,Italienisch#########################################################################################");
    }

    @Test
    public void test32965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32965");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = locale6.getDisplayName();
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.String str11 = locale6.getDisplayLanguage();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayName(locale13);
        java.util.Locale.Builder builder16 = builder1.setLocale(locale6);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.getLanguage();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale18);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str25 = locale23.getExtension('h');
        java.lang.String str26 = locale22.getDisplayScript(locale23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale22);
        java.lang.String str28 = locale18.getDisplayVariant(locale22);
        java.lang.String str29 = locale18.getDisplayLanguage();
        java.lang.String str30 = locale18.getDisplayLanguage();
        java.util.Locale.Builder builder31 = builder1.setLocale(locale18);
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder34 = builder32.setVariant("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: CCCCCCCCCCCCCCCCCCCCCCCCCCfrzo?cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                     [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italiano" + "'", str9, "italiano");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italiano" + "'", str11, "italiano");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ko" + "'", str19, "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "TALIAN\\U0023" + "'", str20, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!       " + "'", str27, "hi!       ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "coreano" + "'", str29, "coreano");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "coreano" + "'", str30, "coreano");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test32966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32966");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h_CN5iTALIAN5en5Italienischzhi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5", "dddddddddddddddddddddddKoreaniscdddddddddddddddddddddddd", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32967");
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale9);
        java.lang.String str11 = locale3.getDisplayName(locale9);
        java.lang.String str12 = locale3.getScript();
        java.util.Locale.setDefault(category1, locale3);
        java.util.Locale locale14 = java.util.Locale.getDefault(category1);
        java.lang.String str15 = locale14.getDisplayScript();
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         a005c         ", locale14);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FRA" + "'", str8, "FRA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str11, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                         A005C         " + "'", str16, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                         A005C         ");
    }

    @Test
    public void test32968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32968");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale8 = new java.util.Locale("44444444444444444444444444444444!IH", "HHHHHHHHHH", "8ian\\u0020i86");
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale9.getDisplayCountry(locale11);
        java.lang.String str15 = locale11.toLanguageTag();
        java.lang.String str16 = locale8.getDisplayCountry(locale11);
        java.util.Locale locale17 = java.util.Locale.GERMANY;
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = locale17.getISO3Language();
        java.lang.String str20 = locale11.getDisplayScript(locale17);
        java.lang.String str21 = locale1.getDisplayScript(locale11);
        java.lang.String str22 = locale1.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italien" + "'", str2, "italien");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals(locale8.toString(), "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italiano" + "'", str10, "italiano");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHHHHHH" + "'", str16, "HHHHHHHHHH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "deu" + "'", str19, "deu");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test32969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32969");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder7.clear();
        java.util.Locale locale13 = builder7.build();
        java.util.Locale.Builder builder14 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinese (Cina)" + "'", str5, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test32970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32970");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "Japonais");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32971");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.lang.String str7 = locale4.getVariant();
        java.util.Locale locale8 = locale4.stripExtensions();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Builder builder13 = builder10.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder13.clear();
        java.util.Locale locale15 = builder14.build();
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = locale8.getDisplayCountry(locale15);
        java.lang.String str18 = locale15.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "francese (Canada)" + "'", str12, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test32972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("japonais", "HCSTUED");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Taiwan", "Frnz\366sisch(Knd", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32974");
        java.util.Locale locale1 = new java.util.Locale("en");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        java.lang.String str9 = locale1.getISO3Country();
        java.lang.String str10 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italiano" + "'", str5, "italiano");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "inglese" + "'", str10, "inglese");
    }

    @Test
    public void test32975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "zhzhzhzhzhzhzhzhzhzhfraazhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test32976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 107, 374);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32977");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...AT4AS4AR4AQ4AO4A...N4", "Engliscu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#AAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#AAAAA" + "'", str1, "#AAAAA");
    }

    @Test
    public void test32979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32979");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                               ))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test32980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\u6cd5\u6587\u52a0\u62ff\u5927)", "...\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r....\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r.....\r\r\r\r\r\r\r\r..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "fran\347ais (France)fr-CA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32982");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", (java.lang.CharSequence) "0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test32983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "\u4e2d\u6587\u4e2d\u56fd)", "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
    }

    @Test
    public void test32984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32984");
        java.util.Locale locale1 = new java.util.Locale("2E             giTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals(locale1.toString(), "2e             gitalianitalianitalianital");
    }

    @Test
    public void test32985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32985");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0042", 'j');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32986");
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
        java.lang.String str43 = locale9.getDisplayName();
        java.lang.String str44 = locale9.getScript();
        java.lang.String str45 = locale9.toLanguageTag();
        java.lang.String str46 = locale9.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italiano" + "'", str8, "italiano");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "francese" + "'", str33, "francese");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "italiano" + "'", str43, "italiano");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "it" + "'", str45, "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "it" + "'", str46, "it");
    }

    @Test
    public void test32987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "HARZHASZHAZHZHZHZHZHZHZHZHZHZ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str2, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
    }

    @Test
    public void test32988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32988");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "coreano (Corea del Sud)", 12);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "FRANCESE (CANADA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" + "'", str2, "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTU005CTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

    @Test
    public void test32990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32990");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Korean (South Korea)", "italien (Italie)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "nauruan");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32992");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap8);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange13 = new java.util.Locale.LanguageRange("E");
        java.lang.String str14 = languageRange13.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] { languageRange11, languageRange13 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale18.getLanguage();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleKeys();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet22, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet22, filteringMode25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet22, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...");
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap30);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "e" + "'", str14, "e");
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italiano" + "'", str19, "italiano");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "it" + "'", str21, "it");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
    }

    @Test
    public void test32993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32993");
        java.util.Locale locale3 = new java.util.Locale("                                               8300u\\                                                ", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", "\u610f\u5927\u5229");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "                                               8300u\\\u610f\u5927\u5229");
    }

    @Test
    public void test32994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     " + "'", str2, "\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     ");
    }

    @Test
    public void test32995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32995");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...AT4AS4AR4AQ4AO4A...N4", (int) '#', "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EEEEE...AT4AS4AR4AQ4AO4A...N4EEEEEE" + "'", str3, "EEEEE...AT4AS4AR4AQ4AO4A...N4EEEEEE");
    }

    @Test
    public void test32996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("rnz\366sisch(Knd", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rnz\366sisch(Knd                                                                                          " + "'", str2, "rnz\366sisch(Knd                                                                                          ");
    }

    @Test
    public void test32997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32997");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", "hi! _\\0020_Italienisch####################################################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\ud55c\uad6d\uc5b4", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("nglish ...nglish ...nglish ...nglichinoisf(Chine)", "9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test32999");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr", "FRANCESE (CANADA)", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test33000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest65.test33000");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "8300u\\", (java.lang.CharSequence) "\uc774\ud0c8\ub9ac\uc544\uc5b4                  ");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }
}
