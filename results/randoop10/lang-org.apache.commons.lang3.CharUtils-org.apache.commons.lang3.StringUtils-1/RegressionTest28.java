import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("frankreich", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         a005c         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("TTAT_ITA", "ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TTAT_ITA" + "'", str2, "TTAT_ITA");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u004", "         R", (int) 'H');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("zzzItalian (Italy)", "R", "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zzzItalian (Italy)" + "'", str3, "zzzItalian (Italy)");
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale9.getDisplayVariant(locale10);
        java.lang.String str15 = locale7.getDisplayLanguage(locale10);
        java.lang.String str16 = locale4.getDisplayName(locale7);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale17.getDisplayVariant();
        java.util.Set<java.lang.String> strSet21 = locale17.getUnicodeLocaleKeys();
        java.lang.String str22 = locale7.getDisplayVariant(locale17);
        java.lang.String str23 = locale17.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Franz\366sisch" + "'", str15, "Franz\366sisch");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais (France)" + "'", str16, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "italien" + "'", str18, "italien");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "it" + "'", str23, "it");
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("     e                               e                               e            ", "HI!       _\\u0020_iTALIENISCH####################################################################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setScript("                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                                                        [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             hcstued                                             ", "hI!", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("fRANZ\326SISCH (kANADA)", "Engl", (int) 'R');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("EFrankreichgFrankreichFrankreichsh", "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFrankreichgFrankreichFrankreichsh" + "'", str2, "EFrankreichgFrankreichFrankreichsh");
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0020", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("deutsch", strArray5, strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'e', 32, 18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "deutsch" + "'", str13, "deutsch");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", "##############", "ITALIAN4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!_\\U0020_itle########################################################################################", "en-CA", (int) 'e');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("italian (italian,eng", (int) '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian (italian,eng" + "'", str2, "italian (italian,eng");
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("zho", "0034\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", "BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444" + "'", str2, "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Francia", "         INGLESE        ", 220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\u30ab\u30ca\u30c0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("cinese (Cina)\\u0069h...", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2iT hi!       _\\U0020_Italienisch####################################################################            2i", "", 151);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("00000000000000cor\351en (Cor\351e du Sud)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 00000000000000core?en (Core?e du Sud) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("royaume-uni ", "tedesco");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\ud504");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061" + "'", str3, "\\u0061");
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", (java.lang.CharSequence) "                                                                                                   U0020");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic" + "'", charSequence2, "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("RA", "                               INGLESE                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u0038");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038" + "'", str1, "\\u0038");
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            " + "'", str1, "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ");
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("                        ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        java.util.Locale locale3 = new java.util.Locale("                                                                                               en", "\ud504\ub791\uc2a4\uc5b4", "A");
        java.lang.String str4 = locale3.getVariant();
        java.lang.String str5 = locale3.toLanguageTag();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ud504\ub791\uc2a4\uc5b4_A");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-lvariant-A" + "'", str5, "x-lvariant-A");
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   cor\351en    ", "                                      )HSILGNE,NAILATI( ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0069hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0069hhhhhhhhhh" + "'", str1, "\\u0069hhhhhhhhhh");
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str2, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Italia                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italia" + "'", str1, "Italia");
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("china", "                                                                                         fr-", 40);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\\0020iTALIANiTALIANiTALIANiTAL", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0020iTALIANiTALIANiTALIANiTAL" + "'", str8, "\\0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", (java.lang.CharSequence) "englisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
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
        java.lang.String str12 = locale8.getDisplayLanguage();
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
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "chinois" + "'", str12, "chinois");
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("u", "\\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u" + "'", str2, "u");
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '2');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0032" + "'", str1, "\\u0032");
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.lang.String str8 = locale5.getScript();
        java.util.Set<java.lang.String> strSet9 = locale5.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet10 = locale5.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("tit", "Frnz\366sisch(Knd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tit" + "'", str2, "tit");
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", "Und-iTALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL" + "'", str2, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("eng", "\\u0048");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0048" + "'", str2, "\\u0048");
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
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
        java.util.Locale locale14 = builder0.build();
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
        org.junit.Assert.assertEquals(locale14.toString(), "english");
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                       K", "", (int) 'R');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str4, "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("NC_HZ", "                                            HCSTUD                                             \\U0034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_HZ" + "'", str2, "NC_HZ");
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("_\\u0020_italienisch####################################################################...", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_\\u0020_italienisch####################################################################..." + "'", str2, "_\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH", "IAN_Englishallem");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "It_I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\\U0064", (int) 'n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064" + "'", str2, "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("KKKKKKKKKKKKKKKKKKKK)DNK( HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK" + "'", str1, "KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK");
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("englisch", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch" + "'", str2, "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("frnz\366sisch(Knd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRNZ\326SISCH(KND)" + "'", str1, "FRNZ\326SISCH(KND)");
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061", "IT_IT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("CA", "(italian,english)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("TALIAN\\u002", "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TALIAN\\u002" + "'", str2, "TALIAN\\u002");
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", (double) 'f');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=102.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("und-KO", 95, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("                                        ITtaIt_italian_eGaISH                                 \\U006");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                         ITtaIt_italian_eGaISH                                 \\U006 [at index 0]");
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
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("frn\347is(frnce)(CHINESE(CHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frn\347is(frnce)(CHINESE(CHINA)" + "'", str1, "frn\347is(frnce)(CHINESE(CHINA)");
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\\', 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                              4444ALLEMAND                              4444", "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str2, "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("fRANZ\326SISC", "ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rcHINESISCH (cHINA)" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rcHINESISCH (cHINA)");
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("2E             giTALIANiTALIANi", "anihc!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23", "hi!        (\\U0020,Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale4.getISO3Language();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.lang.String str10 = locale2.getDisplayCountry(locale4);
        java.lang.String str11 = locale4.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       " + "'", str3, "hi!       ");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "it" + "'", str7, "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ita" + "'", str8, "ita");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Canada" + "'", str10, "Canada");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        java.util.Locale locale3 = new java.util.Locale("ChineseEN_CA(China)", "iFranzosisch ", "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
        org.junit.Assert.assertEquals(locale3.toString(), "chineseen_ca(china)_IFRANZOSISCH _\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\                                               nailati                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        java.util.Locale locale2 = new java.util.Locale("Engl", "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
        org.junit.Assert.assertEquals(locale2.toString(), "engl_        ESELGNI         D00U\\00U\\ED00U\\00U\\ED00U\\");
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("X", "\\u0054");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale3.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("cHN", "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cHN" + "'", str2, "cHN");
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("itTAiT_ITALIAN_EgAish", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "itTAiT_ITALIAN_EgAish" + "'", str2, "itTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "englischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglischenglisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "IT                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "Chinese (China)                                                                                                           ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("italienisch", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talienisch" + "'", str2, "talienisch");
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale3);
        java.lang.String str5 = locale3.getVariant();
        java.lang.String str6 = locale1.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getVariant();
        java.lang.String str8 = locale3.getISO3Country();
        java.util.Locale locale11 = new java.util.Locale("zhAzhzhzhzhzhzhzhzhzhzh", "und-CA");
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        java.lang.String str13 = locale11.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zhazhzhzhzhzhzhzhzhzhzh" + "'", str13, "zhazhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                       \\u0020                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("anglais (royaume-uni)FRA", "United State                                                                                     ", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) " hi!       _\\U0020_Italienisch####################################################################           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("italieital", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u0061\\u0061" + "'", str1, "\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0034\\u00                                             hcstueD                                             \\u0034\\u00", "DE_DE", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = locale4.getCountry();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder3.removeUnicodeLocaleAttribute("italy");
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder8.setExtension('k', "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ?????????????????????????????????????????????????????????????????????????????????????????????????fra [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0020italianitalianitalianitali");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
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
        java.util.Locale locale12 = builder10.build();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        java.lang.String str17 = locale13.getDisplayCountry();
        java.lang.String str18 = locale13.getScript();
        java.lang.String str19 = locale13.getScript();
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.lang.String str24 = locale20.getDisplayCountry();
        java.lang.String str25 = locale20.getScript();
        java.lang.String str26 = locale20.getScript();
        java.lang.String str27 = locale13.getDisplayCountry(locale20);
        java.lang.String str28 = locale20.getDisplayCountry();
        java.lang.String str29 = locale20.getLanguage();
        java.util.Set<java.lang.String> strSet30 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale12.getDisplayLanguage(locale20);
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "fr" + "'", str29, "fr");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("", 'B');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'B' + "'", char2 == 'B');
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("d8                                                                                                                      ", "                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d8                                                                                                                      " + "'", str2, "d8                                                                                                                      ");
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
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
        java.lang.Class<?> wildcardClass29 = languageRangeList1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\ud504\ub791\uc2a4hi!(\\u0020,italienisch#########################################################################################)", "00000000000000cor\351en (Cor\351e du Sud)", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                         fr-", "                                              \\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         fr-" + "'", str2, "                                                                                         fr-");
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("eagaash", 328, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "french (NC_HZ)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("             ", (java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "CANADA");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tedesco", "fran\347ais (Canada)");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'n');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", strArray6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "E             g                          sh" + "'", str7, "E             g                          sh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ECANADAgCANADACANADAsh" + "'", str9, "ECANADAgCANADACANADAsh");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "tenenco" + "'", str14, "tenenco");
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "     Eng");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u0038zho                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038zho                         " + "'", str1, "\\u0038zho                         ");
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iFtlnz\\sisc02rankreich)00      ", "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iFtlnz\\sisc02rankreich)00      " + "'", str2, "iFtlnz\\sisc02rankreich)00      ");
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0061");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        java.util.Locale locale3 = new java.util.Locale("                                                                                                      ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "                                                                                                      _\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", "4300U\\                                             DUTSCH                                            ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder16.removeUnicodeLocaleAttribute("###################################i#######...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ###################################i#######... [at index 0]");
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
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(" ...", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '\r');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaFranzosisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str11, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("         HITALIANH_HitalianH_HeHNGLISH", "                                                       HI!                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str12 = locale9.getDisplayLanguage(locale11);
        java.lang.String str13 = locale6.getDisplayLanguage(locale9);
        java.lang.String str14 = locale6.getDisplayVariant();
        java.lang.String str15 = locale0.getDisplayVariant(locale6);
        java.lang.String str16 = locale6.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'A', 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" hi!       _\\U0020_Italienisch####################################################################            ", 0, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!       _\\U0020..." + "'", str3, " hi!       _\\U0020...");
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-GB", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhHFranz\366sisch", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)", "r-FR", 14);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("inglese...........................................................................................................................................................................................................................................................................................................................................................................", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "  \\u005   ", (java.lang.CharSequence) "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str2, "nnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian    italian", "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinesisch (China", "hi!       ", (int) 'H');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "Italienisch#########################################################################################");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A", strArray4, strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("gERMAN (gERMANY)", strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "itTAiT_ITALIAN_EgAish                                                                                ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinesisch (China" + "'", str10, "Chinesisch (China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinesisch (China" + "'", str15, "Chinesisch (China");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinesisch (China" + "'", str16, "Chinesisch (China");
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        java.util.Locale locale1 = new java.util.Locale("\\u005c");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale.Builder builder9 = builder3.setLanguage("eng");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str15 = locale12.getDisplayLanguage(locale14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.upperCase("", locale14);
        java.lang.String str17 = locale14.getScript();
        java.util.Locale.Builder builder18 = builder9.setLocale(locale14);
        java.util.Set<java.lang.String> strSet19 = locale14.getUnicodeLocaleKeys();
        java.lang.String str20 = locale1.getDisplayScript(locale14);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Franz\366sisch (Kanada)" + "'", str5, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", (java.lang.CharSequence) "###################################i####################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" + "'", charSequence2, "44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "E             g                                                                                     ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray6, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "italian (ITALIAN,English)");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("fr_CA", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                     ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH\\\\\\\\\\\\\\", strArray14, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", strArray14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str11, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str13, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!IH!IH\\\\\\\\\\\\\\" + "'", str18, "!IH!IH\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Chinese (China)                                                                                                           ", "\\u0065                             ", 0, (int) '\r');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0065                             a)                                                                                                           " + "'", str4, "\\u0065                             a)                                                                                                           ");
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CINESE (CINA)\\U0069H...", "Chinesisch (China", "                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CHINA", "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CHINA" + "'", str2, "CHINA");
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.util.Locale locale15 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str16 = locale7.getDisplayCountry(locale15);
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale18 = locale7.stripExtensions();
        java.lang.String str19 = locale7.getDisplayName();
        java.util.Set<java.lang.String> strSet20 = locale7.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale.Builder builder22 = builder5.setLocale(locale7);
        java.lang.String str23 = locale7.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "France" + "'", str16, "France");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "fran\347ais (France)" + "'", str19, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "fran\347ais" + "'", str23, "fran\347ais");
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("z...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "z..." + "'", str1, "z...");
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder0.setExtension('f', "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: \\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("cinese (cina)\\u0069h...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00000000000000cor\351en (Cor\351e du Sud)", "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000cor\351en (Cor\351e du Sud)" + "'", str2, "00000000000000cor\351en (Cor\351e du Sud)");
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setScript("\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ????????????????????????????????????????????????????????????????????????????????????????????????????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("France");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("inglese", locale2);
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.lang.String str5 = locale2.getDisplayScript();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "france");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESE" + "'", str3, "INGLESE");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str2, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                      ", (java.lang.CharSequence) "0023dallemandallemandallemandallemandallemandallemandallemandalle");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                      " + "'", charSequence2, "                                                                      ");
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("franz\366sisch(frankreich)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...cccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoan...", (java.lang.CharSequence) "        FRA         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u0043");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0043" + "'", str1, "\\u0043");
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u00de\\u00\\u\\u00de\\u00\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                               ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setUnicodeLocaleKeyword("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale.Builder builder9 = builder5.setLocale(locale7);
        java.util.Locale locale14 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.util.Locale locale17 = locale14.stripExtensions();
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("Italien", locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder5.setLocale(locale17);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0023 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "iTALIAN" + "'", str15, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ITALIENISCH" + "'", str16, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ITALIEN" + "'", str18, "ITALIEN");
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005", "", (int) '\\');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'A');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u005" + "'", str5, "\\u005");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisc", 267, 537);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("z...", "IAN_Englishallem");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("cinese (cina)\\u0069h..", "FRENCH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cinese (cina)\\u0069h.." + "'", str2, "cinese (cina)\\u0069h..");
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA" + "'", str2, "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale7.getDisplayName(locale13);
        java.lang.String str16 = locale7.getScript();
        java.util.Locale.setDefault(category5, locale7);
        java.util.Locale locale18 = java.util.Locale.getDefault(category5);
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale19.getDisplayCountry(locale21);
        java.util.Set<java.lang.String> strSet24 = locale21.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale18.getDisplayLanguage(locale21);
        java.util.Locale.Builder builder26 = builder3.setLocale(locale21);
        java.util.Locale locale30 = new java.util.Locale("\\u0075", "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder26.setLocale(locale30);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0075 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FRA" + "'", str12, "FRA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str15, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French" + "'", str25, "French");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0075_AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW_ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'Y');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character Y is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale0.getDisplayCountry(locale2);
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "deutsch" + "'", str6, "deutsch");
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...hbi...", (java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("china");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setRegion("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ", "en-CA", "DEUTSCH\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 " + "'", str3, "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'u');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Franz\366sisch(Frankreich)", 99, (int) 'I');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\", '8');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", strArray3, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand" + "'", str11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("INGLESE", "italian (italian,eng\\u0061\\u0061\\u0061\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        java.util.Locale locale3 = new java.util.Locale("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "                         fran\347                          ", ".Korean (South Korea)Korean (So");
        boolean boolean4 = locale3.hasExtensions();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "2cinese (cina)italianitalianitalianital_                         FRAN\347                          _.Korean (South Korea)Korean (So");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("italian (italian,english                                                                    ", (int) '!', "                                                                                     g             e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italian (italian,english                                                                    " + "'", str3, "italian (italian,english                                                                    ");
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                       k", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       k" + "'", str2, "                                       k");
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("nailatiko", "", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko" + "'", str3, "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "erma (ermay)                                                 TALIAN                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale2.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", "Italien", "...EnglishEn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str3, "iTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("chinesisch(China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: chinesisch(China) [at index 0]");
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
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 71, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                      italian (ITALIAN,English)                                      ", "chinesexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, "allemand");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet2, 'h');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("z...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: z... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                  \\u005c                                                         ", "talienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "talienisch" + "'", str2, "talienisch");
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ITALIAN (italian,eNGLISH)", " hi!       _\\U0020_Italienisch####################################################################           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                   ", "\\u002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, 'n');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, "\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, "COR\311EN");
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
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
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList62, 'A');
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
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                        itTAiT_ITALIAN_EgAish                                 \\u0068", "FR_fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        itTAiT_ITALIAN_EgAish                                 \\u0068" + "'", str2, "                                        itTAiT_ITALIAN_EgAish                                 \\u0068");
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                              it", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\u4e2d\u6587", '\r');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1\\u0061\\u0061\\u0061", "Ttat_ita");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        java.util.Locale locale4 = new java.util.Locale("", "DE_DE", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                              Deutsch", locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "_DE_DE_aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                              deutsch" + "'", str5, "                                                                                              deutsch");
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        java.util.Locale locale13 = locale10.stripExtensions();
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getISO3Language();
        java.util.Locale.Builder builder16 = builder8.setLocale(locale13);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.setVariant("d8                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: d8                                                                                                                       [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "allemand" + "'", str12, "allemand");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "deu" + "'", str15, "deu");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Etats-Unis", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Etats-Unis" + "'", str2, "Etats-Unis");
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (int) 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder6 = builder1.setLocale(locale5);
        java.util.Set<java.lang.String> strSet7 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale5.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = locale5.getDisplayName(locale13);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str19 = locale18.getISO3Country();
        java.lang.String str20 = locale5.getDisplayName(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = locale5.getUnicodeLocaleType("ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ZhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "German (Germany)" + "'", str8, "German (Germany)");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German (Germany)" + "'", str16, "German (Germany)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "German (Germany)" + "'", str20, "German (Germany)");
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0062");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0062" + "'", str1, "\\u0062");
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444it                   ", '\r', '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444it                   " + "'", str3, "444444444it                   ");
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                       ", (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                           " + "'", str2, "                                                                                                           ");
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Franz\366sisch (Kanada)", "EEEEEEEEEFRAEEEEEEEEE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franz\366sisch (Kanada)" + "'", str2, "Franz\366sisch (Kanada)");
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!(\\U0020,Italienisch############################################hi!       ", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
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
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.lang.String str19 = locale18.getVariant();
        java.lang.String str20 = locale11.getDisplayVariant(locale18);
        java.lang.String str21 = locale1.getDisplayScript(locale11);
        java.lang.String str23 = locale1.getExtension('f');
        java.lang.String str24 = locale1.getVariant();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.util.Locale locale10 = new java.util.Locale("\\u0034\\u00                                             hcstueD                                             \\u0034\\u00", "\\u0020iItalian\\u0020i");
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getScript();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale13.getScript();
        java.lang.String str16 = locale11.getDisplayScript(locale13);
        java.lang.String str17 = locale10.getDisplayName(locale13);
        java.util.Locale locale18 = locale10.stripExtensions();
        java.lang.String str19 = locale5.getDisplayName(locale10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0034\\u00                                             hcstued                                             \\u0034\\u00_\\U0020IITALIAN\\U0020I");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr" + "'", str14, "fr");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)" + "'", str17, "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "\\u0034\\u00                                             hcstued                                             \\u0034\\u00_\\U0020IITALIAN\\U0020I");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                        ", 'n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("English", "hi!       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '2');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str2, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("it_I", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("c", "                                                               \\U002   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=fffffffffffffffffffffffffffffffffffffffffffffffffff?ffffffffffffffffffffffffffffffffffffffffffffffffffff");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#####################################################################################", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####..." + "'", str2, "####...");
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                NI                                 ", 120, 'b');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str3, "                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\u0048", "RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0048" + "'", str2, "\\u0048");
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("8600U\\                                                                                                                  ", "069\\u0069\\u0069\\u0069\\u0069\\", 92);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("nglisch", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", 'n');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("itTAiT_ITA");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    \\XTALXAN_aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaaTALaaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaaAN_ENGLXSaaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa    ", strArray6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00" + "'", str2, "\\u0034\\u00                                             hDi!        (\\U0020,ItalicniueD#########################################################################################stuD                                             \\u0034\\u00");
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\u4e2d\u6587", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587" + "'", str2, "\u4e2d\u6587");
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('f', (int) '9');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Deutsch", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", 52);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "en-GB");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AzhzhzhzhzhzhzhzhzhzhE             g", "TIT", 15);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "itTAiT_ITALIAN_EgAish");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("itTAiT_ITALIAN_EgAish                                                                                ", strArray4, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, '0');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Deutsch" + "'", str6, "Deutsch");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Deutsch" + "'", str7, "Deutsch");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "itTAiT_ITALIAN_EgAish                                                                                " + "'", str14, "itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zhzhzhzhzhzhzhzhzhzhE             " + "'", str16, "zhzhzhzhzhzhzhzhzhzhE             ");
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fRENCH (fRANCE)", (int) '\n', 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                              4444ALLEMAND                              4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444ALLEMAND 4444" + "'", str1, "4444ALLEMAND 4444");
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("kkkkkkkkkkkkkkkkkkkk)dnK( hcsis\366znrFkkkkkkkkkkkkkkkkkkkk", "fr_CA                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhanglais (Canada)", "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Chinesisch(China)", "Francia");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "cCCC\\CCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(')', 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh", "r-FR", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (int) 'k');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale.Builder builder11 = builder7.setLocale(locale9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.lowerCase("fr-c                 ", locale9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr-c                 " + "'", str12, "fr-c                 ");
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "fran\347ais (Canada)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "frankreich", "     e                               e                               e            ", 79);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str4, "...EnglishEnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(")");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
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
            java.util.Locale.Builder builder9 = builder4.setRegion("             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:              DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu [at index 0]");
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
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHHHHHHHHH", "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDhcstueDKoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDB");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayName(locale2);
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", locale4);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.getDefault(category6);
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "allemand" + "'", str3, "allemand");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)" + "'", str5, "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "                                                         \\u005c                                                        ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("KO", "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA", 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '!');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character ! is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("e             g", "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("########################################################################################eltI_0200U\\_!", ")dnK( hcsis\366znrF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("tttttttfr-C                 ttttttt", "ne\351roc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tttttttfr-C                 ttttttt" + "'", str2, "tttttttfr-C                 ttttttt");
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setVariant("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ti");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ti [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ANGLAIS (ROYAUME-UNI)FRA", 264);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANGLAIS (ROYAUME-UNI)FRA" + "'", str2, "ANGLAIS (ROYAUME-UNI)FRA");
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020", 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Italienisch#########################################################################################", (java.lang.CharSequence) "cinese) )()C)ina)))\\)u)0069)h)...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("FR-FR", "Chinois (chine)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                               ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                      )hsilgne,nailati( ", "FRZ\326CZ(FRKREC)                                                 ", (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u007a", "gence");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("99999\\u0021", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Korean", "E             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'e', 264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 264 + "'", int2 == 264);
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4Z", "itTAiT_ITA", "                                                                                          \\u005c         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ete", "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "\ud504\ub791\uc2a4\uc5b4", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ete" + "'", str4, "ete");
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0034\\u00                                             hcstud                                             \\u0034\\u00 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117 + "'", int1 == 117);
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
        java.util.Locale locale1 = new java.util.Locale("\\U0078");
        java.lang.String str2 = locale1.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("en_CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: en_CA");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0078");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '9');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setScript("NAILAT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: NAILAT [at index 0]");
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
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhfrancese (Canada)", "China");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2E             GITALIANITALIANITALIANITAL", "                                             hcstued", 104);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "en_US                ita                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "FRZ\326CZ(FRKREC)                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                             hcstueD                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Chinesisch(China)", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinesisch(China)                                                                " + "'", str2, "Chinesisch(China)                                                                ");
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!iiiiiii_\\U0020_Italienisch#########################################################################################", "hhhhhhhhH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!iiiiiii_\\U0020_Italienisch#########################################################################################" + "'", str2, "hi!iiiiiii_\\U0020_Italienisch#########################################################################################");
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0023DAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=44444444444444444444444444444444!ihaaaaaaaaaaaaaaaaaaaaaaaafranzo?sisch(frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  ", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        java.util.Locale locale3 = new java.util.Locale("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "ZH_CN", "");
        boolean boolean5 = locale3.equals((java.lang.Object) 99);
        org.junit.Assert.assertEquals(locale3.toString(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
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
        java.lang.String str18 = locale5.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr_FR" + "'", str18, "fr_FR");
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "R");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0047");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0047" + "'", str1, "\\U0047");
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                             DE_DE                                              ", (int) 'U');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str1, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                      ITALIAN (italian,eNGLISH)                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                  it44444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
        java.util.Locale locale3 = new java.util.Locale("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA", "italie", "                                        ITtaIt_italian_eGaISH                                 \\U006");
        org.junit.Assert.assertEquals(locale3.toString(), "fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca_ITALIE_                                        ITtaIt_italian_eGaISH                                 \\U006");
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                               ##########                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("             DE_DE            uuuuuuuuuuuuuuuuuuuuuuuuuu", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!_\\u0020_iTLE#########################################################################################", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 62 + "'", int14 == 62);
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("italian (italian,english", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('d');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                             hcstued", 'U', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             hcstued" + "'", str3, "                                             hcstued");
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("nailati", "          HI!           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("G", "inglesehhhhhhhhH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "G" + "'", str2, "G");
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.toString('D');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch (frankreich)", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'I' + "'", char1 == 'I');
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", 224, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                        ", "\\u0035");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
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
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder14.setLocale(locale15);
        java.util.Locale.Builder builder19 = builder14.setLanguage("und");
        java.util.Locale locale20 = builder19.build();
        java.lang.String str21 = locale6.getDisplayLanguage(locale20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "French" + "'", str2, "French");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French (Canada)" + "'", str16, "French (Canada)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Japanese" + "'", str21, "Japanese");
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale0.getExtension('h');
        java.lang.String str3 = locale0.getVariant();
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = new java.util.Locale("Italian", "Italian", "English");
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale11);
        java.lang.String str15 = locale11.getCountry();
        java.lang.String str16 = locale8.getDisplayLanguage(locale11);
        java.lang.String str17 = locale4.getDisplayScript(locale8);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clear();
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Locale.Builder builder21 = builder18.setLocale(locale20);
        java.util.Locale.setDefault(locale20);
        java.util.Locale locale24 = new java.util.Locale("en");
        boolean boolean25 = locale24.hasExtensions();
        java.util.Set<java.lang.String> strSet26 = locale24.getUnicodeLocaleKeys();
        java.util.Locale locale27 = java.util.Locale.ITALIAN;
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.util.Locale locale29 = locale27.stripExtensions();
        java.lang.String str30 = locale29.getVariant();
        java.lang.String str31 = locale24.getDisplayLanguage(locale29);
        java.lang.String str32 = locale20.getDisplayVariant(locale24);
        java.lang.String str33 = locale8.getDisplayScript(locale24);
        java.lang.String str34 = locale24.getDisplayVariant();
        boolean boolean35 = locale0.equals((java.lang.Object) str34);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals(locale8.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0034" + "'", str14, "\\u0034");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CA" + "'", str15, "CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italian" + "'", str16, "italian");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italian" + "'", str28, "Italian");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "inglese" + "'", str31, "inglese");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglais");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("       !IH", '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", strArray10, strArray14);
        boolean boolean16 = languageRange1.equals((java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anglais" + "'", str2, "anglais");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anglais" + "'", str3, "anglais");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)" + "'", str15, "englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                 INGLESE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Euguush");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN", (java.lang.CharSequence) "D");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FR", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ian\\u0020i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0041", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", (int) '!');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray10, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "Chinese");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray5, strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str14, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Deutsch" + "'", str15, "Deutsch");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str20, "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "8600U\\                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "cinese");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         \\u005c         ", "HARZHASZHAZHZHZHZHZHZHZHZHZHZ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNEnglisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", "2cinese (Cina...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", "\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str2, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaiitalianititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                  8", 105, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.Object obj5 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "it");
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               en" + "'", str1, "                                                                                               en");
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u00de\\u00\\u\\u00de\\u00\\u", "\u4e2d\u6587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "CCCCCCC           \\uCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("########################################################################################", "\\U000A", "##########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Chinese (China", "a)AAAAAAAAAAAAAAAAAAAAAAAAAAHIAN\\U0020IHa)AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", (int) 'H');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        java.util.Locale locale3 = new java.util.Locale("italian (italian,eng", "kokoko", "      ");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "italian (italian,eng_KOKOKO_      ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italian (italian,eng_KOKOKO_      " + "'", str4, "italian (italian,eng_KOKOKO_      ");
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "\\u002e", "tttttt\\u0049");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                  \\u0020iItalian\\u0020i                                                 ", (int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            \\u0020iItalian\\u0020i                                                 " + "'", str2, "            \\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "s (Canada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Royaume-Uni", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Royaume-Uni" + "'", str2, "Royaume-Uni");
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0030", (int) 'B', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0030UUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h########################################################################################", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
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
        java.util.Locale.Builder builder23 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setLanguageTag("    ...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:     ... [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
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
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "FRZ\326CZ(FRKREC)                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale1.getVariant();
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.lang.String str10 = locale7.getExtension('C');
        java.lang.String str11 = locale6.getDisplayLanguage(locale7);
        java.lang.String str12 = locale7.getISO3Country();
        java.lang.String str14 = locale7.getExtension('z');
        java.lang.String str15 = locale1.getDisplayVariant(locale7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.lowerCase("!!!!!!!!!!!!!!!!!!!!!!    ZH_CN    !!!!!!!!!!!!!!!!!!!!!!", locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois" + "'", str11, "chinois");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!" + "'", str16, "!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                  !ih                            ", "...cccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoan...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  !ih                            " + "'", str2, "                                  !ih                            ");
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "X", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Korean", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "French (Canada)", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Deutscd\\XTALXAN_ITALIAN_ENGLXSH", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("  \\u0020iTALIANiTALIANiTALIANiTAL  ", "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\u0020iTALIANiTALIANiTALIANiTAL  " + "'", str3, "  \\u0020iTALIANiTALIANiTALIANiTAL  ");
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", "            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", 406);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Deutsc", "\\u0020iItalian\\u008600u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "n44444444444444alia44444444444444it", (java.lang.CharSequence) "FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("UND", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("franci", 267, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranci");
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "EEEEEEEEEFRAEEEEEEEEE");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '2');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str4, "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" ...", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", 0, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str3, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("erma (ermay)                                                 TALIAN                                                  ", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(")dnK( hcsis\366znrF                              ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")dnK( hcsis\366znrF                              " + "'", str3, ")dnK( hcsis\366znrF                              ");
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("NNNNNNNNNNNNNNNNNN");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 71, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk" + "'", str3, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih                            dllm!ih                            dllm!ih                          ", "Deutsc", 116, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih    Deutsc" + "'", str4, "!ih    Deutsc");
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        boolean boolean6 = locale2.hasExtensions();
        java.lang.String str7 = locale2.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_CA" + "'", str7, "fr_CA");
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444" + "'", str2, "44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "DE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30d5\u30e9\u30f3\u30b9)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "fffffffffffff                                                                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale locale7 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setExtension('N', "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0046", 27, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", 52, 262);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00..." + "'", str3, "...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...");
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("talienisch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          HI!           ", "italiae");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          HI!           " + "'", str2, "          HI!           ");
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str1, "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ADHAEHAFHAGHAIHALHAMHANHAOHAQHARHASHATHAUHAWHAXHAZHBAHBBHBDHBEHBFHBGHBHHBIHBJHBLHBMHBNHBOHBQHBRHBSHBTHBVHBWHBYHBZHCAHCCHCDHCFHCGHCHHCIHCKHCLHCMHCNHCOHCRHCUHCVHCWHCXHCYHCZHDEHDJHDKHDMHDOHDZHECHEEHEGHEHHERHESHETHFIHFJHFKHFMHFOHFRHGAHGBHGDHGEHGFHGGHGHHGIHGLHGMHGNHGPHGQHGRHGSHGTHGUHGWHGYHHKHHMHHNHHRHHTHHUHIDHIEHILHIMHINHIOHIQHIRHISHITHJEHJMHJOHJPHKEHKGHKHHKIHKMHKNHKPHKRHKWHKYHKZHLAHLBHLCHLIHLKHLRHLSHLTHLUHLVHLYHMAHMCHMDHMEHMFHMGHMHHMKHMLHMMHMNHMOHMPHMQHMRHMSHMTHMUHMVHMWHMXHMYHMZHNAHNCHNEHNFHNGHNIHNLHNOHNPHNRHNUHNZHOMHPAHPEHPFHPGHPHHPKHPLHPMHPNHPRHPSHPTHPWHPYHQAHREHROHRSHRUHRWHSAHSBHSCHSDHSEHSGHSHHSIHSJHSKHSLHSMHSNHSOHSRHSSHSTHSVHSXHSYHSZHTCHTDHTFHTGHTHHTJHTKHTLHTMHTNHTOHTRHTTHTVHTWHTZHUAHUGHUMHUSHUYHUZHVAHVCHVEHVGHVIHVNHVUHWFHWSHYEHYTHZAHZMHZW", "eAGAASH", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA", "hI!       ", (int) ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                     fran\347ais (france)                                      ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA" + "'", str7, "...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA");
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("nailati", strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("Eagaash");
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
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
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList40, filteringMode42);
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
        java.lang.String str59 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.lang.String>) strList56);
        java.util.Locale locale60 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet61 = locale60.getExtensionKeys();
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale65 = new java.util.Locale("");
        java.util.Locale locale66 = java.util.Locale.FRANCE;
        java.util.Locale locale67 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str68 = locale66.getDisplayScript(locale67);
        java.util.Locale locale69 = java.util.Locale.ENGLISH;
        java.lang.String str70 = locale69.getDisplayCountry();
        java.util.Locale locale71 = java.util.Locale.PRC;
        java.util.Locale locale72 = java.util.Locale.US;
        java.util.Locale locale73 = java.util.Locale.FRANCE;
        java.util.Locale locale74 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.util.Locale locale76 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet77 = locale76.getExtensionKeys();
        java.util.Locale locale78 = java.util.Locale.ITALIAN;
        java.lang.String str79 = locale78.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.FRENCH;
        java.util.Locale locale81 = java.util.Locale.US;
        java.util.Locale locale82 = java.util.Locale.ITALIAN;
        java.lang.String str83 = locale82.getDisplayLanguage();
        java.util.Locale locale84 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale60, locale63, locale65, locale66, locale69, locale71, locale72, locale74, locale76, locale78, locale80, locale81, locale82, locale84 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList86, filteringMode90);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList86);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(languageRangeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode42.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList43);
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
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
        org.junit.Assert.assertNotNull(charSet61);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "it");
        org.junit.Assert.assertNotNull(charSet77);
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "italien" + "'", str79, "italien");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "italien" + "'", str83, "italien");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode90.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AzhzhzhzhzhzhzhzhzhzhE             g", "TIT", 15);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "itTAiT_ITALIAN_EgAish");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aNCHc", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh...", "\\u0023 (ITALIENISCH,iTALIAN)", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
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
        java.lang.String str22 = locale3.getDisplayVariant();
        java.lang.String str23 = locale3.getDisplayCountry();
        java.lang.String str24 = locale3.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("itTAiT_ITALIAN_EgAish", "ita");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                        ittait_italian_egaish                                 \\u006", ')');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ittait_italian_egaish                                 \\u006" + "'", str2, "                                        ittait_italian_egaish                                 \\u006");
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!", 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!" + "'", str2, "HI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!tttttttHI!");
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                         ", "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("FRTTAT_ITA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ITALIAN", "NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (int) 'k');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITALIAN" + "'", str3, "ITALIAN");
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I", "\\u0038", 328);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                              \\     ", (int) '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              \\     " + "'", str2, "                                              \\     ");
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                         fr-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "chinois");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "bbbbbbbbbb   cor\351en    ");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064" + "'", str2, "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("France", "...ANiTALI", (int) (short) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "France" + "'", str4, "France");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)", "...       g                     ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('t', (int) 'R');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Royaume-Uni");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "anglais", 108);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Fr ncG ", "fran\347ais(france)(CHINESE(CHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fr ncG " + "'", str2, "Fr ncG ");
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("french (NC_HZ)", 997, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0043", "                                                                                           u0020italianitalianitalianitali");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("italy", 52, "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          italy" + "'", str3, "inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          italy");
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
        java.util.Locale locale2 = new java.util.Locale("                                 9", "en_CA");
        org.junit.Assert.assertEquals(locale2.toString(), "                                 9_EN_CA");
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)" + "'", str1, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("          ", "\\u0020hi!       _\\U0020_Italienisch################anihc", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...", (int) 'H');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("8600U\\                                                                                                                  ", "069\\u0069\\u0069\\u0069\\u0069\\", 92);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("nglisch", strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("", 'n');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("                              DE_DE                              ", strArray11);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "English", 4);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u000d", strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny("             ", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("UD                                 ", strArray11, strArray19);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UD                                 " + "'", str22, "UD                                 ");
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)" + "'", str1, "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)");
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" \\U0078 ", "   \\U0034\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "78" + "'", str2, "78");
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
        java.util.Locale locale3 = new java.util.Locale("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEa", "e             g                                                                                     ", "\\U0078");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea_E             G                                                                                     _\\U0078");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)" + "'", str4, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea (E             G                                                                                     ,\\U0078)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "E             G                                                                                     " + "'", str5, "E             G                                                                                     ");
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("E    Italien", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         E    Italien" + "'", str2, "                                                                                         E    Italien");
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("jp");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "italiano", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!(\\U0020,ITALIENISCH#########################################################################################)", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "englisch", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!       ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI" + "'", str1, "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("emand", "##########", 35);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str8 = locale4.getExtension('E');
        java.lang.String str9 = locale4.getLanguage();
        java.lang.String str10 = locale4.getDisplayName();
        java.lang.String str11 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian (ITALIAN,English)" + "'", str10, "italian (ITALIAN,English)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italian (ITALIAN,English)" + "'", str11, "italian (ITALIAN,English)");
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("NAILAT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: NAILAT [at index 0]");
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
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "           \\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Cinese (Cina)\\u0069h..", "iTALIAN", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz [at index 0]");
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
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
        java.util.Locale locale4 = new java.util.Locale("9hhhhhhhhhh", "italiano", "\r\r...");
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("Royaume-Uni");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("fr-FR", locale7);
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT", locale7);
        org.junit.Assert.assertEquals(locale4.toString(), "9hhhhhhhhhh_ITALIANO_\r\r...");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "uni");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FR-FR" + "'", str8, "FR-FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9hhhhhhhhhh" + "'", str9, "9hhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT" + "'", str10, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILAT");
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 20, 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str3, "ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str1, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("NI");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'N' + "'", char1 == 'N');
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("                                                                  \\U0069HHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0069hhhhhhhhhh");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\ud504");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".", "fffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("U", "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT       !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                        itTAiT_ITALIAN_EgAish                                 \\u0068");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...       g                     ...", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...IIIIIIIIIIIIIIIIIIII...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
        java.util.Locale locale2 = new java.util.Locale("fRANZ\326SISCH (kANADA)", "\\u0020italianitalianitalianitali");
        org.junit.Assert.assertEquals(locale2.toString(), "franz\326sisch (kanada)_\\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Deutsc", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Deutsc" + "'", charSequence2, "Deutsc");
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "                                             \\u0066                                              ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("de_DE", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE" + "'", str2, "de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE");
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
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
        java.util.Set<java.lang.String> strSet14 = locale3.getUnicodeLocaleKeys();
        java.lang.String str15 = locale3.getCountry();
        java.util.Locale locale16 = locale3.stripExtensions();
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", locale3);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FR" + "'", str15, "FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065" + "'", str17, "5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065");
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "                                                         \\u005c                                                         ", (int) 'C');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("TALIAN\\u002", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN" + "'", str7, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=!ih");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("fr-c                 ", "it_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_Iit_I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-c                 " + "'", str2, "fr-c                 ");
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("IIIIIIIII");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 371, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r" + "'", str3, "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r");
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS CINESE (CINA)\\U0069H..FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZHFRAN\307AIS (FRANCE)AZHZHZHZHZHZHZHZHZHZH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "...IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "IIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str3, "          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('g', 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                        ittait_italian_egaish                                 \\u006", (java.lang.CharSequence) "\u1112\u1161\u11ab\u1100\u116e\u11a8\u110b\u1165\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                        ittait_italian_egaish                                 \\u006" + "'", charSequence2, "                                        ittait_italian_egaish                                 \\u006");
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hzhzhzhzhz", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hzhzhzhzhz" + "'", str2, "hzhzhzhzhz");
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HIAN\\U0020Ih", "e             g", "\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIAN\\U0020Ih" + "'", str3, "HIAN\\U0020Ih");
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u002" + "'", str1, "\\u002");
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        boolean boolean5 = locale2.hasExtensions();
        java.util.Locale.setDefault(locale2);
        boolean boolean7 = locale2.hasExtensions();
        java.lang.String str8 = locale2.getISO3Country();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        boolean boolean14 = locale9.hasExtensions();
        java.lang.String str15 = locale9.getVariant();
        java.util.Set<java.lang.String> strSet16 = locale9.getUnicodeLocaleKeys();
        java.lang.String str17 = locale2.getDisplayLanguage(locale9);
        java.lang.String str18 = locale1.getDisplayCountry(locale9);
        java.lang.String str19 = locale1.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italie" + "'", str4, "Italie");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "italien" + "'", str17, "italien");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Italienisch#########################################################################################", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("zzzItalian (Italy)", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################" + "'", str4, "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################");
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ", locale4);
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale4.getISO3Country();
        java.lang.String str10 = locale4.getISO3Country();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Canada" + "'", str8, "Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CAN" + "'", str9, "CAN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAN" + "'", str10, "CAN");
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0020", "Italian");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\u0046");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("NA", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("    ", 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0020iItalian\\u0020i", "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                                                      ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("emand", "en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "emand" + "'", str2, "emand");
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("an\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AN\\U00" + "'", str1, "AN\\U00");
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("anglais", 'x');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("...", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'g');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "anglais" + "'", str8, "anglais");
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT" + "'", str1, "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
        java.util.Locale locale1 = new java.util.Locale("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals(locale1.toString(), "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AD  \\u007a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", "\\\\\\\\\\\\\\HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayLanguage();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getDisplayCountry();
        java.lang.String str9 = locale0.getDisplayName(locale7);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale10.getISO3Country();
        java.lang.String str12 = locale7.getDisplayCountry(locale10);
        java.lang.String str13 = locale10.getDisplayName();
        java.lang.String str14 = locale10.getDisplayName();
        java.util.Locale.setDefault(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italien" + "'", str3, "italien");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "italien" + "'", str5, "italien");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CAN" + "'", str11, "CAN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "anglais (Canada)" + "'", str13, "anglais (Canada)");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "anglais (Canada)" + "'", str14, "anglais (Canada)");
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 314, (int) ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("J", "italiaE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Eng");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eng" + "'", str1, "Eng");
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  aNIHc   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", "4444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI444444444444444444444444NAILATI44444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("italian (italian,eng\\u0061\\u0061\\u0061\\u0", "fr-C                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italian (italian,eng\\u0061\\u0061\\u0061\\u0" + "'", str2, "italian (italian,eng\\u0061\\u0061\\u0061\\u0");
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                          g             E", (int) 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "ITALIANITALIAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("9hhhhhhhhhh                                                             ", "!IH", "TITITITITITIT");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it44444444444444444en", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=it44444444444444444en");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("FRENCH (CANADA)", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh" + "'", str2, "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
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
        java.lang.String str30 = locale19.getDisplayLanguage();
        java.lang.String str31 = locale19.getVariant();
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
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais" + "'", str20, "anglais");
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
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "anglais" + "'", str30, "anglais");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                           ...                                                       ", "Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ", 57, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          " + "'", str3, "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..                                                          ");
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
        char[] charArray14 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "8600U\\                                                                                                                  ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Eagaash", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "R0", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder9 = builder7.setLanguage("ITALIAN");
        java.util.Locale locale10 = builder7.build();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                        ", locale10);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("France");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale14);
        java.lang.String str16 = locale14.getDisplayVariant();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.lang.String str19 = locale17.getVariant();
        java.lang.String str20 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale23 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str24 = locale14.getDisplayLanguage(locale23);
        java.lang.String str25 = locale10.getDisplayName(locale14);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", locale10);
        java.util.Set<java.lang.String> strSet27 = locale10.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French (Canada)" + "'", str5, "French (Canada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                        " + "'", str11, "                                                                                                        ");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "france");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "frankreich" + "'", str15, "frankreich");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale23.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "france" + "'", str24, "france");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italian" + "'", str25, "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str26, "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = new java.util.Locale("en");
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        java.lang.String str15 = locale12.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "allemand" + "'", str4, "allemand");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ALLEMAND" + "'", str13, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("inglesehhhhhhhhh", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          inglesehhhhhhhhh                                          " + "'", str2, "                                          inglesehhhhhhhhh                                          ");
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "F");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\u5fb7\u6587", "anihC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("cor\351en (Cor\351e du Sud)", "d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("anglais (royaume-uni)FRA", "###################################i#######...", (int) 'T');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "E             g                                                                                     ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "iTALIAN                                                                 ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Chinesisch(China)");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('2');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                     fran\347ais (france)                                       (CHINESE (CHINA)", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   \\U0034\\U00", "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "          HI!           ", (java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
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
            java.util.Locale.Builder builder10 = builder8.addUnicodeLocaleAttribute("                                                                    \\U0020ItalianItalianItalianItali");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                     \\U0020ItalianItalianItalianItali [at index 0]");
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
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("2", "englishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("tttttt\\u0049", "z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("itTAiT_ITA", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ", "\\u0047");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "itTAiT_ITA" + "'", str3, "itTAiT_ITA");
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Fr ncG ", "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "fra", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "fra" + "'", charSequence2, "fra");
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITTAIT_ITALIAN_EGAISH" + "'", str1, "ITTAIT_ITALIAN_EGAISH");
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (int) 'b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
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
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getScript();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet33, 'A');
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.util.Locale.FilteringMode filteringMode50 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList46, filteringMode50);
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.util.Locale.FilteringMode filteringMode63 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strList61, filteringMode63);
        java.util.Locale.FilteringMode filteringMode65 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList66 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.lang.String>) strList61, filteringMode65);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList73, filteringMode75);
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList66, filteringMode75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList77, filteringMode78);
        java.lang.Class<?> wildcardClass80 = strList77.getClass();
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
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + filteringMode50 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode50.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + filteringMode63 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode63.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + filteringMode65 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode65.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", "\\u0065", "C500u");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setRegion("44444444444444444444444france444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 44444444444444444444444france444444444444444444444444 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "francia");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ZH_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zH_CN" + "'", str1, "zH_CN");
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "DE_DE");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }
}
