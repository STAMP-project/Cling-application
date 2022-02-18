import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("tit", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tit" + "'", str2, "tit");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IAN\\U0020I", 'A');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0029", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\u52a0\u62ff\u5927", (int) 'h', 'e');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str3, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0074");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Eagaash", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Eagaash" + "'", str6, "Eagaash");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                ITA                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                ita                " + "'", str1, "                ita                ");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch", "chinois (chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch" + "'", str2, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\CCglisch");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setLanguageTag("         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag:           [at index 0]");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!       _\\u0020_iTALIENISCH####################################################################...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("zho");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str3 = locale2.getCountry();
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("IIIIIIIIII", locale2);
        java.lang.String str6 = locale2.getScript();
        java.lang.String str7 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "iiiiiiiiii" + "'", str5, "iiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "4", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                    ", "                                                   ", (int) 'C');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 111 + "'", int5 == 111);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "f_KOREAN", 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\" + "'", str3, "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.util.Locale locale3 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale5.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italienisch#########################################################################################" + "'", str6, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italienisch#########################################################################################" + "'", str8, "Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italienisch#########################################################################################" + "'", str9, "Italienisch#########################################################################################");
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                           U0020ITALIANITALIANITALIANITALI", "EAGAASH", (int) 'i');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               8300u\\                                                ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                        " + "'", str1, "                                                                                                        ");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("en-CA", "                                             DEUTSCH                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CA" + "'", str2, "en-CA");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\U0023", (int) 'n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023" + "'", str2, "\\U0023");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u005c", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "fran\347ais (Canada)");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str12, "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) 'x', (int) (byte) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00", 23, 21);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", "                                                  it44444444444444444en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r..." + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("8", "TALIAN_ITALIAN_ENGLISH         ITAL", "...LIAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("iFranzosisch ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iFranzosisch" + "'", str1, "iFranzosisch");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(locale0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("CHN");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '9');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hcstueD", "Korean (South Korea)", 104);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                               \\U0020", strArray4, strArray10);
        boolean boolean12 = locale0.equals((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CHN" + "'", str6, "CHN");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                               \\U0020" + "'", str11, "                                                               \\U0020");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Undetermined", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Undetermined" + "'", str2, "Undetermined");
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0020iItalian\\u008600u\\U\\u0020iItalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uitalian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", (java.lang.CharSequence) "\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 537 + "'", int2 == 537);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("fr_FR");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("fr_FR", "\\u0078");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("E             g                          ", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "E             g                          " + "'", str6, "E             g                          ");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str8 = locale1.getVariant();
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleKeys();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("ed", locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIAN" + "'", str6, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ed" + "'", str10, "ed");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("und-CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und-CA" + "'", str1, "und-CA");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        java.lang.String str9 = locale0.getVariant();
        java.util.Locale locale12 = new java.util.Locale("                                             hcstueD                                             ", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str14 = locale0.getDisplayScript(locale12);
        java.lang.String str15 = locale12.getDisplayVariant();
        java.lang.String str16 = locale12.getLanguage();
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
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                             hcstued                                             " + "'", str13, "                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                             hcstued                                             " + "'", str16, "                                             hcstued                                             ");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\uc774\ud0c8\ub9ac\uc544\uc5b4", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AnihCFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AnihCFFFFFFFF" + "'", str1, "AnihCFFFFFFFF");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...LIAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str1, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r..." + "'", str1, "\r\r...");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  " + "'", str1, "  ");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("IXII");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ixii");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('t', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("ENGLISCH");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("HI!(\\U0020,ITALIENISCH#########################################################################################)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: HI!(\\U0020,ITALIENISCH#########################################################################################) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setScript("                              it");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                               it [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "AD  \\u007a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D  \\u007a" + "'", str2, "D  \\u007a");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                         \\u005", "R");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("U00\\U0034\\U00                                             HCSTUD                                             \\U0034", "                              4444ALLEMAND                              4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("it                   ", "...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   " + "'", str2, "                   ");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                    \\U0020ItalianItalianItalianItali", "B", "    ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\r\r\r\r\r\r\r\r\r\r\r\ritalieital", "chinesisch(China)", "\\U0020ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(' ', 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..", "ENGLISCH (         italian_italian_english,\\U0061)", "EN_US", (int) 'R');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh.." + "'", str4, "...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh..");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCIAN\\U0020ICCCCCCC" + "'", str1, "CCCCCCIAN\\U0020ICCCCCCC");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList22, strMap23);
        java.util.Collection<java.util.Locale> localeCollection25 = null;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter(languageRangeList24, localeCollection25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList24, strMap27);
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
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder4.setUnicodeLocaleKeyword("French (France)", "\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: French (France) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'a', 'x');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(")dnK( hcsis\366znrF", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("nailatiko", (int) '\\', (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\XTALXAN_ITALIAN_ENGLXSH", "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str2, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setUnicodeLocaleKeyword("e             g", "Italian (italian,english");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: e             g [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Azhzhzhzhzhzhzhzhzhzh", "                                                               \\U0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u005c", '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("2CINESE (CINA...", 'd');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "CINESE (CINA)\\U0069H...", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Germany", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale8.getVariant();
        java.lang.String str11 = locale8.getDisplayName();
        java.lang.String str12 = locale8.getCountry();
        java.util.Set<java.lang.String> strSet13 = locale8.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet14 = locale8.getUnicodeLocaleKeys();
        java.lang.String str15 = locale1.getDisplayLanguage(locale8);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.lang.String str20 = locale18.getExtension('h');
        java.lang.String str21 = locale17.getDisplayScript(locale18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale17);
        java.lang.String str24 = locale17.getExtension('z');
        java.lang.String str25 = locale1.getDisplayName(locale17);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.lowerCase("tali...an", locale17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italienisch" + "'", str4, "Italienisch");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italienisch" + "'", str11, "Italienisch");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "italiano" + "'", str15, "italiano");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!       " + "'", str22, "hi!       ");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "italien" + "'", str25, "italien");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "tali...an" + "'", str26, "tali...an");
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
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
        java.lang.String str12 = locale9.getLanguage();
        java.lang.String str13 = locale9.getDisplayCountry();
        java.lang.String str14 = locale9.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de" + "'", str12, "de");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Deutschland" + "'", str13, "Deutschland");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de-DE" + "'", str14, "de-DE");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str2, "             hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chinese (China)", "", (int) 'z');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("z...", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("englisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)" + "'", str7, "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))" + "'", str2, "))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0043", 72, 997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("nglish (United Kingdom", 92, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                               \\U0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ititaitainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Royaume-Uni", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Royaume-Uni" + "'", str2, "Royaume-Uni");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                       \\u0020iTALIANiTALIANiTALIANiTALI", "fRANZ\326SISC", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 72);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str4, "                                       \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u30c9\u30a4\u30c4\u8a9e", "frnz\366sisch (knd)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...", "                                                                                                              italieital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ..." + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ...");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("e", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2E             giTALIANiTALIANi", "...anitali");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("E    Italien");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "neilatI    E" + "'", str1, "neilatI    E");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "i\\u0020italianitalianitalianitaliit         \\", 16);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("FFFF");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 16 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "\\u0034                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis" + "'", str2, "HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", "TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!       ", "zh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale locale10 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "Deutsc", "...ANiTALI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???????????????????????franzO?sisch?(frankreich)??????????????????????? [at index 0]");
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
        org.junit.Assert.assertEquals(locale10.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r_DEUTSC_...ANiTALI");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("x-lvariant-CAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-lvariant-CAN" + "'", str1, "x-lvariant-CAN");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iiiiiiiiii", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaILATiNA...aaaaaaaaaaaaaaaaaaaaaaaaaa", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.util.Locale locale3 = new java.util.Locale("...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALIJ...ANiTALI", "fRENCH (fRANCE)", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        java.util.Locale locale5 = new java.util.Locale("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI");
        java.lang.String str6 = locale3.getDisplayLanguage(locale5);
        org.junit.Assert.assertEquals(locale3.toString(), "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali_FRENCH (FRANCE)_ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals(locale5.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali" + "'", str6, "...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("    IIIIIIIIII...........................");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale locale7 = locale1.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str11 = locale9.getExtension('h');
        java.lang.String str12 = locale8.getDisplayScript(locale9);
        java.util.Locale locale13 = locale8.stripExtensions();
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale16 = new java.util.Locale("en");
        boolean boolean17 = locale16.hasExtensions();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleKeys();
        java.lang.String str19 = locale13.getDisplayCountry(locale16);
        java.lang.String str20 = locale16.getScript();
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale22);
        java.lang.String str25 = locale22.getCountry();
        java.lang.String str26 = locale16.getDisplayCountry(locale22);
        java.lang.String str27 = locale16.toLanguageTag();
        java.lang.String str28 = locale1.getDisplayLanguage(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uc601\uc5b4" + "'", str23, "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "!IH" + "'", str24, "!IH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en" + "'", str27, "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        double double2 = languageRange1.getWeight();
        boolean boolean4 = languageRange1.equals((java.lang.Object) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "und-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)", "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("kkkkkkkkkkkkkkkkkeAGAASH", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setRegion("AhzRAhzQAhzOAhzNAh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: AhzRAhzQAhzOAhzNAh [at index 0]");
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
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("it44444444444444444en");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\\u0065                             ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0065");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
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
        java.lang.String str38 = locale19.getVariant();
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
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIn44444444444444alia44444444444444itIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('e');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character U is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("             hcsineilatI             ", (int) '\n', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Eagaash");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Eagaash" + "'", str1, "Eagaash");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.lang.String str7 = locale3.getScript();
        java.lang.String str8 = locale3.getDisplayScript();
        java.lang.String str9 = locale3.getDisplayName();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc601\uc5b4" + "'", str9, "\uc601\uc5b4");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", (int) '9', 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str5, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0021", "aNCHc", (int) 'E');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("                                                                    ", locale2);
        java.lang.String str4 = locale2.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    " + "'", str3, "                                                                    ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Ialensch#########################################################################################", (int) '!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ialensch#########################################################################################" + "'", str2, "Ialensch#########################################################################################");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r\r...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleKeys();
        java.lang.String str9 = locale4.getDisplayVariant();
        java.lang.String str10 = locale4.toString();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian" + "'", str10, "italian");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("CCCC\\CCCC", "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh" + "'", str1, "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ZH_cn", "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_cn" + "'", str2, "ZH_cn");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("IIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ANGLAIS (ROYAUME-UNI)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("tenenco", "                                            HCSTUD                                             \\U0034");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("NI", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                NI                                 " + "'", str2, "                                NI                                 ");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                                                                     ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!(\\U0020,Italienisch#########################################################################################", "                                  !ih                            dalleman");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\", "                                  \\u005c                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        char[] charArray13 = new char[] { ' ', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frnz\366sisch (knd)", charArray13);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cinese (Cina)\\u0069h...", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0041", "engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", (int) '!');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              \\     ", "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", 'i');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray10, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ixii", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "Chinese");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", strArray5, strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                   \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\hi!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str14, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Deutsch" + "'", str15, "Deutsch");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en" + "'", str20, "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0041" + "'", str21, "\\u0041");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setVariant("\ud504\ub791\uc2a4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("FR-FR", "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR-FR" + "'", str2, "FR-FR");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0038ZHO                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0038zho                          " + "'", str1, "\\u0038zho                          ");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          HI!           ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "8600u\\                                                                                                                  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRANZ\326SI         ITALIAN_italian_eNGLISHFRANZ\326SI");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?si         italian_italian_englishfranzo?si");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Und-iTALIAN", (java.lang.CharSequence) "r-FR");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Und-iTALIAN" + "'", charSequence2, "Und-iTALIAN");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Italie", 'F');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italie" + "'", str2, "Italie");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "German (Germany)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("TAiT_ITALIAN_EgAish", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
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
        java.util.Set<java.lang.Character> charSet10 = locale1.getExtensionKeys();
        java.util.Locale locale11 = locale1.stripExtensions();
        java.lang.String str12 = locale1.getCountry();
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
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CA" + "'", str12, "CA");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Italia                                                  ", 103, "INGLESE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING" + "'", str3, "INGLESEINGLESEINGLESEINItalia                                                  INGLESEINGLESEINGLESEING");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\ud504\ub791\uc2a4", "HI!(\\U0020,ITALIENISCH#########################################################################################)", 27, 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)" + "'", str4, "\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HHHHHHHHH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH" + "'", str2, "HHHHHHHHH");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "Chine)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "cinese (cina)\\u0069h..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str1, "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("iTALIAN (ITALIAN,ENGLISH", "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iTALIAN (ITALIAN,ENGLISH" + "'", str2, "iTALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("a");
        java.util.Collection<java.lang.String> strCollection2 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("CANADA", strMap4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("en");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags(languageRangeList7, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap19);
        java.util.Locale locale21 = java.util.Locale.ITALIAN;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.lang.String str24 = locale21.getLanguage();
        java.util.Set<java.lang.String> strSet25 = locale21.getUnicodeLocaleKeys();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet25, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str28 = java.util.Locale.lookupTag(languageRangeList7, (java.util.Collection<java.lang.String>) strSet25);
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
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList84, filteringMode85);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList1, strCollection2, filteringMode85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "it" + "'", str24, "it");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
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
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Italian" + "'", str74, "Italian");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Italian" + "'", str78, "Italian");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode85.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList86);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!       _\\U0020_Italienisch#########################################################################################", "E             g                          ", (int) '\\');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("U00\\U0034\\U00                                             HCSTUD                                             \\U0034", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!       ", (int) 'C', 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        java.util.Locale locale3 = new java.util.Locale("                                     fran\347ais (france)                                       (CHINESE (CHINA)", "fr", "\uc911\uad6d\uc5b4\uc911\uad6d)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "                                     fran\347\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
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
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("France");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale19);
        java.lang.String str21 = locale19.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale22.getVariant();
        java.lang.String str25 = locale19.getDisplayVariant(locale22);
        java.util.Locale.Builder builder26 = builder1.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder1.removeUnicodeLocaleAttribute("Franz\366sisc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Franzo?sisc [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italian" + "'", str11, "Italian");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "france");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "frankreich" + "'", str20, "frankreich");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("AhzRAhzQAhzOAhzNAh", (double) 220);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=220.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("engengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengengeng", "                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'F', '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'F' + "'", char2 == 'F');
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                             DE_DE                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DE_DE" + "'", str1, "DE_DE");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder5.setUnicodeLocaleKeyword("englisch", "fr-C                 ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: englisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('t', 997);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 997 + "'", int2 == 997);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("it_IT", "fffffffffffff");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it_IT" + "'", str2, "it_IT");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", (int) '2', 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...It..." + "'", str3, "...It...");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("########################################################################################", "Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################" + "'", str2, "########################################################################################");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                          hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch                                           ", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u004e", "NAILAT", 395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("             ", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "44444444444444444444444444444444!IH");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "E             g                          sh" + "'", str6, "E             g                          sh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh" + "'", str8, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", "\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "cHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHN" + "'", str1, "cHN");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("         ", "44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("chinois");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("ne\351roc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: nee?roc [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0020italianitalianitalianitali", "E44444444444444444444444444444444!IHG44444444444444444444444444444444!IH44444444444444444444444444444444!IHSH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aNIHc", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc" + "'", str2, "aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("fr_CA", 499);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_CA");
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.util.Locale locale1 = new java.util.Locale("hi!       ");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       " + "'", str2, "hi!       ");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "z...Frn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", (java.lang.CharSequence) "                                  \\u005c                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "   h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
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
        java.lang.Object obj20 = locale12.clone();
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
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "fr_FR");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "fr_FR");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Eagaas\\\\\\\\\\\\\\HI!HI!", (java.lang.CharSequence) "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Eagaas\\\\\\\\\\\\\\HI!HI!" + "'", charSequence2, "Eagaas\\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'I');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0020" + "'", str6, "\\U0020");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (java.lang.CharSequence) "\\u0034\\u00                                             hcstuD                                             \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", charSequence2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit", 'G', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit" + "'", str3, "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("RoyaumeDeutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\-Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Uni", "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", 537);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", "cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("FRANZ\326SISCH\n(FRANKREICH)", "z...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("franz\366sisch (frankreich)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW" + "'", str2, "ADCAECAFCAGCAICALCAMCANCAOCAQCARCASCATCAUCAWCAXCAZCBACBBCBDCBECBFCBGCBHCBICBJCBLCBMCBNCBOCBQCBRCBSCBTCBVCBWCBYCBZCCACCCCCDCCFCCGCCHCCICCKCCLCCMCCNCCOCCRCCUCCVCCWCCXCCYCCZCDECDJCDKCDMCDOCDZCECCEECEGCEHCERCESCETCFICFJCFKCFMCFOCFRCGACGBCGDCGECGFCGGCGHCGICGLCGMCGNCGPCGQCGRCGSCGTCGUCGWCGYCHKCHMCHNCHRCHTCHUCIDCIECILCIMCINCIOCIQCIRCISCITCJECJMCJOCJPCKECKGCKHCKICKMCKNCKPCKRCKWCKYCKZCLACLBCLCCLICLKCLRCLSCLTCLUCLVCLYCMACMCCMDCMECMFCMGCMHCMKCMLCMMCMNCMOCMPCMQCMRCMSCMTCMUCMVCMWCMXCMYCMZCNACNCCNECNFCNGCNICNLCNOCNPCNRCNUCNZCOMCPACPECPFCPGCPHCPKCPLCPMCPNCPRCPSCPTCPWCPYCQACRECROCRSCRUCRWCSACSBCSCCSDCSECSGCSHCSICSJCSKCSLCSMCSNCSOCSRCSSCSTCSVCSXCSYCSZCTCCTDCTFCTGCTHCTJCTKCTLCTMCTNCTOCTRCTTCTVCTWCTZCUACUGCUMCUSCUYCUZCVACVCCVECVGCVICVNCVUCWFCWSCYECYTCZACZMCZW");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0029", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "chinesisch(China)", charArray12);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("2CINESE (CINA...", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "bgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgbgtalian");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HCSTUED");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HCSTUED" + "'", str1, "HCSTUED");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL" + "'", str1, "\u1111\u1173\u1105\u1161\u11bc\u1109\u1173\u110b\u1165\u110f\u1162\u1102\u1161\u1103\u1161)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Koreanisch", "Chinesisch");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ" + "'", str1, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                        e                               ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              " + "'", str2, "                              ");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 262 + "'", int1 == 262);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("GB", "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ChineseEN_CA(China)", (java.lang.CharSequence) "KoreanADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
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
        java.lang.String str12 = locale5.getISO3Language();
        java.lang.String str13 = locale5.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale5.getUnicodeLocaleType("hi!(\\U0020,Italienisch############################################hi!       ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!(\\U0020,Italienisch############################################hi!       ");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fra" + "'", str12, "fra");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT", "........French (Canadad........");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "chinesisch(China)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\ud504\ub791\uc2a4", "tttttttfr-C                 ttttttt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4" + "'", str2, "\ud504\ub791\uc2a4");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('5');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u000a", "ne\351roc", (int) 't');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_CA" + "'", str1, "en_CA");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u0023");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ZH_CN", 0, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u0039");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str4 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italie" + "'", str2, "Italie");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
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
        java.util.Locale.Builder builder17 = builder14.setExtension('k', "CN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setLanguage("b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: b [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("9hhhhhhhhhh                                                             ", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh..", (int) 'A');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "italian (italian,english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Eagaash", "h", (int) 'f');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("CCCC\\CCCCC", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "9hhhhhhhhhh          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 121, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Franzosisch (Frankreich)", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Franzosisch (Frankreich)" + "'", str2, "Franzosisch (Frankreich)");
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0068", "H", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "iTALIAN (ITALIAN,ENGLISH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("GB");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("iFranzosisch", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GB" + "'", str3, "GB");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fr_CA", "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005" + "'", str1, "\\u005");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH" + "'", str2, "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("Italian");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'I' + "'", char1 == 'I');
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 'B', 'f');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iTALIAN", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Canada", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Cor\351e du Sud", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "R", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" + "'", str1, "Hfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u000d", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
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
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italienisch#########################################################################################", 0, "kkkkkkkkkkkkkkkkkeAGAASH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italienisch#########################################################################################" + "'", str3, "Italienisch#########################################################################################");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str8 = locale6.getExtension('R');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA", locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA" + "'", str9, "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly", "NA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ZH_CN", "nglish (united kingdom)", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("en");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    ...EnglishEn", "U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        java.lang.String str2 = locale1.getISO3Country();
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITA", charArray11);
        boolean boolean18 = locale1.equals((java.lang.Object) charArray11);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "dI!        (\\u0020,iTALICNIUEd#########################################################################################", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                     fran\347ais (france)                                       (CHINESE (CHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fran\347ais (france) (CHINESE (CHINA)" + "'", str1, "fran\347ais (france) (CHINESE (CHINA)");
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".Korean (South Korea)Korean (So");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("\\u0047");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\u0047");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ITALIE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aaaaaaaaaaaaaaaaaaaaaaaafranzo?sisch(frankreich)aaaaaaaaaaaaaa...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Engl", "cor\351en (Cor\351e du Sud)", "e                         iItal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E gl" + "'", str3, "E gl");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("nglish (United Kingdom", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "English", 4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0023", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                              Deutsch", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\uc601\uc5b4                                                                                                  ", 90, (int) 'T');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '!', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '!' + "'", char2 == '!');
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray6, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("allemand", strArray6);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str15, "r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\XTALXAN_ITALIAN_ENGLXSH", (java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", charSequence2, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz..." + "'", str1, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_NAILATI_NAXLATX\\zzzzz...");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("Italienisch#########################################################################################", strArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("\\XTALXAN_ITALIAN_ENGLXSH", strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                     g             e", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ", "", "EN_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        " + "'", str3, "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        ");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", 164, '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str3, "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('e');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "gence");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\U0020IiTALIAN\\U0020I", "                                                    k             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020IiTALIAN\\U0020I" + "'", str2, "\\U0020IiTALIAN\\U0020I");
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN", (int) 'N', "tttttt\\u0049");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN");
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aNIHc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aNIHc" + "'", str1, "aNIHc");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0020iTALIANiTALIANiTALIANiT", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#u##2#iTALIANiTALIANiTALIANiT" + "'", str3, "#u##2#iTALIANiTALIANiTALIANiT");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "kor");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIAN\\U0020IH", 'N');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Franz\366sisch", "Deutschland");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("x-lvariant-CAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "x-lvariant-CAN" + "'", str1, "x-lvariant-CAN");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444NAILATI44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444NAILATI44444444444444" + "'", str1, "44444444444444NAILATI44444444444444");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065", 79, 'z');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065" + "'", str3, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u0065");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", "\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\U0034\\U00 HCSTUD \\U0034\\U00", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0034\\U00 HCSTUD \\U0034" + "'", str2, "\\U0034\\U00 HCSTUD \\U0034");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", "a700u\\  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iTALIAN (ITALIAN,ENGLISH", "", "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iTALIAN (ITALIAN,ENGLISH" + "'", str3, "iTALIAN (ITALIAN,ENGLISH");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str2, "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0021");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "2iTALIANiTALIANiTALIANiTAL", (int) 'D', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE", "CINESE (cINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("e                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               e" + "'", str1, "                               e");
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
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
        java.lang.String str18 = locale1.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\ud504\ub791\uc2a4\uc5b4", (int) 'H');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie" + "'", str1, "\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk..." + "'", str2, "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "8600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "\\u0045", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI" + "'", str3, "ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder2.setExtension('D', "\ub3c5\uc77c\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', (int) 'A');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)", "        FRA         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                       K", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       K" + "'", str2, "                                       K");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!       _\\u0020_italienisch####################################################################...", "fr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr\\u000dfr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr-cafr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       _\\u0020_italienisch####################################################################..." + "'", str2, "hi!       _\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "a");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("G", "\ud504\ub791\uc2a4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ittait_italian_egaish          ", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ittait_italian_egaish          " + "'", str2, "ittait_italian_egaish          ");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0020I...", "\\u005c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("English                                 (                United                                 Kingdom                )", "                                      italian (ITALIAN,English)                                      ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                               ##########                                               ", "Italian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", 49, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Eagaash");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eagaash" + "'", str3, "eagaash");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061_\\u0020_italienisch#########################################################################################", (int) '8', 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Locale.setDefault(locale1);
        java.lang.String str4 = locale1.getISO3Country();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("France");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("Frankreich", locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet11 = locale10.getExtensionKeys();
        java.lang.String str12 = locale10.getVariant();
        java.lang.String str13 = locale7.getDisplayVariant(locale10);
        java.util.Locale locale16 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str17 = locale7.getDisplayLanguage(locale16);
        java.lang.String str18 = locale1.getDisplayScript(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "france");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "frankreich" + "'", str8, "frankreich");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale16.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "france" + "'", str17, "france");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\ub3c5\uc77c\uc5b4", "\\u0038zho                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str2, "\ub3c5\uc77c\uc5b4");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN" + "'", str1, "GBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                               ##########                                               ", "                ITA                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("9", "DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9" + "'", str3, "9");
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                          francese (Canada)                                           ", "                                      ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (int) 'k', 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("r-FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "r-FR" + "'", str1, "r-FR");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hi!iiiiiii_\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ANGLAIS (ROYAUME-UNI)FRA", charArray10);
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
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic" + "'", str1, "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                      )hsilgne,nailati( ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Italie                         ", "", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("fra", "G");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ititaitainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("EFrankreichgFrankreichFrankreichsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EFrankreichgFrankreichFrankreichs" + "'", str1, "EFrankreichgFrankreichFrankreichs");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("italian (italian,engl", "EEEEEEEEEFRAEEEEEEEEE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
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
            java.util.Locale.Builder builder16 = builder11.setVariant("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedh... [at index 0]");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh", 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh" + "'", str2, "azhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais cinese (cina)\\u0069h..france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzhfran\347ais (france)azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Hhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hhhhhhhhh" + "'", str1, "Hhhhhhhhh");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\XTALXAN_ITALIAN_ENGLXSH", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str2, "\\XTALXAN_ITALIAN_ENGLXSH");
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("44444444444444ITALIAN44444444444444", "hcsineilatI");
        boolean boolean11 = languageRange1.equals((java.lang.Object) strArray10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                                     German (Germany)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                                     german (germany)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44                                                                                               en44", "Deutschland", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
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
        java.lang.String str14 = locale13.getLanguage();
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "de" + "'", str14, "de");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension('5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean" + "'", str2, "Korean");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("french (canada)", "", "French (Canada)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "Chinesisch", "Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkrec)Frz\366cz(frkreitaly");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u0074");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder7 = builder1.setLanguage("RA");
        java.util.Locale.Builder builder9 = builder7.setLanguage("");
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale10.getDisplayVariant();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setLanguageTag("e             g                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: e             g                                                                                      [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("zh", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.util.Locale locale1 = new java.util.Locale("hi!       allemandtalienischallemanditalian_TALAN_Eng    \\     ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch");
        org.junit.Assert.assertEquals(locale1.toString(), "hi!       allemandtalienischallemanditalian_talan_eng    \\     adaeafagaalamanaoaqarasatauawaxazbabbbdbebfbgbhbbjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcckclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandh!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemanditalanallemandchinese (china)allemandhi!allemandzh_cnallemanditalanallemandenallemandtalienisch");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder10 = builder0.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder11 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.addUnicodeLocaleAttribute("                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                                 [at index 0]");
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
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh" + "'", str1, "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Engl", "\\u00de\\u00\\u\\u00de\\u00\\u", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Engl" + "'", str3, "Engl");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44d444", "italian (ITALIAN,English)");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "                                             hcstued                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             hcstued                                            " + "'", str2, "                                             hcstued                                            ");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "E    Italien");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E    Italien" + "'", str1, "E    Italien");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GB", "                                                                                                        ", 21);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'd');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0655de06550655de06550655d         INGS        ", "         italian_italian_english", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("italian", 'i');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'H');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "talHan" + "'", str5, "talHan");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.lang.String str4 = locale3.getCountry();
        java.lang.String str5 = locale3.getLanguage();
        java.lang.String str6 = locale1.getDisplayVariant(locale3);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        boolean boolean17 = locale3.equals((java.lang.Object) languageRangeList8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u00de\\u00\\u00de\\u00\\u00d         INGLESE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Frnz\366sisch(Knd)", "french (canada)", (int) 'C');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Fr ncG ", "             ", 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fr ncG " + "'", str3, "Fr ncG ");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ITALIA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIA" + "'", str1, "ITALIA");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", 29, "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str3, "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Deutsch");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "franz\366sisch (frankreich)");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("ENGLISCH", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("itTAiT_ITA", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("franz\366sisch (frankreich)", (java.lang.Object[]) strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "Italian", 95, (int) 'R');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "chinesisch(China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "chinesisch(China)" + "'", str1, "chinesisch(China)");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)" + "'", str2, "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\xtalxan_ITALIAN_EnglxshCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i\\u0020italianitalianitalianitaliit         \\", 99, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00 ", "CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
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
        java.lang.String str31 = locale2.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "eng" + "'", str31, "eng");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i" + "'", str2, "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                       hi!                                                              ", "                                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Deutscd", "                                                       HI!                                                              ", "", 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutscd" + "'", str4, "Deutscd");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "8ian\\u0020i86");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8ian\\u0020i86" + "'", str1, "8ian\\u0020i86");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) 'F');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0046" + "'", str1, "\\u0046");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "...                             xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                         \\u005c                                                         ", "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\u005c                                                         " + "'", str2, "                                                         \\u005c                                                         ");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Englisch (Vereinigtes K\366nigreich)", "Fgence");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u52a0\u62ff\u5927", "69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", "Franz\366sisch (Kanada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u52a0\u62ff\u5927" + "'", str3, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u30ab\u30ca\u30c0", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "TALIAN_italian_eNGLISH         ITAL", "gbr");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.util.Locale locale3 = new java.util.Locale("\\u0065                             ", "##########", "                                                                                     German (Germany)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u0065                             ");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0065                             _##########_                                                                                     German (Germany)");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "\\u0034\\u00                                             h!ih                            dallemanstuD                                             \\u0034\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e", "Eagaash");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0075", (int) 'd');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0075" + "'", str2, "\\u0075");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        java.util.Locale locale1 = new java.util.Locale("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianitalhcsineilati");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, 'I');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, 'h');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("italiano", "             \\u0049                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano" + "'", str2, "italiano");
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ran\347ais (France)                                      f                                     ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("R", "x");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "R" + "'", str2, "R");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                    ", "German");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('R');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "                                                                                        e                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hhhhhhhhH", "HI!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("erma (ermay)                                                 TALIAN                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "erma (ermay)                                                 TALIAN                                                  " + "'", str1, "erma (ermay)                                                 TALIAN                                                  ");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList10, filteringMode14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale16.getScript();
        java.util.Set<java.lang.String> strSet18 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, 'A');
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap22);
        java.util.Collection<java.util.Locale> localeCollection24 = null;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, localeCollection24);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.parse("it                   ", strMap27);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.LanguageRange[] languageRangeArray61 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList62 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList62, languageRangeArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList62, (java.util.Collection<java.lang.String>) strList67, filteringMode69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList59, filteringMode69);
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList73 = java.util.Locale.filterTags(languageRangeList28, (java.util.Collection<java.lang.String>) strList59, filteringMode72);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList74 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList25, filteringMode72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + filteringMode12 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode12.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode14.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + filteringMode37 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode37.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(languageRangeArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode69.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList73);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA..." + "'", str1, "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIA...");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh", "\\u005", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("citalian_ITALIAN_Englishna)\\u0069h...", "          HI!           ", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", (int) 'e');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("5", "", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555" + "'", str3, "5555555555");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.Locale.FilteringMode filteringMode17 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList18 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15, filteringMode17);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList15, filteringMode19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.LanguageRange[] languageRangeArray53 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList54 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList54, languageRangeArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList54, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList51, filteringMode61);
        java.util.List<java.lang.String> strList64 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap65);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strList76, filteringMode78);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList76, filteringMode80);
        java.util.Collection<java.util.Locale> localeCollection82 = null;
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, localeCollection82);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter(languageRangeList66, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList83);
        java.util.Locale locale87 = java.util.Locale.FRANCE;
        java.util.Locale locale88 = java.util.Locale.ITALIAN;
        java.lang.String str90 = locale88.getExtension('h');
        java.lang.String str91 = locale87.getDisplayScript(locale88);
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale87);
        java.lang.String str93 = locale87.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet94 = locale87.getUnicodeLocaleAttributes();
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + filteringMode17 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode17.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode19.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + filteringMode61 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode61.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode78.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it");
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!       " + "'", str92, "hi!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "French" + "'", str93, "French");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW" + "'", str2, "ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("canad", "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("e             g                                                                                     ", "EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "!IH");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'Y' + "'", char2 == 'Y');
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   \r", 'k');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ITALIAN", "italie", (int) 'z');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ITALIAN" + "'", str4, "ITALIAN");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("en_US", "                ita                ", 56, (int) 'H');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_US                ita                " + "'", str4, "en_US                ita                ");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI" + "'", str1, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\8300u\\83RA", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "4444ALLEMAND4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "RA", "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "\uc601\uc5b4                                                                                                  ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: keagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaasheagaashe [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("z...Frn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "z...frn" + "'", str1, "z...frn");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale5);
        java.lang.String str11 = locale1.getDisplayVariant(locale5);
        java.lang.String str12 = locale5.getDisplayVariant();
        java.lang.String str13 = locale5.getISO3Country();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\u0046", (java.lang.CharSequence) "\\u007");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u0046" + "'", charSequence2, "\\u0046");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "TALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIANiTALIAN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\u6cd5\u56fd", "                                     fran\347ais (France)                                      ", "h#########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u56fd" + "'", str3, "\u6cd5\u56fd");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0075", "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("6b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6b" + "'", str1, "6b");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U0034\\U00                                             HCSTUD                                             \\U0034\\U00", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0034\\U00" + "'", str2, "0034\\U00");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                         fran\347                          ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", 105);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: !ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih [at index 0]");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ILATiNA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ILATiNA..." + "'", str1, "ILATiNA...");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", 499, 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW" + "'", str3, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("und-CA", 103, (int) '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "             hcsineilatI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             hcsineilatI             " + "'", str1, "             hcsineilatI             ");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                             DE_DE                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             de_de                                             " + "'", str1, "                                             de_de                                             ");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                               nailati                                                ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               nailati                                                ko" + "'", str1, "                                               nailati                                                ko");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                  \\u0068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    " + "'", str1, "                                                    ");
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g" + "'", str1, "italian_italian_english         italian_!ihittait_italian_egaishe             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g                          she             g");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'F');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("NAC", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("jp", "dI!        (\\u0020,iTALICNIUEd#########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444FRA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC                                                                                                                                                                                                                                                                                                                                                    ", "uuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Cor\351e du Sud", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "#########FranzosischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '9', 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("CANADA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder7.setVariant("#####################################################################################");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ##################################################################################### [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.util.Locale locale1 = new java.util.Locale("it");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.lang.String str8 = locale4.getDisplayCountry();
        java.lang.String str9 = locale4.getScript();
        java.lang.String str10 = locale4.getScript();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayVariant(locale12);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.lang.String str16 = locale11.getScript();
        java.lang.String str17 = locale11.getScript();
        java.lang.String str18 = locale4.getDisplayCountry(locale11);
        java.lang.String str19 = locale3.getDisplayVariant(locale11);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.getDisplayLanguage();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale21);
        java.lang.String str24 = locale21.getCountry();
        java.lang.String str25 = locale21.getCountry();
        java.lang.String str26 = locale11.getDisplayCountry(locale21);
        java.util.Locale locale30 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = locale21.getDisplayCountry(locale31);
        java.lang.String str33 = locale1.getDisplayScript(locale31);
        java.lang.String str34 = locale1.getDisplayName();
        java.lang.Object obj35 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!IH" + "'", str23, "!IH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale30.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Italian" + "'", str34, "Italian");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "it");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0020I...", "\\u0069hhhhhhhhhh");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ne\351roc", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale3 = java.util.Locale.getDefault(category2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("French", locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("de_DE", locale3);
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FRENCH" + "'", str4, "FRENCH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DE_DE" + "'", str5, "DE_DE");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet7, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet7, '\\');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("erma (ermay)                                                 TALIAN                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "erma (ermay)                                                 TALIAN                                                  " + "'", str2, "erma (ermay)                                                 TALIAN                                                  ");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!       _\\U0020_Italienisch####################################################################          ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", (int) 'F');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("JP", "italiaE    ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.lang.String str3 = locale0.getLanguage();
        java.lang.String str4 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", "\\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI", "\\u0020iItalian\\u0020i                                                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!_\\u0020_iTLE#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!_\\u0020_iTLE#########################################################################################" + "'", str1, "!_\\u0020_iTLE#########################################################################################");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getISO3Country();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setLanguageTag("CINESE (cINA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: CINESE (cINA) [at index 0]");
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
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("erma (ermay)                                                 TALIAN                                                  ", "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ... [at index 0]");
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
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u0039", "Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinigtes K\366nigreich)Englisch (Vereinig");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setUnicodeLocaleKeyword("en-GB", "\\\\\\\\\\\\\\\\\\italian_ITALIAN_English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: en-GB [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "         italian_italian_english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getDisplayVariant();
        java.lang.String str4 = locale1.getCountry();
        java.lang.String str5 = locale1.getISO3Language();
        java.lang.String str6 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("             hcsineilatI             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#", "AD  \\u007a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                               INGLESE                                ", (java.lang.CharSequence) "ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("FRANZ\366SISCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: FRANZo?SISCH [at index 0]");
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
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ADKAEKAFKAGKAIKALKAMKANKAOKAQKARKASKATKAUKAWKAXKAZKBAKBBKBDKBEKBFKBGKBHKBIKBJKBLKBMKBNKBOKBQKBRKBSKBTKBVKBWKBYKBZKCAKCCKCDKCFKCGKCHKCIKCKKCLKCMKCNKCOKCRKCUKCVKCWKCXKCYKCZKDEKDJKDKKDMKDOKDZKECKEEKEGKEHKERKESKETKFIKFJKFKKFMKFOKFRKGAKGBKGDKGEKGFKGGKGHKGIKGLKGMKGNKGPKGQKGRKGSKGTKGUKGWKGYKHKKHMKHNKHRKHTKHUKIDKIEKILKIMKINKIOKIQKIRKISKITKJEKJMKJOKJPKKEKKGKKHKKIKKMKKNKKPKKRKKWKKYKKZKLAKLBKLCKLIKLKKLRKLSKLTKLUKLVKLYKMAKMCKMDKMEKMFKMGKMHKMKKMLKMMKMNKMOKMPKMQKMRKMSKMTKMUKMVKMWKMXKMYKMZKNAKNCKNEKNFKNGKNIKNLKNOKNPKNRKNUKNZKOMKPAKPEKPFKPGKPHKPKKPLKPMKPNKPRKPSKPTKPWKPYKQAKREKROKRSKRUKRWKSAKSBKSCKSDKSEKSGKSHKSIKSJKSKKSLKSMKSNKSOKSRKSSKSTKSVKSXKSYKSZKTCKTDKTFKTGKTHKTJKTKKTLKTMKTNKTOKTRKTTKTVKTWKTZKUAKUGKUMKUSKUYKUZKVAKVCKVEKVGKVIKVNKVUKWFKWSKYEKYTKZAKZMKZW");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "X");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.util.Locale locale1 = new java.util.Locale("CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "cccccccccccccanglais (canadaccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fRANZ\326SISCH (kANADA)", "ILATiNA...royaume-uniroyaume-uniroy", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AnihC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI!", 10, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale8 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str9 = locale0.getDisplayCountry(locale8);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale11 = locale0.stripExtensions();
        java.lang.String str12 = locale0.getDisplayName();
        java.lang.String str13 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale8.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fran\347ais (France)" + "'", str12, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FRA" + "'", str13, "FRA");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                      ITALIAN (italian,eNGLISH)                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN (italian,eNGLISH)" + "'", str1, "ITALIAN (italian,eNGLISH)");
    }
}
