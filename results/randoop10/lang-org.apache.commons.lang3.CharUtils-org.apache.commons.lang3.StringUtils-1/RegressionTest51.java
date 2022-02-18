import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

    public static boolean debug = false;

    @Test
    public void test25501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                 TALIAN                                                  ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 TALIAN                                                  " + "'", str2, "                                                 TALIAN                                                  ");
    }

    @Test
    public void test25502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "_\\u0020_italienisch####################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\\u0020_italienisch####################################################################..." + "'", str1, "_\\u0020_italienisch####################################################################...");
    }

    @Test
    public void test25503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...", "\u82f1\u6587\u82f1\u6587\u82f1\u6587\u82f1\u6587TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch(Frankreich)aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC..." + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
    }

    @Test
    public void test25504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25504");
        char[] charArray12 = new char[] { ' ', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Chinese (China)", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0065", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0029", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "eng", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ITALIAN_it  i  _ NGLISHITALIAN_ IHitTAiT_ITALIAN_EgAish", charArray12);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test25505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati" + "'", str1, "nailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailatinailati");
    }

    @Test
    public void test25506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25506");
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
        java.util.Locale.Builder builder14 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder9.setUnicodeLocaleKeyword("\\u0043", "                                                                  \\U0069HHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: \\u0043 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test25507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGGitalianZH_CNGGGGG");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "en_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_..." + "'", str1, "en_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_USen_...");
    }

    @Test
    public void test25509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25509");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                               TALY                                                   TALY     ", (int) 'A', 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25510");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getISO3Country();
        java.util.Locale locale10 = new java.util.Locale(" Italia  Italia  Italia  Italia  Italia  Italia  Italia DEUTSCH Italia  Italia  Italia  Italia  Italia  Italia  Italia  ", "8300u\\", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        java.lang.String str11 = locale5.getDisplayName(locale10);
        java.lang.String str12 = locale5.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRA" + "'", str6, "FRA");
        org.junit.Assert.assertEquals(locale10.toString(), " italia  italia  italia  italia  italia  italia  italia deutsch italia  italia  italia  italia  italia  italia  italia  _8300U\\_!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihtedesco    !ih!ih!ih!ih!ih!ih!iJapanese");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "French (France)" + "'", str11, "French (France)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
    }

    @Test
    public void test25511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("2CINESE(CINA...                                                                                  ", "\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351eHHHHHHHHHHtTAHHHHHHHHHHT_ITAcor\351");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2CINESE(CINA...                                                                                  " + "'", str2, "2CINESE(CINA...                                                                                  ");
    }

    @Test
    public void test25512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25512");
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
        java.util.Locale.Builder builder40 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Italian" + "'", str15, "Italian");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Italian" + "'", str22, "Italian");
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
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test25513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\", "                   Italy                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\" + "'", str2, "...!       \\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\u003dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn\\");
    }

    @Test
    public void test25514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25514");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                        IT44444444444444444EN                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTtat_itaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ADaAEaAFaAGaAIaALaAMaANaAOaAQaARaASaATaAUaAWaAXaAZaBAaBBaBDaBEaBFaBGaBHaBIaBJaBLaBMaBNaBOaBQaBRaBSaBTaBVaBWaBYaBZaCAaCCaCDaCFaCGaCHaCIaCKaCLaCMaCNaCOaCRaCUaCVaCWaCXaCYaCZaDEaDJaDKaDMaDOaDZaECaEEaEGaEHaERaESaETaFIaFJaFKaFMaFOaFRaGAaGBaGDaGEaGFaGGaGHaGIaGLaGMaGNaGPaGQaGRaGSaGTaGUaGWaGYaHKaHMaHNaHRaHTaHUaIDaIEaILaIMaINaIOaIQaIRaISaITaJEaJMaJOaJPaKEaKGaKHaKIaKMaKNaKPaKRaKWaKYaKZaLAaLBaLCaLIaLKaLRaLSaLTaLUaLVaLYaMAaMCaMDaMEaMFaMGaMHaMKaMLaMMaMNaMOaMPaMQaMRaMSaMTaMUaMVaMWaMXaMYaMZaNAaNCaNEaNFaNGaNIaNLaNOaNPaNRaNUaNZaOMaPAaPEaPFaPGaPHaPKaPLaPMaPNaPRaPSaPTaPWaPYaQAaREaROaRSaRUaRWaSAaSBaSCaSDaSEaSGaSHaSIaSJaSKaSLaSMaSNaSOaSRaSSaSTaSVaSXaSYaSZaTCaTDaTFaTGaTHaTJaTKaTLaTMaTNaTOaTRaTTaTVaTWaTZaUAaUGaUMaUSaUYaUZaVAaVCaVEaVGaVIaVNaVUaWFaWSaYEaYTaZAaZMaZW", 'z');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25516");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0023DAL", "\\u0049", (int) '0');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25518");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("English                                 (                United                                 Kingdom                )", 0, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25519");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0066", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Franzosisch(Frankreich)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Franzosisch(Frankreich)" + "'", str1, "Franzosisch(Frankreich)");
    }

    @Test
    public void test25521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25521");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getDisplayName();
        java.lang.String str4 = locale0.getCountry();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.getDisplayName();
        java.lang.String str11 = locale7.getCountry();
        java.util.Set<java.lang.String> strSet12 = locale7.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale7.getUnicodeLocaleKeys();
        java.lang.String str14 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale16);
        java.lang.String str23 = locale16.getExtension('z');
        java.lang.String str24 = locale0.getDisplayName(locale16);
        java.lang.Class<?> wildcardClass25 = locale16.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Italian" + "'", str10, "Italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italiano" + "'", str14, "italiano");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!       " + "'", str21, "hi!       ");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italien" + "'", str24, "italien");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test25522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25522");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0068", (int) 'u', (int) ')');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25523");
        java.util.Locale locale2 = new java.util.Locale("", "");
        java.lang.String str3 = locale2.getVariant();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.util.Locale locale5 = locale2.stripExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.getDefault(category6);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Locale.setDefault(category6, locale9);
        java.util.Set<java.lang.String> strSet12 = locale9.getUnicodeLocaleKeys();
        java.lang.String str13 = locale9.getLanguage();
        java.lang.String str14 = locale9.getDisplayCountry();
        java.lang.String str15 = locale2.getDisplayScript(locale9);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getDisplayName();
        java.util.Locale.Builder builder20 = builder17.setLocale(locale18);
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder21.setLanguage("ITALIAN");
        java.util.Locale.Builder builder24 = builder21.clearExtensions();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale25.getLanguage();
        java.lang.String str27 = locale2.getDisplayScript(locale25);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "allemand" + "'", str10, "allemand");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Canada" + "'", str14, "Canada");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "French (Canada)" + "'", str19, "French (Canada)");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "italian" + "'", str26, "italian");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test25524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25524");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("nauruan", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25526");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fRANZ\326SISCH (kANADA)fRANZ\326S                                                                 fRANZ\326SISCH (kANADA)fRANZ\326SI", (double) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=40.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25527");
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
        java.util.Locale locale13 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setLanguage("cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEngFischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: cCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEngFischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test25528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("francese (Francia)", "TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "francese (Francia)" + "'", str2, "francese (Francia)");
    }

    @Test
    public void test25529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\U0020ITALIANITALIANITALIANITALI", '8');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str2, "\\U0020ITALIANITALIANITALIANITALI");
    }

    @Test
    public void test25530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25530");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("I");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
    }

    @Test
    public void test25531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25531");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!itTAiT_ITALIAN_EgAish!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\\u0068", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test25532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("de-de", "nglish ...hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienischhi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de-de" + "'", str3, "de-de");
    }

    @Test
    public void test25533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!iiiiiii_\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################hcsineilatI_0200U\\_iiiiiii!ih" + "'", str1, "#########################################################################################hcsineilatI_0200U\\_iiiiiii!ih");
    }

    @Test
    public void test25534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA" + "'", str1, "nglish ...hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienischhi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOA");
    }

    @Test
    public void test25535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("2CINESE (CINA)ITALIANITALIANITALIANITAL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LATINAILATINAILATINAILATI)ANIC( ESENIC2" + "'", str1, "LATINAILATINAILATINAILATI)ANIC( ESENIC2");
    }

    @Test
    public void test25536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25536");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Locale locale3 = null;
        java.lang.String str4 = locale0.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French" + "'", str5, "French");
    }

    @Test
    public void test25537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ti", "                                 44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0061", "gERMAN (gERMANY)", "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061" + "'", str3, "\\u0061");
    }

    @Test
    public void test25539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "########################################################################################eltI_0200U\\_!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################################################################################eltI_0200U\\_!" + "'", str1, "########################################################################################eltI_0200U\\_!");
    }

    @Test
    public void test25540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" + "'", str1, "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
    }

    @Test
    public void test25541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.setExtension('k', "R0");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder9.setExtension('!', "\\u0063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: ! [at index 0]");
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
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test25542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("deu", "hIAN\\U0020Ihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "deu" + "'", str2, "deu");
    }

    @Test
    public void test25543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25543");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\xtalxan_ITALIAN_Englxsh", "Englisch", 104);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "E             g                                                                                     ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray5, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "italian (ITALIAN,English)");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("Franz\366sischFranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str10, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\xtalxan_ITALIAN_Englxsh" + "'", str12, "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "...\r\r\r\r\r\r\r\r..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "2aiTALIANiTALIANiTALIANiTALCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test25545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u6cd5", 0, '9');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u6cd5" + "'", str3, "\\u6cd5");
    }

    @Test
    public void test25546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25546");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Franz\366sisch (Kanada", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "...ANiTALI", (int) ' ', 27);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk)hcierknarF( hcsisoznarFhcsis\366znarF", strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("italian (italian,englcor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351encor\351", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "zhozhozhozhozhozhozhozhozhozhozhoItaliazhozhozhozhozhozhozhozhozhozhozhoz");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Kanada" + "'", str12, "Franz\366sisch (Kanada");
    }

    @Test
    public void test25547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25547");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("GBR", "f", (int) 't');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("x", "ixii");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hfffffffffcanad", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hfffffffffcanad" + "'", str8, "Hfffffffffcanad");
    }

    @Test
    public void test25548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "italian__#e-deutsch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian__#e-deutsch" + "'", str1, "Italian__#e-deutsch");
    }

    @Test
    public void test25549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25549");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("....................................................................................... (italian,english)", "5c5c5cm5c5c5c5c5c5c5cm5c5cy5c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25550");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrefrankreichgfrankreichfrankreichs", "\\U000A", 16, (int) 'n');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rrrrrrrrrrrrrrrr\\U000A" + "'", str4, "rrrrrrrrrrrrrrrr\\U000A");
    }

    @Test
    public void test25551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Franzosisch(Frankreich)", "\\u0029");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("DACFACGACHACIACKACLAC", "HI!HI     \\u005cggggggggggggggggggggggggggggggggggggg");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "german (germany)german (germany)german (gC\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rChinesisch (China)(germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)german (germany)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25554");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       r-FRAAAAAAAAAAAAAAAAAAAAAAAAAAA                        ", 32, (int) 'g');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25555");
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
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        java.lang.String str17 = locale13.getDisplayCountry();
        java.lang.String str18 = locale13.getScript();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale13.getDisplayName(locale19);
        java.lang.String str22 = locale13.getDisplayName();
        java.lang.String str23 = locale10.getDisplayName(locale13);
        java.util.Locale.setDefault(locale13);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clear();
        java.util.Locale locale27 = builder25.build();
        java.util.Locale.Builder builder28 = builder25.clearExtensions();
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale.Builder builder30 = builder28.clearExtensions();
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder32 = builder31.clearExtensions();
        java.util.Locale.Builder builder34 = builder31.setLanguageTag("Italian");
        java.util.Locale.Builder builder35 = builder31.clearExtensions();
        java.util.Locale.Builder builder36 = builder31.clear();
        java.util.Locale.Builder builder37 = builder31.clearExtensions();
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        java.lang.String str39 = locale38.getDisplayLanguage();
        java.util.Locale locale40 = locale38.stripExtensions();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str43 = locale42.getDisplayScript();
        java.lang.String str44 = locale40.getDisplayCountry(locale42);
        java.util.Set<java.lang.Character> charSet45 = locale40.getExtensionKeys();
        java.util.Locale.Builder builder46 = builder31.setLocale(locale40);
        java.util.Locale locale48 = java.util.Locale.FRENCH;
        java.util.Locale locale49 = java.util.Locale.ENGLISH;
        java.lang.String str50 = locale49.getDisplayCountry();
        java.lang.String str51 = locale48.getDisplayVariant(locale49);
        java.lang.String str52 = locale48.getDisplayCountry();
        java.lang.String str53 = locale48.getScript();
        java.lang.String str54 = locale48.getScript();
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.lang.String str57 = locale56.getDisplayCountry();
        java.lang.String str58 = locale55.getDisplayVariant(locale56);
        java.lang.String str59 = locale55.getDisplayCountry();
        java.lang.String str60 = locale55.getScript();
        java.lang.String str61 = locale55.getScript();
        java.lang.String str62 = locale48.getDisplayCountry(locale55);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale55);
        java.lang.String str64 = locale55.getDisplayName();
        java.util.Locale locale65 = null;
        java.lang.String str66 = locale55.getDisplayVariant(locale65);
        java.util.Set<java.lang.String> strSet67 = locale55.getUnicodeLocaleKeys();
        java.lang.String str68 = locale40.getDisplayVariant(locale55);
        java.util.Locale.Builder builder69 = builder30.setLocale(locale40);
        java.util.Locale locale70 = builder69.build();
        java.lang.String str71 = locale70.getDisplayCountry();
        java.lang.String str72 = locale13.getDisplayName(locale70);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Italian" + "'", str3, "Italian");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italian" + "'", str4, "Italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Italian" + "'", str5, "Italian");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CAN" + "'", str11, "CAN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ko" + "'", str20, "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str21, "\ud504\ub791\uc2a4\uc5b4");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French" + "'", str22, "French");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "anglais (Canada)" + "'", str23, "anglais (Canada)");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "italien" + "'", str39, "italien");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(charSet45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "fr");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str63, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "fran\347ais" + "'", str64, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "it");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "francese" + "'", str72, "francese");
    }

    @Test
    public void test25556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25556");
        java.util.Locale locale3 = new java.util.Locale("5\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065\\U0065", "  ", "\u6cd5\u570b                                                                   ");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\\u6cd5\u570b                                                                   ");
    }

    @Test
    public void test25557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ITALIAN4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ITALIAN4" + "'", str1, "ITALIAN4");
    }

    @Test
    public void test25558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "             DE_DE            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h (CCCCCCCCC,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EC ER ES EC FC FJ FK)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H (ccccccccc,cv cw cx cy cz de dj dk dm do dz ec ee eg ec er es ec fc fj fk)" + "'", str1, "H (ccccccccc,cv cw cx cy cz de dj dk dm do dz ec ee eg ec er es ec fc fj fk)");
    }

    @Test
    public void test25560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25560");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                          nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhi!nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                           ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test25561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("french", (int) 'D', "FRTTAT_ITA                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRTTAT_ITA                                                    french" + "'", str3, "FRTTAT_ITA                                                    french");
    }

    @Test
    public void test25562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 17, ')');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "...alamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxc......alamaniiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test25563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\u82f1\u8a9e", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                h                                 ", "hcsnela", "dallemandallemandallemandallemandallemandallemandallemandallennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                h                                 " + "'", str3, "                                h                                 ");
    }

    @Test
    public void test25565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("          ", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test25566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25566");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                      Englisch                                                       ", "anglais (royaume-uni)fra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test25567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065" + "'", str1, "5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065");
    }

    @Test
    public void test25568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("italian_italian_english         itaU0020ITALIANITALIANITALIANITALI                 she             g", "chinese");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25569");
        java.util.Locale locale3 = new java.util.Locale("ko", "2iT hi!       _\\U0020_Italienisch####################################################################            2iT", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals(locale3.toString(), "ko_2IT HI!       _\\U0020_ITALIENISCH####################################################################            2IT_iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test25570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADYAEYAFYAGYAIYALYAMYANYAOYAQYARYASYATYAUYAWYAXYAZYBAYBBYBDYBEYBFYBGYBHYBIYBJYBLYBMYBNYBOYBQYBRYBSYBTYBVYBWYBYYBZYCAYCCYCDYCFYCGYCHYCIYCKYCLYCMYCNYCOYCRYCUYCVYCWYCXYCYYCZYDEYDJYDKYDMYDOYDZYECYEEYEGYEHYERYESYETYFIYFJYFKYFMYFOYFRYGAYGBYGDYGEYGFYGGYGHYGIYGLYGMYGNYGPYGQYGRYGSYGTYGUYGWYGYYHKYHMYHNYHRYHTYHUYIDYIEYILYIMYINYIOYIQYIRYISYITYJEYJMYJOYJPYKEYKGYKHYKIYKMYKNYKPYKRYKWYKYYKZYLAYLBYLCYLIYLKYLRYLSYLTYLUYLVYLYYMAYMCYMDYMEYMFYMGYMHYMKYMLYMMYMNYMOYMPYMQYMRYMSYMTYMUYMVYMWYMXYMYYMZYNAYNCYNEYNFYNGYNIYNLYNOYNPYNRYNUYNZYOMYPAYPEYPFYPGYPHYPKYPLYPMYPNYPRYPSYPTYPWYPYYQAYREYROYRSYRUYRWYSAYSBYSCYSDYSEYSGYSHYSIYSJYSKYSLYSMYSNYSOYSRYSSYSTYSVYSXYSYYSZYTCYTDYTFYTGYTHYTJYTKYTLYTMYTNYTOYTRYTTYTVYTWYTZYUAYUGYUMYUSYUYYUZYVAYVCYVEYVGYVIYVNYVUYWFYWSYYEYYTYZAYZMYZW", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCC...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114 + "'", int2 == 114);
    }

    @Test
    public void test25571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0061", "44444444444444444444444444444444444444444444it                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061" + "'", str2, "\\u0061");
    }

    @Test
    public void test25572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25572");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\uc601\uc5b4", "", "\ud504\ub791\uc2a4\uc5b4\uce90\ub098\ub2e4)_ENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENGENG_                                                                    \\u0020iTALIANiTALIANiTALIANiTALI", (int) 'A');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uc601\uc5b4" + "'", str4, "\uc601\uc5b4");
    }

    @Test
    public void test25573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA" + "'", str1, "...FDEDZCYCXCWCVCUCRCOCNCMCLCKCICHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJBIBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALAIAGAFAEADA");
    }

    @Test
    public void test25574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA", "\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3\u97d3\u6587\u5357\u97d3");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test25575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 'x');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\ub3c5\uc77c\uc5b4Italian    italian    italian    italian    italian    italian    italian    italian    italian    italian   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test25576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hhhhhhhhhh", ')');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn", "                                                                 ", (int) 'C');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("             DE_DE            ", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "             DE_DE            " + "'", str8, "             DE_DE            ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn" + "'", str9, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rFrn");
    }

    @Test
    public void test25577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25577");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Frankreich", "                          ...", 64);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("TITHI!HI!", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TITHI!HI!                                                                                      " + "'", str2, "TITHI!HI!                                                                                      ");
    }

    @Test
    public void test25579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25579");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("itFranz\366sischTAFranz\366sischiFranz\366sischTFranz\366sisch_Franz\366sischITA", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test25580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                  \\u0068", "!_\\U0020_itle########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                  \\u0068" + "'", str2, "                                                                                                                  \\u0068");
    }

    @Test
    public void test25581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("FRANCESE (CANADA)", "ITALIAN", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FRANCESE (CANADA)" + "'", str3, "FRANCESE (CANADA)");
    }

    @Test
    public void test25582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25582");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("... g ...", "EnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglischEnglisch");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25583");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getExtension('C');
        java.lang.String str8 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale3);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.String str11 = locale3.getDisplayName();
        java.lang.Class<?> wildcardClass12 = locale3.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais" + "'", str5, "fran\347ais");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinois" + "'", str8, "chinois");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u0038 (FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Italian", 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25586");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW", "       !ih", 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                                                                    .................................Italian (Italy)", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW" + "'", str5, "ADkAEkAFkAGkAIkALkAMkANkAOkAQkARkASkATkAUkAWkAXkAZkBAkBBkBDkBEkBFkBGkBHkBIkBJkBLkBMkBNkBOkBQkBRkBSkBTkBVkBWkBYkBZkCAkCCkCDkCFkCGkCHkCIkCKkCLkCMkCNkCOkCRkCUkCVkCWkCXkCYkCZkDEkDJkDKkDMkDOkDZkECkEEkEGkEHkERkESkETkFIkFJkFKkFMkFOkFRkGAkGBkGDkGEkGFkGGkGHkGIkGLkGMkGNkGPkGQkGRkGSkGTkGUkGWkGYkHKkHMkHNkHRkHTkHUkIDkIEkILkIMkINkIOkIQkIRkISkITkJEkJMkJOkJPkKEkKGkKHkKIkKMkKNkKPkKRkKWkKYkKZkLAkLBkLCkLIkLKkLRkLSkLTkLUkLVkLYkMAkMCkMDkMEkMFkMGkMHkMKkMLkMMkMNkMOkMPkMQkMRkMSkMTkMUkMVkMWkMXkMYkMZkNAkNCkNEkNFkNGkNIkNLkNOkNPkNRkNUkNZkOMkPAkPEkPFkPGkPHkPKkPLkPMkPNkPRkPSkPTkPWkPYkQAkREkROkRSkRUkRWkSAkSBkSCkSDkSEkSGkSHkSIkSJkSKkSLkSMkSNkSOkSRkSSkSTkSVkSXkSYkSZkTCkTDkTFkTGkTHkTJkTKkTLkTMkTNkTOkTRkTTkTVkTWkTZkUAkUGkUMkUSkUYkUZkVAkVCkVEkVGkVIkVNkVUkWFkWSkYEkYTkZAkZMkZW");
    }

    @Test
    public void test25587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25587");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.addUnicodeLocaleAttribute("itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: itChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TAChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)iChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)TChineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)_Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)ITA [at index 0]");
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
    public void test25588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25588");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 104, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25589");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.getLanguage();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale12.getDisplayName();
        java.util.Locale.Builder builder14 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale.Builder builder17 = builder15.setLanguage("ITALIAN");
        java.util.Locale locale18 = builder15.build();
        java.lang.String str19 = locale7.getDisplayScript(locale18);
        java.lang.String str20 = locale18.getDisplayLanguage();
        java.lang.String str21 = locale18.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str13, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "italian" + "'", str20, "italian");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "italian" + "'", str21, "italian");
    }

    @Test
    public void test25590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\u0061\\u0061\\u0061", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzh", 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25592");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test25593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25593");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...anitali", "...FDEDZCYCXCWCVCUCRCOCNCMCLCKC         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHCHCGCFCDCCCACZBYBWBVBTBSBRBQBOBNBMBLBJB         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHBHBGBFBEBDBBBABZAXAWAUATASARAQAOANAMALA         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHAGAFAEADA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test25594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_Englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test25595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!_\\U0020_Italienisch#########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!_\\u0020_italienisch#########################################################################################" + "'", str1, "hi!_\\u0020_italienisch#########################################################################################");
    }

    @Test
    public void test25596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\u005", "0034\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25597");
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
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setLanguageTag("Italian");
        java.util.Locale.Builder builder18 = builder14.clearExtensions();
        java.util.Locale.Builder builder19 = builder14.clear();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder22 = builder14.setLocale(locale21);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder24 = builder22.clear();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale locale26 = builder24.build();
        java.util.Locale.Builder builder27 = builder13.setLocale(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder13.removeUnicodeLocaleAttribute("ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ECANADA                                      ...g                                      ...CANADACANADA                                      ...sh                                      ...                                                                                                    [at index 0]");
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test25598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "G", "\\u005YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25599");
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
            java.util.Locale.Builder builder17 = builder14.setLanguage("\ud55c\uad6d\uc5b4\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ????????????????????????????????????????????????????????????????????????????????????????????????????????? [at index 0]");
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
    public void test25600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25600");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("KOR", 0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25602");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("anglaisaaaaaaaaaaaaaaaaDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061aaaaaaaaaaaaaaaa(Royaume-Uni)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=anglaisaaaaaaaaaaaaaaaadeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061aaaaaaaaaaaaaaaa(royaume-uni)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25603");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "fran\347ais (Canada)");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("\r", strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "Eng");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!" + "'", str7, "HI!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str16, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin44444444444444alia44444444444444itiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test25604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\italian_ITALIAN_English", ')');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25605");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '.', 'R');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test25606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AQeAReASeATeAU", "France", 812);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25608");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("etatS detinU", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00                                             hFranzosischFranzosisch (Frankreich)                                             \\FranzosischFranzosisch (Frankreich)0034\\FranzosischFranzosisch (Frankreich)00 (\\U0020IITALIAN\\U0020I)", "G");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444444444444444444444444444!IH", "\\xtalxan_ITALIAN_Englxsh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("NC_hz\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "cHINESISCH (cHINA)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25613");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "rnz\366sisch(Knd                                                                                                                                                                                                               ", (java.lang.CharSequence) "hcsineilati             dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25614");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("French (France)", "Chinese (China)hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh99999\\u0021hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "IFTLNZ\\SISC02");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25616");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Locale locale8 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str9 = locale2.getDisplayLanguage(locale8);
        java.lang.String str10 = locale2.getDisplayLanguage();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase(" hi!       _\\U0020...", locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         italian_italian_english" + "'", str3, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals(locale8.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinesisch" + "'", str10, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!       _\\u0020..." + "'", str11, " hi!       _\\u0020...");
    }

    @Test
    public void test25617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25617");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "!IH");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "cCCCC...", 76, 29);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25618");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getScript();
        java.lang.String str5 = locale0.getDisplayScript(locale2);
        java.lang.String str6 = locale2.getScript();
        java.lang.String str7 = locale2.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getExtension('-');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: -");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "de" + "'", str3, "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25619");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder1.setLanguage("und");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale locale8 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLanguage("                                                                 CANADA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:                                                                  CANADA [at index 0]");
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
    }

    @Test
    public void test25620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("KKKKKKKKKKKKKKKKKKKK)DNK(HCSIS\326ZNRFKKKKKKKKKKKKKKKKKKKK", "!ih_HHHHHHHHHHDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("DE");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("erma (ermay)", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'T');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DE" + "'", str5, "DE");
    }

    @Test
    public void test25622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                             deutsch                                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test25623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25623");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList43 = java.util.Locale.LanguageRange.parse("Eagaash");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList45 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList43, strMap44);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList47 = java.util.Locale.LanguageRange.parse("und");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList47, strMap48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList47, strMap50);
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str55 = locale53.getDisplayVariant();
        java.lang.String str56 = locale53.getCountry();
        java.util.Set<java.lang.String> strSet57 = locale53.getUnicodeLocaleAttributes();
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet57, "!_\\U0020_Itle#########################################################################################");
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet57, 'n');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap63 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList64 = java.util.Locale.LanguageRange.parse("nailati", strMap63);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap65 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList66 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList64, strMap65);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList64, strMap67);
        java.util.Locale locale70 = java.util.Locale.FRANCE;
        java.util.Locale locale71 = java.util.Locale.ITALIAN;
        java.lang.String str73 = locale71.getExtension('h');
        java.lang.String str74 = locale70.getDisplayScript(locale71);
        java.lang.String str75 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale70);
        java.lang.String str76 = locale70.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet77 = locale70.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange languageRange79 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange81 = new java.util.Locale.LanguageRange("E");
        java.lang.String str82 = languageRange81.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray83 = new java.util.Locale.LanguageRange[] { languageRange79, languageRange81 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList84 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84, languageRangeArray83);
        java.util.Locale locale86 = java.util.Locale.ITALIAN;
        java.lang.String str87 = locale86.getDisplayLanguage();
        java.util.Locale locale88 = locale86.stripExtensions();
        java.lang.String str89 = locale86.getLanguage();
        java.util.Set<java.lang.String> strSet90 = locale86.getUnicodeLocaleKeys();
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet90, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode93 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList84, (java.util.Collection<java.lang.String>) strSet90, filteringMode93);
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags(languageRangeList68, (java.util.Collection<java.lang.String>) strSet77, filteringMode93);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList47, (java.util.Collection<java.lang.String>) strSet57, filteringMode93);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList45, (java.util.Collection<java.lang.String>) strSet57);
        java.util.List<java.lang.String> strList98 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet57);
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
        org.junit.Assert.assertNotNull(languageRangeList45);
        org.junit.Assert.assertNotNull(languageRangeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(languageRangeList64);
        org.junit.Assert.assertNotNull(languageRangeList66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "it");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!       " + "'", str75, "hi!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Franz\366sisch" + "'", str76, "Franz\366sisch");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "e" + "'", str82, "e");
        org.junit.Assert.assertNotNull(languageRangeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Italienisch" + "'", str87, "Italienisch");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "it");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "it" + "'", str89, "it");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + filteringMode93 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode93.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(strList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test25624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25624");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("fr-ca", "                                                  IT44444444444444444EN");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("h", "aaaaaaaaaaaaCaaaaaaaaaaaa", "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test25626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25626");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("emand", "francese88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25627");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\italian_ITALIAN_English");
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale4.getExtension('h');
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale3);
        java.lang.String str9 = locale1.getDisplayCountry(locale3);
        java.lang.String str10 = locale3.getCountry();
        java.lang.String str11 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       " + "'", str8, "hi!       ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Franz\366sisch" + "'", str11, "Franz\366sisch");
    }

    @Test
    public void test25628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Ckkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", (int) 'l');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + "'", str2, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    }

    @Test
    public void test25629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("E             g                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E g" + "'", str1, "E g");
    }

    @Test
    public void test25630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25630");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("        FRA         ", "esenihC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("FRANZ\326SISCH2(FRANKREICH)", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FRANZ\326" + "'", str2, "FRANZ\326");
    }

    @Test
    public void test25632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25632");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Country();
        boolean boolean3 = locale0.equals((java.lang.Object) 'C');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test25633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25633");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                         eNGLISHu005c         ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test25634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25634");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test25635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test25636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25636");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setScript("");
        java.util.Locale locale7 = builder6.build();
        java.lang.String str8 = locale7.getLanguage();
        boolean boolean9 = locale7.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale10.getVariant();
        java.lang.String str14 = locale7.getDisplayCountry(locale10);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "italian" + "'", str8, "italian");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25637");
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
        java.lang.String str16 = locale0.toLanguageTag();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "und" + "'", str16, "und");
    }

    @Test
    public void test25638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,iTALIAN)\\u0023 (ITALIENISCH,\\AuA0046");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25639");
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
        java.util.Locale locale43 = new java.util.Locale("italie");
        java.lang.String str44 = locale36.getDisplayCountry(locale43);
        java.util.Locale locale45 = locale43.stripExtensions();
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
        org.junit.Assert.assertEquals(locale43.toString(), "italie");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "China" + "'", str44, "China");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "italie");
    }

    @Test
    public void test25640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25640");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0023DAL", "       DE_DE            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "FR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAFFR-CAFR-CAFR-C8600U\\FR-CAFR-CAFR-CAFR-CAFR-CAFR-C8600U\\FR-CAF");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25643");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("z...frn", "                                                                    \\u0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25644");
        java.util.Locale locale1 = new java.util.Locale("ian\\u0020i");
        java.util.Locale locale4 = new java.util.Locale("cor\351en (Cor\351e du Sud)", "RA");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale4.getDisplayName(locale5);
        java.lang.String str8 = locale5.getDisplayVariant();
        java.lang.String str9 = locale1.getDisplayLanguage(locale5);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getScript();
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale16.getDisplayName(locale17);
        java.util.Locale.setDefault(category14, locale17);
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.getDefault(category20);
        java.lang.String str23 = locale21.getExtension('x');
        java.util.Locale.setDefault(category14, locale21);
        java.util.Locale locale28 = new java.util.Locale("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-CA", "", "                                      )hsilgne,nailati( ");
        java.lang.String str29 = locale28.getISO3Country();
        java.util.Locale.setDefault(category14, locale28);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getScript();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale31.getCountry();
        java.util.Locale.setDefault(locale31);
        java.util.Locale.setDefault(category14, locale31);
        java.lang.String str37 = locale10.getDisplayScript(locale31);
        java.lang.String str38 = locale10.getScript();
        java.lang.String str39 = locale5.getDisplayLanguage(locale10);
        org.junit.Assert.assertEquals(locale1.toString(), "ian\\u0020i");
        org.junit.Assert.assertEquals(locale4.toString(), "cor\351en (cor\351e du sud)_RA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cor\351en (cor\351e du sud) (RA)" + "'", str7, "cor\351en (cor\351e du sud) (RA)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ian\\u0020i" + "'", str9, "ian\\u0020i");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais" + "'", str11, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.FORMAT + "'", category14.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "allemand" + "'", str18, "allemand");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.FORMAT + "'", category20.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals(locale28.toString(), "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhfr-ca__                                      )hsilgne,nailati( ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "US" + "'", str34, "US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "chinois" + "'", str39, "chinois");
    }

    @Test
    public void test25645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test25646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                         fr-", "\uc774\ud0c8\ub9ac\uc544\uc5b4                  ", "allemand (Allemagne)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         fr-" + "'", str3, "                                                                                         fr-");
    }

    @Test
    public void test25647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25647");
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
        java.lang.String str17 = locale3.getLanguage();
        java.util.Locale.setDefault(locale3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDF...", locale3);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fr" + "'", str17, "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedf..." + "'", str19, "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczdedf...");
    }

    @Test
    public void test25648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25648");
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
        java.util.Set<java.lang.Character> charSet13 = locale10.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charSet13);
    }

    @Test
    public void test25649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\", "\\u0045");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!       aitalianitalianitalianitaliTALIENISCHaitalianitalianitalianitalITALIAN_italian_eNGLISHaitalianitalianitalianitalhi!aitalianitalianitalianitalHI!aitalianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...aitalianitalianitalianital\\U0034aitalianitalianitalianitalhi!aitalianitalianitalianitaliTALIANaitalianitalianitalianital\\U0061aitalianitalianitalianital\\U00a3aitalianitalianitalianitalHI!aitalianitalianitalianitalItalianaitalianitalianitalianitalcHINESE (cHINA)aitalianitalianitalianitalHI!aitalianitalianitalianitalZH_cnaitalianitalianitalianitalItalianaitalianitalianitalianitalENaitalianitalianitalianitaliTALIENISCH", "                                                       a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25651");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("NAILAT", "rrrrrrrrrrrrrrrr\\U000A", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Franz\366sisc", 21, (int) '\u6cd5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0029fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran\347fran");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'R', 46, (int) 'S');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25654");
        char[] charArray11 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    \\    ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("fr-cafr-cafr-c8600u\\fr-cafr-cafr-ca", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Ckkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25657");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale.Builder builder5 = builder2.setLocale(locale3);
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguage("ITALIAN");
        java.util.Locale.Builder builder10 = builder8.setLanguage("FRA");
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getVariant();
        java.lang.String str16 = locale13.getDisplayName();
        java.lang.String str17 = locale13.getCountry();
        java.util.Set<java.lang.String> strSet18 = locale13.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale20 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale20.getVariant();
        java.lang.String str23 = locale20.getDisplayName();
        java.lang.String str24 = locale20.getCountry();
        java.util.Set<java.lang.String> strSet25 = locale20.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet26 = locale20.getUnicodeLocaleKeys();
        java.lang.String str27 = locale13.getDisplayLanguage(locale20);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str32 = locale30.getExtension('h');
        java.lang.String str33 = locale29.getDisplayScript(locale30);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale29);
        java.lang.String str36 = locale29.getExtension('z');
        java.lang.String str37 = locale13.getDisplayName(locale29);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.lowerCase("                                                               \\u002", locale29);
        boolean boolean39 = locale29.hasExtensions();
        java.util.Locale.Builder builder40 = builder11.setLocale(locale29);
        java.util.Set<java.lang.Character> charSet41 = locale29.getExtensionKeys();
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                     g             e", locale29);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fran\347ais (Canada)" + "'", str4, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "italien" + "'", str16, "italien");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "italien" + "'", str23, "italien");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "italiano" + "'", str27, "italiano");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!       " + "'", str34, "hi!       ");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "italien" + "'", str37, "italien");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                                               \\u002" + "'", str38, "                                                               \\u002");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "                                                                                     g             e" + "'", str42, "                                                                                     g             e");
    }

    @Test
    public void test25658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK", "FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRFRFRFRFR###############################################FRFRFRFRFRFRFRFRFRFRFRFRFde_DEFRFRFRFRFRFRFRFRFRTALIAN\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK" + "'", str2, "_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test25659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25659");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("hhhhhhhhhh (                                                                                     G             )");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: hhhhhhhhhh (                                                                                     G             ) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test25660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("cinese (Cina)                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cinese (Cina)" + "'", str1, "cinese (Cina)");
    }

    @Test
    public void test25661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25661");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihCAnihC", "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzHSXLGNE_N");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRFrancia");
    }

    @Test
    public void test25663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25663");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Deutschland");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "neilRtI    E", (java.lang.CharSequence) "Azhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais cinese (cina)u0069h..France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzhfrancais (France)Azhzhzhzhzhzhzhzhzhzh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25665");
        char[] charArray9 = new char[] { ' ', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\italian_ITALIAN_English", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sischFranzosisch (Frankreich)", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALHcsineilatI", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0075", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test25666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25666");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test25667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25667");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "FR-C");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\u0078", "0034\\u00", "ZH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061ItalienischI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0078" + "'", str3, "\\u0078");
    }

    @Test
    public void test25669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "  \\U005    (...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!IH\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISCH)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25670");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getDisplayScript();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fr-FR" + "'", str4, "fr-FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fran\347ais" + "'", str5, "fran\347ais");
    }

    @Test
    public void test25671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Frnz\366sisch(Knd)", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZ", "         9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " rnz\366sisch(nd)" + "'", str3, " rnz\366sisch(nd)");
    }

    @Test
    public void test25672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\ud504           fr_FR                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\ud504           fr_FR                  " + "'", str1, "\ud504           fr_FR                  ");
    }

    @Test
    public void test25673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25673");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", 82, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25674");
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("EAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ", locale1);
        java.lang.String str5 = locale1.getExtension('c');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "eagaash                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test25675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25675");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = new java.util.Locale("CA");
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale16 = new java.util.Locale("\\u005c");
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale18);
        java.lang.String str20 = locale18.getVariant();
        java.lang.String str21 = locale16.getDisplayScript(locale18);
        java.lang.String str23 = locale16.getExtension('C');
        boolean boolean24 = locale16.hasExtensions();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.upperCase("francese (Canada)", locale27);
        java.lang.String str29 = locale27.getVariant();
        java.util.Locale.setDefault(category0, locale27);
        java.lang.Class<?> wildcardClass31 = locale27.getClass();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertEquals(locale13.toString(), "ca");
        org.junit.Assert.assertEquals(locale16.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "franz\366sisch (frankreich)" + "'", str19, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRANCESE (CANADA)" + "'", str28, "FRANCESE (CANADA)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test25676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str2, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00de\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test25677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                               nailati                                                ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 nailati ko" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 nailati ko");
    }

    @Test
    public void test25678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25678");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("E");
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet12, filteringMode15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, 'H');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, '\\');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "     ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italien" + "'", str9, "italien");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)", "                                                                              ##########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)" + "'", str2, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGkorezhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzemandn (south korea)");
    }

    @Test
    public void test25680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25680");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Cor\351e du Sud", "\uc774\ud0c8\ub9ac\uc544\uc5b4                  ", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25681");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.getCountry();
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
        java.lang.String str16 = locale12.getScript();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale18);
        java.lang.String str21 = locale18.getCountry();
        java.lang.String str22 = locale12.getDisplayCountry(locale18);
        java.util.Set<java.lang.String> strSet23 = locale12.getUnicodeLocaleKeys();
        java.lang.String str24 = locale12.getCountry();
        java.lang.String str26 = locale12.getExtension('n');
        java.util.Locale locale27 = java.util.Locale.PRC;
        java.lang.String str28 = locale27.getDisplayVariant();
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale30.getDisplayCountry();
        java.lang.String str32 = locale29.getDisplayVariant(locale30);
        java.lang.String str33 = locale27.getDisplayScript(locale30);
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.util.Locale locale38 = java.util.Locale.FRANCE;
        java.util.Locale locale39 = java.util.Locale.ITALIAN;
        java.lang.String str41 = locale39.getExtension('h');
        java.lang.String str42 = locale38.getDisplayScript(locale39);
        java.lang.String str43 = locale38.getISO3Country();
        java.lang.String str44 = locale36.getDisplayVariant(locale38);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale36);
        java.lang.String str46 = locale30.getDisplayCountry(locale36);
        java.lang.String str47 = locale12.getDisplayCountry(locale36);
        java.lang.String str48 = locale1.getDisplayVariant(locale36);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.upperCase("zho", locale36);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
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
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "France" + "'", str15, "France");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "anglais" + "'", str19, "anglais");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!IH" + "'", str20, "!IH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "FRA" + "'", str43, "FRA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str45, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ZHO" + "'", str49, "ZHO");
    }

    @Test
    public void test25682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25682");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HSIAGE_NAILATI_TIATTIHI!_NAILATI         HSILGNE_NAILATI_NAILA", 314);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25683");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper('\u671d');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "iIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIITALIAN_italian_eNGLISHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test25685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!       2ITALIANITALIANITALIANITALItalienisch2ITALIANITALIANITALIANITALitalian_ITALIAN_English2ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...2ITALIANITALIANITALIANITAL\\u00342ITALIANITALIANITALIANITALHI!2ITALIANITALIANITALIANITALItalian2ITALIANITALIANITALIANITAL\\u00612ITALIANITALIANITALIANITAL\\u00232ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALChinese (China)2ITALIANITALIANITALIANITALhi!2ITALIANITALIANITALIANITALzh_CN2ITALIANITALIANITALIANITALiTALIAN2ITALIANITALIANITALIANITALen2ITALIANITALIANITALIANITALItalienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch" + "'", str1, "!       2italianitalianitalianitalitalienisch2italianitalianitalianitalitalian_italian_english2italianitalianitalianitalhi!2italianitalianitalianitalhi!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\u00342italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianital\\u00612italianitalianitalianital\\u00232italianitalianitalianitalhi!2italianitalianitalianitalitalian2italianitalianitalianitalchinese (china)2italianitalianitalianitalhi!2italianitalianitalianitalzh_cn2italianitalianitalianitalitalian2italianitalianitalianitalen2italianitalianitalianitalitalienisch");
    }

    @Test
    public void test25686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25686");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("u", 'A');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("BGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGBGTALIAN");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", strArray4, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "                                             hcstueD                                             ");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("TA...", strArray6, strArray10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '\r', 118, 14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str7, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TA..." + "'", str14, "TA...");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\U0069HHHHHHHHHH", "FRDzhEzhFzhGzhIzhLzhMzhNzhOzhQzhRzhSzheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "\ud55c\uad6d\uc5b4KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0069HHHHHHHHHH" + "'", str3, "\\U0069HHHHHHHHHH");
    }

    @Test
    public void test25688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25688");
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
        java.lang.String str18 = locale14.getDisplayCountry();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ALLEMAND" + "'", str18, "ALLEMAND");
    }

    @Test
    public void test25689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("CHN", (int) '!', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555CHN555555555555555" + "'", str3, "555555555555555CHN555555555555555");
    }

    @Test
    public void test25690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25690");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("\\u005c");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale4);
        java.lang.String str6 = locale4.getVariant();
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Locale.setDefault(category11, locale14);
        java.util.Locale locale19 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category11, locale19);
        java.util.Locale locale21 = java.util.Locale.getDefault(category11);
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale.setDefault(category11, locale23);
        java.lang.String str25 = locale23.getDisplayScript();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale26.getDisplayCountry();
        java.lang.String str31 = locale26.getScript();
        java.lang.String str32 = locale26.getScript();
        java.lang.String str33 = locale26.getDisplayVariant();
        java.lang.String str34 = locale23.getDisplayName(locale26);
        java.util.Locale.setDefault(category0, locale23);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "franz\366sisch (frankreich)" + "'", str5, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "\\u005c");
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "allemand" + "'", str15, "allemand");
        org.junit.Assert.assertEquals(locale19.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\u005c" + "'", str34, "\\u005c");
    }

    @Test
    public void test25691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("s (Canada)", 16, (int) 't');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25692");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   h", "b");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                                           ...                                                       ", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("italie");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    \\     ", strArray4, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("5\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065\\u0065", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                           ...                                                       " + "'", str8, "                                                           ...                                                       ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    \\     " + "'", str11, "    \\     ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test25693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("FRNZ\326SISCH (KND)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRNZ\326SISCH (KND)" + "'", str1, "FRNZ\326SISCH (KND)");
    }

    @Test
    public void test25694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("italian_ITALIAN_EnglisFitalian (italian,englis", 164, 'n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnitalian_ITALIAN_EnglisFitalian (italian,englisnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" + "'", str3, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnitalian_ITALIAN_EnglisFitalian (italian,englisnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Test
    public void test25695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25695");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Eagaas8", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25696");
        java.util.Locale locale1 = new java.util.Locale("\\u0023 (ITALIENISCH,iTALIAN)");
        java.util.Locale locale3 = new java.util.Locale("\\u005c");
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.lowerCase("Franz\366sisch (Frankreich)", locale5);
        java.lang.String str7 = locale5.getVariant();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str10 = locale3.getExtension('C');
        java.lang.String str11 = locale3.getDisplayScript();
        java.lang.String str12 = locale1.getDisplayVariant(locale3);
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0023 (italienisch,italian)");
        org.junit.Assert.assertEquals(locale3.toString(), "\\u005c");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "franz\366sisch (frankreich)" + "'", str6, "franz\366sisch (frankreich)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi! 5Italienisch5italian_ITALIAN_English5HI!5hi!5ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...5\\u00345HI!5Italian5\\u00615\\u00235hi!5iTALIAN5Chinese (China)5hi!5zh_CN5iTALIAN5en5Italienisch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! 5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese (china)5hi!5zh_cn5italian5en5italienisch" + "'", str1, "hi! 5italienisch5italian_italian_english5hi!5hi!5adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...5\\u00345hi!5italian5\\u00615\\u00235hi!5italian5chinese (china)5hi!5zh_cn5italian5en5italienisch");
    }

    @Test
    public void test25698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaa", "44444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN444444444444444444444444ITALIAN4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25699");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale2.getDisplayName();
        java.lang.String str7 = locale2.getExtension('f');
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale10.getExtension('h');
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        java.util.Locale locale14 = locale9.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale15.getLanguage();
        java.lang.String str17 = locale9.getDisplayCountry(locale15);
        java.lang.String str18 = locale15.getLanguage();
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0061", locale15);
        java.lang.String str20 = locale15.getScript();
        java.lang.String str21 = locale15.getDisplayLanguage();
        java.lang.String str22 = locale2.getDisplayVariant(locale15);
        java.lang.String str23 = locale15.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United Kingdom)" + "'", str5, "English (United Kingdom)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "\\u005c");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u005c" + "'", str16, "\\u005c");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "France" + "'", str17, "France");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u005c" + "'", str18, "\\u005c");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\u0061" + "'", str19, "\\u0061");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u005c" + "'", str21, "\\u005c");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "und" + "'", str23, "und");
    }

    @Test
    public void test25700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25700");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Italian" + "'", str2, "Italian");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
    }

    @Test
    public void test25701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25701");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddfranzosisch(frankreich)", "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI" + "'", str2, "ITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAIITALIANITITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAITAI");
    }

    @Test
    public void test25703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25703");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        java.util.Locale locale5 = locale0.stripExtensions();
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale8);
        java.lang.String str11 = locale8.getCountry();
        java.lang.String str12 = locale8.getCountry();
        boolean boolean13 = locale8.hasExtensions();
        java.lang.String str14 = locale5.getDisplayVariant(locale8);
        java.lang.String str16 = locale8.getExtension('a');
        java.util.Locale locale17 = locale8.stripExtensions();
        java.util.Set<java.lang.String> strSet18 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet18, 'B');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "inglese" + "'", str9, "inglese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!IH" + "'", str10, "!IH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test25704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25704");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("chi069\\U0069\\U0069\\U0069\\U0069\\chin", "CCCCCCIAN\\U0020ICCCCCCC");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25705");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhz\\U0078zhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", "hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!       ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENG    \\     ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE (CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", 63, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25706");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                         dalleman!ih                            dalleman!ih                          ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25707");
        java.util.Locale locale2 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.lang.String str7 = locale4.getExtension('C');
        java.lang.String str8 = locale3.getDisplayLanguage(locale4);
        java.util.Locale.setDefault(locale3);
        java.lang.String str10 = locale2.getDisplayVariant(locale3);
        java.lang.String str11 = locale3.getDisplayName();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale13);
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.lang.String str16 = locale3.getDisplayName(locale13);
        java.lang.Class<?> wildcardClass17 = locale3.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "francese" + "'", str5, "francese");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "chinois" + "'", str8, "chinois");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "         italian_italian_english" + "'", str14, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test25708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25708");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
        java.util.Locale.Builder builder7 = builder1.setLocale(locale6);
        java.lang.String str8 = locale6.getScript();
        java.lang.String str9 = locale6.getScript();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("A700U\\  ", locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale6.getUnicodeLocaleType("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAish");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a700u\\  " + "'", str10, "a700u\\  ");
    }

    @Test
    public void test25709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25709");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale4);
        java.util.Locale locale7 = builder0.build();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.lang.String str12 = locale9.getExtension('C');
        java.lang.String str13 = locale8.getDisplayLanguage(locale9);
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale16);
        java.lang.String str18 = locale14.getDisplayCountry(locale16);
        java.lang.String str19 = locale14.getVariant();
        java.lang.String str20 = locale8.getDisplayScript(locale14);
        java.lang.String str21 = locale7.getDisplayVariant(locale14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587" + "'", str10, "\u6cd5\u6587");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "chinois" + "'", str13, "chinois");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test25710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ", "IXII", "2cinese (cina)italianitalianitalianital");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 " + "'", str3, "                EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE                 ");
    }

    @Test
    public void test25711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25711");
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
        java.lang.String str16 = locale7.getLanguage();
        java.lang.String str17 = locale7.getDisplayCountry();
        java.lang.String str18 = locale7.getDisplayCountry();
        java.lang.String str20 = locale7.getExtension('A');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr" + "'", str16, "fr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25712");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = locale4.getDisplayCountry(locale7);
        java.lang.String str9 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
    }

    @Test
    public void test25713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23" + "'", str1, "FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA             FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA23");
    }

    @Test
    public void test25714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25714");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("KKKKKKKKKKKKKKKKKEAGAASH", "ed", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ca", "tititititiAiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitititititit");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c" + "'", str2, "c");
    }

    @Test
    public void test25716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25716");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("\\U0020", "allemand");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0020", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\U0020" + "'", str14, "\\U0020");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\U0020" + "'", str15, "\\U0020");
    }

    @Test
    public void test25717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                               English(UnitedKingdom)                               ", "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25718");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u007");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder8 = builder3.setLocale(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale7.getVariant();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale7.getDisplayLanguage(locale11);
        java.lang.String str14 = locale1.getDisplayLanguage(locale11);
        java.util.Locale locale16 = java.util.Locale.FRANCE;
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str19 = locale17.getExtension('h');
        java.lang.String str20 = locale16.getDisplayScript(locale17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale16);
        java.lang.String str23 = locale16.getExtension('z');
        java.lang.String str25 = locale16.getExtension('z');
        java.lang.String str26 = locale11.getDisplayCountry(locale16);
        java.lang.String str27 = locale16.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "French (Canada)" + "'", str5, "French (Canada)");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Italian" + "'", str12, "Italian");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tedesco" + "'", str13, "tedesco");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!       " + "'", str21, "hi!       ");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test25719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25719");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { ' ', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "u", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "en-US", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "cinese (cina)\\u0069h...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " italian  ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     Eng", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25720");
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
        java.lang.String str16 = locale15.toLanguageTag();
        java.util.Set<java.lang.Character> charSet17 = locale15.getExtensionKeys();
        java.lang.String str18 = locale15.getLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fr-FR" + "'", str16, "fr-FR");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fr" + "'", str18, "fr");
    }

    @Test
    public void test25721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   cor\351en    ", "\u6cd5\u570b                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a700u  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("KOREAN (SOUTH KOREA)KORE     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KOREAN (SOUTH KOREA)KORE     " + "'", str1, "KOREAN (SOUTH KOREA)KORE     ");
    }

    @Test
    public void test25724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25724");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "taly", (java.lang.CharSequence) "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "taly" + "'", charSequence2, "taly");
    }

    @Test
    public void test25725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25725");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.setVariant("                             kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant:                              kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkEDkk [at index 0]");
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
    }

    @Test
    public void test25726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25726");
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         italian_ITALIAN_English", locale1);
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale1.getDisplayLanguage(locale7);
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale10.getDisplayCountry();
        java.lang.String str15 = locale10.getScript();
        java.lang.String str16 = locale10.getScript();
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayCountry();
        java.lang.String str22 = locale17.getScript();
        java.lang.String str23 = locale17.getScript();
        java.lang.String str24 = locale10.getDisplayCountry(locale17);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.upperCase("\\xtalxan_ITALIAN_Englxsh", locale17);
        java.lang.String str27 = locale17.getExtension('e');
        java.util.Locale locale29 = new java.util.Locale("          ");
        java.lang.String str30 = locale17.getDisplayCountry(locale29);
        java.util.Set<java.lang.Character> charSet31 = locale17.getExtensionKeys();
        boolean boolean32 = locale7.equals((java.lang.Object) locale17);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         italian_italian_english" + "'", str2, "         italian_italian_english");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese" + "'", str8, "Chinese");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\XTALXAN_ITALIAN_ENGLXSH" + "'", str25, "\\XTALXAN_ITALIAN_ENGLXSH");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals(locale29.toString(), "          ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(charSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test25727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)" + "'", str1, "Chineseenglisch (         ITALIAN_ITALIAN_ENGLISH,\\u0061)(China)");
    }

    @Test
    public void test25728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25728");
        java.util.Locale locale1 = new java.util.Locale("x-lvariant-ZH");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "x-lvariant-zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x-lvariant-zh" + "'", str2, "x-lvariant-zh");
    }

    @Test
    public void test25729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("nglish ...nglish ...nglish ...nglichinoisf(Chine)", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                       nglish ...nglish ...nglish ...nglichinoisf(Chine)                                                                                       " + "'", str2, "                                                                                       nglish ...nglish ...nglish ...nglichinoisf(Chine)                                                                                       ");
    }

    @Test
    public void test25730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25730");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\riTALIAN                                                                 \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...", "fRANZ\326SISC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDFrance...");
    }

    @Test
    public void test25732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25732");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("deutsch\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25733");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('c');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              ED_ED                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ED_ED" + "'", str1, "ED_ED");
    }

    @Test
    public void test25735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Rnz\366sisch(Knd                                                                                                                                                                                                               ", "x-lvariant-A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25737");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'N', 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test25738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("fran\347ais(france)(CHINESE(CHINA)", "KKKKKKKKKKKKKKKKKEAGAASH", "                                                                                                                                          ADAEAFAGAIALAMANAOAQARASAAUAWAXAZBABB                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais(france)(CHINESE(CHINA)" + "'", str3, "fran\347ais(france)(CHINESE(CHINA)");
    }

    @Test
    public void test25739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 118, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################" + "'", str3, "######################################################################################################################");
    }

    @Test
    public void test25740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25740");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale3 = locale0.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayVariant();
        java.lang.String str7 = locale5.getDisplayName();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.lang.String str12 = locale8.getDisplayCountry();
        java.lang.String str13 = locale8.getScript();
        java.lang.String str14 = locale8.getScript();
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale16.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayVariant(locale16);
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str20 = locale15.getScript();
        java.lang.String str21 = locale15.getScript();
        java.lang.String str22 = locale8.getDisplayCountry(locale15);
        java.util.Locale.Category category23 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale24 = java.util.Locale.getDefault(category23);
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.ITALIAN;
        java.lang.String str28 = locale26.getExtension('h');
        java.lang.String str29 = locale25.getDisplayScript(locale26);
        java.lang.String str30 = locale25.getISO3Country();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale.setDefault(locale31);
        java.lang.String str33 = locale25.getDisplayName(locale31);
        java.lang.String str34 = locale25.getScript();
        java.util.Locale.setDefault(category23, locale25);
        java.lang.String str36 = locale8.getDisplayCountry(locale25);
        java.lang.String str37 = locale8.getVariant();
        java.lang.String str38 = locale5.getDisplayName(locale8);
        java.util.Locale locale41 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI", "French (Canada)");
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        java.lang.String str43 = locale5.getDisplayLanguage(locale41);
        java.lang.String str44 = locale0.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (China)" + "'", str7, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category23.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FRA" + "'", str30, "FRA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str33, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "chinois (Chine)" + "'", str38, "chinois (Chine)");
        org.junit.Assert.assertEquals(locale41.toString(), "\\u0020italianitalianitalianitali_FRENCH (CANADA)");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Chinese" + "'", str43, "Chinese");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u5fb7\u6587" + "'", str44, "\u5fb7\u6587");
    }

    @Test
    public void test25741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25741");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25742");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale locale7 = builder3.build();
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale.Builder builder9 = builder0.setLocale(locale7);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test25743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25743");
        java.util.Locale locale1 = new java.util.Locale("\\u0068");
        java.lang.String str2 = locale1.getISO3Country();
        boolean boolean3 = locale1.hasExtensions();
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.getDefault(category4);
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Locale.setDefault(category4, locale7);
        java.util.Locale locale12 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category4, locale12);
        java.util.Locale locale14 = java.util.Locale.getDefault(category4);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("France");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.lowerCase("tedesco    ", locale17);
        java.util.Locale.setDefault(category4, locale17);
        java.util.Set<java.lang.String> strSet20 = locale17.getUnicodeLocaleKeys();
        java.lang.String str21 = locale1.getDisplayName(locale17);
        java.lang.String str22 = locale17.getDisplayName();
        boolean boolean23 = locale17.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "allemand" + "'", str8, "allemand");
        org.junit.Assert.assertEquals(locale12.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "france");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "tedesco    " + "'", str18, "tedesco    ");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0068" + "'", str21, "\\u0068");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "france" + "'", str22, "france");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25744");
        java.util.Locale locale1 = new java.util.Locale("\\u0044");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Locale locale3 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "\\u0044");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0044" + "'", str2, "\\u0044");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "\\u0044");
    }

    @Test
    public void test25745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "cvcwcxcyczded...uawaxazbabbbdEEEEEEEEEFRAEEEEEEEEEcdcfcgchcickclcmcncocrcuadaeafagaialamanaoaqarasata", (java.lang.CharSequence) "444444444it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25746");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("44444444444444444444444444444444444444444444it                   ", "1\\u0061\\u0061\\u0061", (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25747");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AzhzhzhzhzhzhzhzhzhzhE             g                          ", "\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25748");
        java.util.Locale locale1 = new java.util.Locale("LIAN_EgAish                                 \\u0068");
        java.lang.String str2 = locale1.getVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "lian_egaish                                 \\u0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaa", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test25750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                           U0020ITALIANITALIANITALIANITALI", "allAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmandallAmand", "                  iTALIE                                           ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test25751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iTALIAN", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                        ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("fran\347ais(france)(CHINESE(CHINA)", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "iTALIAN" + "'", str6, "iTALIAN");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test25752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                           U002", "...78ZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZHZH..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand" + "'", str1, "E             gallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand");
    }

    @Test
    public void test25754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44\\u002344");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "443200u\\44" + "'", str1, "443200u\\44");
    }

    @Test
    public void test25755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test25756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25756");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = java.util.Locale.ITALIAN;
        java.lang.String str4 = locale2.getExtension('h');
        java.lang.String str5 = locale0.getDisplayCountry(locale2);
        java.lang.String str6 = locale2.toLanguageTag();
        java.lang.String str7 = locale2.getDisplayLanguage();
        java.util.Locale locale8 = locale2.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "italien" + "'", str7, "italien");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
    }

    @Test
    public void test25757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "##################    \\XTALXAN_gTALgAN_ENGLXSH    ###################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25758");
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
        java.lang.String str18 = locale14.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (Canada)" + "'", str9, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test25759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25759");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("...9\\ENGLISC#", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=...9\\englisc#");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25760");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25761");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", 'G');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25762");
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
        java.lang.String str27 = locale24.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test25763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("alzzzItalian (Italy)enzzzItalian (Italy)czzzItalian (Italy)#########################################", "GBR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("TA...", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TA..." + "'", str2, "TA...");
    }

    @Test
    public void test25765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25765");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...\r\r\r\r\r\r\r\r..", "ermany)German (G                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en_GB" + "'", str1, "en_GB");
    }

    @Test
    public void test25767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hhhhhhhhH", "BBBBBBILATiNA...royaume-uniroyaume-uniroyBBBBBBB", "\\u0069CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test25768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25768");
        java.util.Locale locale2 = new java.util.Locale("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "hi!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061_\\U0020_Italienisch#########################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_italian_englishiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii_HI!DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\U0061_\\U0020_ITALIENISCH#########################################################################################");
    }

    @Test
    public void test25769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25769");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" \\U0066  ", "44444444444444444444444444444444IHaaaaaaaaaaaaaaaaaaaaaaaaFranz\366sisch (Frankreich)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rz...\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test25770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch", "hi!(\\U0020,Italienisch#########################################################################################)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch" + "'", str2, "Hi!        Italienisch italian_ITALIAN_English HI! hi! ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED... \\u0034 HI! Italian \\u0061 \\u0023 hi! iTALIAN Chinese (China4 hi! zh_CN iTALIAN en Italienisch");
    }

    @Test
    public void test25771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25771");
        java.util.Locale locale2 = new java.util.Locale("DEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEUTSCHDEU\\u0061");
        java.lang.String str3 = locale2.getDisplayCountry();
        java.lang.String str4 = locale2.getVariant();
        boolean boolean5 = locale2.hasExtensions();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.upperCase("frnz\366sisch (knd)", locale2);
        java.lang.String str7 = locale2.getDisplayVariant();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        java.lang.String str14 = locale10.getDisplayCountry();
        java.lang.String str15 = locale10.getScript();
        java.lang.String str16 = locale10.getScript();
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        java.lang.String str21 = locale17.getDisplayCountry();
        java.lang.String str22 = locale17.getScript();
        java.lang.String str23 = locale17.getScript();
        java.lang.String str24 = locale10.getDisplayCountry(locale17);
        java.lang.String str25 = locale9.getDisplayVariant(locale17);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("FRANZ\326SISCH");
        java.lang.String str28 = locale27.getDisplayLanguage();
        java.lang.String str29 = locale17.getDisplayScript(locale27);
        java.lang.String str30 = locale2.getDisplayVariant(locale17);
        org.junit.Assert.assertEquals(locale2.toString(), "deutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeutschdeu\\u0061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FRNZ\326SISCH (KND)" + "'", str6, "FRNZ\326SISCH (KND)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test25772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!(\\U0020,Italienisch############################################hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!(\\U0020,Italienisch############################################hi!" + "'", str1, "hi!(\\U0020,Italienisch############################################hi!");
    }

    @Test
    public void test25773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                        ", "#AAAAA", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25774");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale3 = new java.util.Locale("9hhhhhhhhhh", "\\u0078");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = locale0.getDisplayVariant(locale3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals(locale3.toString(), "9hhhhhhhhhh_\\U0078");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test25775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzhzh", (java.lang.CharSequence) "hIAN\\U0020Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25776");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("NC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                                                                                                                                                                                                                         \\     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Koreanisch", (java.lang.CharSequence) "i\\u0020iTALIANiTALIANiTALIANiTALIit    \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\        \\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25778");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch");
        java.util.Locale.setDefault(locale1);
        java.lang.String str3 = locale1.getDisplayVariant();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setLanguageTag("Italian");
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayName();
        java.util.Locale.Builder builder10 = builder4.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder13 = builder11.setLocale(locale12);
        java.util.Locale.Builder builder14 = builder11.clearExtensions();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale locale17 = locale15.stripExtensions();
        java.lang.String str18 = locale15.getDisplayVariant();
        java.util.Set<java.lang.String> strSet19 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder20 = builder11.setLocale(locale15);
        java.lang.String str21 = locale1.getDisplayLanguage(locale15);
        java.lang.String str22 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese (China)" + "'", str9, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Italian" + "'", str16, "Italian");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "deutsch" + "'", str21, "deutsch");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test25779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25780");
        java.util.Locale locale1 = new java.util.Locale("IIIIIIIIII000000000000000000000000000000000000000000...IIIIIIIIII");
        org.junit.Assert.assertEquals(locale1.toString(), "iiiiiiiiii000000000000000000000000000000000000000000...iiiiiiiiii");
    }

    @Test
    public void test25781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz", '9');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                              ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test25782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25782");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "         ITALIAN_ITALIAN_ENGLISH         ITALIAN_!IHITTAIT_ITALIAN_EGAISHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                          SHE             G                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25783");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("GBR");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                         ", "    \\     ", (int) 'C');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0061ItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalienischItalie", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("6b", strArray14);
        boolean boolean18 = languageRange1.equals((java.lang.Object) strArray14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gbr" + "'", str2, "gbr");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gbr" + "'", str5, "gbr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gbr" + "'", str6, "gbr");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gbr" + "'", str8, "gbr");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                         " + "'", str16, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         italian_italian_english", 81, "EN_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EN_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US" + "'", str3, "EN_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US");
    }

    @Test
    public void test25785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25785");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             hcstueD                                             ", "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiitalian_ITALIAN_EnglisEiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25786");
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
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder17 = builder14.setLanguageTag("Italian");
        java.util.Locale.Builder builder18 = builder14.clearExtensions();
        java.util.Locale.Builder builder19 = builder14.clear();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder22 = builder14.setLocale(locale21);
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale.Builder builder24 = builder22.clear();
        java.util.Locale.Builder builder25 = builder24.clear();
        java.util.Locale locale26 = builder24.build();
        java.util.Locale.Builder builder27 = builder13.setLocale(locale26);
        java.util.Locale.Builder builder28 = builder27.clear();
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test25787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test25788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("TALIAN_italian_eNGLISH         ITAL", "E             g                          ", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TALIAN_italian_eNGLISH         ITAL" + "'", str3, "TALIAN_italian_eNGLISH         ITAL");
    }

    @Test
    public void test25789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25790");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("deutsch");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("E");
        java.lang.String str4 = languageRange3.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        java.lang.String str9 = locale8.getDisplayLanguage();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.lang.String str11 = locale8.getLanguage();
        java.util.Set<java.lang.String> strSet12 = locale8.getUnicodeLocaleKeys();
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL");
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strSet12, filteringMode15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, 'H');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "\\U006E");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, '9');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet12, "french");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Italian" + "'", str9, "Italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it" + "'", str11, "it");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + filteringMode15 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode15.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test25791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25791");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "French (Canada)" + "'", str3, "French (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test25792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25792");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("E");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e" + "'", str3, "e");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
    }

    @Test
    public void test25793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UesUetUeuUfaUffUfiUfjUfoUfrUfyUgaUgdUglUgnUguUgvUhaUheUhiUhoUhrUhtUhu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uhUthUrhUohUihUehUahUvgUugUngUlgUdgUagUyfUrfUofUjfUifUffUafUueUteUseU" + "'", str1, "uhUthUrhUohUihUehUahUvgUugUngUlgUdgUagUyfUrfUofUjfUifUffUafUueUteUseU");
    }

    @Test
    public void test25794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "NAC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25795");
        char[] charArray9 = new char[] { 'i', '4', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ita", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("FRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhA", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhATzhAUzhAWzhAXzhAZzhBAzhBBzhBDzhBEzhBFzhBGzhBHzhBIzhBJzhBLzhBMzhBNzhBOzhBQzhBRzhBSzhBTzhBVzhBWzhBYzhBZzhCAzhCCzhCDzhCFzhCGzhCHzhCIzhCKzhCLzhCMzhCNzhCOzhCRzhCUzhCVzhCWzhCXzhCYzhCZzhDEzhDJzhDKzhDMzhDOzhDZzhECzhEEzhEGzhEHzhERzhESzhETzhFIzhFJzhFKzhFMzhFOzhFRzhGAzhGBzhGDzhGEzhGFzhGGzhGHzhGIzhGLzhGMzhGNzhGPzhGQzhGRzhGSzhGTzhGUzhGWzhGYzhHKzhHMzhHNzhHRzhHTzhHUzhIDzhIEzhILzhIMzhINzhIOzhIQzhIRzhISzhITzhJEzhJMzhJOzhJPzhKEzhKGzhKHzhKIzhKMzhKNzhKPzhKRzhKWzhKYzhKZzhLAzhLBzhLCzhLIzhLKzhLRzhLSzhLTzhLUzhLVzhLYzhMAzhMCzhMDzhMEzhMFzhMGzhMHzhMKzhMLzhMMzhMNzhMOzhMPzhMQzhMRzhMSzhMTzhMUzhMVzhMWzhMXzhMYzhMZzhNAzhNCzhNEzhNFzhNGzhNIzhNLzhNOzhNPzhNRzhNUzhNZzhOMzhPAzhPEzhPFzhPGzhPHzhPKzhPLzhPMzhPNzhPRzhPSzhPTzhPWzhPYzhQAzhREzhROzhRSzhRUzhRWzhSAzhSBzhSCzhSDzhSEzhSGzhSHzhSIzhSJzhSKzhSLzhSMzhSNzhSOzhSRzhSSzhSTzhSVzhSXzhSYzhSZzhTCzhTDzhTFzhTGzhTHzhTJzhTKzhTLzhTMzhTNzhTOzhTRzhTTzhTVzhTWzhTZzhUAzhUGzhUMzhUSzhUYzhUZzhVAzhVCzhVEzhVGzhVIzhVNzhVUzhWFzhWSzhYEzhYTzhZAzhZMzhZW", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "azhzhzhzhzhzhzhzhzhzh", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0034\\u00", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "i4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "i4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[i, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("########################################################################################", "bzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)bzhzhzhzhzhzhzhzhzhzhfrancais0(France)b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################" + "'", str2, "########################################################################################");
    }

    @Test
    public void test25797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25797");
        java.util.Locale locale3 = new java.util.Locale("G", "HHHHHHHHHH", "Franzosisch (Frankreich)");
        org.junit.Assert.assertEquals(locale3.toString(), "g_HHHHHHHHHH_Franzosisch (Frankreich)");
    }

    @Test
    public void test25798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25798");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str3 = locale1.getExtension('h');
        java.lang.String str4 = locale0.getDisplayScript(locale1);
        boolean boolean5 = locale0.hasExtensions();
        java.lang.String str6 = locale0.getVariant();
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.lang.String str8 = locale0.getDisplayLanguage();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getLanguage();
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.upperCase("TALIAN\\u0023", locale10);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale14.getDisplayScript(locale15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ", locale14);
        java.lang.String str20 = locale10.getDisplayVariant(locale14);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale21.getDisplayName(locale22);
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.lang.String str26 = locale22.getDisplayVariant(locale25);
        java.util.Locale locale27 = locale22.stripExtensions();
        java.util.Locale locale30 = new java.util.Locale("France", "       !IH");
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str35 = locale32.getExtension('C');
        java.lang.String str36 = locale31.getDisplayLanguage(locale32);
        java.util.Locale.setDefault(locale31);
        java.lang.String str38 = locale30.getDisplayVariant(locale31);
        java.lang.String str39 = locale27.getDisplayVariant(locale31);
        java.lang.String str40 = locale10.getDisplayName(locale31);
        java.lang.String str41 = locale0.getDisplayCountry(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "French" + "'", str8, "French");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ko" + "'", str11, "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TALIAN\\U0023" + "'", str12, "TALIAN\\U0023");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!       " + "'", str19, "hi!       ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "allemand" + "'", str23, "allemand");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "deutsch");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale30.toString(), "france_       !IH");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "French" + "'", str33, "French");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "chinois" + "'", str36, "chinois");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u671d\u9c9c\u6587\u97e9\u56fd)" + "'", str40, "\u671d\u9c9c\u6587\u97e9\u56fd)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\ud504\ub791\uc2a4" + "'", str41, "\ud504\ub791\uc2a4");
    }

    @Test
    public void test25799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25799");
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
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn                                                                         a005c         ", charArray12);
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
    public void test25800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\ud504", "i\\u0020iTALIANiTALIANiTALIANiTALIit         \\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504" + "'", str2, "\ud504");
    }

    @Test
    public void test25801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("######################################################################################################################", "\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i\\u0020iItalian\\u0020i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25802");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("32AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF             AhzSAhzRAhzQAhzOAhzNAhzMAhzLAhzIAhzGAhzFAhzEAhzDAARF", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=32ahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarfahzsahzrahzqahzoahznahzmahzlahziahzgahzfahzeahzdaarf");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25803");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("\\u0020");
        java.util.Locale.Builder builder8 = builder0.setLocale(locale7);
        java.util.Locale.Builder builder11 = builder0.setExtension('u', "Italian");
        java.util.Locale.Builder builder13 = builder0.setLanguageTag("ixii");
        java.util.Locale.Builder builder15 = builder13.setLanguage("TALY");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.addUnicodeLocaleAttribute("Y");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Y [at index 0]");
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test25804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25804");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("frankreich", "ANGLAIS (R                                                                                                                     ", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ZHO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZHO" + "'", str1, "ZHO");
    }

    @Test
    public void test25806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25806");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getScript();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str3 = locale0.getCountry();
        java.util.Locale.setDefault(locale0);
        java.lang.String str5 = locale0.getCountry();
        java.lang.String str6 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "US" + "'", str3, "US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "US" + "'", str5, "US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test25807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                  \\U0068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "inglese...........................................................................................................................................................................................................................................................................................................................................................................", "HI!HI     \\u005c         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" Italia ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\ud504\ub791\uc2a4HI!(\\U0020,ITALIENISCH#########################################################################################)", "gxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25811");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale2.getDisplayName(locale3);
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale8 = new java.util.Locale("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "allemand");
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = new java.util.Locale("\\u0023", "Italienisch", "iTALIAN");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.util.Locale locale17 = locale14.stripExtensions();
        java.lang.String str18 = locale17.getDisplayName();
        boolean boolean19 = locale10.equals((java.lang.Object) str18);
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
        org.junit.Assert.assertEquals(locale14.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "iTALIAN" + "'", str15, "iTALIAN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ITALIENISCH" + "'", str16, "ITALIENISCH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "\\u0023_ITALIENISCH_iTALIAN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\u0023 (ITALIENISCH,iTALIAN)" + "'", str18, "\\u0023 (ITALIENISCH,iTALIAN)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FranzosischFranzosisch (Frankreich)");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("gbr", 'e');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("Italie", (java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gbr" + "'", str7, "gbr");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "eAGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test25814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                               \\u005c                                                                              ", "dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...dez...de");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("English (Canada)");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test25816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + "'", str2, "frdzhezhfzhgzhizhlzhmzhnzhozhqzhrzhszheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    }

    @Test
    public void test25817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25817");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getDisplayCountry();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder3.setUnicodeLocaleKeyword("talan", "\\u0020hi!       _\\U0020_Italienisch################anihc");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: talan [at index 0]");
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
    }

    @Test
    public void test25818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("italiano (Italia)", "CHINA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiano (Italia)" + "'", str2, "italiano (Italia)");
    }

    @Test
    public void test25819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25819");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinois (Chine)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinois (chine)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\u0020italianitalianitalianitali\\u0020italianitalianitalianital (ALLEMAND)", "ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhzhfran\347ais (France)Azhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("titititititit");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TITITITITITIT" + "'", str1, "TITITITITITIT");
    }

    @Test
    public void test25822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25822");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("NI         d00u\\00u\\ed00u\\00u\\ed00u\\G        ESEL");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test25823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Chine", 221, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAChineAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAChineAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test25824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!       _\\U0020_Italienisch####################################################################          ", 104, "CCCCCCCCCCCCCCCCCCCCCCCCCCfrz\366cz(frkrec)CCCCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!       _\\U0020_Italienisch####################################################################          " + "'", str3, "Hi!       _\\U0020_Italienisch####################################################################          ");
    }

    @Test
    public void test25825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ", "FRZ\326CZ(FRKREC)", "\\u0039");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 " + "'", str3, "zH_cnFrench (Canada)AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test25826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25826");
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
        java.lang.String str13 = locale8.getDisplayCountry();
        java.lang.String str14 = locale8.getDisplayLanguage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
    }

    @Test
    public void test25827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "TALIAN\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TALIAN\\U0023" + "'", str1, "TALIAN\\U0023");
    }

    @Test
    public void test25828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25828");
        java.util.Locale locale2 = new java.util.Locale("z...Frn", "Chinese");
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
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale20.getDisplayName();
        java.lang.String str23 = locale20.getExtension('C');
        java.lang.String str24 = locale19.getDisplayLanguage(locale20);
        java.lang.String str25 = locale19.getScript();
        java.util.Locale.setDefault(category3, locale19);
        java.util.Set<java.lang.String> strSet27 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str28 = locale2.getDisplayName(locale19);
        java.lang.String str29 = locale19.getVariant();
        java.lang.Object obj30 = locale19.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "z...frn_CHINESE");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "\\u0020italianitalianitalianitali\\u0020italianitalianitalianital_ALLEMAND");
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
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fran\347ais" + "'", str21, "fran\347ais");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "chinois" + "'", str24, "chinois");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "z...frn (CHINESE)" + "'", str28, "z...frn (CHINESE)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "zh");
    }

    @Test
    public void test25829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2iT hi!       _\\U0020_Italienisch####################################################################            2i", (int) 'Y', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2iT hi!       _\\U0020_Italienisch####################################################################            2i" + "'", str3, "2iT hi!       _\\U0020_Italienisch####################################################################            2i");
    }

    @Test
    public void test25830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25830");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("xxxxxxxxxxxxxxxxxxxxxxxxxx", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (int) '8');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25831");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                               en");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "         englisch         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        englisch         en" + "'", str3, "                                                                                                        englisch         en");
    }

    @Test
    public void test25832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "en_C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_C" + "'", str2, "en_C");
    }

    @Test
    public void test25833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25833");
        java.util.Locale locale3 = new java.util.Locale("...IIIIIIIIIIIIIIIIIIII...", "gxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals(locale3.toString(), "...iiiiiiiiiiiiiiiiiiii..._GXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX_inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test25834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25834");
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
        java.util.Locale locale14 = builder8.build();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Locale.Builder builder18 = builder15.setLocale(locale17);
        java.util.Set<java.lang.String> strSet19 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str20 = locale17.getDisplayName();
        java.lang.String str22 = locale17.getExtension('f');
        java.util.Locale locale23 = locale17.stripExtensions();
        java.lang.String str24 = locale14.getDisplayLanguage(locale23);
        java.lang.String str25 = locale14.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "chinois (Chine)" + "'", str11, "chinois (Chine)");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "anglais (Royaume-Uni)" + "'", str20, "anglais (Royaume-Uni)");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test25835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW", (int) 'x', "IIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW" + "'", str3, "ADAAEAAFAAGAAIAALAAMAANAAOAAQAARAASAATAAUAAWAAXAAZABAABBABDABEABFABGABHABIABJABLABMABNABOABQABRABSABTABVABWABYABZACAACCACDACFACGACHACIACKACLACMACNACOACRACUACVACWACXACYACZADEADJADKADMADOADZAECAEEAEGAEHAERAESAETAFIAFJAFKAFMAFOAFRAGAAGBAGDAGEAGFAGGAGHAGIAGLAGMAGNAGPAGQAGRAGSAGTAGUAGWAGYAHKAHMAHNAHRAHTAHUAIDAIEAILAIMAINAIOAIQAIRAISAITAJEAJMAJOAJPAKEAKGAKHAKIAKMAKNAKPAKRAKWAKYAKZALAALBALCALIALKALRALSALTALUALVALYAMAAMCAMDAMEAMFAMGAMHAMKAMLAMMAMNAMOAMPAMQAMRAMSAMTAMUAMVAMWAMXAMYAMZANAANCANEANFANGANIANLANOANPANRANUANZAOMAPAAPEAPFAPGAPHAPKAPLAPMAPNAPRAPSAPTAPWAPYAQAAREAROARSARUARWASAASBASCASDASEASGASHASIASJASKASLASMASNASOASRASSASTASVASXASYASZATCATDATFATGATHATJATKATLATMATNATOATRATTATVATWATZAUAAUGAUMAUSAUYAUZAVAAVCAVEAVGAVIAVNAVUAWFAWSAYEAYTAZAAZMAZW");
    }

    @Test
    public void test25836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Deutsch", "", (int) '\\');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deutsch" + "'", str4, "Deutsch");
    }

    @Test
    public void test25837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25837");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = new java.util.Locale("...ANiTALI");
        java.util.Locale.setDefault(category0, locale2);
        java.lang.String str4 = locale2.getDisplayName();
        java.lang.String str5 = locale2.getDisplayName();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale2.toString(), "...anitali");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...anitali" + "'", str4, "...anitali");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...anitali" + "'", str5, "...anitali");
    }

    @Test
    public void test25838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             DE_DE            ", '8');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             DE_DE            " + "'", str4, "             DE_DE            ");
    }

    @Test
    public void test25839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25839");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069!I#\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\U0069\\ENGLISC#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25840");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ko", "allemand");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEnglischCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("z...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("dI!        (\\u0020,iTALICNIUEd########################################################################################", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test25841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         italian_ITALIAN_EnglisF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italian_ITALIAN_EnglisF" + "'", str1, "italian_ITALIAN_EnglisF");
    }

    @Test
    public void test25842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                NI                                 ", "ANGLAIS (ROYAUME-UNI)fra");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25843");
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
            java.util.Locale.Builder builder19 = builder13.removeUnicodeLocaleAttribute("eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: eAGAASH                                                                                                                                                                                                                                                                                                                                                                                                     [at index 0]");
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
    public void test25844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25844");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u0023", "\\u0023");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\r", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                  \\u0068", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "cHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHNuuuucHN", (int) 'G', 73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test25845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25845");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strSet4, "\\u0020iTALIANiTALIANiTALIANiTALI");
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("fr");
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale10.getISO3Country();
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleKeys();
        java.lang.String str13 = java.util.Locale.lookupTag(languageRangeList9, (java.util.Collection<java.lang.String>) strSet12);
        java.lang.String str14 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet12);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap15);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(languageRangeList16);
    }

    @Test
    public void test25846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25846");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                               ", "TALIAN_italian_eNGLISH         ITAL");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25847");
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
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.lang.String str25 = locale19.getScript();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale26.getDisplayCountry();
        java.lang.String str31 = locale26.getScript();
        java.lang.String str32 = locale26.getScript();
        java.lang.String str33 = locale19.getDisplayCountry(locale26);
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
        java.lang.String str47 = locale19.getDisplayCountry(locale36);
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale locale49 = builder48.build();
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str52 = locale49.getDisplayLanguage(locale51);
        java.lang.String str53 = locale36.getDisplayVariant(locale49);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.upperCase("                                                       hi!                                                              ", locale36);
        java.lang.String str55 = locale36.getDisplayScript();
        java.util.Locale.setDefault(category0, locale36);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "fr");
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
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + category34 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category34.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "                                                       HI!                                                              " + "'", str54, "                                                       HI!                                                              ");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test25848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!        (\\U0020,ITALIENISCH#########################################################################################)", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!        (\\U0020,ITALIENISCH#########################################################################################)" + "'", str2, "HI!        (\\U0020,ITALIENISCH#########################################################################################)");
    }

    @Test
    public void test25849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25849");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ITALIAN (ITALIAN,ENGLISH)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("FR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)", 30, 'g');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)" + "'", str3, "FR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfraH\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfrafR\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\ub3c5\uc77c\uc5b4\r\r\r\r\rfra)");
    }

    @Test
    public void test25851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ", "                                                        it                         ", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             " + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC nailati             ");
    }

    @Test
    public void test25852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("BFIBGIBHIBIIBJIBLIBMIBNIBOIBQIBRIBSIBTIBVIBWIBYIBZICAICCICDICFICGICHICIICKICLICMICNICOICRICUICVICWICXICYICZIDEIDJIDKIDMIDOIDZIECIEEIEGIEHIERIESIETIFIIFJIFKIFMIFOIFRIGAIGBIGDIGEIGFIGGIGHIGIIGLIGMIGNIGPIGQIGRIGSIGTIGUIGWIGYIHKI", "                                                                 \\U0020  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25853");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("iFranzosisch ");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test25854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25855");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0038ZHO                          ", (java.lang.CharSequence) "                                      fra");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test25856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25856");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u007", 121, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25857");
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
            java.util.Locale.Builder builder14 = builder12.setRegion("\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d  \\\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d\u671d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ???????????????  \\u007a555555555555555555555555555555555???????????????? [at index 0]");
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
    public void test25858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444NAILATI44444444444444", "s (Canada)", 262);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444NAILATI44444444444444" + "'", str4, "44444444444444NAILATI44444444444444");
    }

    @Test
    public void test25859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("zhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozhozho", "                                          \\U0064                                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              fr_C");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test25860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25860");
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch", locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str3, "HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test25861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25861");
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
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
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
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test25862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25862");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet10 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale1.getUnicodeLocaleType("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: United Kingdom");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test25863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("E                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ", 163, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "E                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               " + "'", str3, "E                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               e                               ");
    }

    @Test
    public void test25864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25864");
        char[] charArray8 = new char[] { ' ', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("itTAiT_ITALIAN_EgAish", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Italy", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ixii", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444fRANZ\326SISC", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 69 + "'", int14 == 69);
    }

    @Test
    public void test25865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25865");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "fr-CAfr-CAfr-C8600u\\fr-CAfr-CAfr-CA", "ANGLAIS (rOYAUME-uNI)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test25866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...", (int) '\u671d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en..." + "'", str2, "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDinglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)englisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCEgschCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCALIAN_ENGLISH,\\u0061)en...");
    }

    @Test
    public void test25867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                        e                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hcstued-e#__nailati", "aDAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDh...", (int) '-');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25869");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "U00\\U0034\\U00                                             HCSTUD                                             \\U0034", (java.lang.CharSequence) "fran\347ais(france)(CHINESE(CHINA)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114 + "'", int2 == 114);
    }

    @Test
    public void test25870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA", 215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                         GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA" + "'", str2, "                                                                                                                                                         GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGFRA");
    }

    @Test
    public void test25871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25871");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rchinesisch (china)", (java.lang.CharSequence) ")aHI0200U\\NAIHAAAAAAAAAAAAAAAAAAAAAAAAAA)a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25872");
        java.util.Locale locale1 = new java.util.Locale("tedesco");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.lang.String str3 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "tedesco");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tedesco" + "'", str3, "tedesco");
    }

    @Test
    public void test25873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("44444444444444444444444444444444444444444444it                   zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25874");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale3.getExtension('h');
        java.lang.String str6 = locale2.getDisplayScript(locale3);
        java.util.Locale locale7 = locale2.stripExtensions();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale9.getCountry();
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
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FR" + "'", str10, "FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FR" + "'", str11, "FR");
    }

    @Test
    public void test25875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25875");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str7 = locale4.getDisplayLanguage(locale6);
        java.lang.String str8 = locale1.getDisplayLanguage(locale4);
        java.lang.String str9 = locale1.toLanguageTag();
        java.lang.String str10 = locale1.getDisplayName();
        java.util.Set<java.lang.String> strSet11 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "und" + "'", str9, "und");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test25876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25876");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Italian (Italy)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian(italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25877");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("                                  !ih                            dalleman");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test25878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("             DE_DE             ", "TALIAN\\U002", "hi!hi     \\u005cggggggggggggggggggggggggggggggggggggg");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test25879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                             hcstueD                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             HCSTUED                                             " + "'", str1, "                                             HCSTUED                                             ");
    }

    @Test
    public void test25880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                       a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test25881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I" + "'", str2, "2IT HI!       _\\U0020_ITALIENISCH####################################################################            2I");
    }

    @Test
    public void test25882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25882");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("WBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                         ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test25883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25883");
        java.lang.CharSequence charSequence0 = null;
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
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25884");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("aitaitaitaitaitaitaitaitaita");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=aitaitaitaitaitaitaitaitaita");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 \\u0069hhhhhhhhhh                 ", ")");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith(")ylatI( nailatI", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 \\u0069hhhhhhhhhh                 " + "'", str4, "                 \\u0069hhhhhhhhhh                 ");
    }

    @Test
    public void test25886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "Italian__#e-deutsch", "                                           fRENCH (fRANCE)                                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test25887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25887");
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
            java.util.Locale.Builder builder20 = builder18.setVariant("inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: inglesehhhhhhhhhenglisCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC [at index 0]");
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
    public void test25888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...ALzhAMzhANzhAOzhAQzhARzhASzhA", "                                                               \\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ALzhAMzhANzhAOzhAQzhARzhASzhA" + "'", str2, "...ALzhAMzhANzhAOzhAQzhARzhASzhA");
    }

    @Test
    public void test25889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                     HSadanacadanacGadanacE", (int) (short) 100, 309);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25890");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhITALIENISCHHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhhhhhhhHhhh", "D", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("            \\u0020iItalian\\u0020i                                                 ", "CCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            \\u0020iItalian\\u0020i                                                 " + "'", str2, "            \\u0020iItalian\\u0020i                                                 ");
    }

    @Test
    public void test25892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test25893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25893");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 inglese", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test25895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDEDJDKDMDODZECEEEGEHERESETFIFJFKFMFOFRGAGBGDGEGFGGGHGIGLGMGNGPGQGRGSGTGUGWGYHKHMHNHRHTHUIDIEILIMINIOIQIRISITJEJMJOJPKEKGKHKIKMKNKPKRKWKYKZLALBLCLILKLRLSLTLULVLYMAMCMDMEMFMGMHMKMLMMMNMOMPMQMRMSMTMUMVMWMXMYMZNANCNENFNGNINLNONPNRNUNZOMPAPEPFPGPHPKPLPMPNPRPSPTPWPYQARERORSRURWSASBSCSDSESGSHSISJSKSLSMSNSOSRSSSTSVSXSYSZTCTDTFTGTHTJTKTLTMTNTOTRTTTVTWTZUAUGUMUSUYUZVAVCVEVGVIVNVUWFWSYEYTZAZMZW");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "fran\347ais (Canada)");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'e');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!" + "'", str6, "HI!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
    }

    @Test
    public void test25896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25896");
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
        java.lang.String str13 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italien" + "'", str1, "italien");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25897");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("fra");
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0045", "");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale8.getLanguage();
        java.lang.String str11 = locale8.getLanguage();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale15.getExtension('h');
        java.lang.String str18 = locale14.getDisplayScript(locale15);
        java.util.Locale locale19 = locale14.stripExtensions();
        boolean boolean20 = locale14.hasExtensions();
        java.util.Locale locale24 = new java.util.Locale("CCCC\\CCCC", "         HITALIANH_HitalianH_HeHNGLISH", "        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
        java.lang.String str25 = locale14.getDisplayLanguage(locale24);
        java.util.Locale.setDefault(category0, locale14);
        java.lang.String str27 = locale14.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fra");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0045" + "'", str10, "\\u0045");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0045" + "'", str11, "\\u0045");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "\\u0045");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals(locale24.toString(), "cccc\\cccc_         HITALIANH_HITALIANH_HEHNGLISH_        ESELGNI         d00u\\00u\\ed00u\\00u\\ed00u\\");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "French" + "'", str25, "French");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "FR" + "'", str27, "FR");
    }

    @Test
    public void test25898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "adaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...", 122);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test25899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25899");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zhzhzhzhzhzhzhzhzhzhfraadzhaezhafzhagzhaizhalzhamzhanzhaozhaqzharzhaszhazhzhzhzhzhzhzhzhzhz");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("l", 'E');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l" + "'", str2, "l");
    }

    @Test
    public void test25901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25901");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish", "Koreanisc", (int) 'N');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25902");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("allemand", "ECANADAgCANADACANADAsh                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0023 (ITALIENISCH,iTALIAN)", 92, "\uc601\uc5b4                                                                                                  ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\uc601\uc5b4                              \\\uc601\uc5b4                              " + "'", str3, "\uc601\uc5b4                              \\\uc601\uc5b4                              ");
    }

    @Test
    public void test25904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25904");
        java.util.Locale locale2 = new java.util.Locale("en");
        boolean boolean3 = locale2.hasExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = locale5.stripExtensions();
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = locale2.getDisplayLanguage(locale7);
        java.lang.String str10 = locale2.getDisplayCountry();
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.lowerCase("French (Canada)", locale2);
        java.lang.String str12 = locale2.getVariant();
        java.lang.String str13 = locale2.getDisplayCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "italien" + "'", str6, "italien");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "inglese" + "'", str9, "inglese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french (canada)" + "'", str11, "french (canada)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test25905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25905");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiifrancese (francia)", "Koreanisch (S\374dkorea)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u" + "'", str1, "\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\uCinese (Cina)\\u0069h..\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u007a\\u");
    }

    @Test
    public void test25907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25907");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder6 = builder4.setLanguageTag("HCSTUED");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: \\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test25908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25908");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.util.Locale locale2 = java.util.Locale.FRENCH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str6 = locale0.getDisplayScript(locale3);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str14 = locale12.getExtension('h');
        java.lang.String str15 = locale11.getDisplayScript(locale12);
        java.lang.String str16 = locale11.getISO3Country();
        java.lang.String str17 = locale9.getDisplayVariant(locale11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.upperCase("\\u0020iTALIANiTALIANiTALIANiTALI", locale9);
        java.lang.String str19 = locale3.getDisplayCountry(locale9);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale locale22 = builder21.build();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("Italian");
        java.lang.String str25 = locale22.getDisplayLanguage(locale24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.upperCase("", locale24);
        java.lang.String str27 = locale3.getDisplayName(locale24);
        boolean boolean28 = locale3.hasExtensions();
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
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FRA" + "'", str16, "FRA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\U0020ITALIANITALIANITALIANITALI" + "'", str18, "\\U0020ITALIANITALIANITALIANITALI");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test25909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                              8600u\\U\\u0", "                ITA                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              8600u\\U\\u0" + "'", str2, "                                              8600u\\U\\u0");
    }

    @Test
    public void test25910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25910");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5600U\\5", "zhzhzhzhzhzhzhzhzhzhE             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25911");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\\u0020");
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale8 = new java.util.Locale("\\u0066");
        java.lang.String str10 = locale8.getExtension('i');
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale8.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for \\u0066");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Italian" + "'", str1, "Italian");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale8.toString(), "\\u0066");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test25912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25912");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Locale.setDefault(category1, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale0.getDisplayVariant(locale4);
        java.lang.String str9 = locale4.getDisplayLanguage();
        java.lang.Object obj10 = locale4.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "allemand" + "'", str5, "allemand");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "French" + "'", str9, "French");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "fr_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "fr_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "fr_CA");
    }

    @Test
    public void test25913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!       G", "anglais (Etats-Unis)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       G" + "'", str2, "HI!       G");
    }

    @Test
    public void test25914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25914");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                      )hsilgne,nailati( ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          IAN\\U0020I", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\hhhhhhhhhh9600u\\)anic( esenic");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test25915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("9hhhhhhhhhh          9hhhhhhhhhh   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9hhhhhhhhhh          9hhhhhhhhhh" + "'", str1, "9hhhhhhhhhh          9hhhhhhhhhh");
    }

    @Test
    public void test25916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25916");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "anglais (royaume-uni)fra");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test25917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ca", (int) 'z', 'B');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBcaBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" + "'", str3, "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBcaBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

    @Test
    public void test25918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25918");
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
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getLanguage();
        java.util.Locale.Builder builder43 = builder6.setLocale(locale39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder45 = builder6.setScript("FRENCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: FRENCH [at index 0]");
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
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ko" + "'", str41, "ko");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ko" + "'", str42, "ko");
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test25919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                      englisch                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                eselgni                               ", 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                eselni                               " + "'", str2, "                                eselni                               ");
    }

    @Test
    public void test25921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25921");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale locale4 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test25922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25922");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)Frnz\366sisch (Knd)");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25923");
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
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.lang.String str23 = locale19.getDisplayCountry();
        java.lang.String str24 = locale19.getScript();
        java.lang.String str25 = locale19.getScript();
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayVariant(locale27);
        java.lang.String str30 = locale26.getDisplayCountry();
        java.lang.String str31 = locale26.getScript();
        java.lang.String str32 = locale26.getScript();
        java.lang.String str33 = locale19.getDisplayCountry(locale26);
        java.lang.String str34 = locale18.getDisplayVariant(locale26);
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.lang.String str37 = locale36.getDisplayLanguage();
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.upperCase("!IH", locale36);
        java.lang.String str39 = locale36.getCountry();
        java.lang.String str40 = locale36.getCountry();
        java.lang.String str41 = locale26.getDisplayCountry(locale36);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.lang.String str44 = locale26.getDisplayLanguage(locale42);
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet46 = locale45.getExtensionKeys();
        java.lang.String str47 = locale45.getVariant();
        java.lang.String str48 = locale45.getDisplayName();
        java.lang.String str49 = locale45.getVariant();
        java.lang.String str50 = locale26.getDisplayVariant(locale45);
        java.lang.String str51 = locale45.getScript();
        java.lang.String str52 = locale11.getDisplayScript(locale45);
        java.lang.String str53 = locale45.getDisplayLanguage();
        java.lang.String str54 = locale45.getDisplayVariant();
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Englisch" + "'", str37, "Englisch");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "!IH" + "'", str38, "!IH");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "fran\347ais" + "'", str44, "fran\347ais");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Italienisch" + "'", str48, "Italienisch");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Italienisch" + "'", str53, "Italienisch");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test25924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                              ##########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################" + "'", str1, "##########################");
    }

    @Test
    public void test25925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Eegeesh", 0, 713);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Eegeesh" + "'", str3, "Eegeesh");
    }

    @Test
    public void test25926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25926");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ko", "Azhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0cinese0(cina)Uu!!i9h..France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)Azhzhzhzhzhzhzhzhzhzhfrancais0(France)A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test25927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#######################################################################", "(C)ALANALANALANAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################" + "'", str2, "#######################################################################");
    }

    @Test
    public void test25928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fR" + "'", str1, "fR");
    }

    @Test
    public void test25929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\351encor\351encranzosisch (Frankreich)kkkkkkkkkkkkkkkkkkk...ranzosisch (Frankreich)kkkkkkkkkk\351encor\351enco");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25930");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("FRANC", "                                        anglais (royaume-uni)FRA                                        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25931");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder7 = builder3.setExtension('E', "DEUTSCH");
        java.util.Locale locale8 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder3.setRegion("\ud504\ub791\uc2a4\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ????????? [at index 0]");
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
    }

    @Test
    public void test25932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25932");
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
        java.lang.String str14 = locale3.getScript();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale17.getDisplayName();
        java.util.Locale.Builder builder19 = builder16.setLocale(locale17);
        java.util.Locale.Builder builder21 = builder16.setLanguage("und");
        java.util.Locale locale22 = builder21.build();
        java.lang.String str23 = locale3.getDisplayVariant(locale22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.upperCase("", locale3);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "fran\347ais (Canada)" + "'", str18, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "und_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test25933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25933");
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
        java.util.Locale.Builder builder42 = builder0.setExtension('H', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder44 = builder42.setRegion("itTAiT_ITALIAN_EgAish                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: itTAiT_ITALIAN_EgAish                                                                                [at index 0]");
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
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test25934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "Italian");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0030", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Egsh" + "'", str6, "Egsh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Egsh" + "'", str7, "Egsh");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test25935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25935");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCcinese (cina)\\u0069h..CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test25936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25936");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Frnz\366sischt(Knd)                        ");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test25937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "\uc601\uc5b4", "CHINESExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25938");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0020iTALIANiTALIANiTALIANiTALI\\u0020iTALIANiTALIANiTALIANiTAL", "h");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("fr-FR", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("zhzhzhzhzhzhzhzhzhzhE             ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test25939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25939");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("Iitalian(italian,eng", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test25940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AGAASHuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25941");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "E", "    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati    nailati");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH" + "'", str1, "hsiAgE_NAILATI_TiATtiHI!_NAILATI         HSILGNe_nailati_NAILATI         HHHHHHHH");
    }

    @Test
    public void test25943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25943");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("Royaume-Uni");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.upperCase("fr-FR", locale3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("zhzhzhzhzhzhzhzhzhzhFRAADzhAEzhAFzhAGzhAIzhALzhAMzhANzhAOzhAQzhARzhASzhAzhzhzhzhzhzhzemand", locale3);
        java.lang.String str6 = locale3.getLanguage();
        java.lang.String str8 = locale3.getExtension('a');
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "uni");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FR-FR" + "'", str4, "FR-FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND" + "'", str5, "ZHZHZHZHZHZHZHZHZHZHFRAADZHAEZHAFZHAGZHAIZHALZHAMZHANZHAOZHAQZHARZHASZHAZHZHZHZHZHZHZEMAND");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uni" + "'", str6, "uni");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Iinglese", "KOREAN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Iinglese" + "'", str2, "Iinglese");
    }

    @Test
    public void test25945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25945");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("CCCC\\CCCCC                                                             ", "hcierknarf");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25946");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\ud55c\uad6d\uc5b4KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????kr");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE", "hIAN\\U0020Ihie", "United State                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE" + "'", str3, "hcierknarFEshcierknarFhcierknarFghcierknarFEdnucierknarFEshcierknarFhcierknarFghcierknarFE");
    }

    @Test
    public void test25948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25948");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("allemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemandallemand", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("chinois", "iTALIAN                                                                 ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test25950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ITALIAe", (java.lang.CharSequence) "CAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25951");
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
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList30, 'Y');
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch" + "'", str46, "hi!       YItalienischYitalian_ITALIAN_EnglishYHI!Yhi!YADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...Y\\u0034YHI!YItalianY\\u0061Y\\u0023Yhi!YiTALIANYChinese (China)Yhi!Yzh_CNYiTALIANYenYItalienisch");
    }

    @Test
    public void test25952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("FR_CA                             ...!       \\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\U0034\\");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                               e", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test25953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("9hhhhhhhhhh                                                             ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25954");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("                                     fran\347ais (france)                                       (CHINESE (CHINA)", (double) 'T');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=84.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL", "                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25956");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\\u007");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder5.build();
        java.lang.String str8 = locale1.getDisplayCountry(locale7);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test25957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25957");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("k", "4444llemnd4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25958");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.util.Locale.Builder builder3 = builder0.setLocale(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant("EN_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: EN_USEN_USEN_USEN_USEN_U         italian_italian_englishEN_USEN_USEN_USEN_USEN_US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test25959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25959");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Francia                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Francia" + "'", str1, "Francia");
    }

    @Test
    public void test25961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(")dnK( hcsis\366znrF                              ", "ITA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ")dnK( hcsis\366znrF                              " + "'", str2, ")dnK( hcsis\366znrF                              ");
    }

    @Test
    public void test25962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25962");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("cHN", "(italian,english)", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25963");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale6 = builder5.build();
        java.lang.String str7 = locale6.getLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test25964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25964");
        java.util.Locale locale1 = new java.util.Locale("nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
        org.junit.Assert.assertEquals(locale1.toString(), "nailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatikonailatiko");
    }

    @Test
    public void test25965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "23DAL", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "Englisch!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test25966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!", "!       2italianitalianitalianitaliTALIENISCH2italianitalianitalianitalITALIAN_italian_eNGLISH2italianitalianitalianitalhi!2italianitalianitalianitalHI!2italianitalianitalianitaladaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...2italianitalianitalianital\\U00342italianitalianitalianitalhi!2italianitalianitalianitaliTALIAN2italianitalianitalianital\\U00612italianitalianitalianital\\U00232italianitalianitalianitalHI!2italianitalianitalianitalItalian2italianitalianitalianitalcHINESE (cHINA)2italianitalianitalianitalHI!2italianitalianitalianitalZH_cn2italianitalianitalianitalItalian2italianitalianitalianitalEN2italianitalianitalianitaliTALIENISCH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rfranz\326sisch\n(frankreich)\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "eee", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test25968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25968");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("GERMAN (GERMANY");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25969");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                          fr-C                           ", 101, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                             xx_xx                                              ", "\\ud504");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             xx_xx                                              " + "'", str2, "                                             xx_xx                                              ");
    }

    @Test
    public void test25971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!ALLEMANDITALIENISCHALLEMANDITALIAN_ITALIAN_ENGLISHALLEMANDHI!ALLEMANDHI!ALLEMANDADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...ALLEMAND\\U0034ALLEMANDHI!ALLEMANDITALIANALLEMAND\\U0061ALLEMAND\\U0023ALLEMANDHI!ALLEMANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH" + "'", str2, "ANDITALIANALLEMANDCHINESE(CHINA)ALLEMANDHI!ALLEMANDZH_CNALLEMANDITALIANALLEMANDENALLEMANDITALIENISCH");
    }

    @Test
    public void test25972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL", "        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL" + "'", str2, "ITALIEITALNC_HZ\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rITALIEITAL");
    }

    @Test
    public void test25973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25973");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancesefr\\u0075francesefrancesefrancTIT");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test25974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25974");
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
        java.util.Locale locale46 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.lang.String str48 = locale30.getDisplayLanguage(locale46);
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet50 = locale49.getExtensionKeys();
        java.lang.String str51 = locale49.getVariant();
        java.lang.String str52 = locale49.getDisplayName();
        java.lang.String str53 = locale49.getVariant();
        java.lang.String str54 = locale30.getDisplayVariant(locale49);
        java.util.Locale.setDefault(locale30);
        boolean boolean56 = locale30.hasExtensions();
        java.util.Locale.setDefault(category0, locale30);
        java.lang.String str58 = locale30.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "de");
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
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "English" + "'", str41, "English");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "!IH" + "'", str42, "!IH");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "fran\347ais" + "'", str48, "fran\347ais");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertNotNull(charSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Italian" + "'", str52, "Italian");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test25975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\ud504", 367);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud504" + "'", str2, "\ud504");
    }

    @Test
    public void test25976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25976");
        java.util.Locale locale3 = new java.util.Locale("hi!", "English", "");
        java.util.Locale locale7 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        java.util.Locale locale12 = new java.util.Locale("H", "Hhhhhhhhh", "CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = locale7.getDisplayName(locale12);
        java.util.Locale locale16 = new java.util.Locale("italy");
        java.lang.String str17 = locale16.getISO3Country();
        java.util.Locale locale20 = new java.util.Locale("", "");
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = locale16.getDisplayLanguage(locale20);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale7.getDisplayLanguage(locale20);
        java.lang.Object obj26 = locale7.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ENGLISH");
        org.junit.Assert.assertEquals(locale7.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals(locale12.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)" + "'", str14, "h (HHHHHHHHH,CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK)");
        org.junit.Assert.assertEquals(locale16.toString(), "italy");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "italy" + "'", str23, "italy");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "h_HHHHHHHHH_CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK");
    }

    @Test
    public void test25977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25977");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList12, filteringMode14);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList12, filteringMode16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.Locale.FilteringMode filteringMode26 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList24, filteringMode26);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!       ", "Italienisch", "italian_ITALIAN_English", "HI!", "hi!", "ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...", "\\u0034", "HI!", "Italian", "\\u0061", "\\u0023", "hi!", "iTALIAN", "Chinese (China)", "hi!", "zh_CN", "iTALIAN", "en", "Italienisch" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.lang.String>) strList56, filteringMode58);
        java.util.List<java.lang.String> strList60 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList48, filteringMode58);
        java.util.List<java.lang.String> strList61 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList48);
        java.util.Locale.FilteringMode filteringMode62 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList63 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList48, filteringMode62);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList48, '9');
        java.lang.String str67 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.lang.String>) strList48, "cana");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode14.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode16.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + filteringMode26 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode26.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode58.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + filteringMode62 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode62.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch" + "'", str65, "hi!       9Italienisch9italian_ITALIAN_English9HI!9hi!9ADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...9\\u00349HI!9Italian9\\u00619\\u00239hi!9iTALIAN9Chinese (China)9hi!9zh_CN9iTALIAN9en9Italienisch");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!       canaItalienischcanaitalian_ITALIAN_EnglishcanaHI!canahi!canaADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...cana\\u0034canaHI!canaItaliancana\\u0061cana\\u0023canahi!canaiTALIANcanaChinese (China)canahi!canazh_CNcanaiTALIANcanaencanaItalienisch" + "'", str67, "hi!       canaItalienischcanaitalian_ITALIAN_EnglishcanaHI!canahi!canaADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...cana\\u0034canaHI!canaItaliancana\\u0061cana\\u0023canahi!canaiTALIANcanaChinese (China)canahi!canazh_CNcanaiTALIANcanaencanaItalienisch");
    }

    @Test
    public void test25978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25978");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder2.setScript("");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguage("NAILAT");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("tanoch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: tanoch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test25979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25979");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL (allemand)", "hi!        (\\U0020,Italienisch#########################################################################################nnn");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25980");
        java.util.Locale locale1 = new java.util.Locale("hi!allemandItalienischallemanditalian_ITALIAN_EnglishallemandHI!allemandhi!allemandADAEAFAGAIALAMANAOAQARASATAUAWAXAZBABBBDBEBFBGBHBIBJBLBMBNBOBQBRBSBTBVBWBYBZCACCCDCFCGCHCICKCLCMCNCOCRCUCVCWCXCYCZDED...allemand\\u0034allemandHI!allemandItalianallemand\\u0061allemand\\u0023allemandhi!allemandiTALIANallemandChinese(China)allemandhi!allemandzh_CNallemandiTALIANallemandenallemandItalienisch");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch" + "'", str2, "hi!allemanditalienischallemanditalian_italian_englishallemandhi!allemandhi!allemandadaeafagaialamanaoaqarasatauawaxazbabbbdbebfbgbhbibjblbmbnbobqbrbsbtbvbwbybzcacccdcfcgchcickclcmcncocrcucvcwcxcyczded...allemand\\u0034allemandhi!allemanditalianallemand\\u0061allemand\\u0023allemandhi!allemanditalianallemandchinese(china)allemandhi!allemandzh_cnallemanditalianallemandenallemanditalienisch");
    }

    @Test
    public void test25981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish", (int) '8');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish" + "'", str2, "ITALIAN_italian_eNGLISHITALIAN_!IHitTAiT_ITALIAN_EgAish");
    }

    @Test
    public void test25982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25982");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.FRENCH;
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str4 = locale1.getExtension('C');
        java.lang.String str5 = locale0.getDisplayLanguage(locale1);
        java.lang.String str6 = locale0.getScript();
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        java.lang.String str8 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
    }

    @Test
    public void test25983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccc\\u00de");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ecanadaGcanadacanadaSH                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ECANADAGCANADACANADASH                                                                                                   " + "'", str1, "ECANADAGCANADACANADASH                                                                                                   ");
    }

    @Test
    public void test25985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25985");
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
            java.util.Locale.Builder builder12 = builder8.setExtension('\\', "ILATiNA...royaume-uniroyaume-uniroy");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: \\ [at index 0]");
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
    public void test25986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25986");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HHHHHHHHH         ITALIAN_italian_eNGLISH         ITALIAN_!IHitTAiT_ITALIAN_EgAis", "...anitali", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test25987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25987");
        java.util.Locale locale2 = new java.util.Locale("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\XTALXAN_ITALIAN_ENGLXSHzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", "...\r\r\r\r\r\r\r\r..");
        org.junit.Assert.assertEquals(locale2.toString(), "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\\xtalxan_italian_englxshzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz_...\r\r\r\r\r\r\r\r..");
    }

    @Test
    public void test25988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25988");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.setLanguage("ITALIAN");
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        java.lang.String str10 = locale9.getLanguage();
        java.lang.String str11 = locale9.getDisplayVariant();
        java.lang.String str12 = locale9.getDisplayVariant();
        java.lang.Class<?> wildcardClass13 = locale9.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fran\347ais (Canada)" + "'", str3, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "italian" + "'", str10, "italian");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25989");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u570b");
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u570b");
    }

    @Test
    public void test25990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25990");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("         ITALIAN_italian_eNGLISH         ITALIAN_!IH");
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.lang.String str4 = locale3.getISO3Language();
        java.util.Locale locale6 = new java.util.Locale("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_CN");
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getDisplayName(locale3);
        java.lang.String str9 = locale3.getVariant();
        java.lang.String str10 = locale3.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals(locale6.toString(), "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rzh_cn");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test25991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25991");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("Italian");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("AnihCFFFFFFFF");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: AnihCFFFFFFFF [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test25992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("x", "ixii");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test25993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("z...frn (CHINESE)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "z...frn (CHINESE)" + "'", str1, "z...frn (CHINESE)");
    }

    @Test
    public void test25994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF" + "'", str1, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    }

    @Test
    public void test25995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25995");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray15 = new char[] { '4', '#', '#', 'a', ' ', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Franz\366sisch", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Italien", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u00d\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\U0020ITALIANITALIANITALIANITALI\\U0020ITALIANITALIANITALIANITAL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0041", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TALA", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4##a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #, #, a,  , a]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test25996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\ud504\ub791\uc2a4\uc5b4\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test25997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25997");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "United State                                                                                     ", (java.lang.CharSequence) "francese (canada)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test25998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25998");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setRegion("                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:                                                                                       [at index 0]");
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese (China)" + "'", str16, "Chinese (China)");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test25999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiihI!       iiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!       IIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!       IIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test26000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test26000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0020");
        org.junit.Assert.assertNotNull(strArray2);
    }
}
