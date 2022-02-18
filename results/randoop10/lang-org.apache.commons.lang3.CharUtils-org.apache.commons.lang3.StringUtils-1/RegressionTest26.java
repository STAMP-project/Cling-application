import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444fra", "                          \\u0046");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          \\u0046" + "'", str2, "                          \\u0046");
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA", "franc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA" + "'", str2, "!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALA");
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("English", "\\u0020iTALIANiTALIANiTALIANiTAL", 3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Engl" + "'", str6, "Engl");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Engl" + "'", str9, "Engl");
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0035");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('G');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!(\\U0020,Italienisch############################################hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Ttat_ita", 92, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
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
        java.util.Set<java.lang.String> strSet11 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale1.getDisplayName();
        java.lang.String str13 = locale1.toLanguageTag();
        java.lang.String str15 = locale1.getExtension('T');
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
        org.junit.Assert.assertNotNull(strSet11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "francese (Canada)" + "'", str12, "francese (Canada)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr-CA" + "'", str13, "fr-CA");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "EnglishI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIIT(I\\U0020ITALIANITALIANITALIANITALIITUnitedI\\U0020ITALIANITALIANITALIANITALIIT I\\U0020ITALIANITALIANITALIANITALIITKingdomI\\U0020ITALIANITALIANITALIANITALIIT)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                ITA                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################" + "'", str1, "########################################################################################");
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0069");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
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
        java.util.Locale locale17 = locale0.stripExtensions();
        java.lang.String str18 = locale17.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "francese (Canada)" + "'", str9, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)", "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
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
        java.lang.String str19 = locale14.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano" + "'", str1, "italiano");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "francese (Canada)" + "'", str9, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
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
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.upperCase("Korean", locale18);
        java.lang.String str37 = locale18.getDisplayCountry();
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
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "KOREAN" + "'", str36, "KOREAN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "France" + "'", str37, "France");
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.addUnicodeLocaleAttribute("TALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: TALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\u0061", "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0065                             ", (java.lang.CharSequence) "nailatiko");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("italian(italian,eng", "\u4e2d\u6587\u4e2d\u56fd)", 221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("frnz\366sisch (knd)", '!', 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frnz\366sisch (knd)" + "'", str3, "frnz\366sisch (knd)");
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE E..." + "'", str2, "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE E...");
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                             hcstued", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...", "fran\347");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...");
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Italy", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("44                                                                                               en44", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                  ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ITALIAN (ITALIAN,ENGLISH", '\ud504');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN (ITALIAN,ENGLISH" + "'", str2, "ITALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("GBR", "                                                 INGLESE");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ko-KR                                                                                                    ", "Italie");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR                                                                                                    " + "'", str2, "ko-KR                                                                                                    ");
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "FRANCESE (CANADA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:                   [at index 0]");
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
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("italian", "Iinglese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("FRANCESE (CANADA)", "                              de_de                              ", 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "hIAN\\U0020Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 16, 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setExtension('9', "\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 9 [at index 0]");
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
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        java.util.Locale locale1 = new java.util.Locale("zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals(locale1.toString(), "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\u0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        java.util.Locale locale2 = new java.util.Locale("italian (ITALIAN,English)", "                                                                                                         ");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale9 = new java.util.Locale("EN_CA", "Ttat_ita");
        java.lang.String str10 = locale3.getDisplayCountry(locale9);
        org.junit.Assert.assertEquals(locale2.toString(), "italian (italian,english)_                                                                                                         ");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fr-CA" + "'", str5, "fr-CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italian (italian,english)" + "'", str6, "italian (italian,english)");
        org.junit.Assert.assertEquals(locale9.toString(), "en_ca_TTAT_ITA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italiano", 406, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000italiano000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC0000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0023", '\n');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023" + "'", str3, "\\u0023");
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                    ", "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("cinese (Cina)\\u0069h...", "\\u0078", 105);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("chinois (Chine)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("\\u0075");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: \\u0075 [at index 0]");
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
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('C', "DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hcsineilatI", "franc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...anitali", "iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", (int) 'A');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "allemand", (int) 'F', (-1));
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("allemand (Allemagne)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "                                                                              ECANADAgCANADACANADAsh", "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Cinese (Cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cinese (Cina)\\u0069h..." + "'", str1, "Cinese (Cina)\\u0069h...");
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\uc601\uc5b4", "itTAiT_ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4" + "'", str2, "\uc601\uc5b4");
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.Object obj8 = null;
        boolean boolean9 = languageRange1.equals(obj8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AzhzhzhzhzhzhzhzhzhzhE             g                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AzhzhzhzhzhzhzhzhzhzhE             g                          " + "'", str1, "AzhzhzhzhzhzhzhzhzhzhE             g                          ");
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("NAC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NAC" + "'", str1, "NAC");
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
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
        java.lang.String str62 = locale1.toString();
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
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
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
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "\\u005c");
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "fr_CA" + "'", str62, "fr_CA");
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "                                             hcstued                                            ", "                                                       HI!                                                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                             hcsfr-CueD                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("RA", 121);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "eR-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("franz\366sisch (frankreich)", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'f' + "'", char2 == 'f');
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("itTAiT_ITA", "hi!       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itTAiT_ITA" + "'", str3, "itTAiT_ITA");
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!       dItalienischditalian_ITALIAN_EnglishdHI!dhi!dADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...d\\u0034dHI!dItaliand\\u0061d\\u0023dhi!diTALIANdChinese (China)dhi!dzh_CNdiTALIANdendItalienisch", (java.lang.CharSequence) "ZH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 264 + "'", int2 == 264);
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...#####################################################################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\AuA0046", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "h)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h)" + "'", str1, "h)");
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ian\\u00208ian\\u0020i868ian\\u00", "Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str17 = locale15.getExtension('G');
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = builder0.build();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = locale22.getScript();
        java.lang.String str25 = locale22.getISO3Country();
        java.lang.String str26 = locale22.getCountry();
        java.lang.String str27 = locale22.getCountry();
        java.lang.String str28 = locale20.getDisplayCountry(locale22);
        java.lang.String str29 = locale19.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "de" + "'", str23, "de");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Deutsch (Deutschland)" + "'", str29, "Deutsch (Deutschland)");
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" \\U0078 ", "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(")dnK( hcsis\366znrF", "B");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "h#########################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ")dnK( hcsis\366znrF" + "'", str4, ")dnK( hcsis\366znrF");
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", "                                                                                                                  8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0075", "HI!(\\U0020,ITALIENISCH#########################################################################################)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Deutsc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranzo?sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hIAN\\U0020Ihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIAN\\U0020Ihi" + "'", str1, "hIAN\\U0020Ihi");
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fr", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0023", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish          ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAffr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CAfr-CAfr-CAfr-C8600u\\fr-CAf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444FRA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (int) 'a', 29);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "eAGAASH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("         ITALIAN_italian_eNGLISH         ITALIAN_!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese", strMap1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale.setDefault(category3, locale6);
        java.util.Locale locale9 = java.util.Locale.getDefault(category3);
        java.util.Locale locale10 = java.util.Locale.getDefault(category3);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale10.getDisplayScript(locale12);
        java.util.Set<java.lang.String> strSet15 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode16 = null;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet15, filteringMode16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet15, 'Y');
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("tenenco", (int) 'x');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.lang.String str8 = locale6.getVariant();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale6);
        boolean boolean10 = locale6.hasExtensions();
        java.lang.String str11 = locale3.getDisplayLanguage(locale6);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0034" + "'", str9, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!       " + "'", str11, "hi!       ");
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                             hcstueD                                             ", "Italy");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             hcstueD                                             " + "'", str2, "                                             hcstueD                                             ");
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("FRENCH", 62, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        java.util.Locale locale3 = new java.util.Locale("tali...an", "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", "                                                                                               c500u");
        org.junit.Assert.assertEquals(locale3.toString(), "tali...an_A)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADZH_CNFRENCH (CANA_                                                                                               c500u");
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hcstueD", 76, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hcstueD" + "'", str3, "hcstueD");
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rHI!\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "dallemandallemandallemandallemandallemandallemandallemandalle", "canad");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "English (United Kingdom)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc" + "'", str2, "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc");
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                  \\u0068", "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13100");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        java.util.Locale.Builder builder5 = builder0.setScript("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13101");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Deutscd\\XTALXAN_ITALIAN_ENGLXSH", "\u5fb7\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u570b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u570b" + "'", str1, "\u6cd5\u570b");
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("DE_DE", "                          \\u0046");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DE_DE" + "'", str2, "DE_DE");
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13104");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", (double) 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=30.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13106");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13107");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("fr_CA", 29, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    ZH_CN    South Korea");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("South Korea", "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc..." + "'", str2, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("franci", "ititaitainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13112");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale5.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italienisch#########################################################################################" + "'", str8, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2cinese (Cina...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2cinese (Cina..." + "'", str1, "2cinese (Cina...");
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13114");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinesisch (Ch", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch(ch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13115");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I [at index 0]");
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
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13116");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\XTALXAN_ITALIAN_ENGLXSH", "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", 151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "8", "ete");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\n", (double) 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=101.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13119");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.addUnicodeLocaleAttribute("en_US                ita                ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_US                ita                 [at index 0]");
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
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", "HSAAGAekkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr", "inglese...........................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13122");
        java.util.Locale locale2 = new java.util.Locale("en");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale2.getDisplayLanguage(locale7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("x", locale7);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italiano" + "'", str6, "italiano");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "inglese" + "'", str9, "inglese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "X" + "'", str10, "X");
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13123");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getVariant();
        java.util.Locale locale9 = locale5.stripExtensions();
        java.util.Locale locale10 = locale5.stripExtensions();
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0043", "an\\u00", "h########################################################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13126");
        java.util.Locale locale2 = new java.util.Locale(" hi!       _\\U0020_Italienisch####################################################################            ", "....................................................................................... (italian,english)");
        org.junit.Assert.assertEquals(locale2.toString(), " hi!       _\\u0020_italienisch####################################################################            _....................................................................................... (ITALIAN,ENGLISH)");
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ILATiNA...", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ILATiNA..." + "'", str2, "ILATiNA...");
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13128");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                          g             E", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                ian\\u00208ian\\u0020i868ian\\u00", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0039", 267, ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039" + "'", str3, ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039");
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("9hhhhhhhhhh_\\U0078", "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "9hhhhhhhhhh_\\U0078" + "'", str2, "9hhhhhhhhhh_\\U0078");
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13131");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str7 = locale5.getExtension('h');
        java.lang.String str8 = locale4.getDisplayScript(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.lang.String str10 = locale2.getDisplayVariant(locale4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale2);
        java.util.Locale locale13 = new java.util.Locale("en");
        java.lang.String str14 = locale2.getDisplayLanguage(locale13);
        java.lang.String str15 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FRA" + "'", str9, "FRA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str11, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "French" + "'", str14, "French");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Canada" + "'", str15, "Canada");
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(")dnK( hcsis\366znrF                              ", '\ud504');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ")dnK( hcsis\366znrF                              " + "'", str2, ")dnK( hcsis\366znrF                              ");
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("deu", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13135");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "hcsineilat");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0020iTALIANiTALIANiTALIANiT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiT" + "'", str1, "\\u0020iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13137");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        boolean boolean3 = locale1.equals((java.lang.Object) "nglish (United Kingdom");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13138");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("             DE_DE            ", 35, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13139");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Fr ncG ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aNIHc", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "iiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13141");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale3);
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.String str6 = locale1.getDisplayName(locale3);
        java.lang.String str7 = locale3.getISO3Language();
        java.lang.Object obj8 = locale3.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         italian_italian_english" + "'", str4, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "zh");
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                 inglese", "         INGLESE        ", "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13143");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Italienisch#########################################################################################", "!IH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Egsh");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13144");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13145");
        java.util.Locale locale2 = new java.util.Locale("gERMAN (gERMANY)", "it_IT");
        java.util.Set<java.lang.Character> charSet3 = locale2.getExtensionKeys();
        boolean boolean5 = locale2.equals((java.lang.Object) "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals(locale2.toString(), "german (germany)_IT_IT");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13146");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", "", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("italian__#e-deutsch", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deutsch" + "'", str6, "Deutsch");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13147");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'f', (int) 'i');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13148");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", (java.lang.CharSequence) "fr-C");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13149");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'N');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character N is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NE_NAILATI_" + "'", str2, "NE_NAILATI_");
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    \\XTALXAN_aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaaTALaaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaaAN_ENGLXSaaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13152");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("USA", "ed");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str1, "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                              DEUTSCH", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              DEUTSCH" + "'", str2, "                                                                                              DEUTSCH");
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", "AnihCFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HHHHHHHHH         ITAL\\u0020iItalian\\u008600u\\HHHHHHHHH         ITAL", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH         ITAL\\u0020iItalian\\..." + "'", str2, "HHHHHHHHH         ITAL\\u0020iItalian\\...");
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!_\\u0020_itle#########################################################################################", (int) 'z', 264);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!_\\u0020_itle#########################################################################################" + "'", str3, "!_\\u0020_itle#########################################################################################");
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                       k", 'N');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       k" + "'", str2, "                                       k");
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray3, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str6, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "u" + "'", str7, "u");
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13160");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITALIAN (italian,eNGLISH)", "             \\u0049                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Italienisch#########################################################################################", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13162");
        java.util.Locale locale1 = new java.util.Locale("\\u0038zho                          ");
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0038zho                          ");
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13163");
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
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale9.getDisplayLanguage(locale25);
        java.util.Locale locale29 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str30 = locale29.getScript();
        java.lang.String str31 = locale9.getDisplayCountry(locale29);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clearExtensions();
        java.util.Locale.Builder builder35 = builder32.setLanguageTag("Italian");
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.lang.String str37 = locale36.getDisplayName();
        java.util.Locale.Builder builder38 = builder32.setLocale(locale36);
        java.lang.String str39 = locale36.getISO3Language();
        java.lang.String str40 = locale36.getScript();
        java.lang.String str41 = locale29.getDisplayScript(locale36);
        java.lang.String str42 = locale29.getISO3Country();
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "fran\347ais" + "'", str27, "fran\347ais");
        org.junit.Assert.assertEquals(locale29.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "chinois (Chine)" + "'", str37, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", "                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..." + "'", str2, "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    IIIIIIIIII...........................", (int) 'G', "ITALIAN4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII..........................." + "'", str3, "ITALIAN4ITALIAN4ITALIAN4ITALIA    IIIIIIIIII...........................");
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13166");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=adaaeaafaagaaiaalaamaanaaoaaqaaraas");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13167");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedjdkdmdodzeceeegeher");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13168");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (java.lang.CharSequence) "                                ESELGNI                               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", charSequence2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("KO", ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("italian (italian,eng", 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13171");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", (java.lang.CharSequence) "Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", charSequence2, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!(\\U0020,Italienisch############################################hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ITALIAN_italian_eNGLISH", "German");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("fr", "French (Canadad");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                               \\U002", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               \\U002   " + "'", str2, "                                                               \\U002   ");
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!_\\U0020_itle########################################################################################", "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13177");
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
        java.util.Locale.Builder builder41 = builder0.setVariant("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
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
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                             DEUTSCH                                             ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" hi!       _\\U0020_Italienisch####################################################################            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!       _\\U0020_Italienisch####################################################################           " + "'", str1, " hi!       _\\U0020_Italienisch####################################################################           ");
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u82f1\u8a9e", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u8a9e" + "'", str2, "\u82f1\u8a9e");
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13181");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs", 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Hhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13183");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "#########FranzosischFranzosisch (Frankreich)########TALIAN_italian_eNGLISHITAL", 374, 116);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AzhzhzhzhzhzhzhzhzhzhADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBhcstueDNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("eAGAAS", "               Deutschland", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                               ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test13187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...", (int) 'G');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC..." + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...");
    }

    @Test
    public void test13188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13188");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.lang.String str15 = locale10.getISO3Country();
        java.lang.String str16 = locale8.getDisplayVariant(locale10);
        java.lang.String str17 = locale10.getCountry();
        java.lang.String str18 = locale1.getDisplayLanguage(locale10);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale20.getExtension('h');
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        java.util.Locale locale24 = locale19.stripExtensions();
        java.lang.String str25 = locale24.getISO3Country();
        java.util.Locale locale27 = new java.util.Locale("en");
        boolean boolean28 = locale27.hasExtensions();
        java.util.Set<java.lang.String> strSet29 = locale27.getUnicodeLocaleKeys();
        java.lang.String str30 = locale24.getDisplayCountry(locale27);
        java.util.Locale.setDefault(locale24);
        java.lang.String str32 = locale24.getISO3Country();
        java.lang.String str33 = locale1.getDisplayCountry(locale24);
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = locale34.getCountry();
        java.lang.String str36 = locale24.getDisplayVariant(locale34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = locale34.getUnicodeLocaleType("             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:              ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FR" + "'", str17, "FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "allemand" + "'", str18, "allemand");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "FRA" + "'", str25, "FRA");
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "France" + "'", str30, "France");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FRA" + "'", str32, "FRA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "CA" + "'", str35, "CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test13189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("cHN", "it_IT");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cHN" + "'", str3, "cHN");
    }

    @Test
    public void test13190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW", "                               e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!", ' ', 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!" + "'", str3, "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!");
    }

    @Test
    public void test13192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13192");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'b');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0062" + "'", str1, "\\u0062");
    }

    @Test
    public void test13193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str1, "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
    }

    @Test
    public void test13194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("chinois (chine)", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13195");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HHHHHHHHHH", "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\u0046", 136, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13197");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   h", "Deutsch (Deutschland)", "ete", 111);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   h" + "'", str4, "   h");
    }

    @Test
    public void test13198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "Cor\351e du Sud");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cor\351e du Sud" + "'", str2, "Cor\351e du Sud");
    }

    @Test
    public void test13199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "italian    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ANGLAIS (ROYAUME-UNI)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS (ROYAUME-UNI)" + "'", str1, "ANGLAIS (ROYAUME-UNI)");
    }

    @Test
    public void test13201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", "ITALIAN (ITALIAN,ENGLISH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)" + "'", str2, "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
    }

    @Test
    public void test13202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", "      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                               EN", "...ANiTALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("f_KOREAN", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhanglais (Canada)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("d", 'T');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test13206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("iTALIE                         ", "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIE                         " + "'", str2, "iTALIE                         ");
    }

    @Test
    public void test13207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("It_", "dallemandallemandallemandallemandallemandallemandallemandalle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "It_" + "'", str2, "It_");
    }

    @Test
    public void test13208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("KKKKKKKKKKKKKKKKKEAGAASH", "             hcsineilatI             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 79, "dI!        (\\u0020,iTALICNIUEd#########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str3, "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test13210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13210");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("und-iTALIAN", "Ital");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13211");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder9.clear();
        java.util.Locale locale15 = builder9.build();
        java.lang.String str17 = locale15.getExtension('a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("Eagaash", locale15);
        java.lang.String str19 = locale15.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "French (Canada)" + "'", str4, "French (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italian");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese (China)" + "'", str12, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EAGAASH" + "'", str18, "EAGAASH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..", "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("anglais (royaume-uni)FRA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                     ", "000000000000000000000000000000000000000000000FRANZ\326SISCH0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13215");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale2.getISO3Country();
        java.lang.String str6 = locale2.getCountry();
        java.lang.String str7 = locale2.getCountry();
        java.lang.String str8 = locale0.getDisplayScript(locale2);
        java.lang.Object obj9 = locale2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "USA" + "'", str5, "USA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "US" + "'", str6, "US");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "US" + "'", str7, "US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "en_US");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "en_US");
    }

    @Test
    public void test13216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "chinois (Chine)", (java.lang.CharSequence) "chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("2italianitalianitalianitali", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13218");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ne\351roc", (java.lang.CharSequence) "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "SUen_", (java.lang.CharSequence) "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...", "Fr ncG ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...");
    }

    @Test
    public void test13221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13221");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("       !IH", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\u0061\\u0061\\u0061                           ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("ZH_cn", strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 28");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)" + "'", str10, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HARZHASZHAZHZHZHZHZHZHZHZHZHZ", 'n', 'd');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HARZHASZHAZHZHZHZHZHZHZHZHZHZ" + "'", str3, "HARZHASZHAZHZHZHZHZHZHZHZHZHZ");
    }

    @Test
    public void test13223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iFranzosisch ", "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13225");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale4.getUnicodeLocaleType("n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test13226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13226");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Italian (Italy)", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13227");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIAN", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Germa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test13229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0029", "         ITALIAN_italian_eNGLISH", 16);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13230");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder8 = builder5.setExtension('i', "");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setLanguage("chinesisch(China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinesisch(China) [at index 0]");
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
    public void test13231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13231");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                     \\u005c         ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "99999\\u0021");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("2italianitalianitalianitali", "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13235");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setExtension('8', "HHHHHHHHH         ITAL\\u0020iItalian\\...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 8 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test13236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13236");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("           e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13237");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13238");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale1.getLanguage();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale.Builder builder11 = builder8.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder8.setLanguage("und");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = builder13.build();
        java.util.Locale locale16 = builder13.build();
        java.lang.String str17 = locale1.getDisplayName(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
    }

    @Test
    public void test13239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!       ", "", (int) 'F');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0066");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0066" + "'", str1, "\\U0066");
    }

    @Test
    public void test13242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Franzosisch (Frankreich)", "                                                  it44444444444444444en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franzosisch (Frankreich)" + "'", str2, "Franzosisch (Frankreich)");
    }

    @Test
    public void test13243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13243");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ian\\u0020i", "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ko-KR                                                                                                   ", "ete");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ko-KR                                                                                                   " + "'", str2, "ko-KR                                                                                                   ");
    }

    @Test
    public void test13245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13245");
        java.util.Locale locale3 = new java.util.Locale("italian", "", "italian    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italian (italian,english)", "E");
        boolean boolean7 = locale3.equals((java.lang.Object) strArray6);
        org.junit.Assert.assertEquals(locale3.toString(), "italian__italian    ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("FR-", "\\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c" + "'", str2, "\\u005c");
    }

    @Test
    public void test13247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        java.util.Locale.Builder builder7 = builder3.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test13248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13248");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                       K");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13250");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       DE_DE            ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test13251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13251");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                           U0020ITALIANITALIANITALIANITALI", "en_CA...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13252");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0066", "iiiiiiiiiiiFrankreich", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13253");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'U');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'U' + "'", char1 == 'U');
    }

    @Test
    public void test13254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("tanoch", "iFtlnz\\sisc02");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...", "FRANZOSISCH(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC..." + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC...");
    }

    @Test
    public void test13256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("tTAT_ITA", 499);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tTAT_ITA" + "'", str2, "tTAT_ITA");
    }

    @Test
    public void test13257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "hi!       _\\U0020_Italienisch####################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13258");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("JP", (double) 221);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=221.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13259");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("             DE_DE             ", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh", "deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test13261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13261");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\xtalxan_ITALIAN_Englxsh", "4444444fra                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "DEU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13264");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = locale14.getExtension('\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englisch" + "'", str15, "Englisch");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH" + "'", str16, "!IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNN" + "'", str2, "NNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test13266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13266");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('N');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character N is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13267");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...It...", "ian\\u0020", 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13268");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITALIAN_EgAish");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", 'u');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 11 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test13269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13269");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                       k", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                       k");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("FRZ\326CZ(FRKREC)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRZ\326CZ(FRKREC)" + "'", str1, "FRZ\326CZ(FRKREC)");
    }

    @Test
    public void test13271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13271");
        java.util.Locale locale3 = new java.util.Locale("                                        ITtaIt_italian_eGaISH                                 \\U006", "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", "fra");
        org.junit.Assert.assertEquals(locale3.toString(), "                                        ittait_italian_egaish                                 \\u006_HHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIHHCSINEILATIH_fra");
    }

    @Test
    public void test13272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ixii", "                                        itTAiT_ITALIAN_EgAish                                 \\u0068", (int) '\\');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                  iTALIE                                           ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test13273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                         \\u0046                                                         ", (int) '8', "ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         \\u0046                                                         " + "'", str3, "                                                         \\u0046                                                         ");
    }

    @Test
    public void test13275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ENGLISCH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str2, "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test13277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hcstued-e#__nailati", "FranzosischFranz\366sisch (Kanada)(Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13278");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                      ", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13279");
        java.util.Locale locale3 = new java.util.Locale("\\u007a", "...ANiTALI", "2cinese (Cina...");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u007a_...ANITALI_2cinese (Cina...");
    }

    @Test
    public void test13280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13280");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                          \\u0046");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test13281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13281");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Italie", 224, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test13283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\351encor\351encor\351encor\351");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\351encor\351encor\351encor" + "'", str1, "\351encor\351encor\351encor");
    }

    @Test
    public void test13284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0020italianitalianitalianitali");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13285");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap27);
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = locale29.getVariant();
        java.lang.String str32 = locale29.getDisplayName();
        java.lang.String str33 = locale29.getCountry();
        java.util.Set<java.lang.String> strSet34 = locale29.getUnicodeLocaleKeys();
        java.lang.String str35 = java.util.Locale.lookupTag(languageRangeList28, (java.util.Collection<java.lang.String>) strSet34);
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
        java.util.Locale locale53 = java.util.Locale.lookup(languageRangeList28, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList52);
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleKeys();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "...ANiTALI");
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet56);
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
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Italienisch" + "'", str32, "Italienisch");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
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
        org.junit.Assert.assertNull(locale53);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(strList59);
    }

    @Test
    public void test13286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               INGLESE                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13287");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("fr_FR", "\\u0078");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13288");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\uc601\uc5b4", 29, (int) 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13289");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00000000000000cor\351en (Cor\351e du Sud)", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000cor\351en (Cor\351e du Sud)" + "'", str3, "00000000000000cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test13290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", (int) '8');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str2, "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test13291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test13292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("cinese (cina)\\u0069h..", "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (cina)\\u0069h.." + "'", str2, "cinese (cina)\\u0069h..");
    }

    @Test
    public void test13293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                  \\u005c                                                         ", "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("FRANZ\326SISCH(FRANKREICH)", "x-lvariant-ZH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("nglish (United Kingdom)", 997, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!nglish (United Kingdom)!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!" + "'", str3, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!nglish (United Kingdom)!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!");
    }

    @Test
    public void test13296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13296");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setVariant("0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE [at index 0]");
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test13297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13297");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                                                                                                                                                      englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061) [at index 0]");
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
    }

    @Test
    public void test13298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("neilatI    E", 'a', 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "neilRtI    E" + "'", str3, "neilRtI    E");
    }

    @Test
    public void test13299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "fr-C                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13300");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                     \\u005c         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hcstued" + "'", str1, "hcstued");
    }

    @Test
    public void test13303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian (ITALIAN,English)" + "'", str1, "italian (ITALIAN,English)");
    }

    @Test
    public void test13304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13304");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setUnicodeLocaleKeyword("4300U\\                                             DUTSCH                                            ", "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 4300U\\                                             DUTSCH                                             [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test13305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13305");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Koreanisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13306");
        java.util.Locale locale2 = new java.util.Locale("Hhhhhhhhhh", "");
        org.junit.Assert.assertEquals(locale2.toString(), "hhhhhhhhhh");
    }

    @Test
    public void test13307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", 'D');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)" + "'", str2, "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
    }

    @Test
    public void test13308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "inglese (Canada)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test13310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CHINESE", "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                               e", ')', 'R');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               e" + "'", str3, "                               e");
    }

    @Test
    public void test13312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13312");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FR", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test13313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13313");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB", "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13314");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG", "\\u0074");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13315");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!", 46, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
    }

    @Test
    public void test13317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13317");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.util.Locale.setDefault(category0, locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale8.getUnicodeLocaleType("         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:          italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test13318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13318");
        java.util.Locale locale2 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "\\u006e");
        org.junit.Assert.assertEquals(locale2.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r_\\U006E");
    }

    @Test
    public void test13319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13319");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0068", "H", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("Chinese (Taiwan)", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("EFrankreichgFrankreichFrankreichs", "WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "HCSTUED");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test13321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13321");
        java.util.Locale locale2 = new java.util.Locale("\\u0038", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0038_FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "   h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   h" + "'", str1, "   h");
    }

    @Test
    public void test13323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13323");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 309 + "'", int1 == 309);
    }

    @Test
    public void test13324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("anglais (Canada)CHINESE", 0, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais (Canada)CHINESE" + "'", str3, "anglais (Canada)CHINESE");
    }

    @Test
    public void test13325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("eagaash", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13326");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale5.getScript();
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getCountry();
        java.util.Locale.setDefault(locale5);
        boolean boolean10 = locale3.equals((java.lang.Object) locale5);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "US" + "'", str8, "US");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test13327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13327");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "English", (java.lang.CharSequence) "FRANZ\326SISCH\n(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "English" + "'", charSequence2, "English");
    }

    @Test
    public void test13328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI", "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "en_US                ita                ", 62);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "...\r\r\r\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str2, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test13331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\\', 0, (int) 'D');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test13334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...! \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\                      ", "ITALIENISC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Koreanisch", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!_\\U0020_Itle", 309);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_Itle" + "'", str2, "!_\\U0020_Itle");
    }

    @Test
    public void test13337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13337");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'R');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character R is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English (Canada)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (Canada)" + "'", str3, "English (Canada)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test13339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U0020IiTALIAN\\U0020I                                                 ", "ITALIEN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13340");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              4444ALLEMAND                              4444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13341");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test13342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13342");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("zh_TW", "a700u\\  ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13343");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "8600u\\", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0078", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "United Kingdom", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IAN\\U0020I", charArray11);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test13344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13344");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale10 = new java.util.Locale("i\\u0020iTALIANiTALIANiTALIANiTALIit", "Hhhhhhhhhh");
        java.lang.String str11 = locale4.getDisplayName(locale10);
        java.lang.Object obj12 = locale10.clone();
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
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "i\\u0020italianitalianitalianitaliit_HHHHHHHHHH");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "i\\u0020italianitalianitalianitaliit_HHHHHHHHHH");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "i\\u0020italianitalianitalianitaliit_HHHHHHHHHH");
    }

    @Test
    public void test13345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "IT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13346");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("!ih                            dalleman", ')');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '!' + "'", char2 == '!');
    }

    @Test
    public void test13347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13347");
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
        java.lang.String str18 = locale13.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (United States)" + "'", str18, "English (United States)");
    }

    @Test
    public void test13348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13348");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('e', (int) 'T');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test13349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("n", 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                     fran\347ais (france)                                       (CHINESE (CHINA)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais(france)(CHINESE(CHINA)" + "'", str2, "fran\347ais(france)(CHINESE(CHINA)");
    }

    @Test
    public void test13351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           \\            " + "'", str2, "           \\            ");
    }

    @Test
    public void test13352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("inglesehhhhhhhhh", 804, "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en" + "'", str3, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
    }

    @Test
    public void test13353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!_\\U0020_Itle", "                                                  IT44444444444444444EN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!_\\U0020_Itle" + "'", str2, "!_\\U0020_Itle");
    }

    @Test
    public void test13354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13354");
        java.util.Locale locale3 = new java.util.Locale("\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale5.getExtension('z');
        java.lang.String str8 = locale3.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG" + "'", str8, "ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
    }

    @Test
    public void test13355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'f', "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test13356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn (can)" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn (can)");
    }

    @Test
    public void test13357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Egsh", "Italia                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Egsh" + "'", str2, "Egsh");
    }

    @Test
    public void test13358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("8ian\\u0020i86", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8ian\\u0020i86" + "'", str2, "8ian\\u0020i86");
    }

    @Test
    public void test13361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13361");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                         \\     ", "ita");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13362");
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
        java.lang.String str15 = locale2.getDisplayScript();
        java.lang.String str16 = locale2.getCountry();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        java.util.Locale locale25 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str26 = locale17.getDisplayCountry(locale25);
        java.util.Locale.setDefault(locale17);
        java.util.Locale locale28 = locale17.stripExtensions();
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.lang.String str30 = locale2.getDisplayScript(locale28);
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayVariant();
        java.lang.String str33 = locale31.getCountry();
        java.lang.String str34 = locale2.getDisplayLanguage(locale31);
        java.lang.String str35 = locale31.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GB" + "'", str16, "GB");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "France" + "'", str26, "France");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test13363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("United Kingdom", "canad");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13364");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("gERMAN (gERMANY)", 85, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", str2, "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test13366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13366");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.removeUnicodeLocaleAttribute("\351encor\351encor\351encor\351");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: e?encore?encore?encore? [at index 0]");
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
    }

    @Test
    public void test13367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13367");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '2', '!');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test13368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("italy", "\\u000d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CHN", 221, 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt" + "'", str3, "CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");
    }

    @Test
    public void test13370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13370");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ITALIAN                                                                 ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13371");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!IH");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("Koreanisch", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test13372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                   U0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   U0020" + "'", str1, "                                                                                                   U0020");
    }

    @Test
    public void test13373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ZHO                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13375");
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
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.lang.String str16 = locale15.getISO3Country();
        java.lang.String str17 = locale15.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.lang.Object obj20 = locale19.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test13376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13376");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) 'x', (int) (byte) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00", 23, 21);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray1);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "A");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW" + "'", str14, "DEFGILMNOQRSTUWXZBBBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCCCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLLBLCLILKLRLSLTLULVLYMMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNNCNENFNGNINLNONPNRNUNZOMPPEPFPGPHPKPLPMPNPRPSPTPWPYQRERORSRURWSSBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUUGUMUSUYUZVVCVEVGVIVNVUWFWSYEYTZZMZW");
    }

    @Test
    public void test13377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("de                                                                                                                      ", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", 117);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0020hi!       _\\U0020_Italienisch################anihc", 34, ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020hi!       _\\U0020_Italienisch################anihc" + "'", str3, "\\u0020hi!       _\\U0020_Italienisch################anihc");
    }

    @Test
    public void test13379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                     German (Germany)", 46, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13380");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 'Y');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test13381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13381");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test13382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13382");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ECANADAgCANADACANADAsh", 6, (int) 'e');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ilatinailatinailatinailati0200u\\", (int) 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ilatinailatinailatinailati0200u\\" + "'", str2, "ilatinailatinailatinailati0200u\\");
    }

    @Test
    public void test13384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13384");
        java.util.Locale locale1 = new java.util.Locale("tttttt\\u0049");
        org.junit.Assert.assertEquals(locale1.toString(), "tttttt\\u0049");
    }

    @Test
    public void test13385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("DEUTSCH", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DEUTSCH" + "'", str2, "DEUTSCH");
    }

    @Test
    public void test13386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test13387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13388");
        java.util.Locale locale2 = new java.util.Locale("franz\366sisch(frankreich)", "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals(locale2.toString(), "franz\366sisch(frankreich)_DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test13389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13389");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                             hcstueD                                             ", "TTAT_ITA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13390");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('D');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13391");
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
        java.util.Locale locale11 = new java.util.Locale("it");
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale locale13 = builder12.build();
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        java.lang.String str18 = locale14.getDisplayCountry();
        java.lang.String str19 = locale14.getScript();
        java.lang.String str20 = locale14.getScript();
        java.util.Locale locale21 = java.util.Locale.FRENCH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale21.getDisplayVariant(locale22);
        java.lang.String str25 = locale21.getDisplayCountry();
        java.lang.String str26 = locale21.getScript();
        java.lang.String str27 = locale21.getScript();
        java.lang.String str28 = locale14.getDisplayCountry(locale21);
        java.lang.String str29 = locale13.getDisplayVariant(locale21);
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.lang.String str32 = locale31.getDisplayLanguage();
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale31);
        java.lang.String str34 = locale31.getCountry();
        java.lang.String str35 = locale31.getCountry();
        java.lang.String str36 = locale21.getDisplayCountry(locale31);
        java.util.Locale locale40 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale41 = locale40.stripExtensions();
        java.lang.String str42 = locale31.getDisplayCountry(locale41);
        java.lang.String str43 = locale11.getDisplayScript(locale41);
        java.lang.String str44 = locale11.getDisplayName();
        java.util.Locale.Builder builder45 = builder9.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder47 = builder9.setRegion("Deutsc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Deutsc [at index 0]");
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
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "!IH" + "'", str33, "!IH");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals(locale40.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Italian" + "'", str44, "Italian");
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test13392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13392");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayName();
        java.util.Locale.setDefault(locale0);
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_CN" + "'", str4, "zh_CN");
    }

    @Test
    public void test13393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("TALIAN_italian_eNGLISH         ITAL", ".Korean (South Korea)Korean (So");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test13394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13394");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\atalaaa_ITALIAN_Eaglaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test13395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13395");
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
        java.lang.Object obj23 = locale11.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "ko_KR");
    }

    @Test
    public void test13396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13396");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray0);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'H', (int) (byte) 100, (int) '\\');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'E', (int) '\n', (int) '\ud504');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 250");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   cor\351en    ", 23, 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bbbbbbbbbb   cor\351en    " + "'", str3, "bbbbbbbbbb   cor\351en    ");
    }

    @Test
    public void test13399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0030", 'F');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0030" + "'", str2, "\\u0030");
    }

    @Test
    public void test13400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13400");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '0');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0030" + "'", str1, "\\u0030");
    }

    @Test
    public void test13401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13401");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "                                                                 CANADA", 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("France", "\\u005");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "8600U\\                                                                                                                  ", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("zhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", "NAC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz" + "'", str2, "zhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
    }

    @Test
    public void test13406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ITALIANITALIANITALIANITALI", 0, 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIANITALIANITALIANITALI" + "'", str3, "ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test13407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", (int) 't', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test13408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "d8                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13409");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                                      ITALIAN (italian,eNGLISH)                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    ZH_CN    ", 57, '!');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!    ZH_CN    !!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!    ZH_CN    !!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test13411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4300U\\                                             DUTSCH                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("fran\347ais(france)(CHINESE(CHINA)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frn\347is(frnce)(CHINESE(CHINA)" + "'", str2, "frn\347is(frnce)(CHINESE(CHINA)");
    }

    @Test
    public void test13413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI", "                                                    ", (int) 'u');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str5, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test13414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("fran\347ais (Canada)", "\uc911\uad6d\uc5b4\uc911\uad6d)", "R0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test13415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "2aiTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIAN\\U0020IH", (int) 'D', "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test13417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13417");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("             \\u0049             ", "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13418");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 'N');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13419");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG", "cor\351en (Cor\351e du Sud)", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13420");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("italian (ITALIAN,English)", "italien", 24);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fran\347ais (France)", "hi!        (\\U0020,Italienisch#########################################################################################nnn");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'N', 101, (int) 'F');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                      Englisch                                                       ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!", 13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", 804);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("8600u\\                                                                                                                  ", "Aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) 'R');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test13424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ckclcmcncocrcucvcwcxcyczdedh...ibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcialamanaoaqarasatauawaxazbabbbdbebfbgbhbiadaeafaga", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u0034                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13426");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('f', 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test13427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444ALLEMAND4444", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AND4444" + "'", str2, "AND4444");
    }

    @Test
    public void test13428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", "                                      )hsilgne,nailati( ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13429");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("inglesehhhhhhhhH", "ITTAIT_ITALIAN_EGAISH          ", (int) 'x', 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          " + "'", str4, "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
    }

    @Test
    public void test13430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", (int) 'E', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital" + "'", str3, "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
    }

    @Test
    public void test13431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13431");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.getScript();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getCountry();
        java.util.Locale.setDefault(locale2);
        java.lang.String str7 = locale0.getDisplayVariant(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US" + "'", str5, "US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       !ih", (int) 'R', 'T');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih" + "'", str3, "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih");
    }

    @Test
    public void test13433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13433");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'N', 'N');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'N' + "'", char2 == 'N');
    }

    @Test
    public void test13434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44\\u002344", "444444444it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444italian44444444444444", "CCCCCCC           \\uCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444italian44444444444444" + "'", str2, "44444444444444italian44444444444444");
    }

    @Test
    public void test13436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", (int) 'f', '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh" + "'", str3, "E             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh");
    }

    @Test
    public void test13437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13438");
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
        java.lang.String str14 = locale12.getDisplayScript();
        java.util.Locale locale18 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str19 = locale12.getDisplayCountry(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.lang.String str21 = locale18.getDisplayScript();
        java.lang.String str22 = locale18.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
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
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "United States" + "'", str19, "United States");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HHHHHHHHH" + "'", str20, "HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str22, "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test13439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setExtension('9', "  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 9 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test13440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA", (int) '5', '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA" + "'", str3, "CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA");
    }

    @Test
    public void test13442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13442");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('2');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test13443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13443");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        java.util.Locale locale7 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setRegion("ITALIANITALIANITALIANITALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ITALIANITALIANITALIANITALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test13444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13444");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("Eagaas");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'E' + "'", char1 == 'E');
    }

    @Test
    public void test13445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13445");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.setVariant("itTAiT_ITALIAN_EgAish");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("Eagaash");
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder9.setRegion("\\u0023 (ITALIENISCH,iTALIAN)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\u0023 (ITALIENISCH,iTALIAN) [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test13446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC", "Franz\366sisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("              TA...", "cHN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              TA..." + "'", str2, "              TA...");
    }

    @Test
    public void test13448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("DE", 'D', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aE" + "'", str3, "aE");
    }

    @Test
    public void test13449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "FR...", "                                                                            fr_FR                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "hi!        (\\U0020,Italienisch#########################################################################################nnn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "italiaE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "iFtlnz\\sisc02");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###################################i####################################", "8600U\\                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################i####################################" + "'", str2, "###################################i####################################");
    }

    @Test
    public void test13454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("france", 53, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444france444444444444444444444444" + "'", str3, "44444444444444444444444france444444444444444444444444");
    }

    @Test
    public void test13455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13455");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        boolean boolean7 = locale5.hasExtensions();
        java.lang.String str8 = locale5.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale14 = locale9.stripExtensions();
        java.lang.String str15 = locale14.getISO3Country();
        boolean boolean16 = locale14.hasExtensions();
        java.lang.String str17 = locale14.getLanguage();
        java.lang.String str18 = locale5.getDisplayLanguage(locale14);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FRA" + "'", str15, "FRA");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais" + "'", str18, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fr_FR" + "'", str19, "fr_FR");
    }

    @Test
    public void test13456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("         ", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test13457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13457");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("french (NC_HZ)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13458");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray10 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strList11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap14);
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.getDefault(category16);
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.util.Locale.setDefault(category16, locale19);
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strSet22);
        boolean boolean24 = locale0.equals((java.lang.Object) strList23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertTrue("'" + category16 + "' != '" + java.util.Locale.Category.FORMAT + "'", category16.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "allemand" + "'", str20, "allemand");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test13459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13459");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0020I...", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13460");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                       K", "44444444444444444444444444444444!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       K" + "'", str2, "                                       K");
    }

    @Test
    public void test13462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud" + "'", str2, "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhACor\351e du Sud");
    }

    @Test
    public void test13463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13463");
        java.util.Locale locale3 = new java.util.Locale("Italie                         ", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: FRANZO?SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "italie                         __aaaaaaaaaaaaaaaaaaaaaaaaaaILaaaaaaaaaaaaaaaaaaaaaaaaaaIL");
    }

    @Test
    public void test13464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "France");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13465");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CHINA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13466");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('f', "tTAT_ITA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.addUnicodeLocaleAttribute("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: FRANZO?SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("9", "Cinese (cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cinese (cina)\\u0069h..." + "'", str2, "Cinese (cina)\\u0069h...");
    }

    @Test
    public void test13468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13468");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!(\\U0020,Italienisch############################################hi!       ", 309, 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "en_C");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iTALIAN                                                                ALLEMAND");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("00000000000000coreen (Coree du Sud)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000coreen (coree du sud)" + "'", str1, "00000000000000coreen (coree du sud)");
    }

    @Test
    public void test13472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13472");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("French (Canada)", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("ko", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\uc601\uc5b4");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str6, "\\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0020iTALIANiTALIANiTALIANiTALI" + "'", str9, "\\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test13473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13473");
        char[] charArray7 = new char[] { 'f', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "d", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13474");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "gERMAN (gERMANY", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13475");
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
        java.lang.String str20 = locale6.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.lang.String str22 = locale21.getISO3Country();
        java.lang.String str23 = locale21.getDisplayVariant();
        java.lang.String str24 = locale21.getDisplayVariant();
        java.lang.String str25 = locale6.getDisplayName(locale21);
        org.junit.Assert.assertEquals(locale1.toString(), "n44444444444444alia44444444444444it");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (Canada)" + "'", str18, "fran\347ais (Canada)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CAN" + "'", str20, "CAN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French (Canada)" + "'", str25, "French (Canada)");
    }

    @Test
    public void test13476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("TTAT_ITA", "\\u0068");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0034\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("FRANZ\326SISCH(FRANKREICH)", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCH(FRANKREICH)" + "'", str2, "FRANZ\326SISCH(FRANKREICH)");
    }

    @Test
    public void test13479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13479");
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
        java.util.Locale.Builder builder18 = builder15.setExtension('N', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder15.setExtension('c', "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italian" + "'", str8, "Italian");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test13480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\0020ItalianItalianItalianItal", "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0020ItalianItalianItalianItal" + "'", str2, "\\0020ItalianItalianItalianItal");
    }

    @Test
    public void test13481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test13482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("eAGAASH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setLanguage("                                             hcsfr-CueD                                             ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                              hcsfr-CueD                                              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test13483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13484");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder13.setUnicodeLocaleKeyword("canada", "EnglischEnglischEnglisc(italian,english)EnglischEnglischEnglisc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: canada [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test13485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test13486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13486");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", (double) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=20.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13487");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getDisplayName();
        java.lang.Object obj11 = locale8.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str10, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!       _\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test13488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13488");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "Frnz\366sisch (Knd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE" + "'", str2, "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
    }

    @Test
    public void test13490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz", "....................................................................................... (italian,english)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz" + "'", str2, "ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
    }

    @Test
    public void test13491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str1, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test13492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("RA", "                                                 Frnz\366sisch(Knd                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RA" + "'", str2, "RA");
    }

    @Test
    public void test13493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13493");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hcstueD", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0052");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0052" + "'", str1, "\\u0052");
    }

    @Test
    public void test13495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13496");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str4 = locale1.getExtension('C');
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13497");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 'H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test13498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13498");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                         \\u005c         ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u005c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\", 'T', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test13500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali" + "'", str1, "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
    }
}
