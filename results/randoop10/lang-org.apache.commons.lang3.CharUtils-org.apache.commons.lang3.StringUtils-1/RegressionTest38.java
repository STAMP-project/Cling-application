import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HCSINEI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHcaNIHc", "aaaaaaaaaaaaCaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc...", (int) (byte) 10, (int) 'n');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance", "    \\     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance" + "'", str2, "francefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrancefrance");
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Italian (italian,english", 116, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777Italian (italian,english" + "'", str3, "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777Italian (italian,english");
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444ITALIAN44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444ITALIAN4444444444444" + "'", str1, "44444444444444ITALIAN4444444444444");
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale7.getDisplayName(locale13);
        java.lang.String str16 = locale7.getScript();
        java.lang.String str17 = locale5.getDisplayCountry(locale7);
        java.lang.String str18 = locale5.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet6);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "France" + "'", str17, "France");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr_FR" + "'", str18, "fr_FR");
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################################i####################################", (int) 'i', (int) 't');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz", 9, "2E             GITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz" + "'", str3, "dnamezhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARFhzhzhzhzhzhzhzhzhzhz");
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ITALIENISC", "itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getVariant();
        java.lang.String str5 = locale1.getExtension('i');
        java.lang.String str6 = locale1.getDisplayLanguage();
        java.lang.String str7 = locale1.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais" + "'", str6, "fran\347ais");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fran\347ais (Canada)" + "'", str7, "fran\347ais (Canada)");
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        char[] charArray9 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "X", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CCCC\\CCCC                                                       ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TALY", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             xx_xx                                              ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Italienisch");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhh italia");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale locale6 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayName(locale3);
        java.util.Locale locale12 = new java.util.Locale("hi!", "English", "");
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = locale3.getDisplayScript(locale12);
        java.util.Locale locale15 = locale12.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!_ENGLISH");
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        char[] charArray11 = new char[] { ' ', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITA", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch (Kanada", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "FRNZ\326SISCH(KND)", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAAAAAAAA)aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a", "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAeeeeeeeeeeeex");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ")aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a" + "'", str2, ")aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RF_rf" + "'", str1, "RF_rf");
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("cHINESISCH(cHINA)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHINESISCH(cHINA)" + "'", str1, "cHINESISCH(cHINA)");
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                        e                               ", 0, 113);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                        e                        " + "'", str3, "                                                                                        e                        ");
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!       _\\u0020_italienisch####################################################################...", "EnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale locale6 = new java.util.Locale("                                     fran\347ais (France)                                      ", "Chinese (China");
        java.lang.String str7 = locale6.getDisplayVariant();
        java.lang.String str8 = locale1.getDisplayLanguage(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals(locale6.toString(), "                                     fran\347ais (france)                                      _CHINESE (CHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "deutsch" + "'", str8, "deutsch");
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder7 = builder3.clear();
        java.util.Locale locale8 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA2", "TALIAN\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia", "h########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\XTALXAN_ITALIAN_ENGLXSH                                                 ", "Franz\366sisch (Frankreich)");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "h#########################################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '!');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH                                                 " + "'", str4, "\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH                                                 " + "'", str6, "\\XTALXAN_ITALIAN_ENGLXSH                                                 ");
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCIAN\\U0020ICCCCCCC", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCIAN\\U0020ICCCCCCC" + "'", str2, "CCCCCCIAN\\U0020ICCCCCCC");
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
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
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleKeys();
        java.lang.String str15 = locale10.getVariant();
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0034                                                                                              ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
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
        java.util.Locale.Builder builder14 = builder8.addUnicodeLocaleAttribute("Egsh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder14.setUnicodeLocaleKeyword("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "\u97d3\u6587\u5357\u97d3)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str3, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        java.util.Locale locale1 = new java.util.Locale("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        java.lang.String str2 = locale1.getISO3Country();
        java.lang.String str3 = locale1.getCountry();
        java.lang.String str4 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" hi!       _\\U0020...", "###################################i#######...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "onailati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                               nailati                                                ", 20, 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               nailati                                                " + "'", str3, "                                               nailati                                                ");
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Italie");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italie" + "'", str1, "italie");
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI" + "'", str1, "\\U000ITALIANITALIANITALIANITALI\\U000ITALIANITALIANITALIANITALHcsineilatI");
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#####################################################################################", "                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################" + "'", str2, "#####################################################################################");
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ", (java.lang.CharSequence) "United Kingdom");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   " + "'", charSequence2, "\\u0068       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih       !ih   ");
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str4 = locale0.getDisplayScript(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getUnicodeLocaleType("allemand");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: allemand");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("             \\u0049             ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (int) '\ud504');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Franz\366sisch (Kanada)", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...E_NAILATI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...E_NAILATI..." + "'", str1, "...E_NAILATI...");
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch", (int) 'I', 122);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...nglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEngli..." + "'", str3, "...nglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEngli...");
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.lang.String str7 = locale1.getScript();
        java.lang.String str8 = locale1.getDisplayVariant();
        java.util.Locale locale9 = locale1.stripExtensions();
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale9.getDisplayLanguage(locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "anglais" + "'", str10, "anglais");
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("nglisch                                                                                                                                                                                                                                                               ", "cinese (Cina)\\u0069h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "nglisch", (java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("UD                                 ", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\", '8');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'F', 62, 52);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_ITALIAN_ENGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0034", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\" + "'", str9, "\\");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HcsineilatI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hcsineilat" + "'", str1, "Hcsineilat");
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        char[] charArray8 = new char[] { 'f', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "itTAiT_ITALIAN_EgAish", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "frankreich", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("french (canada)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "f4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[f, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Franz\366sischhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franz\366sischhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh" + "'", str1, "Franz\366sischhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh");
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CKCLCMCNCOCRCUCVCWCXCYCZDEDh...IBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIaDAEAFAGA", "korezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "YBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHER");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                   ", "                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064\\U0064");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "\\u0042", "CCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("\\!u!00!de!\\!u!0", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("i");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...itTAiT_ITA...", "Italie                         ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", "                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NA");
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale4 = new java.util.Locale("");
        java.util.Locale.setDefault(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.util.Locale locale8 = new java.util.Locale("TA...");
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = locale8.getVariant();
        java.lang.String str12 = locale1.getDisplayName(locale8);
        java.lang.String str13 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "na");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals(locale8.toString(), "ta...");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Nauru" + "'", str12, "Nauru");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Nauru" + "'", str13, "Nauru");
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ja", (int) 'z', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ja                                                                                                                        " + "'", str3, "ja                                                                                                                        ");
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                  iTALIE                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("G");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                              ITALIEITAL", "\351encor\351encor\351encor");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\U0020_Itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\!_\\u0020_itle\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00000000000000coreen (Coree du Sud");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000coreen (Coree du Sud" + "'", str1, "00000000000000coreen (Coree du Sud");
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444ALLEMAND4444", 74, (int) 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("it-IT", "H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', (int) 't');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                    ", locale4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("franz\366sisch (frankreich)", 'G');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ')');
        boolean boolean14 = locale4.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "franz\366sisch (frankreich)" + "'", str11, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "franz\366sisch (frankreich)" + "'", str13, "franz\366sisch (frankreich)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
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
        boolean boolean12 = locale6.equals((java.lang.Object) "harzhaszhazhzhzhzhzhzhzhzhzhz");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("zhAzhzhzhzhzhzhzhzhzhzh", 25, "          HI!           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " zhAzhzhzhzhzhzhzhzhzhzh " + "'", str3, " zhAzhzhzhzhzhzhzhzhzhzh ");
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH" + "'", str2, "Hhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIHhcse...e...tIH");
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)", "tedesco");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0068" + "'", str1, "\\u0068");
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEa", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rZH_cn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("nglisch                                                                                                                                                                                                                                                               ", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("                                      italian (ITALIAN,English)                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=                                      italian (italian,english)                                      ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Italy", 'f');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italy" + "'", str2, "Italy");
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, '\ud504');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("German (Germany)", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German (Germany)" + "'", str2, "German (Germany)");
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA" + "'", str1, "itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ZH_NGGGGG", "          HI!           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "talHan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "talHan" + "'", str1, "talHan");
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        java.util.Locale locale3 = new java.util.Locale("zh-TW", "ITALIE", "");
        org.junit.Assert.assertEquals(locale3.toString(), "zh-tw_ITALIE");
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Locale locale7 = java.util.Locale.getDefault(category1);
        java.util.Locale locale8 = java.util.Locale.getDefault(category1);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale8.getDisplayScript(locale10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.lowerCase("...       g                     ...", locale8);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "...       g                     ..." + "'", str13, "...       g                     ...");
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.lang.String str8 = locale4.getScript();
        java.lang.String str9 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getISO3Language();
        java.lang.String str6 = locale3.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "allemand" + "'", str2, "allemand");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de" + "'", str4, "de");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "deu" + "'", str5, "deu");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "de" + "'", str6, "de");
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hcierknarF", "Hcsineilat");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("France");
        java.util.Locale locale5 = new java.util.Locale("hi!       _\\U0020_Italienisch####################################################################...", "italian_ITALIAN_English", "hcsineilatI");
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.util.Locale locale9 = new java.util.Locale("!IH", "Hhhhhhhhhh");
        java.lang.String str10 = locale5.getDisplayCountry(locale9);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "france");
        org.junit.Assert.assertEquals(locale5.toString(), "hi!       _\\u0020_italienisch####################################################################..._ITALIAN_ITALIAN_ENGLISH_hcsineilatI");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale9.toString(), "!ih_HHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ITALIAN_ITALIAN_ENGLISH" + "'", str10, "ITALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "FRENCH (CANADA)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("6b", "ITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITITIT");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale11 = new java.util.Locale("\\u005c");
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale13);
        java.lang.String str15 = locale13.getVariant();
        java.lang.String str16 = locale11.getDisplayScript(locale13);
        java.lang.String str18 = locale11.getExtension('C');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("italian (ITALIAN,English)", locale11);
        java.lang.String str20 = locale7.getDisplayLanguage(locale11);
        java.lang.String str21 = locale11.getDisplayCountry();
        java.lang.String str22 = locale11.getDisplayScript();
        java.util.Locale.setDefault(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale11.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u005c");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale11.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "franz\366sisch (frankreich)" + "'", str14, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italian (italian,english)" + "'", str19, "italian (italian,english)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "Hhhhhhhhhh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ROYAUME-UNI", "\\u0044", (int) 'H');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale0.getDisplayVariant();
        java.lang.String str7 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr" + "'", str7, "fr");
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...78zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh...", "HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HHH ITALIA", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHH ITALIA" + "'", str2, "HHH ITALIA");
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        java.lang.Iterable<java.lang.String> strIterable0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strIterable0, '0');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      )HSILGNE,NAILATI( ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxNCHI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                      " + "'", str2, "                                                                                                      ");
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ITTAIT_ITALIAN_EGAISH          ", 115, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "TITHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("iTTAIT_ITALIAN_EGAISH", "                                               ##########", "         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAishE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                          shE             g                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.lang.String[] strArray5 = new java.lang.String[] { "...ANiTALI", "             ", "          " };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale10);
        java.lang.String str16 = locale10.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet17 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet17, "FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!       " + "'", str15, "hi!       ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "French" + "'", str16, "French");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0066", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("ixii", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split(")dnK( hcsis\366znrF", "B");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hhhhhhhhH", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hhhhhhhhH" + "'", str10, "hhhhhhhhH");
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.lang.String str7 = locale5.getDisplayLanguage();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.upperCase("", locale12);
        java.lang.String str15 = locale12.getScript();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet17 = locale12.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale12);
        java.lang.String str19 = locale12.getLanguage();
        java.util.Set<java.lang.Character> charSet20 = locale12.getExtensionKeys();
        boolean boolean21 = locale12.hasExtensions();
        java.lang.String str22 = locale5.getDisplayVariant(locale12);
        java.lang.String str23 = locale5.getCountry();
        java.lang.String str24 = locale5.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "italian" + "'", str19, "italian");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale8 = new java.util.Locale("chinois (Chine)", "\\italian_ITALIAN_English");
        java.util.Locale.setDefault(category0, locale8);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "italian");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "italian");
        org.junit.Assert.assertEquals(locale8.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!!!!!!!!!!!!!!!!!!!!!!    zh_cn    !!!!!!!!!!!!!!!!!!!!!!", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Korean (Souti\\u0020iTALIANiTALIANiTALIANiTALIitBBBBBBBBB\\BBBBB Korea)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ZH_cnFrench (Canada)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
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
        java.util.Locale.setDefault(locale14);
        java.lang.String str18 = locale14.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )" + "'", str18, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )");
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\u82f1\u56fd", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u56fd " + "'", str2, "\u82f1\u56fd ");
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("United Kingdom");
        java.util.Locale locale3 = new java.util.Locale("HHHHHHHHH");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale1.getDisplayCountry(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals(locale3.toString(), "hhhhhhhhh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Azhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfr-CA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=?????????????????????????????????????????????????fr-ca??????????????????????????????????????????????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap42 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap42);
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
        java.lang.String str59 = java.util.Locale.lookupTag(languageRangeList43, (java.util.Collection<java.lang.String>) strList58);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap62 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList63 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList61, strMap62);
        java.util.Locale locale66 = new java.util.Locale("chinois (Chine)", "\\italian_ITALIAN_English");
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet67);
        java.lang.String str70 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList68, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList72 = java.util.Locale.filterTags(languageRangeList43, (java.util.Collection<java.lang.String>) strList68, filteringMode71);
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList68, 'a');
        java.lang.String str76 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList68, 'a');
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
        org.junit.Assert.assertNotNull(languageRangeList43);
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
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertEquals(locale66.toString(), "chinois (chine)_\\ITALIAN_ITALIAN_ENGLISH");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", "nglischIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)", "chinois");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ete");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhE             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444it                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   ti444444444" + "'", str1, "                   ti444444444");
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                    ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("U", charArray5);
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
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC##############\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("-RF", "C", (int) '\ud504', (int) 'x');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-RFC" + "'", str4, "-RFC");
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 'd', '\u6cd5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('Y', 997);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 997 + "'", int2 == 997);
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "             hcsineilatI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             hcsineilatI             " + "'", str1, "             hcsineilatI             ");
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AhzRAhzQAhzOAhzNAh", "kor", "44444444444444444444444444444444IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 720);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AhzRAhzQAhzOAhzNAh" + "'", str4, "AhzRAhzQAhzOAhzNAh");
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0059", (int) 'f', (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\u82f1\u6587", 81);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u82f1\u6587" + "'", str2, "\u82f1\u6587");
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "iTALIAN", (int) '#');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray10, strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, ' ', (int) (short) 0, (int) (byte) -1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english", strArray6, strArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("Ital", strArray14);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("E             g                          ", strArray14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english" + "'", str20, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzitalian (italian,english");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                                                                                         italian (italian,e...                                                                                          ", "Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ROYAUME-UNI", (int) 'D');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ROYAUME-UNI" + "'", str2, "ROYAUME-UNI");
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("TALY", "                                                                                              DEUTSCH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder4.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\englisch");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...nglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEngli...", "CCCCCCCCCCCCCanglais (CanadaCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("FRANZ\326SISCHFRANZOSISCH (FRANKREICH)UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\italian_ITALIAN_English");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ed");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ed" + "'", str1, "ed");
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AD  \\u007a", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("dnaHhhhhhhhhdnam", "Fr ncG ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dnaHhhhhhhhhdnam" + "'", str2, "dnaHhhhhhhhhdnam");
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
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
        java.util.Locale locale22 = new java.util.Locale("44444444444444444444444444444444!IH");
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale24.getVariant();
        java.util.Locale locale28 = new java.util.Locale("");
        java.util.Locale.setDefault(locale28);
        java.lang.String str30 = locale24.getDisplayName(locale28);
        java.lang.String str31 = locale22.getDisplayCountry(locale24);
        java.util.Locale.setDefault(category0, locale22);
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
        org.junit.Assert.assertEquals(locale22.toString(), "44444444444444444444444444444444!ih");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "French (Canada)" + "'", str30, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "EagaasiTALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aNCHc", "fran\347ais (Canada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("FrancGa", 371, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "FrancGahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("NC_hz");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NC_hz" + "'", str2, "NC_hz");
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("TEDESCO", 'l');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TEDESCO" + "'", str2, "TEDESCO");
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.setLanguage("CANADA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("                                                  IT44444444444444444EN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                   IT44444444444444444EN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                               ##########", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ##########" + "'", str2, "    ##########");
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("chineseaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", "hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW", "italian (italian,eng_KOKOKO_      ", "                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW" + "'", str3, "AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW");
    }

    @Test
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("####...", "FRZ\326CZ(FRKREC)                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####..." + "'", str2, "####...");
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsine...", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "italian (italian,eng\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "i\\u0020italianitalianitalianitaliit         \\xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'x', '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'x' + "'", char2 == 'x');
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.Locale.FilteringMode filteringMode19 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList17, filteringMode19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.List<java.lang.String> strList25 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList23);
        java.lang.String str26 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange languageRange28 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange30 = new java.util.Locale.LanguageRange("E");
        java.lang.String str31 = languageRange30.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] { languageRange28, languageRange30 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale locale35 = java.util.Locale.ITALIAN;
        java.lang.String str36 = locale35.getDisplayLanguage();
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.String str38 = locale35.getLanguage();
        java.util.Set<java.lang.String> strSet39 = locale35.getUnicodeLocaleKeys();
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet39, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode42 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.lang.String>) strSet39, filteringMode42);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.parse("nailati", strMap47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList48, strMap49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList50, strMap51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap54 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList55 = java.util.Locale.LanguageRange.parse("ENGLISCH", strMap54);
        java.util.Locale locale56 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str58 = locale56.getVariant();
        java.lang.String str59 = locale56.getDisplayName();
        java.lang.String str60 = locale56.getCountry();
        java.util.Set<java.lang.String> strSet61 = locale56.getUnicodeLocaleKeys();
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList55, (java.util.Collection<java.lang.String>) strSet61);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Locale.LanguageRange[] languageRangeArray66 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList67 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList67, languageRangeArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        java.util.Locale.FilteringMode filteringMode74 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList67, (java.util.Collection<java.lang.String>) strList72, filteringMode74);
        java.util.Locale.FilteringMode filteringMode76 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strList72, filteringMode76);
        java.util.Collection<java.util.Locale> localeCollection78 = null;
        java.util.List<java.util.Locale> localeList79 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, localeCollection78);
        java.util.Locale locale80 = java.util.Locale.lookup(languageRangeList55, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale81 = java.util.Locale.lookup(languageRangeList50, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList82);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale84 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList82);
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
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + filteringMode19 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode19.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "e" + "'", str31, "e");
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "it");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Italian" + "'", str36, "Italian");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "it" + "'", str38, "it");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + filteringMode42 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode42.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(languageRangeList55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Italian" + "'", str59, "Italian");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(languageRangeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + filteringMode74 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode74.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertTrue("'" + filteringMode76 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode76.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(localeList79);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNull(locale81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNull(locale83);
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("...IIIIIIIIIIIIIIIIIIII...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
        java.util.Locale locale3 = new java.util.Locale("Aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "aaaaaaaaaaaaaaaaaaaaaaaaFranzos...", "ECANADAgCANADACANADAsh                                                                                                   ");
        org.junit.Assert.assertEquals(locale3.toString(), "aiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_AAAAAAAAAAAAAAAAAAAAAAAAFRANZOS..._ECANADAgCANADACANADAsh                                                                                                   ");
    }

    @Test
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("anglais (royaume-uni)fra", "aaaaaaaaaaaaaaaaaaaaaaaaaa...anitaliaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("francese", "aaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444NAILATI44444444444444", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zh_CN", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'f', 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'f' + "'", char2 == 'f');
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " nailati             ", (java.lang.CharSequence) "44444444444444NAILATI44444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\uc774\ud0c8\ub9ac\uc544\uc5b4", 223);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("italienisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: italienisch");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN" + "'", str2, "iiiiiiiiiiiFrankreichNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IT", "zh-CN");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        java.util.Locale locale1 = new java.util.Locale("                                                                              ECANADAgCANADACANADAsh");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for                                                                               ecanadagcanadacanadash");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "                                                                              ecanadagcanadacanadash");
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
        java.util.Locale locale1 = new java.util.Locale("ian\\u0020i");
        java.util.Locale locale4 = new java.util.Locale("cor\351en (Cor\351e du Sud)", "RA");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale1.getDisplayLanguage(locale5);
        java.lang.String str10 = locale5.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "ian\\u0020i");
        org.junit.Assert.assertEquals(locale4.toString(), "cor\351en (cor\351e du sud)_RA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cor\351en (cor\351e du sud) (RA)" + "'", str7, "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ian\\u0020i" + "'", str9, "ian\\u0020i");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("TA...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaallemand", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ran\347aisa(France)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
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
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.getDefault(category42);
        java.lang.String str44 = locale43.getDisplayScript();
        java.util.Set<java.lang.String> strSet45 = locale43.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList46 = java.util.Locale.filterTags(languageRangeList41, (java.util.Collection<java.lang.String>) strSet45);
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
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("itTAiT_ITALIAN_EgAish                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itTAiT_ITALIAN_EgAish                                                                                " + "'", str1, "itTAiT_ITALIAN_EgAish                                                                                ");
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("kkkkkkkkkkkkkkkkkeAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 25, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '9', 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                               \\U0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("nglish (United Kingdom)");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'n' + "'", char1 == 'n');
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "8600u\\U\\u0", "\\u0046\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "cinese (cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
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
        java.util.Locale locale13 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setVariant("  \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:   \\u005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH) [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "italien");
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("           5555555555           ", "cHINESISCH (cHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           5555555555           " + "'", str2, "           5555555555           ");
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\u671d');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u671d' + "'", char1 == '\u671d');
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABB");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cccccccccccccccccccccccccccccccccccccccccccccccccenglischcccccccccccccccccccccccccccccccccccccccccccccccccc");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...444444444444444444444444444444444444444444444444444                              ", 76, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444ITALIAN44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444ITALIAN44444444444444" + "'", str1, "44444444444444ITALIAN44444444444444");
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...ANiTALI", ".", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhiHnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "E             g", 241);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale8.getExtension('h');
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        java.lang.String str12 = locale7.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale13);
        java.lang.String str15 = locale7.getDisplayName(locale13);
        java.lang.String str16 = locale7.getScript();
        java.lang.String str17 = locale7.getLanguage();
        java.util.Locale locale18 = locale7.stripExtensions();
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale0.getDisplayName(locale19);
        java.lang.String str21 = locale19.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "France" + "'", str6, "France");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fran\347ais (France)" + "'", str20, "fran\347ais (France)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR" + "'", str21, "FR");
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ZZZITALIAN (ITALY)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                        ittait_italian_egaish                                 \\u006", (int) (short) -1, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        ittait_italian_egaish                                 \\u006" + "'", str3, "                                        ittait_italian_egaish                                 \\u006");
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italian (italian,english                                                                    ", "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Italian (Italy)", 73, (int) 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9hhhhhhhhhh9hhhhhhhhhh" + "'", str1, "9hhhhhhhhhh9hhhhhhhhhh");
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", 49, 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Royaume-Uni", (java.lang.CharSequence) "6b");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023", "\\u005c", (int) ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "2ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi!       _\\U0020_Italienisch#########################################################################################", "44444444444\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale11.getExtension('h');
        java.lang.String str14 = locale10.getDisplayScript(locale11);
        boolean boolean15 = locale10.hasExtensions();
        java.lang.String str16 = locale10.getVariant();
        java.lang.String str17 = locale10.getLanguage();
        java.util.Set<java.lang.String> strSet18 = locale10.getUnicodeLocaleKeys();
        java.lang.String str19 = locale10.getVariant();
        java.util.Locale locale22 = new java.util.Locale("                                             hcstueD                                             ", "\ud504\ub791\uc2a4\uc5b4");
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale10.getDisplayScript(locale22);
        java.lang.String str25 = locale22.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder6.setLocale(locale22);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                              hcstued                                              [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Kanada)" + "'", str3, "Franz\366sisch (Kanada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                             hcstued                                             " + "'", str23, "                                             hcstued                                             ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafranz\366sisch (kanada)_ZH_CN", "FRANZ\326SISCHFRANZOSISCH (FRANKREICFRANZ\326SISCHFRANZOSISCH (FRANKREICH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hi!(\\U0020,Italienisch#########################################################################################", (java.lang.CharSequence) "italian (italian,e...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!(\\U0020,Italienisch#########################################################################################" + "'", charSequence2, "hi!(\\U0020,Italienisch#########################################################################################");
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
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
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setUnicodeLocaleKeyword("italieitalNC_hzitalieital", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: italieitalNC_hzitalieital [at index 0]");
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
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                       ...", (java.lang.CharSequence) "\\u0020iIalian\\u008600u\\U\\u0020iIalian\\u0020iUanglaisUFRZ\326CZ(FRKREC)Uialian    U                                                                                                      U!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IUzhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzhUFRZ\326CZ(FRKREC)Ucinese (Cina)\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhhhhhhhhh\\u0069hhU         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHU                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ITALIENISC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIENISC" + "'", str1, "ITALIENISC");
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("emand");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "emand");
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("IIIIIIIIII9999999999999999999999999999999", "italian(italian,eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIII9999999999999999999999999999999" + "'", str2, "IIIIIIIIII9999999999999999999999999999999");
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Franz\366sisch (Kanada)", "alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################################################################", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
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
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale11.getDisplayVariant();
        java.util.Set<java.lang.String> strSet15 = locale11.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder16 = builder7.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder7.addUnicodeLocaleAttribute("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: NC_hz?????????????????????????????????????????????????????????????????????\\aUa0046 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italienisch" + "'", str12, "Italienisch");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Chinesisch (Ch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("FRANZOSI         ITALIAN_italian_eNGLISHFRANZOSI", 133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("frankreich", "H (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("taly", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH" + "'", str1, "!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH");
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\ud55c\uad6d\uc5b4", "\\U0034\\U00                                             HdI!        (\\u0020,iTALICNIUEd#########################################################################################STUd                                             \\U0034\\U00", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("emand");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "emand" + "'", str1, "emand");
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                        aNCHc                        ", "Frankreich");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        aNCHc                        " + "'", str2, "                        aNCHc                        ");
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "x-lvariant-can", (java.lang.CharSequence) "           \\U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hcierknarF", "........French (Canadad........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hcierknarF" + "'", str2, "hcierknarF");
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\!u!00!de!\\!u!00", "T");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("g (FRANZ\366SISCH)", 89, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("FRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFRFR", 74);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!       _\\u0020_italienisch#########################################################################################_KO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       _\\u0020_italienisch#########################################################################################_KO" + "'", str1, "hi!       _\\u0020_italienisch#########################################################################################_KO");
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale locale8 = builder5.build();
        java.util.Locale.Builder builder9 = builder5.clear();
        java.util.Locale locale13 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale14.toLanguageTag();
        java.util.Locale locale18 = new java.util.Locale("en");
        boolean boolean19 = locale18.hasExtensions();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.lang.String str21 = locale14.getDisplayName(locale18);
        java.util.Locale locale25 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale26 = locale25.stripExtensions();
        java.lang.String str27 = locale18.getDisplayName(locale26);
        java.util.Set<java.lang.String> strSet28 = locale26.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        java.util.Locale locale30 = java.util.Locale.ROOT;
        java.lang.String str31 = locale30.getISO3Country();
        java.lang.String str32 = locale30.getDisplayVariant();
        java.lang.String str33 = locale30.getVariant();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str39 = locale38.getDisplayCountry();
        java.lang.String str40 = locale34.getDisplayCountry(locale38);
        java.lang.String str41 = locale30.getDisplayLanguage(locale34);
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.lang.String str44 = locale42.getVariant();
        java.lang.String str45 = locale42.getDisplayName();
        java.lang.String str46 = locale42.getCountry();
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleKeys();
        java.lang.String str48 = locale42.getScript();
        java.lang.String str49 = locale42.getDisplayCountry();
        java.lang.String str50 = locale30.getDisplayVariant(locale42);
        boolean boolean51 = locale42.hasExtensions();
        java.lang.String str52 = locale26.getDisplayScript(locale42);
        java.util.Locale.Builder builder53 = builder9.setLocale(locale42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder55 = builder53.addUnicodeLocaleAttribute("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAAS [at index 0]");
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
        org.junit.Assert.assertEquals(locale13.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "und" + "'", str16, "und");
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str21, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale38.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ITALIAN" + "'", str39, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "China" + "'", str40, "China");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Italian" + "'", str45, "Italian");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        java.util.Locale locale3 = new java.util.Locale(" (ITALIAN,ENGLISH)", "hi!       5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch", "                                                                                         E    Italien");
        org.junit.Assert.assertEquals(locale3.toString(), " (italian,english)_HI!       5ITALIENISCH5ITALIAN_ITALIAN_ENGLISH5HI!5HI!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\U00345HI!5ITALIAN5\\U00615\\U00235HI!5ITALIAN5CHINESE (CHINA)5HI!5ZH_CN5ITALIAN5EN5ITALIENISCH_                                                                                         E    Italien");
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("2cinese (Cina)iTALIANiTALIANiTALIANiTAL", "                ", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("         ITALIAN_italian_eNGLISH         ITALIAN_!IH", 8, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0038", "nglish (United Kingdom)", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\0020!TALIAN!TALIAN!TALIAN!TALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "Franz\366sisch (Kanada)", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("....................................................................................... (italian,english)nglish (United Kingdom)french (NC_HZ)", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Frnz\366sisch(Knd");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\u671d\u9c9c\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "z...Frn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4\uc601\uc5b4es K\366\uc601\uc5b4\uc601\uc5b4ch)", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("italian (italian,english                                                                    ", "             hcsineilatI             ", 4, 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ital             hcsineilatI             " + "'", str4, "ital             hcsineilatI             ");
    }

    @Test
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "44444444444444444444444444444444!IHAAAAAAAAAAAAAAAAAAAAAAAAFRANZ\326SISCH (FRANKREICH)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
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
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.lang.String str15 = locale12.getLanguage();
        java.lang.String str16 = locale12.getISO3Language();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale.Builder builder22 = builder19.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder25 = builder23.setLanguage("ITALIAN");
        java.util.Locale locale26 = builder23.build();
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale26);
        java.lang.String str28 = locale12.getDisplayScript(locale26);
        java.util.Locale locale29 = locale12.stripExtensions();
        java.util.Locale.Builder builder30 = builder9.setLocale(locale12);
        java.lang.String str31 = locale12.getCountry();
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "it" + "'", str15, "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (Canada)" + "'", str21, "French (Canada)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HI!" + "'", str27, "HI!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!IH\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('l');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
        java.util.Locale locale3 = new java.util.Locale("en-GBDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHD", "...fdedzcycxcwcvcucrcocncmclckcichcgcfcdcccaczbybwbvbtbsbrbqbobnbmblbjbibhbgbfbebdbbbabzaxawauatasaraqaoanamalaiagafaeada", "iTALIAN                                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key:          ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "en-gbdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschd_...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA_iTALIAN                                                                 ");
    }

    @Test
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa", '7');
// flaky:         org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'T' + "'", char2 == 'T');
    }

    @Test
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("D", "HHHHHHHHHHtTAHHHHHHHHHHT_ITAhIAN\\U0020Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("r0                                               nailati                                                ", "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("KOREAN (SOUTH KOREA)KORE     ", "\\u0075");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("FRTTAT_ITA", "COR\311EN", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("\\u0038");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0038 [at index 0]");
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
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ZH_CNGGGGG");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZH_CNGGGGG" + "'", str1, "ZH_CNGGGGG");
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\aUa0046");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\r' + "'", char1 == '\r');
    }

    @Test
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
        char[] charArray6 = new char[] { ' ', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.setVariant("Franzosisch(Frankreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Franzosisch(Frankreich) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric('\\');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'H', 52, (int) 'F');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("CHINESE (CHINA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.lang.String str7 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr_FR" + "'", str7, "fr_FR");
    }

    @Test
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'Y');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EYgYYsh" + "'", str10, "EYgYYsh");
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0069hhhhhhhhhh", "                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str1, "z...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\ud504\ub791\uc2a4\uc5b4)", "kokoko", 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CHINESE");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        boolean boolean6 = languageRange1.equals((java.lang.Object) strSet5);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Korean" + "'", str4, "Korean");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA", 0, "inglese...........................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA" + "'", str3, "BFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEKoreanADA");
    }

    @Test
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                    \\U0020ItalianItalianItalianItali", "allemand (Allemagne)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA2", "fr-cafr-cafr-c8600u\\fr-cafr-cafr-caEEEEEE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("talian (FRA,Undetermined)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "talian (FRA,Undetermined)" + "'", str1, "talian (FRA,Undetermined)");
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             hcstueD                                             ", "2CINESE (CINA...", 18);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "LHcsineilat", (java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "italian_ITALIAN_English");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "franz\366sisch (frankreich)", (int) 'i', 6);
        java.lang.String[] strArray10 = java.util.Locale.getISOCountries();
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0034", strArray3, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0034" + "'", str13, "\\u0034");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("9hhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "deutsch" + "'", str5, "deutsch");
    }

    @Test
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDk...", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("000000000000000000000000000000000000000000...", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000..." + "'", str2, "00000000...");
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0034", locale2);
        java.lang.String str6 = locale2.getDisplayName();
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale14 = locale9.stripExtensions();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category7, locale14);
        java.lang.String str17 = locale2.getDisplayLanguage(locale14);
        java.lang.String str18 = locale2.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0034" + "'", str5, "\\u0034");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (Canada)" + "'", str6, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais" + "'", str17, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              it", 'G');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fffffffffffffYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERfffffffffffff", "hcstued", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("canad");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("CHINA", 10, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("KR", "KKKKKKKKKKKKKKKKKKKK)DNK( HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder41 = builder0.setLanguage("8600u\\U\\u0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 8600u\\U\\u0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
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
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("DE_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de_de" + "'", str1, "de_de");
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("KKKKKKKKKKKKKKKKKEAGAASH", "                                                                                                         ", (int) 'f', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                         " + "'", str4, "                                                                                                         ");
    }

    @Test
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str2 = locale0.getExtension('z');
        java.lang.String str3 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cinese (Cina)" + "'", str3, "cinese (Cina)");
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = new java.util.Locale("Italian", "Italian", "English");
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayCountry(locale4);
        java.lang.String str7 = locale4.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale4.toString(), "italian_ITALIAN_English");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ITALIAN" + "'", str5, "ITALIAN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CCCC\\CCCCC", "                                                         \\u005");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
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
        java.lang.String str15 = locale12.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
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
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Azhzhzhzhzhzhzhzhzhzh", "FRANZ\326SISCH\n(FRANKREICH)HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Azhzhzhzhzhzhzhzhzhzh" + "'", str2, "Azhzhzhzhzhzhzhzhzhzh");
    }

    @Test
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
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
        java.lang.String str18 = locale17.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
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
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder0.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("########################################################################################eltI_0200U\\_!", "Chinese (China", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fRHfR)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
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
        java.lang.String str15 = locale7.getDisplayCountry();
        java.util.Locale locale17 = new java.util.Locale("\\u005c");
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale19);
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = locale17.getDisplayScript(locale19);
        java.lang.String str24 = locale17.getExtension('C');
        java.lang.String str25 = locale17.getDisplayScript();
        java.lang.String str26 = locale17.getScript();
        java.lang.String str27 = locale17.getLanguage();
        java.lang.String str28 = locale7.getDisplayName(locale17);
        java.lang.String str29 = locale7.getVariant();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals(locale17.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "franz\366sisch (frankreich)" + "'", str20, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u005c" + "'", str27, "\\u005c");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "French" + "'", str28, "French");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("CHNtttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                           ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" NAILATI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NAILATI" + "'", str1, "NAILATI");
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...!       \\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\u0034\\", "                          g             E", "                                                    fran\347ais (France)                                                     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CHINESE (CHINA", "78", 108);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Franz\366sisch (Kanada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franz\366sisch (Kanada)" + "'", str1, "Franz\366sisch (Kanada)");
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("             \\u0049                                           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "             DE_DE            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman", (int) 'N');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman" + "'", str2, "Egallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallmanallman");
    }

    @Test
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                            fRENCH (fRANCE)                                                \\u0068", "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222allemand22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023DALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLEMANDALLE", "Deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                       HI!                                                              ", (java.lang.CharSequence) "  \\u007a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL", (int) 'l');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL" + "'", str2, "NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u671d", 804);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("frankreich", 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("EYgYYsh", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chine)", "hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd", (int) 'H');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("EcanadaGcanadacanadaSH                                                                                                   ", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", "Royaume-Uniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EcanadaGcanadacanadaSH                                                                                                   " + "'", str3, "EcanadaGcanadacanadaSH                                                                                                   ");
    }

    @Test
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!(\\U0020,ITALIENISCH#########################################################################################)", "Franz\366sisch (Frankreich)");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", "TITcnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf5700u\\rfesecnarfesecnarfesecnarf");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en_CA", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "COR\311EN", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "United State                                                                                     ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
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
            java.util.Locale.Builder builder17 = builder15.removeUnicodeLocaleAttribute("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI [at index 0]");
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
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0069hhhhhhhhhh", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               \\u0069hhhhhhhhhh" + "'", str2, "                                               \\u0069hhhhhhhhhh");
    }

    @Test
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HHHHHHHHHH", "fR          2cinese (cina)italianitalianitalianitalH          2cinese (cina)italianitalianitalianitalfR       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ILATiNA...royaume-uniroyaume-uniroy", (int) '0', 'B');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BBBBBBILATiNA...royaume-uniroyaume-uniroyBBBBBBB" + "'", str3, "BBBBBBILATiNA...royaume-uniroyaume-uniroyBBBBBBB");
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444en", '\r');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                     englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hfffffffffcanad", "FRANZ\326SISCH2(FRANKREICH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hfffffffffcanad" + "'", str2, "Hfffffffffcanad");
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("44444444444444ITALIAN4444444444444", (double) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)" + "'", str1, "\\u0020 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW)");
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#########FranzosischFranzosisch (Frankreich)", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hen");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "    \\     ", (int) 'C');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\ud504');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                         " + "'", str4, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                         " + "'", str5, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                         " + "'", str7, "                                                                                                         ");
    }

    @Test
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
    }

    @Test
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0034\\u00                                             hcstuD                                             \\u0034\\u00", "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Korean (South Korea)Korean (Songlish ...Korean (South Korea)Korean (So", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Korean (South Kor" + "'", str2, "Korean (South Kor");
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("NAILATI", "", 220, 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NAILATI" + "'", str4, "NAILATI");
    }

    @Test
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("fr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr\\u000dfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr-CAfr", (int) '\n', 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                               en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               EN" + "'", str1, "                                                                                               EN");
    }

    @Test
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
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
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("", "hhh italia");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0052");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0052" + "'", str1, "\\u0052");
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "CCCC\\CCCC                                                       ", 499);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch" + "'", str1, "hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
    }

    @Test
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("zh_CN", "iiiiiiiiii", 2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh_CN" + "'", str4, "zh_CN");
    }

    @Test
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HHHHHHHHHHtTAHHHHHHHHHHT_ITA", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHtTAHHHHHHHHHHT_ITA" + "'", str2, "HHHHHHHHHHtTAHHHHHHHHHHT_ITA");
    }

    @Test
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'f' + "'", char2 == 'f');
    }

    @Test
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0069\\U0069\\U", "CHINA", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0069\\U0069\\U" + "'", str3, "\\U0069\\U0069\\U");
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        char[] charArray7 = new char[] { ' ', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("deutsch", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!_\\u0020_iTLE#####################################!_\\u0020_iTLE######################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("\\0020iTALIANiTALIANiTALIANiTALzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("anglais (royaume-uni)FRA", (int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        anglais (royaume-uni)FRA                                         " + "'", str2, "                                        anglais (royaume-uni)FRA                                         ");
    }

    @Test
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("99999\\u0021", "Germany", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
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
        java.lang.String str21 = locale14.getDisplayScript();
        java.lang.String str22 = locale14.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\U0020" + "'", str22, "\\U0020");
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n" + "'", str1, "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZhsxlgne_n");
    }

    @Test
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
        java.util.Locale locale2 = new java.util.Locale("\\u002", "royaume-uni");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "\\u002_ROYAUME-UNI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u002 (ROYAUME-UNI)" + "'", str3, "\\u002 (ROYAUME-UNI)");
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u0062");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Italia                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italia" + "'", str1, "Italia");
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
        java.util.Locale locale3 = new java.util.Locale("fr_FR", "\ub3c5\uc77c\uc5b4", "hcsineilati");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.Object obj5 = locale3.clone();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
        org.junit.Assert.assertNotNull(obj5);
// flaky:         org.junit.Assert.assertEquals(obj5.toString(), "\ub3c5\uc77c\uc5b4_hcsineilati");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "\ub3c5\uc77c\uc5b4_hcsineilati");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "\ub3c5\uc77c\uc5b4_hcsineilati");
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                         \\u005c                                                        ", (int) 'l', "\\u0041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         \\u005c                                                        " + "'", str3, "                                                         \\u005c                                                        ");
    }

    @Test
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        boolean boolean4 = locale0.hasExtensions();
        boolean boolean5 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cor\351en" + "'", str2, "cor\351en");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("fr-ca", "\u671d\u9c9c\u6587\u97e9\u56fd)", 347);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-ca" + "'", str3, "fr-ca");
    }

    @Test
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "FRANCESEFRANCESEFRANCESEFR\\U0075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)", "000000000000000000000000000000000000000000000000000000000000000CCCC\\CCCCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)" + "'", str2, "\\u0075 (AD4AE4AF4AG4AI4AL4AM4AN4AO4AQ4AR4AS4AT4AU4AW4AX4AZ4BA4BB4BD4BE4BF4BG4BH4BI4BJ4BL4BM4BN4BO4BQ4BR4BS4BT4BV4BW4BY4BZ4CA4CC4CD4CF4CG4CH4CI4CK4CL4CM4CN4CO4CR4CU4CV4CW4CX4CY4CZ4DE4DJ4DK4DM4DO4DZ4EC4EE4EG4EH4ER4ES4ET4FI4FJ4FK4FM4FO4FR4GA4GB4GD4GE4GF4GG4GH4GI4GL4GM4GN4GP4GQ4GR4GS4GT4GU4GW4GY4HK4HM4HN4HR4HT4HU4ID4IE4IL4IM4IN4IO4IQ4IR4IS4IT4JE4JM4JO4JP4KE4KG4KH4KI4KM4KN4KP4KR4KW4KY4KZ4LA4LB4LC4LI4LK4LR4LS4LT4LU4LV4LY4MA4MC4MD4ME4MF4MG4MH4MK4ML4MM4MN4MO4MP4MQ4MR4MS4MT4MU4MV4MW4MX4MY4MZ4NA4NC4NE4NF4NG4NI4NL4NO4NP4NR4NU4NZ4OM4PA4PE4PF4PG4PH4PK4PL4PM4PN4PR4PS4PT4PW4PY4QA4RE4RO4RS4RU4RW4SA4SB4SC4SD4SE4SG4SH4SI4SJ4SK4SL4SM4SN4SO4SR4SS4ST4SV4SX4SY4SZ4TC4TD4TF4TG4TH4TJ4TK4TL4TM4TN4TO4TR4TT4TV4TW4TZ4UA4UG4UM4US4UY4UZ4VA4VC4VE4VG4VI4VN4VU4WF4WS4YE4YT4ZA4ZM4ZW,ITALIAN,italian,eNGLISH         ITALIAN,!IHitTAiT,ITALIAN,EgAish)");
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("dI!        (\\u0020,iTALICNIUEd#########################################################################################", 'B');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             DE_DE            ", '8');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\U0020IiTALIAN\\U0020I                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             DE_DE            " + "'", str4, "             DE_DE            ");
    }

    @Test
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 85, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital", (int) '0', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital" + "'", str3, "italieitalNC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ritalieital");
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch", (int) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch" + "'", str3, "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China) hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANIU0020ITALIANITALIANITALIANITALI", (java.lang.CharSequence) "\\U0034\\U00 HCSTUD \\U0034");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Eagaas", "C\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("US", "cinese (cina)\\u0069h..", 101);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("        FRA         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!I", (int) (byte) 0, "italien (Italie)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I" + "'", str3, "!I");
    }

    @Test
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("francesefrancesefrancesefr\\u0075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "francesefrancesefrancesefr\\u0075" + "'", str1, "francesefrancesefrancesefr\\u0075");
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("latIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIHhcsineilatIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih" + "'", str1, "LATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATihHCSINEILATih");
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Korean (South Kor", (java.lang.CharSequence) "R0                                               nailati             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHeAGAASH         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISH", "en_US");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("FRANCESE (CANADA)", "D  \\u007a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale0.getDisplayName(locale2);
        java.lang.String str5 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str1, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-CA" + "'", str3, "fr-CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italien" + "'", str4, "italien");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CAN" + "'", str5, "CAN");
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504" + "'", str1, "\ub2e4\ub098\uce90\uc5b4\uc2a4\ub791\ud504");
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "emand", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setLanguageTag("2iT hi!       _\\U0020_Italienisch####################################################################            2iT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2iT hi!       _\\U0020_Italienisch####################################################################            2iT [at index 0]");
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
    }

    @Test
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ANGLAIS (ROYAUME-UNI)", "CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCIAN\\U0020ICCCCCCC" + "'", str2, "CCCCCCIAN\\U0020ICCCCCCC");
    }

    @Test
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("R0                                               nailati             ", "\\U0046", "itTAiT_ITA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 400 + "'", int1 == 400);
    }

    @Test
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital", (int) 'Y');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u00...", "hi!(\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('c');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0063" + "'", str1, "\\u0063");
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("... g ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... g ..." + "'", str1, "... g ...");
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("bbbbbbbbbb   cor\351en    ", "\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ffffffffffffffffffffffffffffffffFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAfffffffffffffffffffffffffffffffff");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         a005c         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiPrintable('\\');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("italiaE", 309, 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("zh_TW", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "\\u0034\\u00                                             hcstued                                             \\u0034\\u00 (\\U0020IITALIAN\\U0020I)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA", "!ih                            dalleman", "t!li!!_ITALIAN_E!glish");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAA...ANITALIAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(")", 81, 'H');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ")HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, ")HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
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
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale16.getExtension('h');
        java.lang.String str19 = locale15.getDisplayScript(locale16);
        java.lang.String str20 = locale15.getISO3Country();
        java.lang.String str21 = locale13.getDisplayVariant(locale15);
        java.lang.String str22 = locale15.getCountry();
        java.util.Set<java.lang.Character> charSet23 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale25 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
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
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FRA" + "'", str20, "FRA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FR" + "'", str22, "FR");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale.Category category7 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.lang.String str14 = locale9.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale9.getDisplayName(locale15);
        java.lang.String str18 = locale9.getScript();
        java.util.Locale.setDefault(category7, locale9);
        java.util.Locale locale20 = java.util.Locale.getDefault(category7);
        java.util.Locale locale21 = java.util.Locale.getDefault(category7);
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.util.Locale.setDefault(category22, locale25);
        java.util.Locale locale30 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category22, locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault(category22);
        java.util.Locale locale34 = new java.util.Locale("en");
        java.lang.String str35 = locale32.getDisplayCountry(locale34);
        java.util.Set<java.lang.Character> charSet36 = locale34.getExtensionKeys();
        java.util.Locale.setDefault(category7, locale34);
        java.lang.String str38 = locale5.getDisplayLanguage(locale34);
        java.util.Locale locale40 = java.util.Locale.FRANCE;
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        java.lang.String str46 = locale44.getExtension('h');
        java.lang.String str47 = locale43.getDisplayScript(locale44);
        java.lang.String str48 = locale43.getISO3Country();
        java.lang.String str49 = locale41.getDisplayVariant(locale43);
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale41);
        java.lang.String str51 = locale41.getDisplayCountry();
        java.lang.String str52 = locale34.getDisplayLanguage(locale41);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category7.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FRA" + "'", str14, "FRA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str17, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "allemand" + "'", str26, "allemand");
        org.junit.Assert.assertEquals(locale30.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ALLEMAND" + "'", str35, "ALLEMAND");
        org.junit.Assert.assertNotNull(charSet36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "FRA" + "'", str48, "FRA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str50, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Canada" + "'", str51, "Canada");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "anglais" + "'", str52, "anglais");
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\uc601\uc5b4                                                                                                              ", "hhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc601\uc5b4                                                                                                              " + "'", str2, "\uc601\uc5b4                                                                                                              ");
    }

    @Test
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                      ", 812);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      " + "'", str2, "                                                                      ");
    }

    @Test
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("2ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0064f (KOREAN)", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FRA", "                                                                 CANADA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
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
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = locale25.getDisplayCountry(locale27);
        java.util.Locale locale31 = new java.util.Locale("\\u0066");
        java.lang.String str33 = locale31.getExtension('i');
        java.lang.String str34 = locale27.getDisplayScript(locale31);
        java.lang.String str35 = locale31.getScript();
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale36.getScript();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str39 = locale36.getCountry();
        java.lang.String str40 = locale31.getDisplayName(locale36);
        java.lang.String str42 = locale31.getExtension('D');
        java.lang.String str43 = locale11.getDisplayVariant(locale31);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
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
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Italian" + "'", str24, "Italian");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale31.toString(), "\\u0066");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "US" + "'", str39, "US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\u0066" + "'", str40, "\\u0066");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "Fr ncG");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ", (int) 'R', "!ih    Deutsc");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deu       " + "'", str3, "!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deutsc!ih    Deu       ");
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                               \\u005c                                                                              ", (int) 'F');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getLanguage();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getCountry();
        java.util.Locale locale6 = null;
        java.lang.String str7 = locale0.getDisplayVariant(locale6);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale17 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.lang.String str18 = locale9.getDisplayCountry(locale17);
        java.lang.String str19 = locale17.getDisplayName();
        java.lang.String str21 = locale17.getExtension('i');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("iTALIAN                                                                 ", locale17);
        java.lang.String str23 = locale17.getDisplayLanguage();
        boolean boolean24 = locale17.hasExtensions();
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale28.getDisplayCountry();
        java.lang.String str30 = locale27.getDisplayVariant(locale28);
        java.lang.String str31 = locale25.getDisplayScript(locale28);
        java.lang.String str32 = locale17.getDisplayLanguage(locale28);
        java.lang.String str33 = locale0.getDisplayLanguage(locale17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de" + "'", str1, "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals(locale17.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "France" + "'", str18, "France");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!        (\\U0020,Italienisch#########################################################################################)" + "'", str19, "hi!        (\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ITALIAN                                                                 " + "'", str22, "ITALIAN                                                                 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!       " + "'", str23, "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!       " + "'", str32, "hi!       ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "German" + "'", str33, "German");
    }

    @Test
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx...", "englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u000a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u000" + "'", str1, "\\u000");
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("titititititit", "hi!       _\\u0020_italienisch#########################################################################################_KO", (int) '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "titititititit" + "'", str3, "titititititit");
    }

    @Test
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("   cor\351en    ", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chinesisch(China)", 'h');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "                                      ...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setLanguage("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("                                                                 \\U0020  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:                                                                  \\U0020   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
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
        java.lang.String str12 = locale5.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr_FR" + "'", str12, "fr_FR");
    }

    @Test
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ", "KOREAN (SOUTH KOREA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     " + "'", str2, "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\     ");
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Eagaas\\\\\\\\\\\\\\HI!HI!", "E44444444444444444444444444444444!IHg44444444444444444444444444444444!IH44444444444444444444444444444444!IHsh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eagaas\\\\\\\\\\\\\\HI!HI!" + "'", str2, "Eagaas\\\\\\\\\\\\\\HI!HI!");
    }

    @Test
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                         \\u0046                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray13 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "iTALIAN", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "it", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italian_ITALIAN_English", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "french", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                             hcsfr-CueD                                                                                          hcsfr-CueD  ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
    }

    @Test
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("dI!        (\\u0020,iTALICNIUEd#########################################################################################", "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dI!        (\\u0020,iTALICNIUEd#########################################################################################" + "'", str2, "dI!        (\\u0020,iTALICNIUEd#########################################################################################");
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".................................Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".................................Italian (Italy)" + "'", str1, ".................................Italian (Italy)");
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaLower('\r');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0038zho                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue(')', 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs cAnese (cAna)u0069h..France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)AzhzhzhzhzhzhzhzhzhzhfrancaAs (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2ITHI!_\\U0020_ITALIENISCH####################################################################2I");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2ithi!_\\u0020_italienisch####################################################################2i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = null;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        java.lang.String str7 = locale1.getScript();
        java.lang.String str8 = locale1.getDisplayVariant();
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale9);
        java.util.Locale.setDefault(locale9);
        java.util.Locale locale12 = locale9.stripExtensions();
        java.lang.String str13 = locale9.getDisplayVariant();
        java.lang.String str14 = locale1.getDisplayLanguage(locale9);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str17 = locale16.getCountry();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str22 = locale19.getDisplayLanguage(locale21);
        java.lang.String str23 = locale16.getDisplayLanguage(locale19);
        java.lang.String str24 = locale16.getDisplayVariant();
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale.Builder builder28 = builder25.setLanguageTag("Italian");
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale29.getDisplayName();
        java.util.Locale.Builder builder31 = builder25.setLocale(locale29);
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str34 = locale33.getDisplayScript();
        java.util.Locale.setDefault(locale33);
        java.util.Locale.Builder builder36 = builder25.setLocale(locale33);
        java.util.Locale locale37 = builder25.build();
        java.lang.String str38 = locale16.getDisplayLanguage(locale37);
        java.util.Set<java.lang.String> strSet39 = locale16.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet40 = locale16.getUnicodeLocaleKeys();
        java.lang.String str41 = locale1.getDisplayCountry(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Englisch" + "'", str14, "Englisch");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinesisch (China)" + "'", str30, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "it");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                              \\     ", "!_\\U0020_ITLE#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              \\     " + "'", str2, "                                                                              \\     ");
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh", (java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh" + "'", charSequence2, "\\\\\\\\\\\\\\\\\\                                  !ih                            tal                                  !ih                            an_ITALIAN_Engl                                  !ih                            sh");
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ZHO                               44\\u002344  \\u0020iTALIANiTALIANiTALIANiTALI", "fr-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setUnicodeLocaleKeyword("                       \\u0020                        ", "KOR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                        \\u0020                         [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                          francese (Canada)                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          FRANCESE (CANADA)                                           " + "'", str1, "                                          FRANCESE (CANADA)                                           ");
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("NNNNNNNNNNNNNNNNNN", "\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069!ih\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\u0069\\engli");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNN" + "'", str2, "NNNNNNNNNNNNNNNNNN");
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444it" + "'", str1, "444444444it");
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CANADA", "HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("n Italienisch", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale5.getLanguage();
        java.lang.String str9 = locale5.getDisplayName();
        java.util.Locale locale12 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str14 = locale5.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale12.getDisplayCountry(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder1.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: \\u0020italianitalianitalianitali\\u0020italianitalianitalianital [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertEquals(locale12.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ALLEMAND" + "'", str13, "ALLEMAND");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ALLEMAND" + "'", str17, "ALLEMAND");
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hzhzhzhzhzhzhzhzhzhzAhzSAhzRAhzQAhzOAhzNAhz", 'R');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\ud504\ub791\uc2a4\uc5b4)", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN", (int) '2');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", "zhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("zh_CN", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", (int) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("Undetermined", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("             DE_DE             ", 'n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             DE_DE             " + "'", str2, "             DE_DE             ");
    }

    @Test
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
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
            java.util.Locale.Builder builder11 = builder8.setLanguage("B");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: B [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "und_CA");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "und_CA");
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("italian(italian,eng", "talian\\u0032talian");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "NC_hz", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "TALIAN\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0047", "EagaashUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'I');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Z...FRN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
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
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder16.addUnicodeLocaleAttribute("HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH [at index 0]");
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
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               8300u\\                                                ", "anihc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'c');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hic!" + "'", str5, "hic!");
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                " + "'", str1, "                                ");
    }

    @Test
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
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
            java.util.Locale.Builder builder10 = builder7.setScript("                                                                            fr_FR                  ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script:                                                                             fr_FR                   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("und");
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Locale locale6 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str7 = locale5.getDisplayName(locale6);
        java.util.Locale locale8 = locale5.stripExtensions();
        java.util.Locale locale9 = locale5.stripExtensions();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("", locale5);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale14.getDisplayScript(locale15);
        java.lang.String str19 = locale14.getISO3Country();
        java.lang.String str20 = locale12.getDisplayVariant(locale14);
        java.lang.String str21 = locale14.getCountry();
        java.lang.String str22 = locale5.getDisplayLanguage(locale14);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.lang.String str26 = locale24.getExtension('h');
        java.lang.String str27 = locale23.getDisplayScript(locale24);
        java.util.Locale locale28 = locale23.stripExtensions();
        java.lang.String str29 = locale28.getISO3Country();
        java.util.Locale locale31 = new java.util.Locale("en");
        boolean boolean32 = locale31.hasExtensions();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleKeys();
        java.lang.String str34 = locale28.getDisplayCountry(locale31);
        java.util.Locale.setDefault(locale28);
        java.lang.String str36 = locale28.getISO3Country();
        java.lang.String str37 = locale5.getDisplayCountry(locale28);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = locale38.getCountry();
        java.lang.String str40 = locale28.getDisplayVariant(locale38);
        java.lang.String str41 = locale1.getDisplayVariant(locale38);
        java.util.Locale locale42 = java.util.Locale.US;
        java.lang.String str43 = locale42.getScript();
        java.util.Set<java.lang.String> strSet44 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale42.getCountry();
        java.util.Locale.setDefault(locale42);
        java.lang.String str47 = locale1.getDisplayName(locale42);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "allemand" + "'", str7, "allemand");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FRA" + "'", str19, "FRA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FR" + "'", str21, "FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "allemand" + "'", str22, "allemand");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FRA" + "'", str29, "FRA");
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "France" + "'", str34, "France");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "FRA" + "'", str36, "FRA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CA" + "'", str39, "CA");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "US" + "'", str45, "US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        java.util.Locale locale2 = new java.util.Locale("         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish", "FRANZ\326SISCHF(FRANKREICH)");
        org.junit.Assert.assertEquals(locale2.toString(), "         italian_italian_english         italian_!ihittait_italian_egaish_FRANZ\326SISCHF(FRANKREICH)");
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("fr-C                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FR-C                 " + "'", str1, "FR-C                 ");
    }

    @Test
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('T', 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iItalian\\u008600u", "Franz\366sischFranzosisch(Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", 36);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("Chinese (China");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHTEDESCO    !IH!IH!IH!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )", "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca (                                      )hsilgne,nailati( )");
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Frnz\366sischt(Knd)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frnz\366sischt(knd)" + "'", str1, "frnz\366sischt(knd)");
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
        java.util.Locale locale1 = new java.util.Locale("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals(locale1.toString(), "ccccccccccccccccccccccccccccccccccccccccccccccccccinese (cina)u0069h..ccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
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
        java.lang.String str13 = locale2.getDisplayName();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.getDisplayVariant();
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder18.clearExtensions();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Locale.Builder builder22 = builder19.setLocale(locale20);
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder24 = builder19.setLocale(locale23);
        java.util.Set<java.lang.String> strSet25 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale23.getDisplayName();
        java.util.Locale locale30 = new java.util.Locale("HI!       ", "\\U0020", "Italienisch#########################################################################################");
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale.setDefault(locale31);
        java.lang.String str34 = locale23.getDisplayName(locale31);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale23.getDisplayName(locale36);
        java.lang.String str39 = locale15.getDisplayScript(locale23);
        java.lang.String str40 = locale2.getDisplayName(locale23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Italian" + "'", str13, "Italian");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "French (Canada)" + "'", str21, "French (Canada)");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "German (Germany)" + "'", str26, "German (Germany)");
        org.junit.Assert.assertEquals(locale30.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!       _\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "German (Germany)" + "'", str34, "German (Germany)");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "German (Germany)" + "'", str38, "German (Germany)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Italienisch" + "'", str40, "Italienisch");
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("                                                                                          \\u005c         ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                           \\u005c          [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "FRTTAT_ITA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", (java.lang.CharSequence) "de_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DEde_DE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
        java.util.Locale locale1 = new java.util.Locale("\r\r...");
        java.lang.String str2 = locale1.getCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "\r\r...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("frankreich", '\u6cd5', '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "frankreich" + "'", str3, "frankreich");
    }

    @Test
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ENGLISCH (         italian_italian_english,\\U0061)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("fRENCH (fRANCE)", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fRENCH (fRANCE)" + "'", str2, "fRENCH (fRANCE)");
    }

    @Test
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
        char char1 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'S');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'S' + "'", char1 == 'S');
    }

    @Test
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\ud55c\uad6d\uc5b4", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4                                                                                                                       " + "'", str2, "\ud55c\uad6d\uc5b4                                                                                                                       ");
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r", "dallemandallemandallemandallemandallemandallemandallemandalle", 72);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "ital             hcsineilatI             ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.lang.String str8 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois (Chine)" + "'", str5, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String str3 = locale2.getISO3Country();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList7, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList21, filteringMode23);
        java.util.Locale.FilteringMode filteringMode25 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList21, filteringMode25);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.util.Locale.FilteringMode filteringMode35 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList36 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList33, filteringMode35);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        java.util.Locale.FilteringMode filteringMode67 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList68 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strList65, filteringMode67);
        java.util.List<java.lang.String> strList69 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList57, filteringMode67);
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, strMap71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Locale.LanguageRange[] languageRangeArray76 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList77 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList77, languageRangeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList77, (java.util.Collection<java.lang.String>) strList82, filteringMode84);
        java.util.Locale.FilteringMode filteringMode86 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strList82, filteringMode86);
        java.util.Collection<java.util.Locale> localeCollection88 = null;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, localeCollection88);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter(languageRangeList72, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList89);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + filteringMode25 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode25.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + filteringMode35 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode35.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + filteringMode67 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode67.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(languageRangeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + filteringMode86 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode86.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
        java.util.Locale locale1 = new java.util.Locale("fra");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "nglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str1, "NglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
    }

    @Test
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00000000000000cor\351en (Cor\351e du Sud)", (int) 'R');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       00000000000000cor\351en (Cor\351e du Sud)                        " + "'", str2, "                       00000000000000cor\351en (Cor\351e du Sud)                        ");
    }

    @Test
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Locale.Builder builder8 = builder5.setLocale(locale6);
        java.lang.String str10 = locale6.getExtension('h');
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = locale11.stripExtensions();
        java.lang.String str14 = locale11.getLanguage();
        java.lang.String str15 = locale11.getISO3Language();
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale19.getDisplayName();
        java.util.Locale.Builder builder21 = builder18.setLocale(locale19);
        java.util.Locale.Builder builder22 = builder21.clear();
        java.util.Locale.Builder builder24 = builder22.setLanguage("ITALIAN");
        java.util.Locale locale25 = builder22.build();
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale25);
        java.lang.String str27 = locale11.getDisplayScript(locale25);
        java.util.Locale locale28 = locale11.stripExtensions();
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = locale31.getDisplayName(locale32);
        java.util.Locale.setDefault(category29, locale32);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.getDefault(category35);
        java.lang.String str38 = locale36.getExtension('x');
        java.util.Locale.setDefault(category29, locale36);
        java.util.Locale locale40 = java.util.Locale.getDefault(category29);
        java.util.Locale locale41 = java.util.Locale.ITALY;
        java.lang.String str42 = locale41.getScript();
        java.util.Locale.setDefault(category29, locale41);
        java.util.Locale locale44 = java.util.Locale.getDefault(category29);
        java.lang.String str45 = locale11.getDisplayName(locale44);
        java.lang.String str46 = locale6.getDisplayCountry(locale11);
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italien" + "'", str12, "italien");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "it" + "'", str14, "it");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fran\347ais (Canada)" + "'", str20, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HI!" + "'", str26, "HI!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it");
        org.junit.Assert.assertTrue("'" + category29 + "' != '" + java.util.Locale.Category.FORMAT + "'", category29.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "allemand" + "'", str33, "allemand");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.FORMAT + "'", category35.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "italiano" + "'", str45, "italiano");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Italia" + "'", str46, "Italia");
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\U0078");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!       allemandItalienischallemanditalian_ITALIAN_Eng    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese (China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", 'z');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("(italian,english)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(italian,english)" + "'", str1, "(italian,english)");
    }
}
