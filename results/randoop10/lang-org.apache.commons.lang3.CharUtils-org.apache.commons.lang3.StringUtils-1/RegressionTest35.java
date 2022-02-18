import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("DEUTSCH", 51, 720);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ccccccccccccccccccccccccccccccccccccccccccccc", "               Deutschland", (int) 'b');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACfr-CAWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "italian (italian,english", (int) '9');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("g             E", 16, 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale.setDefault(locale9);
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.lang.String str14 = locale2.getDisplayVariant(locale9);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        boolean boolean16 = locale15.hasExtensions();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleKeys();
        java.lang.String str18 = locale9.getDisplayName(locale15);
        boolean boolean20 = locale9.equals((java.lang.Object) "nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)");
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                         fran\347                          ", "und-iTALIAN", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("nglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)Jnglish (united kingdom)", "zh-TW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'c');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'c' + "'", char1 == 'c');
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Fr ncG ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Fr ncG" + "'", str1, "Fr ncG");
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "en_ca", (int) '\ud504');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'R', 'Y');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'R' + "'", char2 == 'R');
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "   h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\U0020IiTALIAN\\U0020I                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA", 20, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
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
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("\\u0061");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: \\u0061 [at index 0]");
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
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cinese (cina)\\u0069h..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (cina)\\u0069h.." + "'", str1, "cinese (cina)\\u0069h..");
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("Italien");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF [at index 0]");
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
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("n,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\ualian (italiait", "Cinese (Cina)\\u0069h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\u0020iTALIANiTALIANiTALIANiTALI", "English", 4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0023", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                              Deutsch", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("2", (int) (byte) 0, '\ud504');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2" + "'", str3, "2");
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Franz\366sisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franz\366sisch" + "'", str1, "Franz\366sisch");
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "kor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("##################    \\XTALXAN_ITALIAN_ENGLXSH    ###################", "Italie", (int) (short) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                               ", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "onailati", 0, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("z", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                                                                              Deutsch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                          g             E", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  aNIHc   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aNIHc" + "'", str1, "aNIHc");
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("anglais (Royaume-Uni)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANGLAIS (rOYAUME-uNI)" + "'", str1, "ANGLAIS (rOYAUME-uNI)");
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HIAN\\U0020Ih", "\\u0038zho                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        double double9 = languageRange1.getWeight();
        java.lang.String str10 = languageRange1.getRange();
        double double11 = languageRange1.getWeight();
        java.lang.String str12 = languageRange1.getRange();
        boolean boolean14 = languageRange1.equals((java.lang.Object) "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "e" + "'", str8, "e");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "e" + "'", str10, "e");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "e" + "'", str12, "e");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0034\\u00                                             hcstud                                             \\u0034\\u00", '\ud504');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("8600u\\                                                                                                                  ", "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIII", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 406, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\u4e2d\u6587\u4e2d\u56fd)", "hcierknarF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str2, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    \\    ", "))))))))))))))))))))))))))))))))))))))))))))))))))))", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_", "hi!(\\U0020,Italienisch#########################################################################################", "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHs");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_" + "'", str3, "HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
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
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "en_ca", charArray12);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('0', 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", 'b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\" + "'", str2, "\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\HI!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", 10, "         ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("zh_TW", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.lang.String str3 = locale0.getExtension('F');
        java.lang.String str4 = locale0.getScript();
        java.lang.String str5 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
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
            java.util.Locale.Builder builder10 = builder5.setExtension('8', "\ud55c\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 8 [at index 0]");
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
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hcstueD");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, " Italia ", (int) (short) 10, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "itTAiT_ITA", 52);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "English");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', 101, 40);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("italieital", strArray5);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ITALIE", 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\\italian_ITALIAN_English", strArray5, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\italian_ITALIAN_English" + "'", str16, "\\italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        java.util.Locale locale1 = new java.util.Locale("TA...");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getScript();
        java.lang.String str4 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ta..." + "'", str4, "ta...");
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\u0049", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!       ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 0, "9hhhhhhhhhh                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("italian (italian,english                                                                    ", (int) 'B', 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("inglesehhhhhhhhHITTAIT_ITALIAN_EGAISH          italy", "ZH_CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0044", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "ad4ae4af4ag4ai4al4am4an4ao4aq4ar4as4at4au4aw4ax4az4ba4bb4bd4be4bf4bg4bh4bi4bj4bl4bm4bn4bo4bq4br4bs4bt4bv4bw...", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0044" + "'", str4, "\\u0044");
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franzo?sischfranzosisch (frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.getLanguage();
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh", "zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A" + "'", str2, "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)\\u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)A");
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("tTAT_ITA", locale1);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TTAT_ITA" + "'", str3, "TTAT_ITA");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-RF", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-rf");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("anau00", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...", (int) 'F');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBV" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBV");
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese" + "'", str2, "francese");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                               nailati                                                ko");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("talienisch", "zh", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", "Cor\351e du Sud", "                                             DEUTSCH                                             ", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH" + "'", str4, "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "de", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...It...", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
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
        java.lang.String str13 = locale2.getScript();
        java.lang.String str14 = locale2.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", 'a', 'H');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str3, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Italia                                                               ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("fr-CA", "gence", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\uc911\uad6d\uc5b4\uc911\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "\uad6d\uc911\uc5b4\uad6d\uc911IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
        char[] charArray10 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "fr", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "de                                                                                                                      ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0078", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("####...", "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR          2cinese (cina)italianitalianitalianital)", (int) 't');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####..." + "'", str3, "####...");
    }

    @Test
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("iFtlnz\\sisc02rankreich)00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkNI", "und-iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0046", (int) 'F', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("6400aUa\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", "R-FRAAAAAAAAAAAAAAAAAAAAAAAAAAAR-FR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ailatI", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ailatI" + "'", str2, "ailatI");
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I" + "'", str1, "!I");
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("FRAADzAEzAFzAGzAIzALzAMzANzAOzAQzARzAzAx");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ENGLISCH (         italian_italian_english,\\U0061", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ENGLISCH (         italian_italian_english,\\U0061" + "'", str2, "ENGLISCH (         italian_italian_english,\\U0061");
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0020italianitalianitalianitali", "                                                                                                       ", 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020italianitalianitalianitali" + "'", str3, "\\u0020italianitalianitalianitali");
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("IT44444444444444444EN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IT44444444444444444EN" + "'", str1, "IT44444444444444444EN");
    }

    @Test
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       HI!       ", (int) 'B', 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Korean (South Korea)");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("italiaE", "4AE4AF4AG4AI4AL4AM4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("nglish (United Kingdom");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglish (United Kingdom" + "'", str1, "nglish (United Kingdom");
    }

    @Test
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Franz\366sischhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", "ermanglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII(nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIermaynglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII)nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                 nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIANnglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                  ", (int) '!');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "x");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ita", "BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKIHM");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4es K\366\uc601\uc5b4\uc601\uc5b4ch)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4es K\366\uc601\uc5b4\uc601\uc5b4ch)" + "'", str1, "\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4es K\366\uc601\uc5b4\uc601\uc5b4ch)");
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                                                    NC_HZ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                                                    nc_hz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
        java.lang.String[] strArray1 = java.util.Locale.getISOCountries();
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("franz\366sisch(frankreich)", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi! allemandtalienischallemanditalian_TALAN_Eng \\ ADAEAFAGAALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCCKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandH!allemandtalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALANallemandenallemandtalienisch", 7, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...emandtalienischallemandi..." + "'", str3, "...emandtalienischallemandi...");
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\uc601\uc5b4                                                                                                  ", "hi!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String[] strArray3 = java.util.Locale.getISOCountries();
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) 'x', (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean10 = languageRange1.equals((java.lang.Object) str9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str4, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW" + "'", str9, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "8600u\\                                 hsiAgE_NAILATI_TiATti                                        ", "Franz\366sischFranzosisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ta...", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italia                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("...#####################################################################", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...#####################################################################");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ", (java.lang.CharSequence) "uni");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            " + "'", charSequence2, "    \\XTALXAN_ITALIAN_ENGLXSH    R0                                               nailati            ");
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder9 = builder7.setLanguage("FRA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         u005c          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
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
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getVariant();
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
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
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
            java.util.Locale.Builder builder12 = builder6.removeUnicodeLocaleAttribute("########################################################################################eltI_0200U\\_!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ########################################################################################eltI_0200U\\_! [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "und_CA");
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444FRA", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("hsxlgnE_NAILATI_naxlatx\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "Franzosisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de", 115);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("n       nn", "EEEEEEEEEFRAEEEEEEEEECCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n       nn" + "'", str2, "n       nn");
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                              ECANADAgCANADACANADAsh", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              ECANADAgCANADACANADAsh" + "'", str2, "                                                                              ECANADAgCANADACANADAsh");
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI" + "'", str1, "FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkedkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", (int) 'Y');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
        int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("TALIAN\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN\\U002" + "'", str1, "TALIAN\\U002");
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG", 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG" + "'", str2, "ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                         \\u005c                                                         ", "                       \\u0020                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c" + "'", str2, "5c");
    }

    @Test
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("2E             giTALIANiTALIANi", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.Class<?> wildcardClass4 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fra" + "'", str2, "fra");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         ", "en-US", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
        java.util.Locale locale3 = new java.util.Locale("", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", "CAN");
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.toLanguageTag();
        java.lang.Object obj6 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_CAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)" + "'", str4, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN (CAN)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-lvariant-CAN" + "'", str5, "x-lvariant-CAN");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_CAN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_CAN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "_\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN_CAN");
    }

    @Test
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u30a4\u30bf\u30ea\u30a2\u8a9e", 406);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str2, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse(" italian  ", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList16, filteringMode20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.util.Locale.FilteringMode filteringMode33 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strList31, filteringMode33);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList31, filteringMode35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        java.util.Locale.FilteringMode filteringMode45 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList43, filteringMode45);
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList36, filteringMode45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.parse("nailati", strMap49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList50, strMap51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList52, strMap53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap56);
        java.util.Locale locale58 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet59 = locale58.getExtensionKeys();
        java.lang.String str60 = locale58.getVariant();
        java.lang.String str61 = locale58.getDisplayName();
        java.lang.String str62 = locale58.getCountry();
        java.util.Set<java.lang.String> strSet63 = locale58.getUnicodeLocaleKeys();
        java.lang.String str64 = java.util.Locale.lookupTag(languageRangeList57, (java.util.Collection<java.lang.String>) strSet63);
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.lang.String>) strList74, filteringMode76);
        java.util.Locale.FilteringMode filteringMode78 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList74, filteringMode78);
        java.util.Collection<java.util.Locale> localeCollection80 = null;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, localeCollection80);
        java.util.Locale locale82 = java.util.Locale.lookup(languageRangeList57, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale locale83 = java.util.Locale.lookup(languageRangeList52, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale locale85 = java.util.Locale.lookup(languageRangeList4, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap86);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode18.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode20.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + filteringMode33 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode33.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode35.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + filteringMode45 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode45.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(languageRangeList57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Italian" + "'", str61, "Italian");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode76.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + filteringMode78 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode78.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNull(locale85);
        org.junit.Assert.assertNotNull(languageRangeList87);
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('E', (int) '\\');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1\\u0061\\u0061\\u0061                           ", "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", "FRENCH (CANADA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\u0061\\u0061\\u0061                           " + "'", str3, "1\\u0061\\u0061\\u0061                           ");
    }

    @Test
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0052", (java.lang.CharSequence) "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "itTAiT_ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("HCSTUED", (double) 'I');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=73.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("FRANCESE (cANADA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ")ADANAc( ESECNARF" + "'", str1, ")ADANAc( ESECNARF");
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                okokok                                                                                                                                ", "en-GB                                                                                                                ", (int) '\ud504');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Chinese (China", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitalij...anitali", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("zho", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                             de_de                                              ", (double) 73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=73.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444ALLEMAND 4444", "REHEGEEECEZDODMDKDJDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBY");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444ALLEMAND 4444" + "'", str2, "4444ALLEMAND 4444");
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)" + "'", str1, "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222FRANCESE (cANADA)");
    }

    @Test
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
        java.util.Locale locale1 = new java.util.Locale(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("franc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: franc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))\\u0039");
    }

    @Test
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\ud504", "", 109);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504" + "'", str3, "\ud504");
    }

    @Test
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italian_ITALIAN_English", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDi...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setVariant("ANGLAIS (ROYAUME-UNI)FRA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ANGLAIS (ROYAUME-UNI)FRA [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", "\ud504\ub791\uc2a4", 72);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("             \\u0049             ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff" + "'", str5, "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
    }

    @Test
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("I", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setScript("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: i\\u0020iTALIANiTALIANiTALIANiTALIit         \\      [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "\\u0034\\u00 hcstud \\u0034\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("United States", "FRANZ\326SISCH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList13);
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
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap32);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet35, "\\u005c");
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet35, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap41);
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder43.clearExtensions();
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = locale45.getDisplayName();
        java.util.Locale.Builder builder47 = builder44.setLocale(locale45);
        java.util.Locale locale48 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder49 = builder44.setLocale(locale48);
        java.util.Set<java.lang.String> strSet50 = locale48.getUnicodeLocaleAttributes();
        java.lang.String str51 = locale48.getVariant();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.lang.String str53 = locale52.getDisplayLanguage();
        java.lang.String str54 = locale48.getDisplayLanguage(locale52);
        java.util.Set<java.lang.String> strSet55 = locale48.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList56 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strList56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + filteringMode9 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode9.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode24.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "French (Canada)" + "'", str46, "French (Canada)");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Italian" + "'", str53, "Italian");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "tedesco" + "'", str54, "tedesco");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strList56);
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue('\u671d');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character ? is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'E', 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'E' + "'", char2 == 'E');
    }

    @Test
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "aaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFRANZ\326SISCH\n(FRANKREICH)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        java.util.Locale locale2 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str5 = locale2.getLanguage();
        java.util.Locale locale8 = new java.util.Locale("gERMAN (gERMANY)", "it_IT");
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        java.lang.String str10 = locale2.getDisplayScript(locale8);
        org.junit.Assert.assertEquals(locale2.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0045" + "'", str4, "\\u0045");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0045" + "'", str5, "\\u0045");
        org.junit.Assert.assertEquals(locale8.toString(), "german (germany)_IT_IT");
        org.junit.Assert.assertNotNull(charSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u006bCinese (Cina)\\u0069h..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chinese", '!');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("         INGLESE        ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
        java.util.Locale locale2 = new java.util.Locale("    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati", "FR...");
        org.junit.Assert.assertEquals(locale2.toString(), "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati_FR...");
    }

    @Test
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
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
        java.util.Set<java.lang.String> strSet15 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale8.getVariant();
        java.lang.String str17 = locale8.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet18 = locale8.getExtensionKeys();
        java.lang.String str19 = locale8.getDisplayCountry();
        java.util.Set<java.lang.String> strSet20 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str21 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\U0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("zh", "hi!_\\U0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u4e2d\u6587\u4e2d\u56fd)", "2CINESE (CINA)ITALIANITALIANITALIANITAL", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Korean", 52, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Korean" + "'", str3, "Korean");
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\u0034", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0034" + "'", str2, "\\u0034");
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: \\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0... [at index 0]");
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
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "", "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh" + "'", str3, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("\\U005");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: \\U005");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str1, "\u52a0\u62ff\u5927eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00de\\u00\\u00de\\u00\\u00d         INGLESE        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                         ", (java.lang.CharSequence) "                                                                                           U0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0020", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("deutsch", strArray5, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "deutsch" + "'", str13, "deutsch");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale1);
        java.lang.String str3 = locale1.getLanguage();
        java.util.Locale locale4 = locale1.stripExtensions();
        java.lang.String str6 = locale4.getExtension('N');
        java.lang.String str7 = locale4.getDisplayScript();
        java.lang.String str8 = locale4.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "franz\366sisch (frankreich)" + "'", str2, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str1, "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("    ZH_CN    ", 'G');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih dalleman", "itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...", 2, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ..." + "'", str3, "                                                                                         U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
    }

    @Test
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("FRZ\326CZ(FRKREC)                                                 ", '\ud504');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRZ\326CZ(FRKREC)                                                 " + "'", str2, "FRZ\326CZ(FRKREC)                                                 ");
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zh_CN", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("CN", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "CHINA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("dallemandallemandallemandallemandallemandallemandallemandalle");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'd' + "'", char1 == 'd');
    }

    @Test
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\u671d', 'H');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\u671d' + "'", char2 == '\u671d');
    }

    @Test
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "HI!", (int) '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 111, (int) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCC" + "'", str3, "CCCCCCCCC");
    }

    @Test
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              " + "'", str1, "                                                                              ");
    }

    @Test
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("8300u\\", "4AE4AF4AG4AI4AL4AM4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                  IT44444444444444444EN", 109, 262);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  IT44444444444444444EN" + "'", str3, "                                                  IT44444444444444444EN");
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("NI d00u\\00u\\ed00u\\00u\\ed00u\\G ESEL", " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale.Builder builder14 = builder0.clearExtensions();
        java.util.Locale locale15 = builder0.build();
        java.util.Locale.Builder builder16 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder0.setRegion("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???? [at index 0]");
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ixii");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnloltlulvmgmhmimkmlmnmomrmsmtmynanbndnengnlnnnonrnvnyocojomorospapiplpsptqurmrnrorurwsascsdsesgsiskslsmsnsosqsrssstsusvswtatetgthtitktltntotrtstttwtyugukuruzvevivowawoxhyiyozazhzu", 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnlo" + "'", str2, "aaabaeafakamanarasavayazbabebgbhbibmbnbobrbscacechcocrcscucvcydadedvdzeeeleneoeseteufafffifjfofrfygagdglgngugvhahehihohrhthuhyhziaidieigiiikinioisitiuiwjajijvkakgkikjkkklkmknkokrkskukvkwkylalblglilnlo");
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "zhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        java.util.Locale locale2 = new java.util.Locale("                                             de_de                                             ", "u00\\u0034\\u00                                             hcstud                                             \\u0034");
        org.junit.Assert.assertEquals(locale2.toString(), "                                             de_de                                             _U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0065");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("Uuuuu", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\nFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn (can)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "e             g                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                             xx_xx                                              ", "         ITALIAN_italian_eNGLISH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str1, "Nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED..", (java.lang.CharSequence) "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119 + "'", int2 == 119);
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("germa", (int) 'u', 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca", " italian  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca");
    }

    @Test
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "chinois (Chine)", (java.lang.CharSequence) "Di!        (\\U0020,ItalicniueD#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ailatI", (int) '!');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ailatI" + "'", str2, "ailatI");
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet19, 'E');
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
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-CA" + "'", str3, "fr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("an\\u00", "English");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "an\\u00" + "'", str2, "an\\u00");
    }

    @Test
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0034\\u00                                             hcstud                                             \\u0034\\u00", "hi!_\\U0020...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiichn");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.parse("Eagaash");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList42, strMap43);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList46, strMap47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList46, strMap49);
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str53 = locale52.getCountry();
        java.lang.String str54 = locale52.getDisplayVariant();
        java.lang.String str55 = locale52.getCountry();
        java.util.Set<java.lang.String> strSet56 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, "!_\\U0020_Itle#########################################################################################");
        java.lang.String str60 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet56, 'n');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.parse("nailati", strMap62);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList63, strMap64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap66 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList63, strMap66);
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.util.Locale locale70 = java.util.Locale.ITALIAN;
        java.lang.String str72 = locale70.getExtension('h');
        java.lang.String str73 = locale69.getDisplayScript(locale70);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale69);
        java.lang.String str75 = locale69.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet76 = locale69.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange languageRange78 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange80 = new java.util.Locale.LanguageRange("E");
        java.lang.String str81 = languageRange80.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] { languageRange78, languageRange80 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.util.Locale locale85 = java.util.Locale.ITALIAN;
        java.lang.String str86 = locale85.getDisplayLanguage();
        java.util.Locale locale87 = locale85.stripExtensions();
        java.lang.String str88 = locale85.getLanguage();
        java.util.Set<java.lang.String> strSet89 = locale85.getUnicodeLocaleKeys();
        java.lang.String str91 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet89, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode92 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, (java.util.Collection<java.lang.String>) strSet89, filteringMode92);
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList67, (java.util.Collection<java.lang.String>) strSet76, filteringMode92);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList46, (java.util.Collection<java.lang.String>) strSet56, filteringMode92);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList44, (java.util.Collection<java.lang.String>) strSet56);
        java.lang.String str97 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList96);
        java.lang.String str99 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList96, "         0         ");
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
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!       " + "'", str74, "hi!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "French" + "'", str75, "French");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "e" + "'", str81, "e");
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Italian" + "'", str86, "Italian");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "it");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "it" + "'", str88, "it");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + filteringMode92 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode92.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ITALIAN                                                                 ", "eAGAASH", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                                  \\u0068");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                           U0020ITALIANITALIANITALIANITALI", "EAGAASH", (int) 'i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\", strArray7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                               \\U0020", "ranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        itTAiT_ITALIAN_EgAish                       )modgniK detinU( hsilgnE", "                                                                                                                                             \\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("fra");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("", locale3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", locale3);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fra");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fra" + "'", str4, "fra");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI" + "'", str6, "ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("CANADA", "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai", (int) 'C', 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai" + "'", str4, "ititaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitaitai");
    }

    @Test
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ti", "talHan");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i\\u0020iTALIANiTALIANiTALIANiTALIit", 499, "    \\    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\" + "'", str3, "i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\");
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "cinese (Cina)\\u0069h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale1.getVariant();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("Canada", locale1);
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getISO3Country();
        java.lang.String str6 = locale1.toLanguageTag();
        java.lang.String str7 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CANADA" + "'", str3, "CANADA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Korean (South Korea)" + "'", str4, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KOR" + "'", str5, "KOR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ko-KR" + "'", str6, "ko-KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale7.getDisplayLanguage();
        java.lang.String str10 = locale7.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT", "Korean (South Korea)", "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT" + "'", str3, "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
    }

    @Test
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FranzosischFranz\366sisch (Kanada)(Frankreich)", "                                                                                                                  \\U0068", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                              ECANADAgCANADACANADAsh                                                                              ECANADAgCANADACANADAsh                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                             hcsfr-CueD                                             ", (int) 'a', 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             hcsfr-CueD                                         ..." + "'", str3, "                                             hcsfr-CueD                                         ...");
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                 INGLESE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder0.setExtension('k', "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
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
    }

    @Test
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Italienisch#########################################################################################", 3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ECANADAgCANADACANADAsh");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str7, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str4 = locale1.getDisplayName();
        java.lang.String str5 = locale1.getDisplayName();
        java.lang.String str6 = locale1.getDisplayVariant();
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("cinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh", locale1);
        java.util.Locale.setDefault(locale1);
        java.lang.String str9 = locale1.getISO3Country();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("2aiTALIANiTALIANiTALIANiTAL");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale1.getDisplayVariant(locale11);
        java.util.Set<java.lang.String> strSet14 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh" + "'", str7, "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Frnz\366sisch (Knd)");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 't');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Frnz\366sischt(Knd)" + "'", str3, "Frnz\366sischt(Knd)");
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        java.util.Locale locale1 = new java.util.Locale("n");
        org.junit.Assert.assertEquals(locale1.toString(), "n");
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("x");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("d");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("Eagaash");
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
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList36, filteringMode38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList46, filteringMode48);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList52);
        java.lang.String str55 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale locale56 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale59 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale61 = new java.util.Locale("");
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Locale locale63 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str64 = locale62.getDisplayScript(locale63);
        java.util.Locale locale65 = java.util.Locale.ENGLISH;
        java.lang.String str66 = locale65.getDisplayCountry();
        java.util.Locale locale67 = java.util.Locale.PRC;
        java.util.Locale locale68 = java.util.Locale.US;
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.util.Locale locale70 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str71 = locale69.getDisplayScript(locale70);
        java.util.Locale locale72 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet73 = locale72.getExtensionKeys();
        java.util.Locale locale74 = java.util.Locale.ITALIAN;
        java.lang.String str75 = locale74.getDisplayLanguage();
        java.util.Locale locale76 = java.util.Locale.FRENCH;
        java.util.Locale locale77 = java.util.Locale.US;
        java.util.Locale locale78 = java.util.Locale.ITALIAN;
        java.lang.String str79 = locale78.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale56, locale59, locale61, locale62, locale65, locale67, locale68, locale70, locale72, locale74, locale76, locale77, locale78, locale80 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList82, filteringMode86);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap89 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList90 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap89);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList92 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale93 = java.util.Locale.ROOT;
        java.lang.String str94 = locale93.getISO3Country();
        java.util.Set<java.lang.String> strSet95 = locale93.getUnicodeLocaleKeys();
        java.lang.String str96 = java.util.Locale.lookupTag(languageRangeList92, (java.util.Collection<java.lang.String>) strSet95);
        java.lang.String str97 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet95);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "it");
        org.junit.Assert.assertNotNull(charSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "it");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "italiano" + "'", str75, "italiano");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "italiano" + "'", str79, "italiano");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNotNull(languageRangeList90);
        org.junit.Assert.assertNotNull(languageRangeList92);
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("KorezhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemandn (South Korea)", "nailatiko");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("8ian\\u0020i86", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8ian\\u0020i86" + "'", str2, "8ian\\u0020i86");
    }

    @Test
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\ud504\ub791\uc2a4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\\u00de\\u00\\u00de\\u00\\u00d         INGLESE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u00de\\u00\\u00de\\u00\\u00dinglese");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444ITALIAN4444444444", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\n", "hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setScript("                                 KOREAN (SOUTH KOREA)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                  KOREAN (SOUTH KOREA) [at index 0]");
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
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("okokok");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
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
        java.util.Locale.setDefault(locale10);
        java.lang.String str15 = locale10.getExtension('N');
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cinese (Cina)" + "'", str11, "cinese (Cina)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str3 = locale2.getDisplayScript();
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(locale2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("R", locale2);
        java.lang.String str7 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "R" + "'", str6, "R");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN", "italieital");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!zH_CN");
    }

    @Test
    public void test17754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "bbbbbbbbbb   cor\351en    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#", 78, 'G');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#" + "'", str3, "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#");
    }

    @Test
    public void test17756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "anglais (royaume-uni)fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)" + "'", str2, "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
    }

    @Test
    public void test17758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                             de_de                                              ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test17759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17759");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test17760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", " tli                                                               ", "EN_ca...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test17761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17761");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("d");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("nailati", strMap3);
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
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList29);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleKeys();
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
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
        java.lang.String str61 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList58);
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale67 = new java.util.Locale("");
        java.util.Locale locale68 = java.util.Locale.FRANCE;
        java.util.Locale locale69 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str70 = locale68.getDisplayScript(locale69);
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.lang.String str72 = locale71.getDisplayCountry();
        java.util.Locale locale73 = java.util.Locale.PRC;
        java.util.Locale locale74 = java.util.Locale.US;
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Locale locale76 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str77 = locale75.getDisplayScript(locale76);
        java.util.Locale locale78 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet79 = locale78.getExtensionKeys();
        java.util.Locale locale80 = java.util.Locale.ITALIAN;
        java.lang.String str81 = locale80.getDisplayLanguage();
        java.util.Locale locale82 = java.util.Locale.FRENCH;
        java.util.Locale locale83 = java.util.Locale.US;
        java.util.Locale locale84 = java.util.Locale.ITALIAN;
        java.lang.String str85 = locale84.getDisplayLanguage();
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale62, locale65, locale67, locale68, locale71, locale73, locale74, locale76, locale78, locale80, locale82, locale83, locale84, locale86 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.List<java.util.Locale> localeList93 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap94 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList95 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode15.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
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
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "it");
        org.junit.Assert.assertNotNull(charSet79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "it");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Italian" + "'", str81, "Italian");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "fr");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "it");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Italian" + "'", str85, "Italian");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNotNull(localeList93);
        org.junit.Assert.assertNotNull(languageRangeList95);
    }

    @Test
    public void test17762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itTAiT_ITALIAN_EgAish                                                                               " + "'", str1, "itTAiT_ITALIAN_EgAish                                                                               ");
    }

    @Test
    public void test17763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i", "\\U0020ItalianItalianItalianItali\\U0020ItalianItalianItalianItal");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" + "'", str3, "                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }

    @Test
    public void test17764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                               \\u002", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test17765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", "und-CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz" + "'", str2, "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test17766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("NAILATI", "FRENCH (CANADA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17767");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF", "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz", "....................................................................................... (italian,english)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17770");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('g');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "italian_ITALIAN_English", (java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test17772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "FRANCESE (cANADA)", "Germany");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17773");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "E             g                                                                                     ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray6, strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("9hhhhhhhhhh          9hhhhhhhhhh   ", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str11, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9hhhhhhhhhh          9hhhhhhhhhh   " + "'", str12, "9hhhhhhhhhh          9hhhhhhhhhh   ");
    }

    @Test
    public void test17774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17774");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  ", "ZHO                               44\\U002344  \\U0020ITALIANITALIANITALIANITALI", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "zzzChina");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17776");
        java.util.Locale locale2 = new java.util.Locale("ANGLAIS (ROYAUME-UNI)FRA", "JP");
        org.junit.Assert.assertEquals(locale2.toString(), "anglais (royaume-uni)fra_JP");
    }

    @Test
    public void test17777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "2cinese (Cina...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2cinese (Cina..." + "'", str1, "2cinese (Cina...");
    }

    @Test
    public void test17778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\uc601\uc5b4", 223);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4                                                                                                              " + "'", str2, "\uc601\uc5b4                                                                                                              ");
    }

    @Test
    public void test17779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("kkkkkkkkkkkkkkkkkeAGAASH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\", "    \\XTALXAN_ITALIAN_ENGLXSH    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\" + "'", str2, "FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
    }

    @Test
    public void test17781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17782");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        boolean boolean2 = locale1.hasExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                 CANADA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068", "C");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                              Deutsch", "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17786");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'D' + "'", char1 == 'D');
    }

    @Test
    public void test17787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17787");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '4', '8');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
    }

    @Test
    public void test17788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17788");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "ko_KR");
    }

    @Test
    public void test17789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17789");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  \\u007a555555555555555555555555555555555", "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test17790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17790");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test17791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17791");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17792");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("HI!HI     \\u005c         ", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!hi\\u005c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRENCH                     ", "  \\u007a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17794");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("Italy");
        java.util.Locale locale8 = new java.util.Locale("Aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "                                                                               ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_                                                                               ");
    }

    @Test
    public void test17795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccc" + "'", str2, "cccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test17796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17796");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("NA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_CN", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17797");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '!', '!');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '!' + "'", char2 == '!');
    }

    @Test
    public void test17798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17798");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("dallemandallemandallemandallemandallemandallemandallemandalle");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17799");
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
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setRegion("\\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test17800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                         \\u0046                                                         ", 115, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test17801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ko-kr                                                                                                    ", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                " + "'", str2, "                                                ");
    }

    @Test
    public void test17802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("italian_ITALIAN_EnglisF", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17803");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("            zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:             zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
    }

    @Test
    public void test17804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)" + "'", str2, "  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
    }

    @Test
    public void test17805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I\\U0020IiTALIAN\\U0020I", "ITTAIT_ITALIAN_EGAISH          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test17806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0020hi!       _\\U0020_Italienisch################", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0020hi!       _\\U0020_Italienisch################" + "'", str2, "\\u0020hi!       _\\U0020_Italienisch################");
    }

    @Test
    public void test17807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005" + "'", str1, "\\u005");
    }

    @Test
    public void test17808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17808");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "9hhhhhhhhhh                                                             hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("             DE_DE             ", "\\u0061                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17812");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        java.lang.String str9 = locale6.getDisplayCountry();
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.Object obj11 = locale6.clone();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
    }

    @Test
    public void test17813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!        (\\u0020,italienisch#########################################################################################)", (int) 'A', 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444ITALIAN4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17815");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder8.setLanguage("44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranzo?sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test17816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17816");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             DEUTSCH                                             ", "CAN", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("...anitali", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                             DEUTSCH                                             " + "'", str5, "                                             DEUTSCH                                             ");
    }

    @Test
    public void test17817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17817");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de\\u00ccccccccccccccccccccccccccccccccccccccccccccccc", (double) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=92.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17818");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale locale6 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale6.getExtension('h');
        java.lang.String str9 = locale5.getDisplayScript(locale6);
        boolean boolean10 = locale5.hasExtensions();
        java.lang.String str11 = locale5.getVariant();
        java.util.Set<java.lang.Character> charSet12 = locale5.getExtensionKeys();
        java.lang.String str13 = locale2.getDisplayScript(locale5);
        java.util.Locale locale14 = null;
        java.lang.String str15 = locale5.getDisplayScript(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-CA" + "'", str3, "fr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("English (United Kingdom)", "eR-GB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17820");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale0.getDisplayCountry();
        java.lang.String str5 = locale0.getScript();
        java.lang.String str6 = locale0.getScript();
        java.util.Locale.setDefault(locale0);
        java.lang.String str8 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
    }

    @Test
    public void test17821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0043\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("CCCC\\CCCCC", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED8...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U000A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000A" + "'", str1, "\\U000A");
    }

    @Test
    public void test17824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17824");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("FRENCH (CANADA)", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17825");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.lang.String str4 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale2.getUnicodeLocaleType("Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test17826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17826");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.Object obj6 = locale4.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "...anitali");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "...anitali");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "...anitali");
    }

    @Test
    public void test17827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "NAC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("       DE_DE            ", "ian\\u0020i", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       DE_DE            " + "'", str3, "       DE_DE            ");
    }

    @Test
    public void test17829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17829");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Deutschland", "ja");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 104, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17832");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("DE_DE");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("rnz\366sisch(Knd", strArray5, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DE_DE" + "'", str8, "DE_DE");
    }

    @Test
    public void test17833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("de", 99, 'd');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd" + "'", str3, "dddddddddddddddddddddddddddddddddddddddddddddddddeddddddddddddddddddddddddddddddddddddddddddddddddd");
    }

    @Test
    public void test17834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17834");
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
        java.util.Locale locale19 = new java.util.Locale("KOREAN (SOUTH KOREA)", "n");
        java.util.Locale locale22 = new java.util.Locale(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))iTALIAN", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str23 = locale19.getDisplayScript(locale22);
        java.util.Set<java.lang.Character> charSet24 = locale19.getExtensionKeys();
        java.lang.String str25 = locale8.getDisplayLanguage(locale19);
        java.lang.String str26 = locale8.getISO3Country();
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
        org.junit.Assert.assertEquals(locale19.toString(), "korean (south korea)_N");
        org.junit.Assert.assertEquals(locale22.toString(), ")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))italian_44444444444444444444444444444444IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\366SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese" + "'", str25, "Chinese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CHN" + "'", str26, "CHN");
    }

    @Test
    public void test17835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 374, "\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI" + "'", str3, "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
    }

    @Test
    public void test17836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17836");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("Franz\366sisch (Kanada)", '\ud504');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'F' + "'", char2 == 'F');
    }

    @Test
    public void test17837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17837");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "de", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "de-DE", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test17838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Frnz\366sisch(Knd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Frnz\366sisch(Knd)" + "'", str1, "Frnz\366sisch(Knd)");
    }

    @Test
    public void test17839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                  HSIAGE_NAILATI_TIATTIHI!_NAILATI HSILGNE_NAILATI_NAILAT", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("fran\347ais (Canaaa)", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17841");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", (java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC" + "'", charSequence2, "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC");
    }

    @Test
    public void test17842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17842");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Englisch (Vereinigtes K\366nigreich)", "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)", 8, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0049");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0049" + "'", str1, "\\U0049");
    }

    @Test
    public void test17844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Korean (South Korea)", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IjAPANESE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch" + "'", str1, "...u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
    }

    @Test
    public void test17846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc" + "'", str2, "aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc");
    }

    @Test
    public void test17847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17847");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.List<java.lang.String> strList35 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList33);
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList33);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList33, "English (United Kingdom)");
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList33, '8');
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList33, 'n');
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList33);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList43, "\\U0020ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + filteringMode29 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode29.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test17848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###################################i####################################", "4300U\\                                             DUTSCH                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################i####################################" + "'", str2, "###################################i####################################");
    }

    @Test
    public void test17849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h########################################################################################", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h########################################################################################" + "'", str2, "h########################################################################################");
    }

    @Test
    public void test17850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", "\\u0020iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh" + "'", str2, "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh");
    }

    @Test
    public void test17851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ADAEAFAGAI\\u0034\\u00                                             hcstueD                                             \\u0034\\u00XAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", "\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("z", "...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17853");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                 \\u0059                                  ", 'e');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test17854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##################    \\XTALXAN_TALAN_ENGLXSH    ###################", (java.lang.CharSequence) "Japanese");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("iTTAIT_ITALIAN_EGAISH          ", "\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00hFranzosischFranzosisch(Frankreich)\\FranzosischFranzosisch(Frankreich)0034\\FranzosischFranzosisch(Frankreich)00(\\U0020IITALIAN\\U0020I)", "2ITHI!_\\U0020_ITALIENISCH####################################################################2I");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Frankreich", "\uc774\ud0c8\ub9ac\uc544\uc5b4");
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", "iFranzosisch ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      " + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                       (italian,english)                                      i (italian,english)                                      ");
    }

    @Test
    public void test17860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                ian\\u00208ian\\u0020i868ian\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ian\\u00208ian\\u0020i868ian\\u00" + "'", str1, "ian\\u00208ian\\u0020i868ian\\u00");
    }

    @Test
    public void test17861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH" + "'", str1, "HZHZHZHZHZHZHZHZHZHZAHZSAHZRAHZQAHZOAHZNAH");
    }

    @Test
    public void test17862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17862");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "\\u005c");
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet34, "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet34);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList41, strMap42);
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.Locale.FilteringMode filteringMode52 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList50, filteringMode52);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList60, filteringMode62);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList66);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strList66);
        java.util.Locale locale70 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleKeys();
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet71, "...ANiTALI");
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strSet71);
        java.util.Locale.Builder builder76 = new java.util.Locale.Builder();
        java.util.Locale locale77 = builder76.build();
        java.util.Locale locale79 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str80 = locale77.getDisplayLanguage(locale79);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.upperCase("", locale79);
        java.lang.String str82 = locale79.getScript();
        java.util.Set<java.lang.String> strSet83 = locale79.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, (java.util.Collection<java.lang.String>) strSet83);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strList84);
        java.lang.String str87 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList85, "hI!");
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
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(languageRangeList43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + filteringMode52 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode52.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test17863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17863");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("French (Canada)", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                          g             E", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test17864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE" + "'", str2, "fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE");
    }

    @Test
    public void test17865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17865");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hcierknarF");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test17866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                          French", "fran\347ais (france) (CHINESE (CHINA)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch" + "'", str2, "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
    }

    @Test
    public void test17869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17869");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale1);
        java.lang.String str7 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale1.getExtension('E');
        java.util.Locale locale11 = null;
        java.lang.String str12 = locale1.getDisplayScript(locale11);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!       " + "'", str6, "hi!       ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French" + "'", str7, "French");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test17870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17870");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutscd\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test17871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17871");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1\\u0061\\u0061\\u0061", "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222", "it_I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str2, "                                                                             zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz2222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test17873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17873");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test17874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17874");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("KOR");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        boolean boolean5 = languageRange1.equals((java.lang.Object) " nailati             ");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17875");
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
            java.util.Locale.Builder builder47 = builder45.removeUnicodeLocaleAttribute("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (ALLEMAND) [at index 0]");
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
    public void test17876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("cHN", "8600u\\                                                                                                                  ", "\u82f1\u8a9e");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2cinese (Cina)iTALIANiTALIANiTALIANiTAL" + "'", str1, "2cinese (Cina)iTALIANiTALIANiTALIANiTAL");
    }

    @Test
    public void test17878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("anihC", "hi!        (\\u0020,italienisch#########################################################################################)", "ITALIENISCH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "anihC" + "'", str3, "anihC");
    }

    @Test
    public void test17879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17879");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("franci", "                                                               \\u002", "69\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "franci" + "'", str4, "franci");
    }

    @Test
    public void test17880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ITALIAE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17881");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '8', '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
    }

    @Test
    public void test17882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                             de_de                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_de" + "'", str1, "de_de");
    }

    @Test
    public void test17883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17883");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("e             HCSINEILATI             g             HCSINEILATI                          HCSINEILATI             sh", "nailati");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17884");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FrkrB", "                                                     \\u005c        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17886");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=ecanada                                      ...g                                      ...canadacanada                                      ...sh                                      ...                                                                                                   ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test17888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020hi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANhi!       _\\U0020_Italienisch#########################################################################################TALIANiTALI", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiCHN");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', (int) 'i', 12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test17889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17889");
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
        java.lang.String str17 = locale0.getISO3Language();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ita" + "'", str17, "ita");
    }

    @Test
    public void test17890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", (int) '#', "cHINESISCH (cHINA)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   " + "'", str3, "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
    }

    @Test
    public void test17891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17892");
        java.util.Locale locale1 = new java.util.Locale("44444444444444444444444444444444!IH");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "44444444444444444444444444444444!ih");
    }

    @Test
    public void test17893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("fr_CA", "Italienisch#########################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0020italianitalianitalianitali", 0, (int) 'c');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17894");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA" + "'", str1, "CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-CA" + "'", str2, "fr-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CA" + "'", str3, "CA");
    }

    @Test
    public void test17895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17895");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'F', 'Y');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'F' + "'", char2 == 'F');
    }

    @Test
    public void test17896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17896");
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
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale locale16 = new java.util.Locale("\\u005c");
        java.lang.String str17 = locale16.getVariant();
        java.lang.String str18 = locale16.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder14.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u005c [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese (China)" + "'", str11, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals(locale16.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test17897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17897");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("JP");
        java.util.Locale.setDefault(category0, locale3);
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "44444444444444444444444444444444!ih");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "jp");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test17898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17898");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0020", "Italian");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0020" + "'", str5, "\\u0020");
    }

    @Test
    public void test17899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "", "Hhhhhhhhh");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("zhazhzhzhzhzhzhzhzhzhzh_UND-CA", "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zhazhzhzhzhzhzhzhzhzhzh_UND-CA" + "'", str2, "zhazhzhzhzhzhzhzhzhzhzh_UND-CA");
    }

    @Test
    public void test17901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17901");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "                                                                                     g             e");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand" + "'", str3, "Eallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmandallmand");
    }

    @Test
    public void test17903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17903");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped((java.lang.Character) '\u671d');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u671d" + "'", str1, "\\u671d");
    }

    @Test
    public void test17904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u", "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17905");
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
        java.util.Locale.setDefault(locale14);
        java.lang.String str20 = locale14.getScript();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test17906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17906");
        char[] charArray12 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Fr ncG ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aNIHc", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! _\\U0020_Italienisch####################################################################", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test17907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)", (java.lang.CharSequence) "Und-iTALIAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("8600u\\                                                                                                                  ", (int) 'd', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          2cinese (cina)italianitalianitalianital", "!_\\U0020_ITLE#########################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17910");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17911");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)", "\\italian_ITALIAN_English");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("iTALIAN", (java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca", 109, (int) '!');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test17912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("tali...an", "ecanadaGcanadacanadaSH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tali...an" + "'", str2, "tali...an");
    }

    @Test
    public void test17913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "                                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17914");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "ko");
    }

    @Test
    public void test17915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("CHINESE (CHINA)", "hcstueD");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI     \\u005c", 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI     \\u005c" + "'", str2, "HI!HI     \\u005c");
    }

    @Test
    public void test17917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17917");
        java.util.Locale locale3 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("...anitali");
        java.lang.String str6 = locale3.getDisplayName(locale5);
        java.lang.String str8 = locale5.getExtension('Y');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = locale5.getUnicodeLocaleType("###################################i#######...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ###################################i#######...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)" + "'", str6, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17918");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale locale6 = builder5.build();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet7, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet7, "44444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test17919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A", "444444444it                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test17920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17920");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("CANADA");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setLanguageTag("Italian");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayName();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale15);
        java.lang.String str18 = locale15.getISO3Language();
        java.util.Locale.Builder builder19 = builder7.setLocale(locale15);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = locale20.getDisplayName(locale21);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.lang.String str25 = locale21.getDisplayVariant(locale24);
        java.lang.String str26 = locale24.toLanguageTag();
        java.util.Locale.Builder builder27 = builder19.setLocale(locale24);
        java.lang.String str28 = locale24.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)" + "'", str3, "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str16, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "allemand" + "'", str22, "allemand");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ko" + "'", str26, "ko");
        org.junit.Assert.assertNotNull(builder27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ko" + "'", str28, "ko");
    }

    @Test
    public void test17921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17921");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setUnicodeLocaleKeyword("                   ", "k");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                     [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test17922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17922");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Italienisch#########################################################################################", "frankreich", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  \\u007a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u007a" + "'", str1, "\\u007a");
    }

    @Test
    public void test17924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("nc_HZ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nc_HZ" + "'", str2, "nc_HZ");
    }

    @Test
    public void test17925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("tit");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tit" + "'", str1, "tit");
    }

    @Test
    public void test17926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       DE_DE            ", "\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test17928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17928");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("inglesehhhhhhhhh", "chinese", (int) 'T');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("n       nn", "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAFFR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17930");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("aaaaaaaaaaaaaaaaaaaaaaaaFranzos...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aaaaaaaaaaaaaaaaaaaaaaaafranzos...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17931");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('.', 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test17932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn");
    }

    @Test
    public void test17933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("8600u\\                                 hsiAgE_NAILATI_TiATti");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8600u\\                                 hsiAgE_NAILATI_TiATti" + "'", str1, "8600u\\                                 hsiAgE_NAILATI_TiATti");
    }

    @Test
    public void test17934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\ud55c\uad6d\uc5b4", "talian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                              \\     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\" + "'", str1, "\\");
    }

    @Test
    public void test17936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ADA\\AFAGA0A5AMANAOAQARASA6A0AWAXAZBABBBDB\\BFBGBHB0BJB5BMBNBOBQBRBSB6BVBWBYBZCACCCDCFCGCHC0CKC5CMCNCOCRC0CVCWCXCYCZD\\Dh...", "ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "ittait_italian_egaish          ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test17937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("FRANZ\326SISCH2(FRANKREICH)", "hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326SISCH2(FRANKREICH)" + "'", str2, "FRANZ\326SISCH2(FRANKREICH)");
    }

    @Test
    public void test17938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB" + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB");
    }

    @Test
    public void test17939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17939");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'B', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'B' + "'", char2 == 'B');
    }

    @Test
    public void test17940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!       _\\U0020_Italienisch####################################################################          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!       _\\U0020_Italienisch####################################################################          " + "'", str1, "Hi!       _\\U0020_Italienisch####################################################################          ");
    }

    @Test
    public void test17941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGitalian", "hi!_\\U0020_Italienisch#########################################################################################", "COR\311EN");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test17942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17942");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "an\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17943");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "fran\347ais (france) (CHINESE (CHINA)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test17944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17944");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("de-DE", (double) '\u671d');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=26397.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                              de_de                              ", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              de_de                              " + "'", str2, "                              de_de                              ");
    }

    @Test
    public void test17946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Uuuuu", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuu" + "'", str2, "uuuu");
    }

    @Test
    public void test17947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", "zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0061", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061" + "'", str2, "\\u0061");
    }

    @Test
    public void test17949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17949");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\\u0078");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\u0078");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                 Frnz\366sisch(Knd                                                  ", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 Frnz\366sisch(Knd                                                  " + "'", str2, "                                                 Frnz\366sisch(Knd                                                  ");
    }

    @Test
    public void test17951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("(C)ALANALANALANAL", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(C)ALANALANALANAL" + "'", str2, "(C)ALANALANALANAL");
    }

    @Test
    public void test17952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "germa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17953");
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
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale47.getLanguage();
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale47);
        java.util.Locale locale51 = java.util.Locale.FRANCE;
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        java.lang.String str54 = locale52.getExtension('h');
        java.lang.String str55 = locale51.getDisplayScript(locale52);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale51);
        java.lang.String str57 = locale47.getDisplayVariant(locale51);
        java.util.Locale.Builder builder58 = builder44.setLocale(locale51);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder60 = builder44.setScript("\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: \\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW) [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
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
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "French" + "'", str39, "French");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ko" + "'", str48, "ko");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "TALIAN\\U0023" + "'", str49, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "it");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!       " + "'", str56, "hi!       ");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test17954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ANGLAIS (R                                                                                                                     ", "    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17955");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh", "                                                                                               en");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("tedesco");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\ub3c5\uc77c\uc5b4", strArray3, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "iFranzosisch ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB", 0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ub3c5\uc77c\uc5b4" + "'", str6, "\ub3c5\uc77c\uc5b4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tedesco" + "'", str8, "tedesco");
    }

    @Test
    public void test17956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!", (int) 'N', "fr_CA                             ...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_CA                             ...HI!fr_CA                             ...!" + "'", str3, "fr_CA                             ...HI!fr_CA                             ...!");
    }

    @Test
    public void test17957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                    NC_HZ", "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    NC_HZ" + "'", str2, "                                                                    NC_HZ");
    }

    @Test
    public void test17958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17959");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a700u\\", "t!li!!_ITALIAN_E!glish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH" + "'", str2, "\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH");
    }

    @Test
    public void test17961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\r\rneilatI    E\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test17962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17962");
        java.util.Locale locale3 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "ITALIEN", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!nglish (United Kingdom)!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese!ih!");
    }

    @Test
    public void test17963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17963");
        java.util.Locale locale1 = new java.util.Locale("en");
        boolean boolean2 = locale1.hasExtensions();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        java.util.Locale.setDefault(locale6);
        java.lang.String str10 = locale6.getScript();
        java.util.Locale locale11 = locale6.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "inglese" + "'", str8, "inglese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
    }

    @Test
    public void test17964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17964");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" \\U0078 ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0078" + "'", str2, "\\U0078");
    }

    @Test
    public void test17965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17965");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.util.Locale locale8 = locale3.stripExtensions();
        java.util.Locale.setDefault(category1, locale3);
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale.setDefault(category1, locale10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("E             g                                                                                     ", locale10);
        java.lang.String str14 = locale10.getVariant();
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "e             g                                                                                     " + "'", str13, "e             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test17966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!_\\u0020_iTLE#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!_\\u0020_iTLE#########################################################################################" + "'", str1, "!_\\u0020_iTLE#########################################################################################");
    }

    @Test
    public void test17967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444NAILATI44444444444444", "s (Canada)", 262);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'T');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444NAILATI44444444444444" + "'", str5, "44444444444444NAILATI44444444444444");
    }

    @Test
    public void test17968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("2CINESE (CINA...", 8, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17969");
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
        java.lang.String str16 = locale13.getLanguage();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "france" + "'", str16, "france");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test17970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17970");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", 51, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hcsineilati", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkDEkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana" + "'", str1, "a)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAdZH_cnFrench (Cana");
    }

    @Test
    public void test17973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17973");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("zh");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale11 = locale9.stripExtensions();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale13.getDisplayCountry(locale15);
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet20 = locale15.getUnicodeLocaleKeys();
        java.lang.String str21 = locale11.getDisplayVariant(locale15);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str25 = locale23.getExtension('h');
        java.lang.String str26 = locale22.getDisplayScript(locale23);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getLanguage();
        java.lang.String str30 = locale22.getDisplayCountry(locale28);
        java.util.Set<java.lang.String> strSet31 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str32 = locale22.toLanguageTag();
        java.lang.String str33 = locale11.getDisplayName(locale22);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "francese (Canada)" + "'", str3, "francese (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str14, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u6cd5\u56fd" + "'", str30, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "fr-FR" + "'", str32, "fr-FR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "chinois" + "'", str33, "chinois");
    }

    @Test
    public void test17974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\uc601\uc5b4", "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "U00\\U0034\\U00                                             HCSTUD                                             \\U0034");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4" + "'", str3, "\uc601\uc5b4");
    }

    @Test
    public void test17975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17975");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("c", "Chinesisch (Ch", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test17976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17976");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = locale45.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
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
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
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
    }

    @Test
    public void test17977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ITTAIT_ITALIAN_EGAISHI!_\\U0020_ITLE###########", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("TITITITITITIT", "       DE_DE            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test17979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("FRANCESEFRANCESEFRANCESEFR\\U0075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRANCESEFRANCESEFRANCESEFR\\U0075" + "'", str1, "FRANCESEFRANCESEFRANCESEFR\\U0075");
    }

    @Test
    public void test17980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17980");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                               )))))))))))))))))))))))))))))))))))))))))))))))))))");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test17981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND", "                                                                                              Deutsch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND" + "'", str2, "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND");
    }

    @Test
    public void test17982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17982");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI");
    }

    @Test
    public void test17984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                         \\u005", "                                                                        ", "z...Frn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005" + "'", str3, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005");
    }

    @Test
    public void test17985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("KR", "chinoisf(Chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "KR" + "'", str2, "KR");
    }

    @Test
    public void test17986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("chinois", "iTALIAN                                                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'i');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
    }

    @Test
    public void test17987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AN\\U00", 32, 'F');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str3, "AN\\U00FFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test17988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17988");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0074", "44444444444444444444444444444444444444444444it                   ", (int) 'U');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test17989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17989");
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
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("italian");
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Locale.Builder builder17 = builder13.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setRegion("hcstued");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hcstued [at index 0]");
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "italian");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "italian");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test17990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17990");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant();
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         ", '\\');
        boolean boolean9 = locale2.equals((java.lang.Object) strArray8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                      ITALIAN (italian,eNGLISH)                                      ", 'b', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      ITALIAN (italian,eNGLISH)                                      " + "'", str3, "                                      ITALIAN (italian,eNGLISH)                                      ");
    }

    @Test
    public void test17992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17992");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale1.getDisplayScript(locale2);
        java.util.Locale locale9 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str10 = locale1.getDisplayCountry(locale9);
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale12 = locale1.stripExtensions();
        java.lang.String str13 = locale1.getDisplayName();
        java.util.Set<java.lang.String> strSet14 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale1);
        java.lang.String str16 = locale1.getISO3Country();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "France" + "'", str10, "France");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fran\347ais (France)" + "'", str13, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
    }

    @Test
    public void test17993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17993");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder5.build();
        java.util.Locale locale10 = builder5.build();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.lang.String str12 = locale11.getISO3Country();
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.util.Locale locale14 = locale11.stripExtensions();
        java.lang.String str15 = locale10.getDisplayScript(locale14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test17994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17994");
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale1.getDisplayCountry(locale5);
        java.lang.String str9 = locale5.getExtension('E');
        java.lang.String str10 = locale5.getLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.upperCase("it44444444444444444en", locale5);
        java.util.Set<java.lang.Character> charSet12 = locale5.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale5.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIAN" + "'", str6, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian" + "'", str10, "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IT44444444444444444EN" + "'", str11, "IT44444444444444444EN");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test17995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17995");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2italianitalianitalianitali", (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17996");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("nc_HZ", 'f');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test17997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17997");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046", "\uc911\uad6d\uc5b4\uc911\uad6d)", 46, 267);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str4, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)");
    }

    @Test
    public void test17998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17998");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("USEEEE", "ccccccccccccccccccccccccccccccccccccccccccccc", "                                NI                                 bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USEEEE" + "'", str4, "USEEEE");
    }

    @Test
    public void test17999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444!IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test18000");
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
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale25.getVariant();
        java.lang.String str28 = locale25.getDisplayName();
        java.lang.String str29 = locale25.getDisplayName();
        java.lang.String str30 = locale25.getDisplayLanguage();
        java.lang.String str32 = locale25.getExtension('e');
        java.util.Locale locale33 = locale25.stripExtensions();
        java.util.Locale.setDefault(category0, locale33);
        java.util.Locale locale37 = new java.util.Locale("  aNIHc   ", "tttttt\\u0049");
        java.lang.String str38 = locale33.getDisplayVariant(locale37);
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
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Italian" + "'", str28, "Italian");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Italian" + "'", str29, "Italian");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Italian" + "'", str30, "Italian");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals(locale37.toString(), "  anihc   _TTTTTT\\U0049");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }
}
