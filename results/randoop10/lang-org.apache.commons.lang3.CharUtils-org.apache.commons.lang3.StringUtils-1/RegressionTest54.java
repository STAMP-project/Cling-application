import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest54 {

    public static boolean debug = false;

    @Test
    public void test27001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AzhzhzhzhzhzhzhzhzhzhE             g                          ", 79, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hzhzhzhzhE             g                          " + "'", str3, "...hzhzhzhzhE             g                          ");
    }

    @Test
    public void test27002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA", "\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b\\u006b", "AN\\U00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u00...", "dnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlladnamAlla");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u00..." + "'", str2, "...engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng_                                                                    \\u00...");
    }

    @Test
    public void test27004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27004");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test27005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hg44444444444444444444444444444444!IH44444444444444444444444444444444!IH", "N", (int) 'J');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27006");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("SH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test27007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27007");
        java.util.Locale locale3 = new java.util.Locale("cinese (cina)\\u0069h..", "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC", "\\u0075");
        org.junit.Assert.assertEquals(locale3.toString(), "cinese (cina)\\u0069h.._KOREANADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC_\\u0075");
    }

    @Test
    public void test27008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27008");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ita", "\\\\\\\\\\\\\\HI!HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'f', (int) 'T', 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "         italian_italian_english");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Italienisch#########################################################################################", 3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ECANADAgCANADACANADAsh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ITALIENISC", "Italian__#e-deutsch", 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIENISC" + "'", str3, "ITALIENISC");
    }

    @Test
    public void test27012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27012");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str6 = locale0.getScript();
        java.lang.String str7 = locale0.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.util.Locale locale16 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str17 = locale8.getDisplayCountry(locale16);
        java.util.Locale.setDefault(locale8);
        java.util.Locale locale19 = locale8.stripExtensions();
        java.lang.String str20 = locale8.getDisplayName();
        java.util.Set<java.lang.String> strSet21 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale0.getDisplayLanguage(locale8);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.util.Locale locale25 = java.util.Locale.GERMAN;
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.util.Locale.setDefault(category23, locale26);
        java.lang.String str29 = locale0.getDisplayCountry(locale26);
        java.lang.String str30 = locale26.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale16.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "France" + "'", str17, "France");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fran\347ais (France)" + "'", str20, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fran\347ais" + "'", str22, "fran\347ais");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "allemand" + "'", str27, "allemand");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test27013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27013");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getISO3Country();
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, 'I');
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27014");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale3.getDisplayCountry(locale5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("\ud504\ub791\uc2a4\uc5b4", locale3);
        java.lang.String str9 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet10 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str8, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test27015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27015");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'c');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character c is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     Englisch", (int) '2', '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     Englisch" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     Englisch");
    }

    @Test
    public void test27017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444ALLEMAND 4444", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444ALLEMAND 4444" + "'", str2, "4444ALLEMAND 4444");
    }

    @Test
    public void test27019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27019");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale6 = new java.util.Locale("en");
        boolean boolean7 = locale6.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = locale9.stripExtensions();
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = locale6.getDisplayLanguage(locale11);
        java.lang.String str14 = locale2.getDisplayVariant(locale6);
        java.lang.String str15 = locale6.toLanguageTag();
        java.util.Locale locale17 = new java.util.Locale("italy");
        java.lang.String str18 = locale17.getISO3Country();
        java.util.Locale locale21 = new java.util.Locale("", "");
        java.lang.String str22 = locale21.getVariant();
        java.lang.String str23 = locale21.getDisplayCountry();
        java.lang.String str24 = locale17.getDisplayLanguage(locale21);
        java.lang.String str25 = locale6.getDisplayScript(locale17);
        java.lang.String str26 = locale17.toLanguageTag();
        java.util.Locale.setDefault(locale17);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "inglese" + "'", str13, "inglese");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertEquals(locale17.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italy" + "'", str24, "italy");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italy" + "'", str26, "italy");
    }

    @Test
    public void test27020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27020");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'S', 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test27021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hcsFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalyneFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitalylaFrz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ttttttttttttttttttttttttttttttttttttttttttttttttttttttttuuuutttttttttttttttttttttttttttttttttttttttttttttttttttttttt", "a700u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ttttttttttttttttttttttttttttttttttttttttttttttttttttttttuuuutttttttttttttttttttttttttttttttttttttttttttttttttttttttt" + "'", str2, "ttttttttttttttttttttttttttttttttttttttttttttttttttttttttuuuutttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
    }

    @Test
    public void test27023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27023");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', (int) 'S');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test27024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27024");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('\n');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
    }

    @Test
    public void test27025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("                                      ITALIAN (italian,eNGLISH)                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                       ITALIAN (italian,eNGLISH)                                       [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test27026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504", "hi!       _\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504" + "'", str2, "FRZ\326\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504\ud504");
    }

    @Test
    public void test27027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27027");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Korean (South Korea)", "Chinesisch", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27028");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                        e                               ", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 57);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", '\r');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("HI!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("iTALIAN", (java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HHHHHHHHHH", strArray9, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("Und-iTALIAN", strArray4, strArray9);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'B', 100, (int) (byte) 100);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str11, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHHHHHHHH" + "'", str16, "HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Und-iTALIAN" + "'", str17, "Und-iTALIAN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test27029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27029");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HIAN\\U0020Ih");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIAN\\U0020Ih" + "'", str2, "HIAN\\U0020Ih");
    }

    @Test
    public void test27030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d\\u000d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D" + "'", str1, "\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D");
    }

    @Test
    public void test27031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27031");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("EcanadaGcanadacanadaSH                                                                                                  ", "s\366znrF");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27032");
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
        java.util.Locale locale17 = builder1.build();
        java.util.Locale.Builder builder18 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguage("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test27033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'N', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27034");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale1.getDisplayScript();
        java.lang.String str8 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French" + "'", str8, "French");
    }

    @Test
    public void test27035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27035");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("United Kingdom");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("(C)ALANALANALANAL", "ITALIEN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27037");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("              TA...", 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              TA..." + "'", str2, "              TA...");
    }

    @Test
    public void test27039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27039");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "tTAT_ITA", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "            ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test27040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("KOREAN (SOUTH KOREA)KORE     ", "ITALIAN                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27041");
        java.util.Locale locale2 = new java.util.Locale("U", "\\u0020GermanTALIANGermanTALIANGermanTALIANiTALI");
        org.junit.Assert.assertEquals(locale2.toString(), "u_\\U0020GERMANTALIANGERMANTALIANGERMANTALIANITALI");
    }

    @Test
    public void test27042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                ian\\u00208ian\\u0020i868ian\\u00", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            ..." + "'", str2, "                                            ...");
    }

    @Test
    public void test27043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27043");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("English (Canada)", "itTAiT_ITALIAN_EgAishi!_\\u0020_iTLE###########", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 7, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA" + "'", str3, "AAAAAAA");
    }

    @Test
    public void test27045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0020hi!       _\\U0020_Italienisch################", (java.lang.CharSequence) "8600u\\                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27046");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'R');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                              deutsch (\\)", "Frnz\366sischt(Knd)", (int) 'R');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IjAPANESE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Katalanisch", (int) 't', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Katalanisch\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "Katalanisch\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test27052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27052");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                      ITALIAN (italian,eNGLISH)                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                      italian (italian,english)                                      ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("ko", '\\');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ko" + "'", str7, "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str8, "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test27054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                          French", 'N', 'N');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          French" + "'", str3, "                          French");
    }

    @Test
    public void test27055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\italian_ITALIAN_English", 374);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\italian_ITALIAN_English" + "'", str2, "\\italian_ITALIAN_English");
    }

    @Test
    public void test27056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27056");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "E             g                                                                                     ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray5, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "italian (ITALIAN,English)");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("Englisch (Vereinigtes K\366nigreich)", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "hcstueD", (int) 'H', 872);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str10, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str12, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str15, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27057");
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
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList44, '\\');
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList16, (java.util.Collection<java.lang.String>) strList44);
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
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test27058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27058");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("TALIAN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguageTag("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ [at index 0]");
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
    public void test27059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27059");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                           ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", 'h');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                              \\     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de", "Hgerman (germany)!       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27062");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("        \\u005c         ", "                                                                                                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27064");
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
        java.util.Locale locale22 = new java.util.Locale("                                                                                               en", "\\U0020ITALIANITALIANITALIANITALI");
        java.util.Locale.setDefault(category0, locale22);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale24.getCountry();
        java.lang.String str26 = locale24.toLanguageTag();
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale28 = java.util.Locale.getDefault(category0);
        java.util.Locale locale29 = java.util.Locale.getDefault(category0);
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
        org.junit.Assert.assertEquals(locale22.toString(), "                                                                                               en_\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CA" + "'", str25, "CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr-CA" + "'", str26, "fr-CA");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
    }

    @Test
    public void test27065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27065");
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
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("ZZZITALIAN (ITALY)", locale1);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ZZZITALIAN (ITALY)" + "'", str15, "ZZZITALIAN (ITALY)");
    }

    @Test
    public void test27066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ixii", "C");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ete");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Eg");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27070");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale1);
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getISO3Country();
        java.util.Locale.setDefault(locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.lang.String str8 = locale1.getScript();
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CANADA" + "'", str3, "CANADA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cor\351en (Cor\351e du Sud)" + "'", str4, "cor\351en (Cor\351e du Sud)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KOR" + "'", str5, "KOR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str7, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test27071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                ian\\u00208ian\\u0020i868ian\\u00", "italieitalNC_hzitalieital", 67);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27072");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setScript("                                                        it                         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                         it                          [at index 0]");
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
    }

    @Test
    public void test27073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "und-itTAiT-ITALIAN-EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und-itTAiT-ITALIAN-EgAish" + "'", str1, "und-itTAiT-ITALIAN-EgAish");
    }

    @Test
    public void test27074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27074");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'e' + "'", char1 == 'e');
    }

    @Test
    public void test27075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27075");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))", (java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4,A)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", charSequence2, "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test27076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("inglese", '\n', 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inglese" + "'", str3, "inglese");
    }

    @Test
    public void test27077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "             DE_DE            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27078");
        java.util.Locale locale1 = new java.util.Locale("\\u0066");
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = locale1.toLanguageTag();
        java.lang.String str4 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0066");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0066" + "'", str4, "\\u0066");
    }

    @Test
    public void test27079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86", "         italian_italian_englIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86" + "'", str2, "44444444444444444444444444444444!ih_HHHHHHHHHH_8ian\\u0020i86");
    }

    @Test
    public void test27080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27080");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale6.getDisplayCountry(locale8);
        java.lang.String str11 = locale6.getVariant();
        java.lang.String str12 = locale0.getDisplayScript(locale6);
        java.util.Locale locale13 = locale6.stripExtensions();
        java.util.Locale locale17 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale18 = locale17.stripExtensions();
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale18.toLanguageTag();
        java.util.Locale locale22 = new java.util.Locale("en");
        boolean boolean23 = locale22.hasExtensions();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleKeys();
        java.lang.String str25 = locale18.getDisplayName(locale22);
        java.util.Locale locale29 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale30 = locale29.stripExtensions();
        java.lang.String str31 = locale22.getDisplayName(locale30);
        java.lang.String str32 = locale22.getCountry();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale37 = java.util.Locale.getDefault(category36);
        java.lang.String str38 = locale34.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale39.getDisplayName(locale40);
        java.util.Locale locale42 = java.util.Locale.UK;
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = locale43.getDisplayName(locale44);
        java.util.Locale locale46 = locale43.stripExtensions();
        java.lang.String str47 = locale42.getDisplayVariant(locale43);
        java.lang.String str48 = locale40.getDisplayLanguage(locale43);
        java.lang.String str49 = locale37.getDisplayName(locale40);
        java.lang.String str50 = locale22.getDisplayVariant(locale40);
        java.lang.String str51 = locale13.getDisplayCountry(locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str2, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "und" + "'", str20, "und");
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str25, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "allemand" + "'", str35, "allemand");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "de");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "allemand" + "'", str41, "allemand");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "allemand" + "'", str45, "allemand");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Franz\366sisch" + "'", str48, "Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "deutsch" + "'", str49, "deutsch");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test27081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("SH", "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SH" + "'", str2, "SH");
    }

    @Test
    public void test27082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("nglish(UnitedKingdom)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27083");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("allemand", "\\u0020iTALIANiTALIANiTALIANiTAL", 3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("fr");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("nailati", strArray5, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("443200u\\44", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nailati" + "'", str8, "nailati");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fr" + "'", str9, "fr");
    }

    @Test
    public void test27084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27084");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "talian_ITALIAN_English", (java.lang.CharSequence) "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "talian_ITALIAN_English" + "'", charSequence2, "talian_ITALIAN_English");
    }

    @Test
    public void test27085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Kanada");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kANADA" + "'", str1, "kANADA");
    }

    @Test
    public void test27086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale.Builder builder13 = builder11.setLanguage("Engliscu");
        java.util.Locale locale14 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder11.setExtension('U', "\\u0037");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\u0037 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "engliscu");
    }

    @Test
    public void test27087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Korean (South Korea)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27088");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", "ECANADAGCANADACANADASH                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test27089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", 'G');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i" + "'", str2, "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
    }

    @Test
    public void test27090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Koreanisc", (int) '8', 'd');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dddddddddddddddddddddddKoreaniscdddddddddddddddddddddddd" + "'", str3, "dddddddddddddddddddddddKoreaniscdddddddddddddddddddddddd");
    }

    @Test
    public void test27091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("f(KOREAN)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f(KOREAN)" + "'", str2, "f(KOREAN)");
    }

    @Test
    public void test27092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...It...", (int) 'b', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...It...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "...It...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27093");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('9', 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test27094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27094");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("              nglish ...              ", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27095");
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
        java.util.Set<java.lang.String> strSet17 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale14.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet19 = locale14.getUnicodeLocaleKeys();
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
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italian" + "'", str18, "italian");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test27096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ian\\u0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ian\\u0020" + "'", str1, "ian\\u0020");
    }

    @Test
    public void test27098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27098");
        java.util.Locale locale2 = new java.util.Locale("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void test27099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27099");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'i');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\n', (int) '\\', 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("NNNNNNNNNNNNNNNNNN                                                                                 ", "UD", "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", (int) '\\');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NNNNNNNNNNNNNNNNNN                                                                                 " + "'", str4, "NNNNNNNNNNNNNNNNNN                                                                                 ");
    }

    @Test
    public void test27101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", "HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkED" + "'", str2, "EDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkED");
    }

    @Test
    public void test27102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u6cd5\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test27104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27104");
        char[] charArray9 = new char[] { 'i', '4', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ita", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020iItalian\\u0020i                                                 ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...It...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "i4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "i4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[i, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test27105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "italian (italian,english");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh" + "'", str2, "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test27106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27106");
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
        java.util.Locale.Builder builder12 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.setUnicodeLocaleKeyword("           \\            ", "\r\r...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:            \\             [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test27107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27107");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("titititititit", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27108");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("    \\     ", "...IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Frz\366cz(frkrec)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27110");
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
        java.util.Locale.setDefault(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale9.getUnicodeLocaleType("                                        #u##2#iTALIANiTALIANiTALIANiT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:                                         #u##2#iTALIANiTALIANiTALIANiT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
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
    }

    @Test
    public void test27111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("8600u\\U\\u0", "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" rnz\366sisch(nd)", "fr_CA                             ...HI!fr_CA                             ...!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " rnz\366sisch(nd)" + "'", str2, " rnz\366sisch(nd)");
    }

    @Test
    public void test27113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("United Kingdo", 'b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "United Kingdo" + "'", str2, "United Kingdo");
    }

    @Test
    public void test27114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27114");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.lang.String str13 = locale8.getISO3Country();
        java.lang.String str14 = locale6.getDisplayVariant(locale8);
        java.lang.String str15 = locale0.getDisplayScript(locale6);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str18 = locale17.getCountry();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale locale20 = builder19.build();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str23 = locale20.getDisplayLanguage(locale22);
        java.lang.String str24 = locale17.getDisplayLanguage(locale20);
        java.lang.String str25 = locale17.getDisplayVariant();
        java.lang.String str26 = locale17.getISO3Country();
        java.lang.String str27 = locale0.getDisplayCountry(locale17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italienisch" + "'", str1, "Italienisch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test27115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27115");
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
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clearExtensions();
        java.util.Locale locale13 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setVariant("A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: A [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test27116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27117");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("", locale2);
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27118");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("TALIAN", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", 'G');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str2, "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test27120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27120");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('\n');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000a" + "'", str1, "\\u000a");
    }

    @Test
    public void test27121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27121");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("en-GB", (int) 'H');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                        e                               ", "!ih_HHHHHHHHHHDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        e                               " + "'", str2, "                                                                                        e                               ");
    }

    @Test
    public void test27123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27123");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("italian_italian_englishitalian_!ihittait_italian_egaishegshegshegshegshegshegshegsheg", "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", 5, (int) '.');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg" + "'", str4, "italiC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)an_egaishegshegshegshegshegshegshegsheg");
    }

    @Test
    public void test27124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27124");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", 'f');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27125");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                       hi!                                                              ", "GENCE", 267, (int) '!');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                 GENCE" + "'", str4, "                                 GENCE");
    }

    @Test
    public void test27126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27126");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0075", "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("2iT hi!       _\\U0020_Italienisch####################################################################            2i", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2iT hi!       _\\U0020_Italienisch####################################################################            2i" + "'", str2, "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
    }

    @Test
    public void test27128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27128");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("8ian");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27129");
        java.util.Locale locale1 = new java.util.Locale("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale3);
        java.lang.String str5 = locale3.getDisplayVariant();
        java.util.Locale locale9 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale3.getDisplayName(locale9);
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        org.junit.Assert.assertEquals(locale1.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "deutsch" + "'", str11, "deutsch");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str12, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test27130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27130");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet5, "!_\\U0020_Itle#########################################################################################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet5, 'F');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test27131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27131");
        java.util.Locale locale2 = new java.util.Locale("                                             hcstueD                                             ", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = locale2.getScript();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             hcstued                                             " + "'", str3, "                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
    }

    @Test
    public void test27133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " ZHAZHZHZHZHZHZHZHZHZHZH ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("HI!");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("franz\366sisch (frankreich)", strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("italiaE    ", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("ne\351roc", strArray3, strArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny(")NAILATi,HCSINEILATI( 3200u\\", strArray3);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ne\351roc" + "'", str11, "ne\351roc");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test27135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27135");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.util.Locale.setDefault(locale1);
        java.lang.String str12 = locale1.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayVariant();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayVariant(locale16);
        java.lang.String str19 = locale13.getDisplayScript(locale16);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.lang.String str27 = locale25.getExtension('h');
        java.lang.String str28 = locale24.getDisplayScript(locale25);
        java.lang.String str29 = locale24.getISO3Country();
        java.lang.String str30 = locale22.getDisplayVariant(locale24);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale22);
        java.lang.String str32 = locale16.getDisplayCountry(locale22);
        java.util.Locale.setDefault(locale16);
        java.lang.String str34 = locale1.getDisplayVariant(locale16);
        java.util.Set<java.lang.String> strSet35 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.lowerCase("!_\\U0020_ITLE#########################################################################################", locale1);
        java.lang.String str37 = locale1.getLanguage();
        java.util.Locale.Builder builder38 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder38.clearExtensions();
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale40.getDisplayName();
        java.util.Locale.Builder builder42 = builder39.setLocale(locale40);
        java.util.Locale.Builder builder43 = builder42.clear();
        java.util.Locale.Builder builder45 = builder43.setLanguage("ITALIAN");
        java.util.Locale.Builder builder46 = builder43.clearExtensions();
        java.util.Locale locale47 = builder46.build();
        java.lang.String str48 = locale1.getDisplayScript(locale47);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRA" + "'", str29, "FRA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str31, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "!_\\u0020_itle#########################################################################################" + "'", str36, "!_\\u0020_itle#########################################################################################");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "fr" + "'", str37, "fr");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "French (Canada)" + "'", str41, "French (Canada)");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test27136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27136");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 'c');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27138");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale1);
        java.lang.String str3 = locale1.getVariant();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.util.Locale locale9 = locale4.stripExtensions();
        java.lang.String str10 = locale9.getISO3Country();
        boolean boolean11 = locale9.hasExtensions();
        java.lang.String str12 = locale9.getISO3Language();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale14.getExtension('h');
        java.lang.String str17 = locale13.getDisplayScript(locale14);
        java.util.Locale locale18 = locale13.stripExtensions();
        java.lang.String str19 = locale18.getISO3Country();
        boolean boolean20 = locale18.hasExtensions();
        java.lang.String str21 = locale18.getLanguage();
        java.lang.String str22 = locale9.getDisplayLanguage(locale18);
        java.lang.String str23 = locale1.getDisplayCountry(locale9);
        java.lang.String str24 = locale9.getLanguage();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
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
        java.lang.String str40 = locale29.getScript();
        java.lang.String str41 = locale26.getDisplayCountry(locale29);
        java.lang.String str42 = locale9.getDisplayLanguage(locale29);
        java.lang.String str43 = locale9.getDisplayScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch (frankreich)" + "'", str2, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FRA" + "'", str10, "FRA");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra" + "'", str12, "fra");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FRA" + "'", str19, "FRA");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr" + "'", str21, "fr");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fran\347ais" + "'", str22, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr" + "'", str24, "fr");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + category27 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category27.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
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
    public void test27139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH" + "'", str1, "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
    }

    @Test
    public void test27140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27140");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ittait_italian_egaish                                                                                ", "coreano", "de                                                                                                                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian" + "'", str2, "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
    }

    @Test
    public void test27142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("       DE_DE            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DE_DE" + "'", str1, "DE_DE");
    }

    @Test
    public void test27143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB", (int) 'T', "!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB" + "'", str3, "!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
    }

    @Test
    public void test27144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0039                             ", "ITALIENISCH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", "Frnz\366sischt(Knd)                        ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065" + "'", str3, "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test27147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test27148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27148");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale11 = new java.util.Locale("\\u0068");
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale15 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale11.getDisplayName(locale15);
        java.util.Set<java.lang.String> strSet18 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale11.toLanguageTag();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clearExtensions();
        java.util.Locale.Builder builder25 = builder22.setLanguageTag("Italian");
        java.util.Locale locale26 = java.util.Locale.PRC;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale.Builder builder28 = builder22.setLocale(locale26);
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder31 = builder29.setLocale(locale30);
        java.util.Locale locale32 = builder31.build();
        java.lang.String str34 = locale32.getExtension('n');
        java.util.Locale.setDefault(category0, locale32);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale15.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!ih" + "'", str16, "!ih");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0068" + "'", str17, "\\u0068");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "und" + "'", str19, "und");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "\\u0068");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test27149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                               TALY                                                   TALY     ", "\\AuA0046");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\AuA0046" + "'", str2, "\\AuA0046");
    }

    @Test
    public void test27150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27150");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale2.getScript();
        java.lang.String str12 = locale2.getLanguage();
        java.util.Locale locale13 = locale2.stripExtensions();
        java.lang.String str14 = locale1.getDisplayLanguage(locale2);
        java.lang.String str15 = locale1.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "und" + "'", str15, "und");
    }

    @Test
    public void test27151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("en_US", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test27152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("fr-ca", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          fr-ca" + "'", str2, "          fr-ca");
    }

    @Test
    public void test27153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27153");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "\\italian_ITALIAN_English");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '\r', 6, 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0020", '8');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", strArray4, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit", strArray4);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch" + "'", str12, "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test27154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3", "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZHZHZHZ2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3" + "'", str2, "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3");
    }

    @Test
    public void test27155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                  \\U0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8600U\\                                                                                                                  " + "'", str1, "8600U\\                                                                                                                  ");
    }

    @Test
    public void test27156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27156");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("GENCE", strMap1);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getScript();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale3.getCountry();
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale9);
        java.lang.String str12 = locale9.getCountry();
        java.lang.String str13 = locale9.getCountry();
        java.lang.String str14 = locale3.getDisplayLanguage(locale9);
        java.util.Set<java.lang.String> strSet15 = locale3.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale locale18 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale18.getDisplayCountry(locale22);
        java.lang.String str26 = locale22.getExtension('E');
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale27.toLanguageTag();
        java.lang.String str29 = locale22.getDisplayName(locale27);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0049", locale27);
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet31);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet31, "CHI069\\u0069\\u0069\\u0069\\u0069\\CHIN");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "US" + "'", str6, "US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH" + "'", str11, "!IH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale22.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ITALIAN" + "'", str23, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "China" + "'", str24, "China");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-US" + "'", str28, "en-US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "italian (ITALIAN,English)" + "'", str29, "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\u0049" + "'", str30, "\\u0049");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test27157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee8ian\\u0020i86 (ITALIAN (ITALIAN,ENGLISH))eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  nailati                                                                                                               ", 29, "IAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  nailati                                                                                                               " + "'", str3, "  nailati                                                                                                               ");
    }

    @Test
    public void test27159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "c                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBENGLISCH", "\\U0064");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga", "ttttttttttttttttttttt                                                                                                              ITALIEITALtttttttttttttttttttttt", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#####################################################################################", "00000000000000COR\311EN (cOR\311E DU sUD)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IT", (int) 'E', (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Deutsch" + "'", str10, "Deutsch");
    }

    @Test
    public void test27164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27164");
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
        java.util.Locale locale12 = builder11.build();
        java.util.Locale.Builder builder14 = builder11.setVariant("ITALIAN4");
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setExtension('a', "Franz\366sisch (Kanada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Franzo?sisch (Kanada) [at index 0]");
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test27165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("French", "#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27166");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("English", "\\u0020iTALIANiTALIANiTALIANiTAL", 3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("fr_CA                                                  ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Engl" + "'", str7, "Engl");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                              ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", "adaeafagaialamanaoaqarasatauawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcucvcwcxcyczded...", "...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27168");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.util.Locale locale15 = locale10.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getLanguage();
        java.lang.String str18 = locale10.getDisplayCountry(locale16);
        boolean boolean19 = locale10.hasExtensions();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.util.Locale.Builder builder25 = builder22.setLocale(locale23);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder27 = builder22.setLocale(locale26);
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = locale31.getDisplayName();
        java.util.Locale.Builder builder33 = builder30.setLocale(locale31);
        java.util.Locale locale34 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder35 = builder30.setLocale(locale34);
        java.util.Set<java.lang.String> strSet36 = locale34.getUnicodeLocaleAttributes();
        boolean boolean37 = locale34.hasExtensions();
        java.util.Locale.Builder builder38 = builder27.setLocale(locale34);
        java.lang.String str39 = locale34.getLanguage();
        boolean boolean40 = locale10.equals((java.lang.Object) str39);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u005c" + "'", str17, "\\u005c");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "French (Canada)" + "'", str24, "French (Canada)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French (Canada)" + "'", str32, "French (Canada)");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "de" + "'", str39, "de");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test27169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AND4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27170");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################" + "'", str2, "i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("FRZ\326CZ(FRKREC)                                                 ", 105, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...          " + "'", str3, "...          ");
    }

    @Test
    public void test27172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200U\\" + "'", str1, "200U\\");
    }

    @Test
    public void test27173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27173");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\ud504', '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\ud504' + "'", char2 == '\ud504');
    }

    @Test
    public void test27174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27174");
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale1.getDisplayScript(locale4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", locale4);
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str8, "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test27175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\ud55c\uad6d\uc5b4                                                                                                                       ", "CN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "japonais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italDE_DE", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27178");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa3200u\\NAILAT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test27179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ENGLISCH (         italian_italian_english,\\U0061)", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u0035");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ENGLISCH (         italian_italian_english,\\U0061)" + "'", str3, "ENGLISCH (         italian_italian_english,\\U0061)");
    }

    @Test
    public void test27180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27180");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'z', 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test27181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27181");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", 73, 406);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'H');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHZ" + "'", str2, "_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHZ");
    }

    @Test
    public void test27183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("e ITALIAN,ENGLISHa", "_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\U0066");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0066" + "'", str1, "\\U0066");
    }

    @Test
    public void test27185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27185");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("nailati", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList19);
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
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = locale38.getScript();
        java.util.Set<java.lang.String> strSet40 = locale38.getUnicodeLocaleAttributes();
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet40, 'A');
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet40);
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap45);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
    }

    @Test
    public void test27186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "2aiTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27187");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test27188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB" + "'", str1, "!       2italianitalianitalianitaliTALIENISCH2iADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
    }

    @Test
    public void test27189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27189");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayCountry(locale8);
        java.lang.String str11 = locale4.getVariant();
        java.util.Set<java.lang.String> strSet12 = locale4.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale8.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ITALIAN" + "'", str9, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test27190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27190");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ", "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI", 574);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN" + "'", str4, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
    }

    @Test
    public void test27191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "francese (Francia)", "hi!(\\u0020,italienisch#########################################################################################)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("u005c", "EDE_DEgDE_DEsch (VereDE_DEgDE_DEes K\366DE_DEgreDE_DEch)", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", 314);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u005c" + "'", str4, "u005c");
    }

    @Test
    public void test27193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "HI!HI     \\u005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test27194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HSXLGNE_NAILATI_NAXLATX\\", 220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    ...EnglishEn", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("430Francia  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "430Francia" + "'", str1, "430Francia");
    }

    @Test
    public void test27197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ITALIAN (italian,eNGLISH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27198");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("x-lvariant-A", "CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESE (CHINA)CHINESen_C", 395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27199");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString((java.lang.Character) 'b');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "b" + "'", str1, "b");
    }

    @Test
    public void test27200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hg44444444444444444444444444444444!IH44444444444444444444444444444444!IH", "chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(China)chinesisch(HI!       G");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27201");
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
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("ITALIAN");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayName();
        java.util.Locale.Builder builder26 = builder22.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder22.clear();
        java.util.Locale locale28 = builder22.build();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale.Builder builder32 = builder29.setLocale(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale31.getDisplayName();
        java.lang.String str36 = locale31.getExtension('f');
        java.util.Locale locale37 = locale31.stripExtensions();
        java.lang.String str38 = locale28.getDisplayLanguage(locale37);
        java.lang.String str39 = locale37.getDisplayVariant();
        java.util.Locale.Builder builder40 = builder13.setLocale(locale37);
        java.util.Locale.Builder builder42 = builder13.setLanguage("FRANC");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder44 = builder13.setScript("NC_H");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: NC_H [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais (Canada)" + "'", str17, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chinois (Chine)" + "'", str25, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "anglais (Royaume-Uni)" + "'", str34, "anglais (Royaume-Uni)");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test27202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBFR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\     CFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0045", "TALIAN_ITALIAN_ENGLISh         ITAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023                      " + "'", str2, "                     KOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKOKO\\u0023                      ");
    }

    @Test
    public void test27205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HHHHHHHHHH", "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27207");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444FRA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'F');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444FRA" + "'", str3, "4444444FRA");
    }

    @Test
    public void test27208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iT_ITALIAN_EgAish", "44444444444444ITALIAN4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27209");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str8 = locale5.getDisplayLanguage(locale7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("", locale7);
        java.lang.String str10 = locale7.getScript();
        java.util.Set<java.lang.String> strSet11 = locale7.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet12 = locale7.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap14);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap17);
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = locale19.getDisplayName();
        java.lang.String str23 = locale19.getCountry();
        java.util.Set<java.lang.String> strSet24 = locale19.getUnicodeLocaleKeys();
        java.lang.String str25 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strSet24);
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
        java.util.Collection<java.util.Locale> localeCollection41 = null;
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, localeCollection41);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Locale locale44 = java.util.Locale.lookup(languageRangeList15, (java.util.Collection<java.util.Locale>) localeList42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "italien" + "'", str22, "italien");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
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
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNull(locale44);
    }

    @Test
    public void test27210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\r", (int) 't');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27211");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("en-US", "inglesehhhhhhhhH", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("FR_fr", 7, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27213");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.lang.String str7 = locale0.getExtension('e');
        java.util.Locale locale8 = locale0.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.lang.String str11 = locale9.getLanguage();
        java.lang.String str12 = locale8.getDisplayLanguage(locale9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italien" + "'", str3, "italien");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italien" + "'", str10, "italien");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
    }

    @Test
    public void test27214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        java.util.Locale.Builder builder7 = builder3.setLanguage("fr");
        java.util.Locale.Builder builder8 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("FR_fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: FR_fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test27215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27215");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0020", "23DAL", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN_italian_eNGLISH         ITAL" + "'", str1, "TALIAN_italian_eNGLISH         ITAL");
    }

    @Test
    public void test27217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("B");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "B" + "'", str1, "B");
    }

    @Test
    public void test27218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC", (int) '\n', "NC_HZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("royaume-uni ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                          \\u0046", '!');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("\\u0029", "hcsineilati");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("esenihC", strArray6, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "esenihC" + "'", str11, "esenihC");
    }

    @Test
    public void test27220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27220");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0020IiTALIAN\\U0020I                                                 ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (int) '!');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27221");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', (int) 'Y');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test27222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27222");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Italie                         ", "ixii", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27223");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch (Kanada", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...ANiTALI", (int) ' ', 27);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                             frn\347is(frnce)(CHINESE(CHINA)");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("anglais (Royaume-Uni)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setRegion("italian    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: italian     [at index 0]");
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
    public void test27225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27225");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str13 = locale12.getScript();
        java.util.Locale.setDefault(category0, locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u005c");
        org.junit.Assert.assertEquals(locale12.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27226");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("chinoisf(Chine)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27227");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("royaume-uni ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\u671d');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "royaume-uni" + "'", str3, "royaume-uni");
    }

    @Test
    public void test27228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\uc601\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n" + "'", str1, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\n");
    }

    @Test
    public void test27230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("               FRANZ\326SISCH(FRANKREICH)               ", "                                                         u005c         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               FRANZ\326SISCH(FRANKREICH)               " + "'", str2, "               FRANZ\326SISCH(FRANKREICH)               ");
    }

    @Test
    public void test27231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("jpn", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test27232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\uc601\uc5b4                                                                                                              ", "           \\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27233");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("french (canada)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN", "ChineseEN_CA(China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
    }

    @Test
    public void test27235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                               \\u005c                                                                              ", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27236");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "anglais (Royaume-Uni)", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "eCANADAgCANADACANADAsh                                                                                                  ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CINESE (cINA)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test27237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     " + "'", str2, "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888E             g                                                                                     ");
    }

    @Test
    public void test27239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27239");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch", "...E_NAILATI...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27240");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("english                                h                                 ", "hi!       _\\U0020_Italienisch####################################################################          ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...ienischall", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Italy");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italy" + "'", str1, "Italy");
    }

    @Test
    public void test27242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27242");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################G", "                          g             E");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", "", "frnkreich");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str3, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test27244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia)", "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (Francia");
    }

    @Test
    public void test27245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str1, "hi!        (\\U0020,Italienisch#########################################################################################)");
    }

    @Test
    public void test27247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                ", (int) 'J', (int) 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27248");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 't', 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test27249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\Ueutsc\\u0020iItalian\\u008600u\\\\atalaaa_ITALIAN_Eaglaaa\\u0020iItalian\\u008600u\\U", "8ian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27250");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "            \\u0020iItalian\\u0020i                                                 ", (java.lang.CharSequence) "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESELalhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 753 + "'", int2 == 753);
    }

    @Test
    public void test27251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27251");
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
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayVariant(locale16);
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str20 = locale15.getScript();
        java.lang.String str21 = locale15.getScript();
        java.util.Locale locale22 = java.util.Locale.FRENCH;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale22.getDisplayVariant(locale23);
        java.lang.String str26 = locale22.getDisplayCountry();
        java.lang.String str27 = locale22.getScript();
        java.lang.String str28 = locale22.getScript();
        java.lang.String str29 = locale15.getDisplayCountry(locale22);
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.ITALIAN;
        java.lang.String str35 = locale33.getExtension('h');
        java.lang.String str36 = locale32.getDisplayScript(locale33);
        java.lang.String str37 = locale32.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale38);
        java.lang.String str40 = locale32.getDisplayName(locale38);
        java.lang.String str41 = locale32.getScript();
        java.util.Locale.setDefault(category30, locale32);
        java.lang.String str43 = locale15.getDisplayCountry(locale32);
        java.util.Locale.Builder builder44 = new java.util.Locale.Builder();
        java.util.Locale locale45 = builder44.build();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str48 = locale45.getDisplayLanguage(locale47);
        java.lang.String str49 = locale32.getDisplayVariant(locale45);
        java.util.Locale.setDefault(category0, locale45);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.lang.String str52 = locale51.getDisplayScript();
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale54.getExtension('h');
        java.lang.String str57 = locale53.getDisplayScript(locale54);
        boolean boolean58 = locale53.hasExtensions();
        java.lang.String str59 = locale53.getVariant();
        java.util.Set<java.lang.Character> charSet60 = locale53.getExtensionKeys();
        java.lang.String str61 = locale53.toLanguageTag();
        java.lang.String str62 = locale51.getDisplayCountry(locale53);
        java.lang.String str63 = locale53.getScript();
        java.util.Locale.setDefault(category0, locale53);
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder66 = builder65.clearExtensions();
        java.util.Locale locale67 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str68 = locale67.getDisplayName();
        java.util.Locale.Builder builder69 = builder66.setLocale(locale67);
        java.util.Locale.Builder builder70 = builder66.clear();
        java.util.Locale.Builder builder71 = builder70.clear();
        java.util.Locale.Builder builder73 = builder70.setLanguage("zh");
        java.util.Locale locale74 = builder73.build();
        java.util.Locale.setDefault(locale74);
        java.util.Locale locale76 = locale74.stripExtensions();
        java.util.Locale locale77 = locale76.stripExtensions();
        java.util.Locale.setDefault(category0, locale76);
        java.util.Locale locale80 = java.util.Locale.CHINESE;
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale80);
        java.lang.String str82 = locale80.getVariant();
        java.util.Locale.setDefault(category0, locale80);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + category30 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category30.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "fr");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "FRA" + "'", str37, "FRA");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str40, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "fr-FR" + "'", str61, "fr-FR");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "fran\347ais (Canada)" + "'", str68, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "franz\366sisch (frankreich)" + "'", str81, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test27252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27252");
        java.util.Locale locale4 = new java.util.Locale("##########", "", "CANADA");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("...ANiTALI", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "##########__CANADA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "##########__CANADA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...anitali" + "'", str6, "...anitali");
    }

    @Test
    public void test27253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27253");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FKCV CW CX CY CZ DE DJ DK 8300u\\");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test27254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27254");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getExtension('!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: !");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
    }

    @Test
    public void test27255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27256");
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
        java.util.Locale locale15 = locale2.stripExtensions();
        java.lang.String str16 = locale15.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
    }

    @Test
    public void test27257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27257");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("I");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str11 = locale8.getDisplayLanguage(locale10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("", locale10);
        java.lang.String str13 = locale10.getScript();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet15 = locale10.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList44);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList44);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList44, '\\');
        java.lang.String str50 = java.util.Locale.lookupTag(languageRangeList5, (java.util.Collection<java.lang.String>) strList44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList52, strMap53);
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
        java.util.Locale locale70 = java.util.Locale.US;
        java.lang.String str71 = locale70.getScript();
        java.util.Set<java.lang.String> strSet72 = locale70.getUnicodeLocaleAttributes();
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet72, 'A');
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strSet72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, strMap76);
        java.util.Collection<java.util.Locale> localeCollection78 = null;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, localeCollection78);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter(languageRangeList54, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList80);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode25.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
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
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
    }

    @Test
    public void test27258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("nglish (United Kingdom", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27259");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemandnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 57, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0034\\u00", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0034\\u00" + "'", str2, "0034\\u00");
    }

    @Test
    public void test27262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27262");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getVariant();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.parse("nailati", strMap23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap30);
        java.util.Locale locale32 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.lang.String str34 = locale32.getVariant();
        java.lang.String str35 = locale32.getDisplayName();
        java.lang.String str36 = locale32.getCountry();
        java.util.Set<java.lang.String> strSet37 = locale32.getUnicodeLocaleKeys();
        java.lang.String str38 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList48, filteringMode52);
        java.util.Collection<java.util.Locale> localeCollection54 = null;
        java.util.List<java.util.Locale> localeList55 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, localeCollection54);
        java.util.Locale locale56 = java.util.Locale.lookup(languageRangeList31, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale locale57 = java.util.Locale.lookup(languageRangeList28, (java.util.Collection<java.util.Locale>) localeList55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList55, filteringMode58);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "it");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "italien" + "'", str35, "italien");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode50.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode52.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(localeList55);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNull(locale57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList59);
    }

    @Test
    public void test27263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                \r", "talian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("FRANZ\366SISCH", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\366SISCH" + "'", str2, "FRANZ\366SISCH");
    }

    @Test
    public void test27265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27265");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", "de_de");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27266");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.util.Locale locale7 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test27267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27268");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\ud504');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("italienisch", "Franz\366sischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27271");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '2', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test27272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hcsilgnE     ", "Chinese (China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test27273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ahzrahzqahzoahznah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27274");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("SH", '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'S' + "'", char2 == 'S');
    }

    @Test
    public void test27275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho", 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho" + "'", str2, "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho");
    }

    @Test
    public void test27276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale.Builder builder8 = builder6.setLanguage("");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("             HCSINEILATI             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:              HCSINEILATI              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test27277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk", "z...Frn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444ALLEMAND4444", 224, '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4444ALLEMAND4444" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4444ALLEMAND4444");
    }

    @Test
    public void test27279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27279");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.lang.String str10 = locale8.getDisplayName();
        java.lang.String str11 = locale8.getISO3Country();
        java.lang.String str13 = locale8.getExtension('t');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "cor\351en" + "'", str10, "cor\351en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test27280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27280");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "tali...an");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034\\u00 hcstud \\u0034\\u00" + "'", str1, "\\u0034\\u00 hcstud \\u0034\\u00");
    }

    @Test
    public void test27282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27283");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hsilgne,nailati( nailati", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!_\\u0020_iTLE#########################################################################################", "                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\u0020_iTLE#########################################################################################" + "'", str2, "!_\\u0020_iTLE#########################################################################################");
    }

    @Test
    public void test27285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "                                  \\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test27286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27286");
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
        java.util.Locale locale13 = new java.util.Locale("en");
        boolean boolean14 = locale13.hasExtensions();
        java.lang.String str15 = locale8.getDisplayCountry(locale13);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale13.getDisplayName(locale16);
        java.lang.String str18 = locale13.getCountry();
        java.util.Locale locale20 = new java.util.Locale("it");
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = builder21.build();
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
        java.lang.String str38 = locale22.getDisplayVariant(locale30);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale40.getDisplayLanguage();
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale40);
        java.lang.String str43 = locale40.getCountry();
        java.lang.String str44 = locale40.getCountry();
        java.lang.String str45 = locale30.getDisplayCountry(locale40);
        java.util.Locale locale49 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = locale40.getDisplayCountry(locale50);
        java.lang.String str52 = locale20.getDisplayScript(locale50);
        java.lang.String str53 = locale20.getDisplayName();
        java.lang.String str54 = locale13.getDisplayCountry(locale20);
        java.lang.String str55 = locale13.toString();
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
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Englisch" + "'", str17, "Englisch");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "anglais" + "'", str41, "anglais");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "!IH" + "'", str42, "!IH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "italien" + "'", str53, "italien");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en" + "'", str55, "en");
    }

    @Test
    public void test27287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                    fran\347ais (france)                                                     ", "Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    fran\347ais (france)                                                     " + "'", str2, "                                                    fran\347ais (france)                                                     ");
    }

    @Test
    public void test27288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                               c500u", "IENISCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               c500u" + "'", str2, "                                                                                               c500u");
    }

    @Test
    public void test27289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", (int) 'b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str2, "ZH,cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test27290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", 82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ENGLISH", "Italie");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISH" + "'", str2, "ENGLISH");
    }

    @Test
    public void test27292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                         fr-", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0034\\u00                                             hcstuD                                             \\u0034\\u00", "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "E             g                                                                                     ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray9, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "italian (ITALIAN,English)");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("fr_CA", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH\\\\\\\\\\\\\\", strArray17, strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("ECANADAgCANADACANADAsh                                                                                                   ", strArray3, strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "nnnnnnnnnnnnnnnnnCinese (cina)\\u0069h...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str14, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str16, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "!IH!IH\\\\\\\\\\\\\\" + "'", str21, "!IH!IH\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ECANADAgCANADACANADAsh                                                                                                   " + "'", str22, "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "fr_CA" + "'", str24, "fr_CA");
    }

    @Test
    public void test27294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27294");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("       !IH", strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "ixii");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'C');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test27295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27295");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frankreich", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\U0034\\U00   \\\\U0020ITALIANITALIANITALIANITALI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test27296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\uc911\uad6d\uc5b4\uc911\uad6d)", "...........................................................................................................................................................................................z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r.......................................................................................................................................................................h.hzhhn_.AL.AN_ngzhsF");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I" + "'", str1, "20IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test27298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27298");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("D  \\u007a", "\\u007");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27299");
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
        java.lang.String str16 = locale11.getScript();
        java.lang.String str17 = locale11.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Deutsch" + "'", str17, "Deutsch");
    }

    @Test
    public void test27300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27300");
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
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getLanguage();
        java.lang.String str19 = locale15.getDisplayName();
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder22 = builder21.clearExtensions();
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = locale23.getDisplayName();
        java.util.Locale.Builder builder25 = builder22.setLocale(locale23);
        java.util.Locale.Builder builder27 = builder22.setLanguage("und");
        java.util.Locale locale28 = builder27.build();
        java.util.Locale locale29 = builder27.build();
        java.util.Locale locale30 = builder27.build();
        java.lang.String str31 = locale15.getDisplayName(locale30);
        java.util.Locale locale36 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str37 = locale36.getDisplayVariant();
        java.util.Locale locale38 = locale36.stripExtensions();
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.upperCase("       ", locale38);
        java.lang.String str40 = locale15.getDisplayLanguage(locale38);
        java.lang.String str41 = locale38.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder42 = builder14.setLocale(locale38);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0023 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinesisch (China)" + "'", str11, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italienisch" + "'", str16, "Italienisch");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italienisch" + "'", str19, "Italienisch");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Kanada)" + "'", str24, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Italian" + "'", str31, "Italian");
        org.junit.Assert.assertEquals(locale36.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "iTALIAN" + "'", str37, "iTALIAN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "       " + "'", str39, "       ");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italian" + "'", str40, "Italian");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "iTALIAN" + "'", str41, "iTALIAN");
    }

    @Test
    public void test27301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27301");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', 'S');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test27302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "uni", "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str3, "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test27303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen", 0, 26397);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen" + "'", str3, "enenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenenen");
    }

    @Test
    public void test27304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27304");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "anglais", "Korean (South Korea)");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test27305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27305");
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
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("", locale25);
        java.lang.String str28 = locale25.getScript();
        java.util.Set<java.lang.String> strSet29 = locale25.getUnicodeLocaleKeys();
        java.lang.String str30 = locale8.getDisplayLanguage(locale25);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englisch" + "'", str15, "Englisch");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "English" + "'", str30, "English");
    }

    @Test
    public void test27306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27306");
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
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale.Builder builder18 = builder15.setLocale(locale16);
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("ITALIAN");
        java.util.Locale.Builder builder22 = builder19.clearExtensions();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayName();
        java.util.Locale.Builder builder26 = builder22.setLocale(locale24);
        java.util.Locale.Builder builder27 = builder22.clear();
        java.util.Locale locale28 = builder22.build();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale.Builder builder32 = builder29.setLocale(locale31);
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale31.getDisplayName();
        java.lang.String str36 = locale31.getExtension('f');
        java.util.Locale locale37 = locale31.stripExtensions();
        java.lang.String str38 = locale28.getDisplayLanguage(locale37);
        java.lang.String str39 = locale37.getDisplayVariant();
        java.util.Locale.Builder builder40 = builder13.setLocale(locale37);
        java.util.Locale.Builder builder42 = builder13.setLanguage("FRANC");
        java.util.Locale.Builder builder43 = builder13.clear();
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch (Kanada)" + "'", str17, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "italian");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinesisch (China)" + "'", str25, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str34, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test27307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("dI!        (\\u0020,iTALICNIUEd########################################################################################", "Euguush");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dI!        (\\u0020,iTALICNIUEd########################################################################################" + "'", str2, "dI!        (\\u0020,iTALICNIUEd########################################################################################");
    }

    @Test
    public void test27308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27308");
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
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str20 = locale19.getDisplayLanguage();
        java.lang.String str21 = locale9.getDisplayScript(locale19);
        java.lang.String str22 = locale9.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale9.getUnicodeLocaleType("FRNZ\326SISCH (KND)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRNZO?SISCH (KND)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fra" + "'", str22, "fra");
    }

    @Test
    public void test27309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27309");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000", "                                                                    \\U0020ItalianItalianItalianItali", 18);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FRANZ\326SISCH", "44\\u002344", (int) (short) 0);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("Euguush", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("EHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglisEHglis", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Franz\366sisch (Frankreich)", "\\u0065");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "E             g                                                                                     ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...", strArray3, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC..." + "'", str10, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test27311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27311");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.getDisplayName();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder12 = builder7.setLanguage("und");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale15 = builder12.build();
        java.lang.String str16 = locale0.getDisplayName(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale0.getUnicodeLocaleType("5555555555");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 5555555555");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italienisch" + "'", str1, "Italienisch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italienisch" + "'", str4, "Italienisch");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Franz\366sisch (Kanada)" + "'", str9, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
    }

    @Test
    public void test27312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27312");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", (int) 'Y');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27313");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinois");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinois");
    }

    @Test
    public void test27314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                               TALY                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "fr-c                 ", "Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27316");
        java.util.Locale locale2 = new java.util.Locale("cor\351en (Cor\351e du Sud)", "RA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getUnicodeLocaleType("\\u0020iItalian\\u0020i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\u0020iItalian\\u0020i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "cor\351en (cor\351e du sud)_RA");
    }

    @Test
    public void test27317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27317");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "E             g                                                                                     ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray6, strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("Italienisch#########################################################################################", strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '8', 67, 4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concatWith("ITALIAN_ITALIAN_ENGLISH", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str11, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test27318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27318");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("uD                                             \\U0034", "fr-C", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         ", "\\0020!TALIAN!TALIAN!TALIAIAN_Englishallemzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test27320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 'S');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLIHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test27321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##################    \\XTALXAN_TALAN_ENGLXSH    ###################", "franz\366sisch(frankreich)");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("G", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27322");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", (java.lang.CharSequence) "AN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ")modgniK detinU( hsilgnE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27324");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.lang.String str7 = locale3.getDisplayCountry();
        boolean boolean8 = locale3.hasExtensions();
        java.lang.Object obj9 = locale3.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kanada" + "'", str7, "Kanada");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "fr_CA");
    }

    @Test
    public void test27325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("inglese...........................................................................................................................................................................................................................................................................................................................................................................", "n       nn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Fgence");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27327");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("       DE_DE            i\\u0020iTALIANiTA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test27328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27328");
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
        java.util.Locale.Builder builder14 = builder11.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder11.removeUnicodeLocaleAttribute("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test27329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\u671d", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u671d" + "'", str2, "\u671d");
    }

    @Test
    public void test27330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27330");
        java.util.Locale locale3 = new java.util.Locale("                                                        it                         ", "23DAL", "c");
        org.junit.Assert.assertEquals(locale3.toString(), "                                                        it                         _23DAL_c");
    }

    @Test
    public void test27331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)", "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27332");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FRFR_FR", "iTALIAN (ITALIAN,NGLIH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESELalhi!       _\\U0020_Italienisch####################################################################          andallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str2, "HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test27334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("cCCC\\CCCC", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cCCC\\CCCC" + "'", str2, "cCCC\\CCCC");
    }

    @Test
    public void test27335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("h", "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test27336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("FRTTAT_ITA                                                                                                  ", "nglish (United Kingdom", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27337");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r", "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 'R', 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str3, "Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test27340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "                                                               \\U002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ailatI", "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnlo");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("cHINESISCH(cHINA)", "\\u000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27343");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   cor\351en    ", "1\\u0061\\u0061\\u0061                           ", (int) '7', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 1\\u0061\\u0061\\u0061                           " + "'", str4, " 1\\u0061\\u0061\\u0061                           ");
    }

    @Test
    public void test27344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27344");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27345");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                              ", "IAN_Englishallem");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27346");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko" + "'", str2, "ko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko_KR" + "'", str3, "ko_KR");
    }

    @Test
    public void test27347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27347");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.lang.String str3 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27348");
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
        java.util.Locale locale17 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale17);
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale20 = locale17.stripExtensions();
        java.lang.String str21 = locale17.getDisplayVariant();
        java.lang.String str22 = locale1.getDisplayCountry(locale17);
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test27349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27349");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("United Kingdom", "inglesehhhhhhhhH", (int) 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                               \\U002   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 71 + "'", int6 == 71);
    }

    @Test
    public void test27350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("German");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27351");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati", (int) ')', "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati" + "'", str3, "cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati");
    }

    @Test
    public void test27352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...", (java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" zhAzhzhzhzhzhzhzhzhzhzh ", (int) 'G', "nc_HZ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nc_HZnc_HZnc_HZnc_HZnc_ zhAzhzhzhzhzhzhzhzhzhzh nc_HZnc_HZnc_HZnc_HZnc_" + "'", str3, "nc_HZnc_HZnc_HZnc_HZnc_ zhAzhzhzhzhzhzhzhzhzhzh nc_HZnc_HZnc_HZnc_HZnc_");
    }

    @Test
    public void test27354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ECANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                  hsADANACADANACgADANACE" + "'", str1, "                                                                                                  hsADANACADANACgADANACE");
    }

    @Test
    public void test27355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "royaume-uni ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0034\\u00", (java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27357");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("8");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27358");
        java.util.Locale locale4 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale8 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str9 = locale4.getDisplayScript(locale8);
        java.util.Locale locale13 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale8.getDisplayName(locale13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale8);
        java.lang.String str17 = locale8.getVariant();
        org.junit.Assert.assertEquals(locale4.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale8.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale13.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str15, "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str16, "TALIAN\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str17, "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test27359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("china", "\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27360");
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
        java.util.Locale locale14 = locale1.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.lang.String str19 = locale16.getExtension('C');
        java.lang.String str20 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale23);
        java.lang.String str25 = locale21.getDisplayCountry(locale23);
        java.lang.String str26 = locale21.getVariant();
        java.lang.String str27 = locale15.getDisplayScript(locale21);
        java.util.Locale locale28 = locale21.stripExtensions();
        java.lang.String str29 = locale1.getDisplayScript(locale28);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch" + "'", str17, "Franz\366sisch");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "chinois" + "'", str20, "chinois");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test27361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27361");
        java.util.Locale locale2 = new java.util.Locale("                                                                 HCSTUD                                             \\U0034", "frankreich");
        org.junit.Assert.assertEquals(locale2.toString(), "                                                                 hcstud                                             \\u0034_FRANKREICH");
    }

    @Test
    public void test27362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "                                                                                ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC" + "'", str1, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
    }

    @Test
    public void test27364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                               \\U002   ", 400);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               \\U002   " + "'", str2, "                                                               \\U002   ");
    }

    @Test
    public void test27365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27365");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('S');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN" + "'", str2, "                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
    }

    @Test
    public void test27367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27367");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ENGLISH");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test27368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27368");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.lang.String str7 = locale2.getISO3Country();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale8);
        java.lang.String str10 = locale2.getDisplayName(locale8);
        java.lang.String str11 = locale1.getDisplayLanguage(locale8);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.util.Locale.setDefault(category12, locale15);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Locale locale20 = java.util.Locale.getDefault(category18);
        java.util.Locale.setDefault(category12, locale20);
        java.lang.String str22 = locale1.getDisplayName(locale20);
        java.util.Set<java.lang.String> strSet23 = locale20.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleAttributes();
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
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test27369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc  E                         IIT L, t          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ES" + "'", str2, "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ES");
    }

    @Test
    public void test27370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27370");
        java.util.Locale locale3 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setRegion("hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)##############################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi!        (\\U0020,Italienisch#####Franzosisch (Kanada)############################################################################## [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test27372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("cor\351en44444444444444444444444444444444!ih", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...", "\ud55c\uad6d\uc5b4KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\351K44444444444444444444444444444444!" + "'", str3, "\351K44444444444444444444444444444444!");
    }

    @Test
    public void test27373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0029", 21, 'n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0029nnnnnnnnnnnnnnn" + "'", str3, "\\u0029nnnnnnnnnnnnnnn");
    }

    @Test
    public void test27374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27374");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("I");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap5);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.getDisplayName();
        java.lang.String str11 = locale7.getCountry();
        java.util.Set<java.lang.String> strSet12 = locale7.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet12);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray19 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.String> strList22 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.FilteringMode filteringMode23 = null;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList22, filteringMode23);
        java.lang.String str25 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList27, strMap28);
        java.util.Locale locale32 = new java.util.Locale("chinois (Chine)", "\\italian_ITALIAN_English");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags(languageRangeList27, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList37 = java.util.Locale.LanguageRange.parse("francese", strMap36);
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale39);
        java.util.Set<java.lang.String> strSet41 = locale39.getUnicodeLocaleKeys();
        java.lang.String str42 = java.util.Locale.lookupTag(languageRangeList37, (java.util.Collection<java.lang.String>) strSet41);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = locale43.getDisplayName(locale44);
        java.util.Set<java.lang.String> strSet46 = locale43.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode47 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strSet46, filteringMode47);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList58 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.lang.String>) strList55, filteringMode57);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList60 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList70, filteringMode72);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList70, filteringMode74);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags(languageRangeList60, (java.util.Collection<java.lang.String>) strList70, filteringMode76);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags(languageRangeList37, (java.util.Collection<java.lang.String>) strList55, filteringMode76);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet33, filteringMode76);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertEquals(locale32.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeList37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "DE_DE" + "'", str40, "DE_DE");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "allemand" + "'", str45, "allemand");
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + filteringMode47 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode47.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode57.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(languageRangeList60);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode74.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
    }

    @Test
    public void test27375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27375");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("TALIAN");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.lang.String str7 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "talian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "talian" + "'", str7, "talian");
    }

    @Test
    public void test27376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27376");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getVariant();
        java.lang.String str10 = locale0.getLanguage();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale13.getDisplayCountry(locale15);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str22 = locale19.getDisplayLanguage(locale21);
        java.lang.String str23 = locale13.getDisplayLanguage(locale19);
        java.lang.String str25 = locale19.getExtension('u');
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale26.getDisplayName(locale27);
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale26);
        java.lang.String str31 = locale19.getDisplayScript(locale26);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.util.Locale.setDefault(locale32);
        java.lang.String str36 = locale19.getDisplayCountry(locale32);
        java.lang.String str37 = locale0.getDisplayCountry(locale19);
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = locale0.getDisplayName(locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr" + "'", str10, "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Italian" + "'", str23, "Italian");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "allemand" + "'", str28, "allemand");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Koreanisch" + "'", str34, "Koreanisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "France" + "'", str37, "France");
    }

    @Test
    public void test27377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27378");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                               \\u0052", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 63 + "'", int14 == 63);
    }

    @Test
    public void test27379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", 220, "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" + "'", str3, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
    }

    @Test
    public void test27380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27380");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "HCSTUD \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27381");
        char[] charArray14 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                         ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                            dalleman!ih                            dalleman!ih                          ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "German (Germany)", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("...LIAN", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test27382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ENGLISCH (         italian_italian_english,\\U0061)", "CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISCH (         italian_italian_english,\\U0061)" + "'", str2, "ENGLISCH (         italian_italian_english,\\U0061)");
    }

    @Test
    public void test27383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27383");
        java.util.Locale locale3 = new java.util.Locale("onailati", "                    fRENCH (fRANCE)                                                \\u0068", "000000000000000000000cCCCC...000000000000000000000");
        org.junit.Assert.assertEquals(locale3.toString(), "onailati_                    FRENCH (FRANCE)                                                \\U0068_000000000000000000000cCCCC...000000000000000000000");
    }

    @Test
    public void test27384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("R0", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "R0" + "'", str3, "R0");
    }

    @Test
    public void test27385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27385");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "United Kingdom", (java.lang.CharSequence) "9hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhhhhhhh_\\U00789hhhhenglish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test27386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27386");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" italian  ", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("en-GB");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap15);
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
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        java.util.Locale.LanguageRange[] languageRangeArray64 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList65 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65, languageRangeArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList65, (java.util.Collection<java.lang.String>) strList70, filteringMode72);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strList62, filteringMode72);
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap76);
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strList87, filteringMode89);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, (java.util.Collection<java.lang.String>) strList87, filteringMode91);
        java.util.Collection<java.util.Locale> localeCollection93 = null;
        java.util.List<java.util.Locale> localeList94 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, localeCollection93);
        java.util.List<java.util.Locale> localeList95 = java.util.Locale.filter(languageRangeList77, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.List<java.util.Locale> localeList96 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale locale97 = java.util.Locale.lookup(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale locale98 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList94);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
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
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode89.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(localeList94);
        org.junit.Assert.assertNotNull(localeList95);
        org.junit.Assert.assertNotNull(localeList96);
        org.junit.Assert.assertNull(locale97);
        org.junit.Assert.assertNull(locale98);
    }

    @Test
    public void test27387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27387");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    \\XTALXAN_ITALIAN_ENGLXSH    ", "\\U0020ITALIANITALIANITALIANITALI", (int) 'T');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27388");
        java.util.Locale locale2 = new java.util.Locale("en", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ");
        org.junit.Assert.assertEquals(locale2.toString(), "en_NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN                                                                     ");
    }

    @Test
    public void test27389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("... g ...", 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("chinois (Chine)", "GERMAN (GERMANY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinois (Chine)" + "'", str2, "chinois (Chine)");
    }

    @Test
    public void test27391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27391");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "TALA", (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test27392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27392");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi! _\\0020_Italienisch####################################################################");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test27393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27393");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Rankreich)00      ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test27394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27394");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test27395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27395");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', (int) 'I', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 73");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "00000000000000COR\311EN (cOR\311E DU sUD)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("ENGLISCH (         italian_italian_english,\\U0061)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !ih                            dalleman", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27399");
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
        java.lang.String str32 = locale26.getDisplayVariant();
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str37 = locale36.getCountry();
        java.util.Locale.setDefault(category33, locale36);
        java.util.Locale locale40 = new java.util.Locale("en");
        boolean boolean41 = locale40.hasExtensions();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.util.Locale locale43 = java.util.Locale.ITALIAN;
        java.lang.String str44 = locale43.getDisplayLanguage();
        java.util.Locale locale45 = locale43.stripExtensions();
        java.lang.String str46 = locale45.getVariant();
        java.lang.String str47 = locale40.getDisplayLanguage(locale45);
        java.util.Locale.setDefault(category33, locale45);
        java.util.Locale locale49 = locale45.stripExtensions();
        java.lang.String str50 = locale26.getDisplayVariant(locale49);
        java.lang.String str51 = locale49.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
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
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "italiano" + "'", str44, "italiano");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "inglese" + "'", str47, "inglese");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "it" + "'", str51, "it");
    }

    @Test
    public void test27400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("8300u\\", 52, 'l');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lllllllllllllllllllllll8300u\\lllllllllllllllllllllll" + "'", str3, "lllllllllllllllllllllll8300u\\lllllllllllllllllllllll");
    }

    @Test
    public void test27401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM", 37);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27402");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de_de", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("c0000000c0000000000000", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AND4444", (int) 'A', 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" hi!       _\\U0020_Italienisch####################################################################           ", "#u##2#iTALIANiTALIANiTALIANiT", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("KO", '!');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27407");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!        (\\u0020,italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Englisch (Vereinigtes K\366nigreich)", "Italian");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Egsch (Vereges K\366grech)" + "'", str3, "Egsch (Vereges K\366grech)");
    }

    @Test
    public void test27409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!       _\\U0020_Italienisch#########################################################################################", "\\u0020)TALIAN)TALIAN)TALIANiTALI", "uni");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       _\\U0020_Italienisch#########################################################################################" + "'", str3, "Hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test27411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                                  !ih                            dalleman                ZH_CNGGGGG");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 25 vs 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Japonais", "\\U005");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Japonais" + "'", str2, "Japonais");
    }

    @Test
    public void test27413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...00u\\                                                                    _gn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "iT_ITALIAN_EgAish");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27415");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.util.Locale locale6 = locale3.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Locale locale10 = locale7.stripExtensions();
        java.lang.String str11 = locale6.getDisplayVariant(locale10);
        java.util.Locale.setDefault(locale6);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iTALIAN" + "'", str4, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIENISCH" + "'", str5, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "allemand" + "'", str9, "allemand");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "iTALIAN" + "'", str11, "iTALIAN");
    }

    @Test
    public void test27416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                \r", 78, "kokoko");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                \r" + "'", str3, "                                                                                                                \r");
    }

    @Test
    public void test27417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27417");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = locale3.stripExtensions();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale5.getDisplayCountry(locale7);
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str14 = locale11.getDisplayLanguage(locale13);
        java.lang.String str15 = locale5.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getExtension('u');
        java.util.Set<java.lang.String> strSet18 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale19.getDisplayName();
        java.lang.String str21 = locale11.getDisplayLanguage(locale19);
        java.lang.String str22 = locale1.getDisplayVariant(locale11);
        java.lang.String str23 = locale11.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "French (Canada)" + "'", str20, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "und" + "'", str23, "und");
    }

    @Test
    public void test27418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27418");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "G");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zhAzhzhzhzhzhzhzhzhzhzh", 133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27420");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA", (java.lang.CharSequence) "tit");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test27421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("englisch", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)", 25);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "D  \\u007a", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test27425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27425");
        java.util.Locale locale1 = new java.util.Locale("FR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR\\U000DFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR-CAFR");
        org.junit.Assert.assertEquals(locale1.toString(), "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
    }

    @Test
    public void test27426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27426");
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
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale15.getScript();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet17, 'A');
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap21);
        java.util.Collection<java.util.Locale> localeCollection23 = null;
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection23);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = locale27.getDisplayName();
        java.util.Locale.Builder builder29 = builder26.setLocale(locale27);
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder31 = builder26.setLocale(locale30);
        java.util.Set<java.lang.String> strSet32 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet32, "ita");
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet32);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French (Canada)" + "'", str28, "French (Canada)");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test27427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27427");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!_\\u0020_iTLE#########################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("e ITALIAN,ENGLISHa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test27428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test27429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27429");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6, filteringMode8);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList27);
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
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList42);
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
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList73);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList76, filteringMode77);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList78, filteringMode79);
        java.lang.String str82 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList80, "A)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaDzh_CNfRENCH (cANA");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
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
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode77.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode79.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test27430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "uni");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27431");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "zh_cnggggg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh_cnggggg" + "'", str1, "zh_cnggggg");
    }

    @Test
    public void test27432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "tTAT_ITA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...LIAN", "                   ti444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...LIAN" + "'", str2, "...LIAN");
    }

    @Test
    public void test27434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27434");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27436");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                eselgni                               ", "CCCCCCC           \\uCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27437");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("000000000000000000000000000000000000000000...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test27438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("en_CA", 19, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27439");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'J');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character J is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27440");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                           FR_frGGGGG", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDiFranzosisch ...", "Japanese");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27441");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", "    ...ENGLISHEN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO", "44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCO");
    }

    @Test
    public void test27443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27443");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", "cccccccccccccccccccccccccccccccc", (int) 'f');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                         German (Germany)", "chinese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch" + "'", str1, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
    }

    @Test
    public void test27446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27446");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder5.clear();
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test27447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27447");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hhhhhhhhhh (                                                                                     G             )", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27448");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020iTALIANiTALIANiTALIANiT", "8600u\\                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", "", "china");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY" + "'", str2, "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
    }

    @Test
    public void test27451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0045", 't');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                ");
    }

    @Test
    public void test27453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27453");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("anglais (Canada)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test27454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("....................................................................................... (italian,english)", "8600u\\                                 hsiAgE_NAILATI_TiATti8600u\\                     nglish (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....................................................................................... (italian,english)" + "'", str2, "....................................................................................... (italian,english)");
    }

    @Test
    public void test27455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27455");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "z...", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                  it44444444444444444en", (int) 'd');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27456");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("italian (italian,engl", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", 111);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("ch", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test27457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
    }

    @Test
    public void test27458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch", "\\u00de\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
    }

    @Test
    public void test27459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "anglais (Etats-Unis)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27460");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine..." + "'", str3, "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
    }

    @Test
    public void test27461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                     etatS detinU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27462");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!       _\\U0020_Italienisch#########################################################################################", "44\\u002344");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray10, strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("       !IH", strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("FRANZ\326SISCH", strArray14);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray14);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("TAUAWAXAZBA", "");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH", strArray4, strArray21);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH" + "'", str22, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test27463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27463");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder11 = builder6.setExtension('I', "");
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayName(locale13);
        java.util.Locale locale15 = locale12.stripExtensions();
        java.lang.String str16 = locale12.getScript();
        java.lang.String str17 = locale12.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale12.getDisplayScript(locale20);
        java.util.Locale.Builder builder22 = builder11.setLocale(locale20);
        java.lang.String str23 = locale1.getDisplayName(locale20);
        java.lang.String str24 = locale20.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French (Canada)" + "'", str5, "French (Canada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "allemand" + "'", str14, "allemand");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "German" + "'", str17, "German");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian" + "'", str19, "Italian");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ita" + "'", str24, "ita");
    }

    @Test
    public void test27464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27465");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale1.getExtensionKeys();
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale1.getDisplayVariant(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27466");
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
        java.util.Locale.Builder builder15 = builder1.removeUnicodeLocaleAttribute("emand");
        java.util.Locale locale16 = builder15.build();
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             hcstueD                                             ", "UND", (int) '4');
        boolean boolean21 = locale16.equals((java.lang.Object) "UND");
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test27467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27467");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("hcsilgnE     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hcsilgnE      [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test27468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27468");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('S');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27469");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4300u\\                                             dutsch                                            ", 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                         GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "cccccccccccccccccccccccccccccccc", "ko");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                              ))))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              ))))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str1, "                                                                              ))))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test27472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H", "hsiAE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27473");
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
        java.lang.String str15 = locale8.getVariant();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27474");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "TAUAWAXAZBA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...          ", "######################################ELTi_0200u\\_!#####################################ELTi_0200u\\_!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("iFtlnz\\sisc02");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iFtlnz\\sisc02" + "'", str1, "iFtlnz\\sisc02");
    }

    @Test
    public void test27478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27478");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IAN\\U0020I", "   cor\351en    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IAN\\U0020I" + "'", str4, "IAN\\U0020I");
    }

    @Test
    public void test27479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27479");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        java.util.Locale.Builder builder9 = builder3.clear();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale.Builder builder15 = builder12.setLocale(locale14);
        java.util.Locale.setDefault(locale14);
        java.util.Locale locale18 = new java.util.Locale("en");
        boolean boolean19 = locale18.hasExtensions();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale23.getVariant();
        java.lang.String str25 = locale18.getDisplayLanguage(locale23);
        java.lang.String str26 = locale14.getDisplayVariant(locale18);
        java.lang.String str27 = locale14.getVariant();
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.lowerCase("Azhzhzhzhzhzhzhzhzhzh", locale14);
        java.lang.String str29 = locale14.getISO3Country();
        java.util.Locale.Builder builder30 = builder9.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder30.setVariant(")HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: )HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "inglese" + "'", str25, "inglese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "azhzhzhzhzhzhzhzhzhzh" + "'", str28, "azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GBR" + "'", str29, "GBR");
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test27480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27480");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese (China)", 'A');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'f');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese (China)" + "'", str4, "Chinese (China)");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
    }

    @Test
    public void test27481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("FrkrB", "ANGLAIS (ROYAUME-UNI)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G" + "'", str1, "ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G");
    }

    @Test
    public void test27483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27483");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("FRA", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("                                                         HSILGNHeH_HnailatiH_HNAILATIH         ", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str11, "EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Eagaas                                                         HSILGNHeH_HnailatiH_HNAILATIH         " + "'", str12, "Eagaas                                                         HSILGNHeH_HnailatiH_HNAILATIH         ");
    }

    @Test
    public void test27484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("DE_DE", "en-US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DE" + "'", str2, "DE_DE");
    }

    @Test
    public void test27485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("English (Canada)", "iFranzosisch ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Canada)" + "'", str2, "English (Canada)");
    }

    @Test
    public void test27486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Chinesisch(China)", "ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27487");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\u6cd5', '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\u6cd5' + "'", char2 == '\u6cd5');
    }

    @Test
    public void test27488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27488");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AzhzhzhzhzhzhzhzhzhzhE             g", "\uc601\uc5b4                                                                                                  ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444ITALIAN4444444444", 16, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444ITALIAN4444444444" + "'", str3, "44444444444444ITALIAN4444444444");
    }

    @Test
    public void test27490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         " + "'", str1, "                                                         ");
    }

    @Test
    public void test27491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27491");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!IH");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                             de_de                                              ", strArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test27492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27492");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale locale11 = builder10.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test27493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iTALIE                         ", 221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               iTALIE                                                                                                                        " + "'", str2, "                                                                                               iTALIE                                                                                                                        ");
    }

    @Test
    public void test27494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27494");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("GB", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27495");
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
        java.util.Locale locale17 = builder16.build();
        java.util.Locale.Builder builder18 = builder16.clear();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.lang.String str20 = locale19.getISO3Country();
        java.lang.String str21 = locale19.getVariant();
        java.util.Set<java.lang.Character> charSet22 = locale19.getExtensionKeys();
        java.util.Locale.Builder builder23 = builder16.setLocale(locale19);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(charSet22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test27496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", "bbbbbbbbbb   cor\351en    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe" + "'", str2, "keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
    }

    @Test
    public void test27497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27497");
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
            java.util.Locale.Builder builder12 = builder8.setExtension('F', "llandADAEAFAGAIA...ienischallemandhi!allemandHI!alleman_ITALIAN_EnglishalianditallemandADAEAFAGAIA...ienischallemandhi!allemandHI!alleman_ITALIAN_Englishalianditallema\\u0068 !ih !ih !ih !ih !ih !ih !ih !ih !ihienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: llandADAEAFAGAIA...ienischallemandhi!allemandHI!alleman [at index 0]");
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
    public void test27498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000", "             x-lvariant-CAN              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27499");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("US", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "eAGAASH", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test27500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest54.test27500");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("neilatI    E");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'n' + "'", char1 == 'n');
    }
}
